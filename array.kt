
fun main() {
    val items = arrayOf(1,2,3,4)

    items[0] = 12

    println(items)

    try {
        val item = items[6]
    } catch (e: Exception) {
        print(e.message)
    }

}
