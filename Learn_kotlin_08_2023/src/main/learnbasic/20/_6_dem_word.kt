fun main(args: Array<String>) {
    var a = """
       Đoan đep trai
        THảo thì xinh gái
        trai tài gái sắc, trai
    """.trimIndent()
    var b = a.split(" ","\t")
    println("Nhập ký tự muốn tìm : ")
    var c:String? = readLine()
    if(c== null){return}
    else {
        var count = 0;
        for (i in b) {
            val trimWord = i.trim()
            println(trimWord+ " ")
            if (trimWord == c){

                count++
                println(count)
            }
        }
        println("$c xuất hiện: $count lần")
    }
    //bai 20.7, tach so va chuoi
    var q = "123gh123g123"
    var so = ""
    var chu = ""
    for(i in q){
        if( i.isDigit()){
            so += i
        }
        if(i.isLetter()){
            chu+=i
        }
    }
    println(" số: $so, chứ: $chu ")

}