
const val compileNum = 30

fun main()  {
//    변수 선언
    var i = 10
    var name = "test"
    var point = 3.3

    var i2 : Int  = 10
    var name2 : String  = "test2"
    var point2 : Double  = 3.4

    i = 20

    val num = 20
//    num = 30 -> 상수는 불가능

    print(compileNum)

//    형변환
    var i3 = 10
    var l = 20L

    l = i3.toLong()
    i3 = l.toInt()

}
