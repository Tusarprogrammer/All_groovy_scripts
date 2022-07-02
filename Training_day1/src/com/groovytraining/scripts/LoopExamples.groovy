package com.groovytraining.scripts


// for , while , for-in



// for loop in groovy

/*
for (def item = 1; item <10; item++) {
	println item
}



for (def item = 1; item <10; item++) {
	if(item %2 ==0) {
	println item
	}
}

*/
// while loop
/*
def item = 0 
while (item < 10) {
	println item
	item++
}

*/

def listItems = [4, 6, 7, 10]

for (item1 in listItems) {

	println item1	
}



/*
*
* *
* * *
* * * *
* * * *  *
*/

/*
 * 
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9

*/


for (def i=1;i<50;i++) {
	for (def j=1; j<=i; j++) {
		print "$j "
	}
	println ""
	if (i == 10) {
		break
	}
}



def studentList = ["Rajesh", "Vignesh", "Radha", "Sameer"]

for (student in studentList) {
	println student
}





