package demo

import java.util.*

fun main (args : Array<String>) {
    println("Hello world")

    val name = "Sophie"
    var age = 26
    //$variableInYourText

    println("Your name is $name and you are $age years old.")
    println("Your age is an int: ${age is Int}")
    println(78.toChar())

    var myArray = arrayOf("Soph", 'C', 15, 2.15, 5, 19, "Mia")

    myArray[2] = "Pria"

    println("it has ${myArray.size} elements and it contains Pria: ${myArray.contains("Pria")}")

    var partArray = myArray.copyOfRange(0, 3)

    println(partArray.first())
    println(partArray.indexOf('C'))
    println(partArray[2])

    val alpha = 'A'..'Z'
    print(alpha.contains('R'))
    for (x in partArray) println(x)

    when (age) {
        0, 1, 2, 3, 4, 5 -> println("Go to Preschool")
        in 6..25 -> println("go to ${age - 5} grade")
        else -> println("you're done")
    }

    //1..10 = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    for (x in 1..10) {
        println("Loop: $x")
    }

    val random = Random()
    val magicNum = random.nextInt(50) + 1
    var guess = 0
    while (guess != magicNum) {
        guess++
    }
    println("That's right! It's $guess")
    for (x in 1..20) {
        //continue = dont use x in the further code
        if (x % 2 == 0) {
            continue
        }
        if (x % 3 == 0) {
            println("$x is devidable by 3"); continue
        }
        println(x)
        if (x == 19) {
            break
        }
    }

    var arr3: Array<Int> = arrayOf(3, 6, 9, 12, 15)
    for (i in arr3.indices) {
        println("Mult 3: ${arr3[i]}")
    }

    for ((index, value) in arr3.withIndex()) {
        println("Index: $index Value: $value")
    }
    //!!!!!!!!!!!!!!!!!!!!!!
    fun add(num1: Int, num2: Int): Int = num1 + num2
    println("5 + 4 = ${add(5, 4)}")
    fun subtract(num1: Int, num2: Int): Int = num1 - num2
    println("5 - 4 = ${subtract(5, 4)}")
    println("5 - 7 = ${subtract(5, 7)}")

    fun greeter(name: String) {
        println("Hello $name")
    }

    greeter(name)

    fun getSum(vararg nums: Int): Int {
        var sum = 0
        nums.forEach { x -> sum += x }
        return sum
    }

    println("The sum is: ${getSum(1, 2, 5, 4, 7, 8, 95, 8, 4)}")

    val numList = 1..20
    val evens = numList.filter {it % 2 ==0}
    // .forEach = do to every element -> {this}
    evens.forEach {n-> println(n)}



    fun makeMath(num1: Int): (Int) -> Int = {num2 -> num1 * num2}
    val mult3 = makeMath(3)
    val mult3times5 = mult3(5)
    println(mult3times5)
}







