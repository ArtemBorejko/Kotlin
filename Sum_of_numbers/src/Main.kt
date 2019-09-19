class SumOf(var a: Int, var b: Int, var c: Int) {
    fun sum(){
        println("Sum is: ${a + b + c}")
    }
}

fun main() {
    println("Введите числа: ")
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    var c = readLine()!!.toInt()
    SumOf(a, b, c).sum()
}