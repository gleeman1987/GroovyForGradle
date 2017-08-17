def test1 = new test()
test1.printx()

def file = new File("ganyu.txt")
file.eachLine{
	println it
}
def targetFile = new File("copy.txt")
targetFile.withOutputStream{
	os ->
	file.withInputStream{
		is ->
		os << is
	}
}
targetFile.eachLine{
	println it
}



//def bts = file.getBytes()
//println bts