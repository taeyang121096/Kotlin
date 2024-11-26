
fun main() {
    var name: String? = null
    name = "test"
    name = null

    var name2: String = ""

//    name2 = name -> 서로 다른 타입임
    if (name != null) {
        name2 = name
    }

//    별로 안좋은 방식
    name2 = name!!

//
    name?.let {
        name2 = it
    }
}
