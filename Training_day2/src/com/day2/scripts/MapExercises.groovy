package com.day2.scripts;




// key:value pair
def mapData = ["name":"Madhav", "email":"madhav@gmail.com","id":12345,"mobile":324234324]


def mapDataCopy = ["name":"Madhav", "email":"madhav@gmail.com","id":12345,"mobile":324234324]

println mapData.equals(mapDataCopy)



println mapData.get("name")

println mapData.keySet()

println mapData.values()

println mapData.containsKey("city")

println mapData.containsValue("Bangalore")

mapData.put("city", "Bangalore")

println mapData

println mapData.size()


println mapData.equals(mapDataCopy)


println mapData.isEmpty()


for (data in mapData) {
	//println data
	println "Key: "+data.getKey()
	println "value: "+data.getValue()
}


// frequency/counter of each of the numbers in a list
def counterMap = [:]
def listOfNumbers = [2,3,2,3,4,45,67,100,55,45,67,500,2,2,2]

def listOfNames = ["Rajesh","Manav", "Ajay","Vijay","Manav", "Ajay","Vijay", "Manav", "Ajay","Vijay", "Radhika"]



for (item in listOfNumbers) {
	
	if(counterMap.get(item) != null) {
		counterMap.put(item, counterMap.get(item)+1)
	} else {
		counterMap.put(item, 1)
	}
}

println counterMap

def counterMapForName = [:]

for (item in listOfNames) {
	
	if(counterMapForName.get(item) != null) {
		counterMapForName.put(item, counterMapForName.get(item)+1)
	} else {
		counterMapForName.put(item, 1)
	}
}

println counterMapForName










