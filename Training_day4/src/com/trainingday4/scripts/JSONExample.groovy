package com.trainingday4.scripts

import groovy.json.JsonSlurper
import groovy.json.JsonOutput


// Employee 

def employeeObj = ["name":"Raghavendra","phone":543543565, "email":"raghu@gmail.com"]

def employeeJSON = '{"name":"Raghavendra","phone":543543565, "email":"raghu@gmail.com"}'


println employeeObj

println employeeJSON

println employeeObj.name

//println employeeJSON.name

def jsonSlurper = new JsonSlurper()


def jsonTextAsObject = jsonSlurper.parseText(employeeJSON)

println jsonTextAsObject

println jsonTextAsObject.name+","+jsonTextAsObject.phone+","+jsonTextAsObject.email


def serverConfigJson = '{"IPAddress":"12.34.45.66", "port":8080,"login":"admin","password":"123abcd","OS":"Windows"}'

def serverConfigJsonAsObject = jsonSlurper.parseText(serverConfigJson)

println serverConfigJsonAsObject

println serverConfigJsonAsObject.IPAddress

println serverConfigJsonAsObject.port

println serverConfigJsonAsObject.login

println serverConfigJsonAsObject.password

println serverConfigJsonAsObject.OS



println employeeObj


println "jsonStringForemployeeObj"

JsonOutput jsOutput = new JsonOutput()

def jsonStringForemployeeObj = jsOutput.toJson(employeeObj)

println jsonStringForemployeeObj



def studentObj = ["name":"Madhu","SchoolName":"DPS","City":"New Delhi","class":"XI"]

def jsonStringForstudentObj = jsOutput.toJson(studentObj)

println jsonStringForstudentObj
















