package com.groovytraining.scripts

// Operators in Groovy

// Arithmetic Operators

// + , -, *, /, %

def firstNumber = 20

def secondNumber = 15

def sum = firstNumber + secondNumber
println "Sum of firstNumber and secondNumber( $firstNumber+$secondNumber)  = $sum"

def difference = firstNumber - secondNumber
println "Sum of firstNumber and secondNumber( $firstNumber-$secondNumber)  = $difference"


def multiplication = firstNumber * secondNumber

println "Sum of firstNumber and secondNumber( $firstNumber*$secondNumber)  = $multiplication"

def division = firstNumber / secondNumber
println "Sum of firstNumber and secondNumber( $firstNumber/$secondNumber)  = $division"


def mod = firstNumber % secondNumber
println "Sum of firstNumber and secondNumber( $firstNumber%$secondNumber)  = $mod"


// ++ , --


def value = 10


def newValue = ++value

println value

println newValue

value = 5

newValue = value--

println value

println newValue

// comparison operator

// > >= < <=  == !=


def value1 = 10

def value2 = 20

def value3 = 30


if(value1 > value2) {
	if(value1>value3) {
		println "value1 is greatest"
	} else if(value3 > value2) {
		println "value3 is greatest"
	} else {
		println "value2 is greatest"
	}	
}
else if(value2 > value3) { 
	println "value2 is greatest"
} else {
	println "value3 is greatest"
}


// Logical operators && (logical AND) || (logical OR) , NOT !

/*
 * true && true => true
 * true && false => false
 * 
 *  true || false => true
 *  false || true => true
 *  
 */
println "Logical operator example"

if (value1 > value2 && value1 > value3) {
	println "Value 1 is greatest"
} else if(value2 > value3 && value2 > value1) {
	println "value2 is greatest"
}else {
	println "value3 is greatest"
}
	

// no to be checked if it is even => if it is greater than 10 => if less than 50  


def dataValue = 8

if(dataValue %2 == 0 && dataValue > 10 && dataValue < 50) {
	println "Provided no is even and greter than 10 and less than 50"
} else {
	println "Provided no is not OK as per requirement"
}


// Ternary operator


if ( 5 > 6) {
	println "Yes"
} else {
	println "No"
}


def result = 5 > 6 ? "5 is greter than 6" : "5 is less than 6"


// expression ? result for true : result for false


println result

def enteredNumber = 99

result = enteredNumber % 2 !=0 && enteredNumber > 100 ? "Entered no is odd and greter than 100" : "Entered no is NOT OK as per requirement"

println result


// switch case statement in groovy

def caseValue = 100
switch(caseValue) {
	case 1:
	println "This is for case 1"
	break
	
	case 2: 
	println "This is for case 2"
	break
	
	case 10:
	println "This is for case 10"
	break
	
	case {caseValue > 50}:
	println "This is for case is for greter than 50"
	break
	
	default:
	println "This is for default case"
	break
}
	
	
	














































