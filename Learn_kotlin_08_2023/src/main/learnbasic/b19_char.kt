fun main(args: Array<String>) {
    //khai bao tuong minh va khong tuong minh
    var a:Char = 'D'
    var b:Char = '/' //neu de"" se bao loix  vi no chi nhan dau ''
    println("Type of a : $a is ${a::class.java.typeName}")
    println("Type of b : $b is ${b::class.java.typeName}")

    //cach 2 : khai bao ASCII
    for(i in 0..127){
        var c = Char(i)
        print("$i = $c  ")
        if(i%10 ==0){
            println()
        }
    }
    println("\nMoi ban nhap ky tu: ")
    var s:String? = readLine()
    if(s== null) return
    var kt:Char = s.first() //
    var kt2:Char = s[0]
    var kt3:Char = s.single()
    println("kt1 = $kt \n kt2 = $kt2 \n kt3 = $kt3")
    println("${"a".equals("b")}")

    //char method
    //charDigit: chuoi truyen vao la so vd: '1'.Digit()
    //'a'.isLetter
    //isWhiteSpace // neu chuoi chuyen vao la 1 space
    //'a'.isLowerCase()//ky tu thuong
    //Upper neu la chu hoa

    println("s : ${kt.isDigit()}")
    println("s : ${kt.isLetter()}")
    println("s : ${kt.isLowerCase()}")
    println("s : ${kt.isWhitespace()}")
    println("s : ${kt.isUpperCase()}")
}