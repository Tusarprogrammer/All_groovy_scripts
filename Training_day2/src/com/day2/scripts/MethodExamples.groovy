package com.day2.scripts

//method definition

def void display() {
	
	println "Hello , Good morning"
	println "Hello , Good morning"
	println "Hello , Good morning"
}



display()


def void displayWithParams(def firstParam, def secondParam) {
	
	println "Hello , Good morning $firstParam , $secondParam"

}

displayWithParams("Rajesh", "Priyanka")


def int addTwoNumbers(def firstNumber, def secondNumber) {
	
	//println "sum of $firstNumber, $secondNumber ="+(firstNumber+secondNumber)
	
	return firstNumber + secondNumber

}

println addTwoNumbers(10,20)

// method with default parameters
def void addThreeNumbers(def firstNumber, def secondNumber=10, def thirdNumber=5) {
	
	println "sum of $firstNumber, $secondNumber, $thirdNumber ="+(firstNumber+secondNumber+thirdNumber)
	
}


addThreeNumbers(10,20,30)

addThreeNumbers(10)

addThreeNumbers(10, 50)


def String getFullName(def firstName, def middleName, def lastName) {
	return firstName +" "+ middleName + " "+ lastName
}


println getFullName("Rajesh", "Kumar", "Gupta")








