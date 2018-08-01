package Chapter03

fun main(args: Array<String>) {
    val immutableMap: Map<String, Int> = mapOf(Pair("A", 65), Pair("B", 66)) //아래의 코드와 동일
    val immutableMap2: Map<String, Int> = mapOf("A" to 65, "B"  to 66)

    var code: Int? = immutableMap["A"] //키 "A"에 해당하는 값(immutableMap.get("A")와 동일
    println(code)
    code = immutableMap.get("B")
    println(code)

//    immutableMap["C"] = 67 <-자료 변경 불가능

    val mutableMap: HashMap<String, Int> = hashMapOf(Pair("A", 65), Pair("B", 66))

    mutableMap["C"] = 67 //자료 변경 가능
}