import groovy.util.slurpersupport.GPathResult

GPathResult result = new XmlSlurper().parse("test.xml")
println "books count = "+result.value.books.book.size()
def book6 = result.value.books.book[2]
println book6.@id