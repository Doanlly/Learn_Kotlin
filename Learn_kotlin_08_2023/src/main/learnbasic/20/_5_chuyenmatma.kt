package `20`

fun main(args: Array<String>) {
    //chuyển mật mã theo bảng
    var a = "qwertyuiopasdfghjklmnbvcxz"
    var b = "mnbvcxzpoiuytrewqasdfghjkl"
    var mahoa = ""
    println("Mời bạn nhập vào chuooixmax hóa")
    var s:String? = readLine()
    if(s==null) return
    for(i in s){
        //println(a.indexOf(i))
        println(b[a.indexOf(i)]+ " ")
        mahoa +=b[a.indexOf(i)]
    }
    println("ma hoa $s -- $mahoa")
}