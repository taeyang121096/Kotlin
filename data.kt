
fun main()  {
    val test = Persons("test", 10)
    val test2 = Persons("test", 10)

    println(test)
    println(test2)
    println(test == test2)

//    test.hobby = "test hobby"
    println(test.hobby)

}

data class Persons(
    val name: String,
    var age: Int
) {
    var hobby = "축구"
        private set
        get() = "취미 : $field"

    init {
        println("init")
    }

    fun some()  {
        hobby = "농구"
    }
}
