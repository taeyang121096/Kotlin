
fun main() {
    val box = Box(10)
    val box2 = Box("test")

    println(box.value)
}

class Box<T>(var value: T) {
}
