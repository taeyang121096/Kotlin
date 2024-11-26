import kotlin.math.max
import kotlin.random.Random

fun main() {
    var i = 10
    var j = 20
    println(max(i, j))

    var randomNumber = Random.nextInt(0, 100) // 0 ~ 99 사이의 랜덤한 숫자
    println(randomNumber)
}
