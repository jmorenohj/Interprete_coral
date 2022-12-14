package models

import java.lang.NumberFormatException
import kotlin.system.exitProcess

enum class DataTypes { INTEGER, FLOAT, ARRAY_INT, ARRAY_FLOAT, FUNCTION }

data class Variable constructor(val type: DataTypes, val name: String, var value: Any?) {
    constructor(type: String, name: String, value: Any?) : this(DataTypes.valueOf(type), name, value)

    init {
        if (this.value == null) {
            when (this.type) {
                DataTypes.INTEGER -> this.value = 0
                DataTypes.FLOAT -> this.value = 0.0
                DataTypes.ARRAY_INT -> null
                DataTypes.ARRAY_FLOAT -> null
                DataTypes.FUNCTION -> null
            }
        }
    }

    private fun checkIfIsArray(): Boolean {
        return this.value != null && (this.type == DataTypes.ARRAY_FLOAT || this.type == DataTypes.ARRAY_INT)
    }

    fun getSize(): Int {
        if (checkIfIsArray()) {
            return (this.value as MutableList<Number>).size
        }
        println("Error $type no tiene el atributo size")
        exitProcess(-1)
    }

    fun getArrayElement(index: Int): Any {
        if (checkIfIsArray()) {
            try {
                return (this.value as MutableList<Number>)[index]
            } catch (e: IndexOutOfBoundsException) {
                println("Error no contiene el elemento $index")
                exitProcess(-1)
            }
        }
        println("Error $type no es una lista")
        exitProcess(-1)
    }

    fun setArrayElement(index: Int, value: Number) {
        if (checkIfIsArray()) {
            try {
                (this.value as MutableList<Number>)[index] = value
            } catch (e: IndexOutOfBoundsException) {
                println("Error no contiene el elemento $index")
                exitProcess(-1)
            } finally {
                return
            }
        }

        println("Error $type no es una lista")
        exitProcess(-1)
    }

    fun copyWithValue(value: Any?): Variable {
        when (this.type) {
            DataTypes.INTEGER -> {
                try {
                    this.value = value.toString().toDouble().toInt()
                } catch (e: NumberFormatException) {
                    println("Error de tipos, se esperaba un entero")
                    exitProcess(-1)
                }
            }

            DataTypes.FLOAT -> {
                try {
                    this.value.toString().toDouble()
                } catch (e: NumberFormatException) {
                    println("Error de tipos, se esperaba un float")
                    exitProcess(-1)
                }
            }

            DataTypes.ARRAY_INT -> {
                if (this.value != null) {
                    println("Error, ya se ha declarado el tama??o del arreglo")
                    exitProcess(-1)
                }
                this.value = value
            }

            DataTypes.ARRAY_FLOAT -> {
                if (this.value != null) {
                    println("Error, ya se ha declarado el tama??o del arreglo")
                    exitProcess(-1)
                }
                this.value = value
            }
            DataTypes.FUNCTION->{
                if(this.value != null){
                    println("Error, ya se ha declarado esta funci??n")
                    exitProcess(-1)
                }
                this.value = value
            }
        }
        return Variable(this.type, this.name, value)
    }


    //TODO: OVERRIDE OPERATORS
    //operator fun Variable.plus(other:Any?):Number{
    //    if(other is Variable){
    //        return this.value+other.value
    //    }
    //}
}
