import java.lang.Exception

fun main(args: Array<String>) {
    try {
        devideForZero();
    }catch (e:Exception){
        print(e.message)
    }
    print("tks")
}

fun devideForZero(): Int {
    var a: Int = 5
    var b: Int = 0;
    if (b == 0) {
        throw Exception("mau so bang 0")
    }
    return a / b
}

fun maxOfArray(array: IntArray): Int {
    var max = array[0]
    for (i in array) {
        max = if (i > max) i else max
    }
    return max
}

fun doGreatestDivisor(a: Int, b: Int): Int {
    var result = 1
    val min = if (a > b) b else a
    for (i in min downTo 1) {
        if (a % i == 0 && b % i == 0) {
            result = i
            break
        }
    }
    return result
}

fun doFactorial(n: Int): Int {
    var result = 1
    for (i in 1..n step 2) {
        result *= i
    }
    return result
}

fun inputData(): Int {
    print("pls input some key code\n")
    var inputData: String? = readLine()
    if (inputData != null) {
        var result: Int = inputData.toInt()
        return result
    }
    return 0
}

fun max2number(): Int {
    val a = 10
    val b = 4
    var max: Int
    max = if (a > b) a else b
    return max
}

fun whenExpression(keyCode: Int) {
    when (keyCode) {
        0 -> println("Noooo")
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        else -> println("four")
    }
}

