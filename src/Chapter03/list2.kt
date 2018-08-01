package Chapter03

fun main(args: Array<String>) {
    val immutableList: List<String> = listOf("red", "orange", "yellow", "green")

    var firstItem: String = immutableList[0] //첫번째 항목 가져오기(get(0)과 동일)
    println(firstItem)
    firstItem = immutableList.get(1) //두번째 항목 가져오기
    println(firstItem)

    //immutableList[0] = "blue" <- List<>는 자료 수정이 불가능 하기 때문에 컴파일 오류

    val mutableList: MutableList<String> = arrayListOf("red", "orange", "yellow", "green")

    mutableList[0] = "blue" //첫번째 항목 수정(set(0, "blue")와 동일)
    println(mutableList)
    mutableList.set(1, "indigo") //두번째 항목 수정
    println(mutableList)
}