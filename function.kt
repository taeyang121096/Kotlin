
fun main() {
    println(sum(1, 2))

    println(sum(b = 1, a = 2))
}

//fun sum(a: Int, b: Int): Int {
//    return a + b
//}

fun sum(a: Int, b: Int, c: Int = 0) = a + b + c
