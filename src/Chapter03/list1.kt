package Chapter03

fun main(args: Array<String>) {
    val immutableList: List<String> = listOf("red", "orange", "yellow")//지료를 수정할 수 없는 리스트 생성
    //immutableList.add("green") <- List<>는 자료 수정이 불가능하다.

    val mutableList: MutableList<String> = arrayListOf("red", "orange", "yellow")//자료형을 수정할 수 있는 리스트 생성
    mutableList.add("green") // <- MutableList<>는 자료 수정이 가능하다.
}