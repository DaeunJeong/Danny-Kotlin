package Chapter04

//인터페이스 선언
interface Bar {

    fun baz()
}

//인터페이스의 인스턴스 생성
val bar = object:Bar { //object: [인터페이스 이름]형태로 선언

    override fun baz() {
        //함수 구현
    }
}