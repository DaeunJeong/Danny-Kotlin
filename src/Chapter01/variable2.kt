package Chapter01

fun main(args: Array<String>) {
    //코틀린은 변수 및 변수 내 할당된 값의 불변 여부를 구분한다.

    //val : 값을 한번 할당하고 나면 그 후에 변경할 수 없는 변수, JAVA의 final과 같은 존재
    val name: String = "JeongDaeun"
    //name = "JeongDasilver" <- 값 변경 불가능

    //var : 할당된 값을 자유자재로 바꿀 수 있는 변수
    var age: Int = 17
    age = 18 //<- 값 변경 가능


}
