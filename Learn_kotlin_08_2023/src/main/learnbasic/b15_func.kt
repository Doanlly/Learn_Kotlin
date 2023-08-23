fun BMI(a:String, b:String, c:String , d:String){
    println("Hello $a. THong tin cua ban nhu sauL:")
    println("Ho va ten: $a\nNam Sinh:$b\n Can nang: $c\nChieu cao: $d")
    if(18 <= b.toInt() && b.toInt()<= 35 ){
        println("Ban la 1 thanh nien")
    }else{
        println("Ban khong phai 1 thanh nien")
    }
    //BMI = W/ [ (H)2]
    var bmi = c.toDouble() / ((d.toDouble()/100)*(d.toDouble()/100))
    if(25 < bmi&& 29.9>bmi){
        println("Ban thuoc tuyp nguoi Beo")
    }else if (18.5 < bmi&& 24.9>bmi){
        println("Ban thuoc tuyp nguoi Can doi")
    }else if ( 29.9< bmi){
        println("Ban thuoc tuyp nguoi Qua beo")
    }
    else{
        println("Ban thuoc tuyp nguoi gay")
    }
}
fun main(args: Array<String>) {
    sum(1,2,3)
    var c = sum(1,2,3)
    hello()
    println("Sum = $c")

    while (true){
        println("Nhap name = 0  de ket thuc")
        println("Nhap ten")
        var name:String =  readln()
        if(name == "0" ){
            println("Stop program! Thanks for use")
            break
        }
        println("Nhap tuoi")
        var age:String = readln()
        println("Nhap chieu cao ")
        var tall:String = readln()
        println("Nhap can nang")
        var weight:String = readln()
        BMI(name,age,tall,weight)

    }

}
fun sum(a:Int, b:Int,c:Int):Int{
    return a+b+c
}
fun hello(){
    println("Xin chao doan 180cm")
    println("Vui long nhap thong tin chi tiet")

}