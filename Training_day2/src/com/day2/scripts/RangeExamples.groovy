package com.day2.scripts


def dataRange = 1..10

def dataRangeReverse = 10..1

def charRange = 'A'..'Z'

def dataRangeFrom100To1000 = 100..1000


for (item in dataRangeFrom100To1000) {
	
	if(item %2==0) {
	print item+" ,"
	}
}



for (item in dataRange) {
	println item
}

println "Reverse Range"

for (item in dataRangeReverse) {
	println item
}
println "Range from and To"
println dataRange.getFrom()
println dataRange.getTo()


println dataRange.from
println dataRange.to

println dataRange.size()

println dataRange.sum()

def subListRange = dataRange.subList(5, 10)

for (item in subListRange) {
	println item
}


for (item in charRange) {
	print item+",  "
}


// define a range from 100 to 1000 and find all the even nos and display them



