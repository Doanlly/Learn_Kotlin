
    fun main(){
        println("Hello World"+ 1000000)

        var x = 6 // co the thay doi
        var a = 120
        println("x: $x; a = $a, kiểu của a là ${a::class.java.typeName}")
        x = 10

        println("x new: $x; a = $a")
        var floa:Float = 4.5f
        var zzz:Long = 4L
        var bbb:Byte = 127
        var shsh:Short = 1231
        var charr = 's'
        val z = 100; // khong the gan gia tri moi
        // function a block code

        sayHello("Doan dep trai")
        var summ = sum(2.3,4.7)
        println("Sum 2.3+4.7 = $summ")
        showColor(255,0,0,0.5f)
        like("apple", "banana","lisa")

        var tong = a plus 10 plus  20
        println("a = $a , Tong = $tong")
        var nhan:Int = a nhan 3
        println(nhan)
        var yeuu:String = "lisa"
        // du lieu gan khong duoc phep Null
        println(yeuu +  "Doan" yeu "lisa" +" yeuu co kieu la ${yeuu::class.java.typeName}")
        var email:String?  // co the gan null, mac dinh thi se khong co// kieu du lieu optional
        email = "nguyendoan0307@gmail.com"
        //mail = null
        //Elvis Operator :? thay cho if-else , tra ve gia tri mac dinh neu no null
        println("email = ${email ?: "vi email null nen ket qua la: \n email = nguyenvandoan0307@gmail.com"} \n length email.length = ${email.length ?: 0}")
        var kj:Int? = null
        println("Data type as int also $kj ")
        // ngoai ra con when trong Kotlin tương đương với switch-case
        kj = 100
        var kq = when (kj){
            100-> " kj is True"
            1  -> " kj is False"
            else -> "100 or 1 , not any number "
        }
        println("kj = 100 nen ket qua: = $kq")
        doSomething(1,2, completion = {resul:Int ->run{
            println("result is: $resul")
        }})

        var aaaa = """Than 
            em
        """
        var bl:Boolean = true
        //mang so thuc:
        var arrdpuble:FloatArray = floatArrayOf(0.5f,0.6f)
    }
