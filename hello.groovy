//打印Hello,world一下几句是等价的
print "Hello,Groovy!\n"
println "Hello,Groovy!"
println ("Hello,Groovy!")

//变量声明与赋值
def int var1 = 0b1001
print "var1 = "+var1+"\n"
print "testFunction: var1+8.131415927 = "+testFunction(var1,8.131415927)+"\n"

var4 = "变量基本运算与字符串拼接 "
def var3 = "var2+1 = "
def int var2 = 5000
println var4+ var3 + (var2+1)
println var2.getClass().getCanonicalName()

String testFunction(var1,var2){
	return var1+var2+""
}

//字符串操作(注意双引号与单引号的区别)
println 'I have $var2 dollar'
println "I have $var2 dollar"

//方法定义与返回类型
def noReturnTypeFunction(String string){
	println "noReturnTypeFunction invoked $string"
//		var1 = "noReturnTypeFunction bottom line"
}
void noReturnTypeFunction1(){
	println "noReturnTypeFunction1 invoked"
	return
}
noReturnTypeFunction("WTF")
noReturnTypeFunction1()

//持有对象
def var0 = 'string'
def aList = [12,false,var0]
aList[100] = "end"
def a1 = aList.size()
println 'aList.size = '+a1
println "aList[100] = "+aList[100]
println  ("aList[99] = " + aList[99])

def aMap = [0:false,"1":true,2:'neutral',"alive":'negative']
println aMap.size()//4
println aMap.get(2)//neutral
println aMap.get("alive")//negative
println aMap['1']//true

def map = [:]
map."an identifier with a space and double quotes" = "ALLOWED"
map.'with-dash-signs-and-single-quotes' = "ALLOWED"
assert map."an identifier with a space and double quotes" == "ALLOWED"
assert map.'with-dash-signs-and-single-quotes' == "ALLOWED"

def aRange = 'a'..'z'
println aRange.from
println aRange.size()
println aRange
println aRange.getClass()

def toyRange = 15..<0
println toyRange.isReverse()
println toyRange.size()
println toyRange
println toyRange.getClass()

//闭包
def aClosure = {
	int var11,int var12 ->
	println "ClosureTest var11*var12="+(var11*var12)
	return var11*var12
}
//def a = aClosure.call(3,9)
def a = aClosure(3,9)
println a.getClass()//Integer

def aClosure2 = {
	println ">>> Closure without arguments $it<<<"
	return it//返回隐含参数it，并试图获取其类型信息
}

def b = aClosure2.call("Haha")
println b.toString()//null
println b.getClass()//class org.codehaus.groovy.runtime.NullObject

def iList = [1,2,3,4,5,6]
def x = iList.each{
	println it
}
println "each returns $x"
def y = iList.findAll{
	it % 2 ==1
}
println "findAll returns $y"

def test = {
	ay,by,Closure cx ->
	println "ay = $ay , by = $by ,cx = "+cx.toString();
	cx(ay,by)
}
test "Art",250,{
	arg1,arg2 ->
	println "arg1 = $arg1 ,arg2 = $arg2"
}

def map1 = [1:false,2:true,3:true,4:false]
def a9 = map1.findAll{
	key,value ->
	if (key % 2 == 1){
		return true;
	}else if(value == true){
			return true
			} else {
		return false
		}
}
println a9
