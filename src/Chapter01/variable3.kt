package Chapter01

fun main(args: Array<String>) {
    //Kotlin은 널(null)값의 허용 여부를 명확히 구분한다.

    //null 값을 허용하는 문자열 타입(String?)
    val name1: String? = "JeongDaeun"
    val name2: String? = null //null값 가능

    //null 값을 허용하지 않는 문자열 타입(String)
    val job: String = "student"
    //val job: String = null <- null값 불가능
}
