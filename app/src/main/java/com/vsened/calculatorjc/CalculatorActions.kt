package com.vsened.calculatorjc

sealed class CalculatorActions {
    data class Number(val numbet: Int): CalculatorActions()
    object Clear: CalculatorActions()
    object Delete: CalculatorActions()
    object Decimal: CalculatorActions()
    object Calculate: CalculatorActions()
    data class Operation(val operation: CalculatorOperation): CalculatorActions()
}
