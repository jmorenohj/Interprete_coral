package controller

import CoralLanguageParser
import models.AssignVariableStrategy
import models.DataTypes
import models.ExceptionInter
import models.Variable
import java.util.*
import kotlin.collections.HashMap
import kotlin.system.exitProcess

object VariableController {
    private const val globalScope = "Global"
    var strategy = AssignVariableStrategy.ONLY_VALUE
    var currentVar: Variable? = null

    // Mapa de mapas donde el mapa general es un mapa de scopes
    private val scopes: HashMap<String, HashMap<String, Variable>> = HashMap()

    init {
        createScope(globalScope)
    }

    fun getArrayLength(ctx: CoralLanguageParser.ArrdeclarationContext): Int? {
        if (ctx.arrdeclarationopt().TKN_INT() != null) {
            return ctx.arrdeclarationopt().TKN_INT().text.toInt()
        }
        return null
    }

    fun addFromStackContext(ctx: CoralLanguageParser.VardeclarationContext, scope:String) {
        val type = ctx.type().text
        val id = ctx.TKN_ID().text
        val arrDeclaration = ctx.arrdeclaration().text
        if (arrDeclaration.isEmpty()) {
            addVariable(id, type.uppercase(), null,scope)
            println(getVariable(id))
        } else {
            val length = getArrayLength(ctx.arrdeclaration())
            val typeEnum = if (type == "integer") "ARRAY_INT" else "ARRAY_FLOAT"
            if (length == null) {
                addVariable(id, typeEnum, null,scope)
            } else {
                val list = MutableList<Number>(length) { 0 }
                addVariable(id, typeEnum, list,scope)
            }
            println(getVariable(id))
        }
        //TODO: ARRAYS INIT WITH ZERO VALUE
        //TODO: ARRAYS SHOULD HAS A SIZE AND SHOULD BE ONLY DECLARATED ONCE
    }

    fun createScope(scopeName: String) {
        scopes[scopeName] = HashMap()
    }

    fun deleteScope(scopeName: String) {
        scopes.remove(scopeName)
    }

    fun getScope(scopeName: String): HashMap<String, Variable> {
        if (!scopes.containsKey(scopeName)) {
            println("No existe el scope $scopeName")
            exitProcess(-1)
        }
        return scopes[scopeName]!!
    }

    fun addVariable(varName: String, varType: String, value: Any?) {
        val scope = getScope(globalScope)
        if (scope.containsKey(varName)) {
            println("Error: $varName ya ha sido declarada")
            exitProcess(-1)
        }
        scope[varName] = Variable(varType, varName, value)
    }

    fun addVariable(varName: String, varType: String, value: Any?, scopeName: String = globalScope) {
        val scope = getScope(scopeName)
        if (scope.containsKey(varName)) {
            println("Error: $varName ya ha sido declarada")
            exitProcess(-1)
        }
        scope[varName] = Variable(varType.uppercase(), varName, value)
    }

    fun getVariables(scopeName: String): HashMap<String, Variable> {
        return getScope(scopeName)
    }

    fun getVariables(): HashMap<String, Variable> {
        return getScope(globalScope)
    }

    fun getVariable(varName: String, scopeName: String = globalScope): Variable {
        val scope = getScope(scopeName)
        if (scope.containsKey(varName)) {
            return scope[varName]!!
        }
        print("$varName no ha sido declarado")
        exitProcess(-1)
    }

    fun getVariable(varName: String): Variable {
        val scope = getScope(globalScope)
        if (scope.containsKey(varName)) {
            return scope[varName]!!
        }
        print("$varName no ha sido declarado")
        exitProcess(-1)
    }

    fun setVariable(varName: String, value: Any?, scopeName: String) {
        var variable = getVariable(varName, scopeName)
        variable = variable.copyWithValue(value)
        val scope = getScope(scopeName)
        scope[varName] = variable
    }

    fun setVariable(varName: String, value: Any?) {
        var variable = getVariable(varName, globalScope)
        variable = variable.copyWithValue(value)
        val scope = getScope(globalScope)
        scope[varName] = variable
    }

    fun setArraySize(varName: String, size: Int, scopeName: String) {
        val variable = getVariable(varName, scopeName)
        variable.copyWithValue(MutableList<Number>(size) { 0 })
        val scope = getScope(scopeName)
        scope[varName] = variable
    }

    fun setArraySize(varName: String, size: Int) {
        val variable = getVariable(varName, globalScope)
        variable.copyWithValue(MutableList<Number>(size) { 0 })
        val scope = getScope(globalScope)
        scope[varName] = variable
    }

    fun setArrayElement(varName: String, pos: Int, value: Double) {
        val variable = getVariable(varName, globalScope)
        variable.setArrayElement(pos, value)
    }

    fun setArrayElement(varName: String, pos: Int, value: Double, scopeName: String) {
        val variable = getVariable(varName, scopeName)
        variable.setArrayElement(pos, value)
    }

    fun scopeContainsVariable(varName: String, scopeName:String):Boolean{
        var scope = getScope(scopeName)
        if(scope.containsKey(varName)){
            return true;
        }
        return false;
    }
}