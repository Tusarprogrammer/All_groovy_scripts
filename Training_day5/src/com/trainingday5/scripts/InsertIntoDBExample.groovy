package com.trainingday5.scripts

import groovy.sql.Sql

def dbInstanceObject
try {
	def dbURL = "jdbc:mysql://localhost:3306/groovyTraining"
	
	def dbUserName = "root"
	
	def dbPassword = "root"
	
	def dbDriver = "com.mysql.jdbc.Driver"
	
	
	println "Connecting to database"
	
	dbInstanceObject = Sql.newInstance(dbURL,dbUserName,dbPassword,dbDriver)
	
	def DBQuery = "INSERT INTO users(NAME,email,phone,QUERY) VALUES('Prem','Premgmail.com','32424324','Need to know Semester exam day')"
	
	println DBQuery
	
	dbInstanceObject.connection.autoCommit = false
	dbInstanceObject.execute(DBQuery)
	dbInstanceObject.commit()
	println("Successfully inserted data into Database Table")
	

}catch(Exception exc) {
	println("Failed to insert data into Database Table")
	println "Exception during DB call"
	println exc
	dbInstanceObject.rollback()
}finally {
	
	dbInstanceObject.close()
}