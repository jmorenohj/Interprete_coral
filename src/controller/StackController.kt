package controller

object StackController {
    val scopeStack =  ArrayList<String>()
    var stackSize = 0
    init {
        scopeStack.add("Global")
        stackSize = 1
    }
    fun addScope(scopeName: String) {
        scopeStack.add(scopeName)
        VariableController.createScope(scopeName)
        stackSize+=1
    }

    fun removeScope(){
        VariableController.deleteScope(scopeStack.get(stackSize-1))
        scopeStack.removeAt(stackSize-1)
        stackSize -= 1
    }
    fun getScope():String{
        return scopeStack.get(stackSize-1)
    }

    fun getPrevScope():String{
        return scopeStack.get(stackSize-2);
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