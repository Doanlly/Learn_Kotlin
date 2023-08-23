fun main(args: Array<String>) {
    var t = "Englis = 20 Science = 48 Math = 70 Physical = 50"
    var z = t. split(" ")
    var tong = 0
    var dem = 0
    for(i in z){
        if(i[0].isDigit())
        {
            println(i + " ")
            dem++
            tong = tong+ i.toInt()
        }
    }
    println(z.size)
    println("Tong = $tong, trung binh cong: ${tong/dem}")
    //Kiem tra chinh hop le cua mk
    //sai qua 5 lan thi out c trinh
    //kiem tra dai hay ngan, du cac ky tu
    var mk:String?
    //nhập và kiểm tra độ manh mk
    while (true){
        println("Mời nhập mật khẩu ")
        var dem = 0
        var demchu = 0
        mk = readLine()
        if(mk!= null){
            //if(mk[0].isDigit() || mk[0].i)
            if(mk.length <= 5){
                println("Mat khau it nhat 6 ky tu")
            }else{
                for(i in mk){
                    if(i.isDigit()){
                        dem++
                    }else if(i.isLetter()){
                        demchu++
                    }
//                    println(i+ " ")
                }
                if(dem*demchu==0){
                    println("Mat khau khong hop le")
                } else{
                    println("Ban da thiet lap xon  mat khau")
                    break
                }
            }
        }
    }
    // cho ngu dung nhap
    var demdangnha= 0
    while (true){
        println("moi ban nhap, Lan thu thu $demdangnha/5")
        var long:String? = readLine()
        if(long!= null){
            if (demdangnha == 5){
                println("ƠBan da nhap sai qua 5 lan, bi khia")
                break

            }else if(long == mk){
                kotlin.io.println("Dnag nhap thanh cong")
                break
            }else{
                demdangnha++
            }
        }
    }
}