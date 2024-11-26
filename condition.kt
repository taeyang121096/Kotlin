
fun main() {
    var i = 5
//    if 문
    if (i > 10) {
        println("i는 10보다 큽니다.")
    }
    else {
        println("i는 10보다 작거나 같습니다.")
    }
//    when 문
    when {
        i > 10 -> {
            println("i는 10보다 큽니다.")
        }
        else -> {
            println("i는 10보다 작거나 같습니다.")
        }
    }

//    kotlin 은 식을 변수에 넣을 수 있다.
    var result = when {
        i > 10 -> {
            "i는 10보다 큽니다."
        }
        else -> {
            "i는 10보다 작거나 같습니다."
        }
    }
    println(result)
//    삼항 연산
    // boolean result = i > 10 ? true : false;
    var res = if (i > 10) true else false
    println(res)
}
