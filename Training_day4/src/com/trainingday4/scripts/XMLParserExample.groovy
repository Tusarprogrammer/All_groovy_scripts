package com.trainingday4.scripts

import groovy.xml.XmlParser
import groovy.xml.XmlSlurper



def xmlText = '''
<list>
<technology>
<name>GROOVY</name>
</technology>
</list>
'''

println "XML Text parsing using XmlParser"
def objForXmlText = new XmlParser().parseText(xmlText)

println objForXmlText

println objForXmlText.technology.name.text()


println "XML Text parsing using XmlSlurper"

def objForXmlTextUsingXmlSlurper = new XmlSlurper().parseText(xmlText)

println objForXmlTextUsingXmlSlurper

println objForXmlTextUsingXmlSlurper.technology.name

