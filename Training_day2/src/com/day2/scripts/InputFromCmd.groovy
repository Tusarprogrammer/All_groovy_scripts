package com.day2.scripts


println "Enter the value for first number :"
def firstNumber = System.console().readLine()


println "Enter the value for second number :"
def secondNumber = System.console().readLine()

def sum = firstNumber.toInteger() + secondNumber.toInteger()
println "Sum of $firstNumber and $secondNumber = "+sum
