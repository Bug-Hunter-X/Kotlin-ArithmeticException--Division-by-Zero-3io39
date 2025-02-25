```kotlin
fun calculate(a: Int, b: Int): Int {
    return if (b == 0) {
        0 // Or throw an exception, or handle it in a way suitable for your application
    } else {
        a / b
    }
}

fun main() {
    val result = calculate(10, 0)
    println(result) // This will now print 0
    val result2 = calculate(10,2)
    println(result2) // This will print 5
}
```