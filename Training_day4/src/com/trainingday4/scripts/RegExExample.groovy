package com.trainingday4.scripts

def searchOutputObjMultiMatch = "Hello This is a session Hello Hello on Groovy . Hello , we also discuss other topics" =~"Hello"
// List

if(searchOutputObjMultiMatch) {
	println "Searched String Found"
	def matchCounter = 0
	
	while(searchOutputObjMultiMatch.size() > matchCounter) {
		//println searchOutputObjMultiMatch[0]
		//println searchOutputObjMultiMatch[1]
		println "search counter"+matchCounter
		println searchOutputObjMultiMatch[matchCounter]
		matchCounter++
	}
	println searchOutputObjMultiMatch.size()
	
} else {
	println "No result found"
}