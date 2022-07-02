package com.groovyday3.scripts


def firstNumber = 100

def secondNumber = 0
def result = 0
def dataItems = [2, 3]

def userType = "Admin"

try {
	
	if(userType.equalsIgnoreCase("Normal")) {
		throw new UserNotAllowedException("A normal user is not allowed to perform this action")
	}
	

if(secondNumber >5) {
	throw new OperationNotAllowedException("Second no can not be more than 5")
}
	println dataItems.get(3)
	result = firstNumber/secondNumber

	}catch (ArithmeticException aexc) {
		println "I am inside catch block for ArithmeticException"
		
			println aexc.getMessage()
		
	} 
	catch (IndexOutOfBoundsException exp) {
	
		println "I am inside catch block for IndexOutOfBoundsException"
	
		println exp.getMessage()
		println exp

		}catch (OperationNotAllowedException exp) {
	
		println "I am inside catch block for OperationNotAllowedException"
	
		println exp.getMessage()
		println exp

		}catch (UserNotAllowedException exp) {
	
		println "I am inside catch block for UserNotAllowedException"
	
		println exp.getMessage()
		println exp

		}
		catch (Exception exp) {
	
		println "I am inside catch block for Exception"
	
		println exp.getMessage()
		println exp

		}
		finally {
			println "I am inside finally block"
		}

printf "Division result is "+result
