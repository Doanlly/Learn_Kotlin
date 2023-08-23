import kotlin.math.PI

fun main(args: Array<String>) {
    /*Ep kieu du lieu cho String
    -toBoolean
    -toByte
    -toShort
    -toInt
    -toLong
    -toFloat
    -toDouble*/
    var a = "true".toBoolean()
    var b = "100".toByte()
    var c = "10".toInt()
    var d = "2.0f".toFloat()
    var e = ""
    //Nhap du lieu tu ban phim
    //dung readline de doc, tra ve 1 chuoi
    //co the tra ve null neu khong co du lieu
    println("Nhap du lieu tu ban phim: ")
    var name:String? = readln()
    println("name your enter is: " + name)

    println("Nhap old: ")

    //phai chac chan ko nhan null thi moi cho ep kieu
    var olds:Int = 0
    //Variable 'olds' must be initialized: phai duoc khoi tai truocc
    var old:String?  =  readln()
    if(old!= null){
        olds = old.toInt()
        println("Old your enter is: " + olds+"type: + ${olds::class.java.typeName}" )
    }
    println("\n thoat khoi vong lap \n Old your enter is: " + olds+"type: + ${olds::class.java.typeName}" )

    println("________________\n \n CHuong chinh tinh chu vi, S hinh tron")

    print("Nhap ban kinh: ")
    var R:Double = 0.0;
    val pi = 3.14
    var bankinh:String? = readln()
    if(bankinh!= null){
        R = bankinh.toDouble()
        println("chu vi = 2*pi*R = "+ (2* PI*R))
        println("Dien tich = pi*R^2 = "+ (PI*R*R))
    }



}