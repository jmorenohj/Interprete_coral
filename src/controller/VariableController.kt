package controller

import CoralLanguageParser
import models.DataTypes
import models.ExceptionInter
import models.Variable
import kotlin.system.exitProcess

enum class  AssignVariableStrategy{DOT_SIZE, ARR_POSITION, ONLY_VALUE }

object VariableController {
    private const val globalScope = "Global"

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

    fun assignFromVariableContext(ctx: CoralLanguageParser.IdcallContext) {
        // Check if variable exists
        println(ctx.text);
        val currentVar = ctx.TKN_ID().text
        getVariable(currentVar)
        //CHECK STRATEGY
        if (ctx.TKN_OPENING_PAR() == null) {
            var strategy=AssignVariableStrategy.ONLY_VALUE
            //WHEN IS A VAR
            if (ctx.idopt().text.isNotEmpty()) {
                // WHEN IS ACCESSING INTO AN ARR POSITION OR DOT_SIZE
                if (ctx.idopt().arrpos().text.isNotEmpty()) {
                    //WHEN IS ACCESSING INTO AN ARRPOSITION
                    strategy=AssignVariableStrategy.ARR_POSITION
                    ctx.idopt().arrpos().expression()
                } else {
                    //WHEN IS ACCESSING INTO A DOT_SIZE
                    strategy=AssignVariableStrategy.DOT_SIZE
                }
                print("IDOPT ")
                println(ctx.idopt().text)
            }
            //ASSIGNATION VALUE
            print("ASSIGNATION ")
            println(ctx.idstuff().assignation().text)
        } else {
            //WHEN IS A CALL FUNCTION
            println(ctx.TKN_CLOSING_PAR())
            println(ctx.arguments())
            println(ctx.TKN_CLOSING_PAR())
        }
    }

    fun addFromVardeclarationContext(ctx: CoralLanguageParser.VardeclarationContext) {
        val type = ctx.type().text
        val id = ctx.TKN_ID().text
        val arrDeclaration = ctx.arrdeclaration().text
        if (arrDeclaration.isEmpty()) {
            addVariable(id, type.uppercase(), null)
            println(getVariable(id))
        } else {
            val length = getArrayLength(ctx.arrdeclaration())
            val typeEnum = if (type == "integer") "ARRAY_INT" else "ARRAY_FLOAT"
            if (length == null) {
                addVariable(id, typeEnum, null)
            } else {
                val list = MutableList<Number>(length) { 0 }
                addVariable(id, typeEnum, list)
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

    private fun getScope(scopeName: String): HashMap<String, Variable> {
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
        scope[varName] = Variable(varType, varName, value)
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
}