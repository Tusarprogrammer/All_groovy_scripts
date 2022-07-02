package com.groovyday3.scripts



def filePath = "C:\\Users\\Administrator\\eclipse-workspace-groovy\\Training_day3\\src\\com\\groovyday3\\scripts\\data\\DataFile"

def studentFilePath = "C:\\Users\\Administrator\\eclipse-workspace-groovy\\Training_day3\\src\\com\\groovyday3\\scripts\\data\\studentDataFile"



File fileObj = new File(filePath)


// File content as an entire String
println fileObj.text

println "Reading file line by line"

// Read the file by each line with line no


fileObj.eachLine { 
	line, index -> println "$line, $index"
}



File fileObjForStudent = new File(studentFilePath)

println "=======================Student Search script=============================="

def studentToBeSearched = "Manav"

fileObjForStudent.eachLine {
	line, index ->  if(studentToBeSearched.equalsIgnoreCase(line)) {println "$line, $index"}
}


// how to find the file size

println fileObjForStudent.length()

println "===========================Writing into a file============================================"

def directoryPathForFile = "C:\\Users\\Administrator\\eclipse-workspace-groovy\\Training_day3\\src\\com\\groovyday3\\scripts\\data\\"

File fileObjForWriting = new File(directoryPathForFile,"FileToBeCreated.txt")

fileObjForWriting.withWriter("utf-8") { writer -> writer.writeLine("Hello This is a sample content to be written into the newly created file") 
	
}
	
	
def commonFileContentToBeWritten = "This is a common content for log tracing which we received from a third party API"



File firstFileObjForWriting = new File(directoryPathForFile,"FirstFileToBeCreated.txt")
File secondFileObjForWriting = new File(directoryPathForFile,"SecondFileToBeCreated.txt")

firstFileObjForWriting.withWriter("utf-8") { writer -> writer.writeLine(commonFileContentToBeWritten) }
	
	
	secondFileObjForWriting.withWriter("utf-8") { writer -> writer.writeLine(commonFileContentToBeWritten) }


	
println fileObj.isFile()

println fileObj.isDirectory()
	


def newDirectoryPath = "C:\\Users\\Administrator\\eclipse-workspace-groovy\\Training_day3\\src\\com\\groovyday3\\scripts\\data123\\"


def directoryObj = new File(newDirectoryPath)

directoryObj.mkdir()

// To delete a file

fileObj.delete()



