import com.example.test.Test
import groovy.transform.Field;

def test = new Test("Groovy","is wonderful!")
test.print()

//def x = 11
//int x = 11
//def int x = 11
//上述三种写法均导致x作为局部变量编译到run方法中

@Field x = 11
//仅有此种写法编译时会让x成为test类的成员变量

def printx(){
	println "x = $x"
	//可以访问上述test类的成员变量x
}
printx()


//引用方法的方式
void testMethod (var1) {
	println "testMethod invoked,var1 = $var1"
}
testMethod("Fang Tangjing")
testMethod var1:"Fang Tangjing",var2:"Bao Butong"