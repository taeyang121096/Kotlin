
fun main() {
    val dog: Animal = Dog()
    val cat = Cat()

//    type check 는 is 사용
    if (dog is Dog){
        dog.draw()
        println("dog is")
    }
//    강제 캐스팅 as 사용
//    cat as Dog
    
}

interface  Drawable {
    fun draw()
}

open class Animal {
    open fun move() {
        println("move")
    }
}

class Dog : Animal(), Drawable {
    override fun move() {
        println("run")
    }

    override fun draw() {
        TODO("Not yet implemented")
    }
}

class Cat : Animal(), Drawable {
    override fun move() {
        println("walk")
    }

    override fun draw() {
        TODO("Not yet implemented")
    }
}
