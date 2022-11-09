package models

enum class AssignVariableStrategy { DOT_SIZE, ARR_POSITION, ONLY_VALUE }

data class IdOptResult (val strategy:AssignVariableStrategy, val name:String, val arrPos:String?){
}