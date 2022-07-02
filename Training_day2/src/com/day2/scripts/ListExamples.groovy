package com.day2.scripts


def listDataForStudents = ["Ramesh", "Rajesh", "Radha","Hari"]

def listDataForFruits = ["Mango","Apple","Orange"]

def mixedData = ["India", "USA", 123,"England"]




println listDataForStudents.size()

println listDataForStudents[0]+","+listDataForStudents[1]+","+listDataForStudents[2] + ","+listDataForStudents[3] 


println listDataForStudents.get(0)+","+listDataForStudents.get(1)+","+listDataForStudents[2] + ","+listDataForStudents[3]


println listDataForStudents.reverse()


println listDataForStudents.contains("Madhu")

println listDataForStudents.contains("Rajesh")


println "Before adding element into the list"
println listDataForStudents

listDataForStudents.add("Madhav")
println "After adding element into the list"
println listDataForStudents


listDataForStudents.addAll(listDataForFruits)


println "After adding another list into the list"
println listDataForStudents



println "Check if a list is empty"

println listDataForFruits.isEmpty()

println "Sorting a list"
println listDataForStudents.sort()


println "Get the index of an element in a list"
println listDataForStudents.indexOf("Radha")




println "Iterating a list to display the index and value"

listDataForStudents.eachWithIndex { value,index ->
	
	println value + ", " + index
}


for (item in listDataForStudents ) {
	println item
}


// Input list

def listOfEvenNumbers = []
def listOfOddNumbers = []
def listOfNumbers = [22,34,66,78,35,100,37]


for (item in listOfNumbers ) {
	if (item %2 ==0) {
		listOfEvenNumbers.add(item)
	} else {
		listOfOddNumbers.add(item)
	}
}

println "Even list is below :"
println listOfEvenNumbers

println "Odd list is below :"
println listOfOddNumbers



def teamA = [] // even index
def teamB = [] // odd index
def listOfStudntsToPlay = ["Raghu", "Radha", "Mohan", "Manoj", "Venkat", "Arya", "Ananya"]



listOfStudntsToPlay.eachWithIndex { value,index ->
	
	if (index %2 == 0) {
		teamA.add(value)
	} else {
		teamB.add(value)
	}
}

println "Players for Team A are below :"
println teamA


println "Players for Team B are below :"
println teamB












