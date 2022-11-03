package models

import java.lang.NumberFormatException

enum class DataTypes{ INTEGER, FLOAT  }

data class Variable (val type:DataTypes, val value:String?){
    constructor(type:String, value:String?):this(DataTypes.valueOf(type), value){
        checkType()
    }

    fun checkType(){
        if(value==null) return
        when(type){
            DataTypes.INTEGER -> checkInteger()
            DataTypes.FLOAT -> checkDouble()
        }
    }

    fun checkInteger(){
        try {
            value?.toInt()
        }catch (e: NumberFormatException) {
            throw ExceptionInter("Se encontro $value y esperaba un entero .")
        }
    }

    fun checkDouble(){
        try {
            value?.toDouble()
        }catch (e: NumberFormatException) {
            throw ExceptionInter("Se encontro $value y esperaba un float.")
        }
    }

    fun copyValue(newVal:String): Variable {
        return Variable(this.type, newVal)
    }

    fun copyType(newType:String): Variable {
        return Variable(DataTypes.valueOf(newType.uppercase()), this.value)
    }
}