
fun main() {
    myFunc(10) { println("콜백 호출") }
}

fun myFunc (a:Int,callBack : () -> Unit) {
    println("myFunc 호출")
    callBack()
    println("myFunc 호출 끝")
}
