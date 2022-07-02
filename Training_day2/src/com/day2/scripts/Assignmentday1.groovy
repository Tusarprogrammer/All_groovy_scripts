package com.day2.scripts


def caseData = 52


switch (caseData) {
	
	case {caseData%2==0}:
	 println "Entered no is even"
	 break
	 
	 case {caseData >50}:
	 println "Entered no is greater than 50"
	 break
	 
	 case {caseData >100}:
	 println "Entered no is greter than 100"
     break
	 
	 case {caseData%2!=0}:
	 println "Entered no is odd"
	 break
	 
	 default:
	 println "This is a default case"
	 break
	 	 	 
} // end of switch block

println "End of switch"
println "End of switch"

println "End of switch"

println "End of switch"
