package Chapter04

//추상클래스 선언
abstract class Foo {

    abstract fun bar()
}

//추상 클래스의 인스턴스 생성
var foo = object:Foo() { //object: [생성자] 형태로 선언

    override fun bar() {
        //함수 구현
    }
}