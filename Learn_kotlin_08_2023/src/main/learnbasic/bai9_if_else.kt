import  kotlin.math.sqrt
fun main(args: Array<String>) {
    var a1= 100
    var b1 = 50
    var max = 0
    if(a1.toFloat() > b1.toInt() && a1>= 0 && b1>=0){
        println("a1> b")
        max = a1.toInt()
    }else if (a1< b1 && a1>= 0 && b1>=0){
        println("a1< b")
        max = b1.toInt()
    }else{
        println("a1= b")
        max = a1.toInt()
    }
    var mx = 0;
    mx = if(a1>b1) a1 else b1
    println("Max = "+  max + " mx = "+ mx)

    println("Tim x, y khi biet tong va1hieu cua1chung")
    println("case 1: tong = 100, hieu = 37")
    var x:Double
    var y:Double
    var sum = 100
    var hieu = 37
    println("x = " + ((sum+hieu).toFloat().div(2)).toFloat() + " y = "+  (sum - ((sum+hieu).div(2))).toFloat())


    //Chuong trinh tinh nam nhuan
    println("\n_________------------------__________\nChuong trinh tinh nam nhuan")
    println("Nam nhuan la1nam chia1het cho 4 nhungko chiahet cho 100")
    println("Liet ke tat ca1cac nam nhuan tu 2000-2100")
    var check  = 0;
    for (i in 2000..2100){
        if(i % 4 ==0 && i %100 != 0){
            print( " " + i + " ; ")
        }
    }
    println("Giai phuong trinh bac 2")
    println("ax^2 + bx + c = 0 ; delta1 = b^2 - 4ac")
    println("Nhap a: ")
    var aa:String?  =  readln()
    println("Nhap a: ")
    var bb:String? = readln()
    println("Nhap a: ")
    var cc:String? = readln()

    if(aa!= null && bb!= null && cc!= null){
        var a = aa.toInt()
        var b = bb.toInt()
        var c = cc.toInt()
        var delta = b*b - 4*a*c;
        if(delta < 0 ){
            println("Phuong trinh vo nghiem")
        } else if(delta == 0){
            println("Phuong trinh co nghiem kep x1; x2 = "+ ((-b).toFloat()/(2*a)))

        }else{

            println("Phuong trinh co 2 nghiem phan biet: \nx1 = ${(-b+ sqrt(delta.toFloat())).toFloat()/(2*a)}" )
            println("x2 =  = ${(-b- sqrt(delta.toFloat())).toFloat()/(2*a)}" )

        }
    }

}