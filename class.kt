
fun main() {
    val test = Person("test", 10)
    println(test.name)
    println(test.age)

//    test.name = "test2"
    test.age = 30

    println(test)
}

class Person(val name: String, var age: Int)
