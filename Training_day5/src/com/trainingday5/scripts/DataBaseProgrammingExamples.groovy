package com.trainingday5.scripts

import groovy.sql.Sql


try {
	def dbURL = "jdbc:mysql://localhost:3306/groovyTraining"
	
	def dbUserName = "root"
	
	def dbPassword = "root"
	
	def dbDriver = "com.mysql.jdbc.Driver"
	
	
	println "Connecting to database"
	
	def dbInstanceObject = Sql.newInstance(dbURL,dbUserName,dbPassword,dbDriver)
	
	def DBQuery = "SELECT *FROM users"
	
	//def DBQuery = "SELECT *FROM users where name='Manoj'"
	
	dbInstanceObject.eachRow(DBQuery) { 
		//row -> if(row.name=='Manoj') {println ("id : "+row.id+", Name: "+row.name+", phone : "+row.phone+", email: "+row.email)}
		
		row -> println ("id : "+row.id+", Name: "+row.name+", phone : "+row.phone+", email: "+row.email)
		
		 }

}catch(Exception exc) {
	println "Exception during DB call"
	println exc
}finally {
	
	dbInstanceObject.close()
}