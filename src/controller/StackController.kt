package controller

object StackController {
    private val scopeStack =  ArrayList<String>()
    init {
        addScope("Global")
    }
    fun addScope(scopeName: String) {
        scopeStack.add(scopeName)
    }

    fun removeScope(){
        scopeStack.removeAt(scopeStack.size-1)
    }
    fun getScope():String{
        return scopeStack.get(scopeStack.size-1)
    }

    fun checkForVariable(varName:String):Boolean{
        var globalScope = VariableController.getScope("Global");
        if(globalScope.containsKey(varName)) {
            return false
        }
        for (i in scopeStack.size-1 downTo 1 step 1) {
            var tmpScope = scopeStack.get(i)
            var scopevars = VariableController.getScope(tmpScope)
            if(scopevars.containsKey(varName)){
                return false;
            }
            if(globalScope.containsKey(tmpScope)){
                return true;
            }

        }
        return true;
    }

}