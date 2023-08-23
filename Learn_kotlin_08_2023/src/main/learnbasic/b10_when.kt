fun main(args: Array<String>) {
    //giong switch-case , when cung tuong tu  when(condition) a->cau lenh1

    var a:Int = 7
    when(a){
        1,2,3 -> println("Thuoc quy1")
        4,5,6 -> println("Thuoc quy2")
        7,8,9 -> println("Thuoc quy3")

        else -> println("bam tao lai")
    }
    var check = when(a){
        in 1..3 -> println("ngheo")
        in 4..6 -> println("Binh thuong")
        in 7..9 -> false
        else -> println("Nhap lai")
    }
    println(check)
    when {
        a%2 ==0 -> println("a chan")
        else -> println("a le")
    }
}