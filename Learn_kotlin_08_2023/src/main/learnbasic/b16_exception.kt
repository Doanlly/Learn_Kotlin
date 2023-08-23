fun Thuong(a:Int,b:Int): Int{
    if(b==0){
        throw  Exception("mau bang 0 ko tinh dc")

    }
    return a/b
}
fun main(args: Array<String>) {
    //excaption: ngoai lệ
    /*là những
    lỗi có thể phát sinh khi thực thi, ví dụ như đọc 1 file ko tồn tại hoặc kết nối với datavase không có sẵn,
    xử lý ngoại lệ giúp thông báo,tiếp tục chạy chương trinh mà ko làm gián đoạn, treo màn hhk
    * */
   /* var a =  10
    var b = 0
    try {
        var c = a/b
        println(c)
    }catch (e:Exception)
    {
        e.printStackTrace()
    }*/
//    finally {
//        //van pahi dung code trong nay. kieu thoat CSDL ngay lap tuc
//        println("THoat khoi database")
//    }
   /* println("Chuong trinh loi")
    //try-catch-finnaly: thu va xuat loi, van thuc hien

    //throw statement: nhung loi co the du doan duoc
    Thuong(5,0)
    println("Doan code phia sau\n________\n")*/
    try {
        Thuong(5,0) //kiem tra xem chay dc ko, nhung doan code sau ko chy dc
    }catch (e:Exception){
        println(e.message) // neu co koi thi xuat ra
        //return // dung lai cac doan cdoe phia sau
    }
    finally {
        println("ket thuc csdl")
    }
    println("Doan code phia sau")
}
