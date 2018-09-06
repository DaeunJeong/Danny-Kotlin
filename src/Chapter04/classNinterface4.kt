package Chapter04

class Person {
    val name: String? = null //값을 읽을 수만 있는 val (Getter)
    var address: String? = null //값을 읽고 쓰는 게 모두 가능한 var (Getter, Setter)
    //코틀린에서 클래스의 멤버로 사용하는 프로퍼티는 초깃값을 명시적으로 지정하거나 생성자에서 값을 할당해야 한다.

    lateinit var nickName: String //프로퍼티 선언 시점이나 생성자 호출 시점에 값을 할당할 수 없는 경우 lateinit 키워드 사용

    //프로퍼티에 초깃값을 할당하는 시점에서 프로퍼티의 타입을 추론할 수 있ㄷ면 타입선언 생략 가능
    var bloodType = "O형" //var name : String = "O형"과 동일
    var age : Int? = null //null만으로는 타입을 추론할 수 없기에 타입 선언 필요

}