
fun main() {
    val items = listOf(1,2,3,4,5)

    println(items)
    val items2 : MutableList<Int> = mutableListOf<Int>(1,2,3,4,5)
    items2.add(6)
    items2.remove(3)
    println(items2)
}
