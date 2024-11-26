
fun main() {
    val items = listOf(1,2,3,4,5)

    for (item in items) {
        println(item)
    }

    items.forEach({ item -> println(item) })

    for (i in 0..(items.size-1)) {
        println(items[i])
    }

    var i = 0
    while (i < items.size) {
        println(items[i])
        i++
    }


}
