
fun main() {
//    lifecycleScope 가 필요함
//    myFunction(10) { println("콜백 호출") }
}

suspend fun myFunction (a:Int,callBack : () -> Unit) {
    println("myFunc 호출")
    callBack()
    println("myFunc 호출 끝")
}
