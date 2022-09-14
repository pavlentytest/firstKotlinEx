// комментарий

fun main() {
    println("Hello World!")
    val age: Int = 20 // value
    //age = 50
    println(age)

    /*
    Group comment
     */
    var age2: Int = 40
    age2 = 40

    val a: Byte = -10
    val b: Short = 45
    var c: Int = -250
    val d: Long = 3000

    val h: Double = 4.5
    val f: Float = 5.6F

    val flag: Boolean = true

    c = d.toInt()
    val ch: Char = 'A'
    val name: String = "Ivan"
    val lastname: String = "Ivanov"
    val hello = "Hello, $name $lastname"
    println(hello)
    println(hello::class)

    val width = 6.7
    // print()
    //println()
    print("Input name:")
    //val nn = readLine()
    //println(nn)
    val z = readLine()?.toInt()
    println(z)

    val a1 = 11
    val y1 = 5
    val z1 = a1/y1 // z1 = 2

    val a2 = 11
    val y2 = 5.0
    val z2 = a2/y2 // z = 2.2

    val b1 = 65
    val b2 = 10
    val b3 = b1 % b2 // 5

    var w1 = 5   // 6
    var w2 = ++w1 // 6

    var w3 = 5      // 6
    var w4 = w3++   // 5

    val g = 10
    if(g == 10) {
        println("10")
    } else if(g == 8) {
        println("")
    } else {
        println("")
    }

    val s = 10
    val p = 20
    //val l = if (s>p) s else p
    val l = if (s>p) {
        println("s = $s")
        s
    } else {
        println("p = $p")
        p
    }

    val flag2 = true
    when(flag2) {
        false -> println("False")
        true -> println("True")
    }


}
fun sqr(x: Int): Int {
    return x*x
}
fun sqr2(x: Int) = x*x

