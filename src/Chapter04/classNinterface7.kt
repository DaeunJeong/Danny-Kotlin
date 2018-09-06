package Chapter04

class Danny7(val a: Int, var b: Int) {
    //a의 값만 인자로 받는 추가 생성자
    constructor(a: Int) : this(a, 0) //기본 생성자를 반드시 호출해야 한다.

    //두 인자의 값을 모두 0으로 지정하는 생성자
    constructor() : this(0, 0)
}