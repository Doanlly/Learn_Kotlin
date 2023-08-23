import kotlin.random.Random


fun main() {
    var rd = Random
    var rdNgyen = rd.nextInt(5,10)
    println(" random: $rdNgyen")

    var rdDouble = rd.nextDouble(0.0,1.0)
    var rdDouble1 = rd.nextDouble()
    println("Random so thuc: ${rdDouble*10} \n${rdDouble1+2}")
    //print
    //bai tap check xem ban co dung so cua chuong trinhhay khong?
    var rdrobot = rd.nextInt(1,101)
    while (true){
        println("Moi ban nhap so: ")
        var uenter = readln()
        if(uenter == "a"){
            println("Ket thuc cchuong trinh")
            break
        }
        if(uenter.toInt() == rdrobot){
            println("Ban da du doan dung")
            break
        }else if(uenter.toInt() > rdrobot){
            println("Vui long nhap so nho hon, neu ko muon hay  go 'a'")
        }else if(uenter.toInt() < rdrobot){
            println("Vui long nhap so lon hon, neu ko muon hay  go 'a'")
        }

    }
}