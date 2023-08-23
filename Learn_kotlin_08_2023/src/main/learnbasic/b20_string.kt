import java.lang.StringBuilder


fun main(args: Array<String>) {
    var a:String = "DOANZZ"
    var b = " dasdasdsdsds"
    var c = "\"  \\  \\t tab ngang \\n dong moi"
    println("Hoc \"Hoc nua\" \t \nhoc mai")
    println("Lengh c = ${c.length}; c[15] = ${c[15]} (index = 0)")
    println("Kiem tra vi tri xuat hien dau tirn trong string: IndexOf. con LastIndexOf la tra ve vi tri xuat hien cuoi cung")
    println(b.indexOf("d"))
    println(b.lastIndexOf("a"))

    var cc = "as"
    var cccc = "as__aaas"
    if(cccc.contains(cc)){
        println("cc la 1 chuoi con")
    }
    println("${cccc.substring(0,2)}")
    if(cccc.substring(0,2) == cc){
        println("cc la string con")
    }

    //replace
    var replace = "Xin chao Doan yeu Lisa lisa"
    var re1 = replace.replace("Lisa", "Ly", ignoreCase = true)
    println("String re1 sau khi thay doi: $re1")
    //trim(): xoa toan bo khoang trang  o dau va cuoi
    //trimEnd() xoa toan bo khoang trang o cuoi
    //trimStart() xoa toan bo khoang trang o dau
    var test = "  Day la Dai Tieng noi Viet Nam    "
    println(test.length)
    println(test.trim())
    println(test.trim().length)
    println(test.trimEnd())
    println(test.trimEnd().length)
    println(test.trimStart())
    println(test.trimStart().length)

    //noi chuo
    var te = "Xhao"+test
    te = "cao".plus(test)

    //DUng stringbuider se tot hon, dau tien can khai bao
    var strbd = StringBuilder()
    //khoi tao
    var s29 = StringBuilder("Hahaaha")

    //insert vao vi tri thu 0 - 1 - 2
    s29.insert(2,"nguoi yeu oi")
    println("s29 = $s29")

    s29.append(" Ngoai kia ")
    println("s29 = $s29")
    s29.reverse()
    println("s29 revesed Dao nguoc: $s29")

    // tach chuoi tra ve lít
    //lowercase tra ve chu thuong
    //uppercase

    var z  = "helo.Doandz"
    var zz:List<String> = z.split(".")
    println("Array luu ssau khi dung split:")
    for(i in zz){
        print(" $i - ")
    }
    println()
    println(z.lowercase())
    println(z.uppercase())

    var mk = z.toCharArray()// tach cac ky tu o chuoi nay ra

    for(i in mk){
        println("$i : type - ${i::class.java.typeName}")
    }
    //nhap 1 chuoi tu ban phim: dem xem bao nhieu ky tu thuong, in hoa, bao nhieu so, bao nhieu space
    var inp:String? = readLine()
    if(inp == null)return
    var mv  = inp.toCharArray()

    var cntuppCase:Int = 0;
    var cntLowCase:Int = 0;
    var cntNumber:Int = 0;
    var cntWhitesp:Int = 0;

    for(i in mv){
        if(i.isUpperCase()){
            cntuppCase++
        }
        if(i.isLowerCase()){
            cntLowCase++
        }
        if(i.isDigit()){
            cntNumber++
        }
        if(i.isWhitespace()){
            cntWhitesp++
        }
    }
    println("Chuoi so: $inp :\n co: $cntLowCase chu thuong, $cntuppCase chu hoa, $cntNumber chu so, $cntWhitesp space")

}   //constants(string): kiem tra chuoi con, substring: trich loc chuoi con tu chuoi ban dau(2,10)