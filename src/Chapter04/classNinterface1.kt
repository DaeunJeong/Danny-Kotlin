package Chapter04

class Danny {

}
// 코틀린에서 접근 제한자를 지정하지 않는 경우 public으로 간주한다.


class Danny2 //클래스 본체 없이 클래스를 선언할 수 있다.

//인자 하나를 받는 클래스 선언
class Danny3(a: Int) {

}

class Main {
    fun main(args: Array<String>) {
        val danny: Danny = Danny() //클래스의 인터페이스 생성
        val danny3: Danny3 = Danny3(1); //인자 하나를 받는 생성자로 인스턴스 생성

    }
}

//인터페이스 또한 동일한 규칙 적용