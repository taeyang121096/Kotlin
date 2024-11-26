
# Kotlin 학습 가이드

이 프로젝트는 Kotlin을 처음 배우는 Java 개발자를 대상으로 기본 문법부터 고급 주제까지 다룹니다. Kotlin의 간결함과 강력한 기능을 이해하고 활용할 수 있도록 예제와 설명을 제공합니다.

---

## 목차

1. [기초 문법](#기초-문법)
    - Kotlin 소개
    - 기본 구조
    - 변수와 타입
    - 함수
    - 조건문과 반복문
2. [중급 문법](#중급-문법)
    - 클래스와 객체
    - 상속과 다형성
    - 인터페이스
    - 컬렉션
    - 람다와 고차 함수
3. [고급 문법](#고급-문법)
    - 확장 함수
    - 코틀린 DSL
    - 코루틴
    - null 안정성
    - Kotlin/JVM, Kotlin/Native, Kotlin/JS

---

## 기초 문법

### Kotlin 소개
Kotlin은 JetBrains에서 개발한 프로그래밍 언어로, 간결함과 안정성을 목표로 만들어졌습니다. Java와 100% 호환되며 Android 개발에서 널리 사용됩니다.

### 기본 구조
```kotlin
fun main() {
    println("Hello, Kotlin!")
}
```

### 변수와 타입
Kotlin에서는 `val`과 `var` 키워드를 사용해 변수를 선언합니다.
- `val`: 변경 불가능한 변수(Immutable)
- `var`: 변경 가능한 변수(Mutable)

```kotlin
val name: String = "Kotlin"  // 변경 불가
var age: Int = 10           // 변경 가능
age = 20
```

### 함수
Kotlin의 함수는 `fun` 키워드로 선언합니다.
```kotlin
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 단일 표현식 함수
fun multiply(a: Int, b: Int) = a * b
```

### 조건문과 반복문
```kotlin
// 조건문
val max = if (a > b) a else b

// 반복문
for (i in 1..5) {
    println(i)
}

while (x > 0) {
    x--
}
```

---

## 중급 문법

### 클래스와 객체
Kotlin에서 클래스는 간결하게 정의할 수 있습니다.
```kotlin
class Person(val name: String, var age: Int)

val person = Person("John", 30)
println(person.name)  // John
```

### 상속과 다형성
Kotlin의 클래스는 기본적으로 `final`입니다. 상속하려면 `open` 키워드를 사용합니다.
```kotlin
open class Animal {
    open fun sound() {
        println("Animal sound")
    }
}

class Dog : Animal() {
    override fun sound() {
        println("Bark")
    }
}
```

### 인터페이스
```kotlin
interface Drivable {
    fun drive()
}

class Car : Drivable {
    override fun drive() {
        println("Driving a car")
    }
}
```

### 컬렉션
Kotlin에서는 List, Set, Map 등의 컬렉션을 쉽게 사용할 수 있습니다.
```kotlin
val numbers = listOf(1, 2, 3)  // 읽기 전용 리스트
val mutableNumbers = mutableListOf(1, 2, 3)
mutableNumbers.add(4)
```

### 람다와 고차 함수
람다 표현식과 고차 함수로 간결한 코드를 작성할 수 있습니다.
```kotlin
val sum = { a: Int, b: Int -> a + b }
println(sum(3, 4))  // 7

fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
println(applyOperation(3, 4, sum))  // 7
```

---

## 고급 문법

### 확장 함수
기존 클래스에 함수를 추가할 수 있습니다.
```kotlin
fun String.addPrefix(prefix: String): String {
    return "$prefix$this"
}

println("Kotlin".addPrefix("Hello, "))  // Hello, Kotlin
```

### 코틀린 DSL
Kotlin DSL(Domain-Specific Language)로 간결한 문법을 구현할 수 있습니다.
```kotlin
fun html(block: Html.() -> Unit): Html = Html().apply(block)

class Html {
    fun body(block: Body.() -> Unit) {
        println("<body>")
        Body().apply(block)
        println("</body>")
    }
}

class Body {
    fun p(text: String) {
        println("<p>$text</p>")
    }
}

// 사용 예시
html {
    body {
        p("Hello, Kotlin DSL!")
    }
}
```

### 코루틴
비동기 작업을 쉽게 관리할 수 있습니다.
```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
}
```

### Null 안정성
Kotlin은 NullPointerException을 방지하기 위해 null 안전성을 제공합니다.
```kotlin
var name: String? = null
println(name?.length)  // null
```

### Kotlin/JVM, Kotlin/Native, Kotlin/JS
Kotlin은 다양한 플랫폼에서 실행될 수 있습니다.
- **Kotlin/JVM**: Java와 완벽히 호환
- **Kotlin/Native**: 네이티브 코드로 컴파일
- **Kotlin/JS**: JavaScript로 컴파일

---

## 참고 자료
- [Kotlin 공식 문서](https://kotlinlang.org)
- [Kotlin Playground](https://play.kotlinlang.org)
