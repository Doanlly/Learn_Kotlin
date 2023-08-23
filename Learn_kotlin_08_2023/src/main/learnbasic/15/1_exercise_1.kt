package `15`

fun tong(a:Double,b:Double){
    println("$a + $b = ${a+b}")
}
fun hieu(a:Double,b:Double){
    println("$a - $b = ${a-b}")
}
fun nhan(a:Double,b:Double){
    println("$a * $b = ${a.times(b)}")
}
fun chia(a:Double,b:Double){
    println("$a / $b = ${a.div(b)}")
}
fun main(args: Array<String>) {
    println("Nhap + - * / ")

    while (true) {
        print("Bạn nhập: a,b ")
        var a: String = readln()
        var b: String = readln()
        var i: String = readln()
        if(a == "a"){
            break
        }
//        if (i == "+") {
//            tong(a.toDouble(), b.toDouble())
//        } else if (i == "-") {
//            hieu(a.toDouble(), b.toDouble())
//        } else if (i == "*") {
//            nhan(a.toDouble(), b.toDouble())
//        } else if (i == "\\") {
//            chia(a.toDouble(), b.toDouble())
//        } else {
//            println("Vui lòng nhập lại")
//        }
        when(i){
            "+" -> tong(a.toDouble(), b.toDouble())
            "-" -> hieu(a.toDouble(), b.toDouble())
            "*" -> nhan(a.toDouble(), b.toDouble())
            "/" -> chia(a.toDouble(), b.toDouble())
            else -> println("Vui lòng nhập lại")
        }
    }
}