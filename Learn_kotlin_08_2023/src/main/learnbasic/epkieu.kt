
fun main(args:Array<String> ){
    var a:Long = 1231
    var b:Short = a.toShort() ///neu = a se bao loi vi a la kieu long
    println("s mat mat data tu long - short a = $a ; b = $b - type: ${b::class.java.typeName}")//mat mat du lieu

    var m:Float = 400.4F
    var n:Int = m.toInt()
    println("Floa d m = $m;  n = $n ")
    println("a%10 + n = a.plus(n0 =  ${(a%10).plus(n)}" )
    println("a - n*100 = a.minus(n*100) =  ${a.minus(n*100)}")
    println("a * n / 100 = a.time(n).dic(100) =  ${a.times(n).div(100)}")
    println("a%10 - n%10 = a.rem(10) - n.rem(10) =  ${a.rem(10) - n.rem(10)}")

    // 1 luu y la vi a, b deu in nhung khi div(chia) thi co the la so thuc (double , Float) nen can gan kieu lai cho a la kw se tu dong qua doube
    var move:Float = n.toFloat()
    println("Move / 22 = ${move.div(22)} and  type  =  ${move::class.java.typeName}")

    //Toan tu tien do 1 ngoi a.unaryPlus and unaryMinus am va duong
    var test:Float = 30f
    var unaryF = test.unaryPlus()
    var unaryMinus = test.unaryMinus()
    println("\n ___________ su dung de gan + - trc bien:___\n test = "+ test + "; unaryF = "+ unaryF + " ; unariMinus = "+ unaryMinus)


}
