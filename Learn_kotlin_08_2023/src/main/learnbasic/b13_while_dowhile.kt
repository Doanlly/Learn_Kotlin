fun main(args: Array<String>) {
    var i =0
    while (i <= 5){
        print(" $i ")
        i++
    }
    println("\n Moi ban nhap: ")
    var n = 0
    //n trong khoang 11-99
    while (n < 1|| n> 99){
        var s:String = readln()
        if(s!= null){
             n = s.toInt()
        }
    }
    println("Ban nhap hop le")
    var tong = 0
    i = 0
    do {
        tong = tong+i
        println(" i = $i tong = $tong")
        //chay vong lap truoc khi xet dieu kien
        i++
    }while (
        i <=4
    )
    println("Tong cuoi cung: $tong")
    while (true){
        println("Banj muon thoat chuong trinh?")
        var s:String = readln()
        if(s =="y"|| s =="Y"){

            break
        }
    }
    println("Cam on ban da su dung phan mem")


}