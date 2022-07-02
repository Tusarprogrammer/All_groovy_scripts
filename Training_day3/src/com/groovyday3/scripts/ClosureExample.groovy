package com.groovyday3.scripts

// Closure


def myClosure = {println "Hello People, this is a simple closure"}


def methodWithClosureParam(def clos) {
	clos.call("Bangalore")
}


def methodWithClosureParams(def firstClosure, def secondClosure) {
	firstClosure.call("Bangalore")
	secondClosure.call("India")
}


myClosure.call()

myClosure.call()

myClosure.call()

def param2 = "Asia"

def passParamClosure = {param -> println "Hello ${param} ${param2}"}

def passParamClosure2 = {param -> println "Hello ${param}"}

passParamClosure.call("India")


methodWithClosureParam(passParamClosure2)

methodWithClosureParams(passParamClosure2,passParamClosure)

//def incrementClosureBy2 = {param -> println "Hello ${param}"}

def incrementClosureBy2 = { param10 -> return param10+2 }

def param5 = 10

def addTwoParamsClosureBy = { param1,param6 -> return param1+param6 }


println incrementClosureBy2.call(5)

println addTwoParamsClosureBy.call(6,5)


def addThreeParamsClosure = { firstparam,secondparam,thirdparam -> return firstparam + secondparam + thirdparam }

def multiThreeParamsClosure = { firstparam,secondparam,thirdparam -> return firstparam * secondparam * thirdparam }


def methodWith2Params(def addThreeParamsClosure, def multiThreeParamsClosure) {
	println addThreeParamsClosure(1,2,3)
	println multiThreeParamsClosure(2,3,4)
}

methodWith2Params(addThreeParamsClosure, multiThreeParamsClosure)





