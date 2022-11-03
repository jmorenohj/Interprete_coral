package controller

import models.ExceptionInter
import models.Variable

object VariableController {
    private const val globalScope = "Global"
    // Mapa de mapas donde el mapa general es un mapa de scopes
    private val scopes: HashMap<String, HashMap<String, Variable>> = HashMap()

    init {
        createScope(globalScope)
    }

    fun createScope(scopeName: String){
        scopes[scopeName]= HashMap()
    }

    fun deleteScope(scopeName: String){
        scopes.remove(scopeName)
    }

    private fun getScope(scopeName:String):HashMap<String, Variable>{
        if(!scopes.containsKey(scopeName)){
            throw ExceptionInter("No existe el scope $scopeName")
        }
        return scopes[scopeName]!!
    }

    fun addVariable(varName:String, varType:String, value:String?, scopeName:String=globalScope){
        val scope= getScope(scopeName)
        scope[varName] = Variable(varType, value)
    }

    fun getVariables(scopeName: String= globalScope): HashMap<String, Variable>{
        return getScope(scopeName)
    }

    fun getVariable(varName: String, scopeName: String= globalScope): Variable{
        val scope = getScope(scopeName)
        if(scope.containsKey(varName)){
             return scope[varName]!!
        }
        throw ExceptionInter("$varName no ha sido declarado")
    }
}