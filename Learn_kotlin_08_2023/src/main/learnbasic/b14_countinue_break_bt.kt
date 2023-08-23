import  kotlin.math.sqrt
fun main(args: Array<String>) {
    var n = 0
    while (true){
        n++
        print(("n trong vong lap $n \n"))
        if(n==10) break
    }
    var tong = 0;
    for(i in 0..5){
        if(i ==3) {
            continue
        }else{
            tong+= i
        }

    }
    println(tong)
    println("Chuong trinh in ra so nguyen n!")
     n = 4
    var gt = 1
    for(i in 1..4){
        if(i ==1 ) n =1;
        gt = gt*i
    }
    println("gt = $gt")

    println("chuong trinh 1!+2!+ 3! + 4!")
    tong = 0
    var sum:Int = 1
    for(i in 1..4){
        var sum1 =1
        for(j in 1..i){
            sum1 = sum1*j
        }
        tong+= sum1

        println(" sum = $sum1 vtong $i ! = $tong")
        sum1 = 0
    }
    println("Ket qua sum: 1!+2!+3!+4! = 1+ 2+ 6+ 24 = $tong")
    println("in ra so hoan thien la so ma tong cac uoc bang no vd: 6 =1 + 2+ 3")
    for(j in 1..1000){
        var shh = j
        var tongg = 0
        for(i in 1..shh/2){
            if(shh%i == 0){
                //myAr.add(i)
                tongg = tongg + i
            }
        }
        if(tongg == shh ){
            println("$shh ;")
        }
        tongg = 0
    }
//    println("Mảng sau khi thêm các phần tử: $myAr  can 6 = ${sqrt(6.toDouble()).toInt()}")
//    var sumbt = 0
//    for(i in myAr){
//        sumbt += i
//    }
//    if(sumbt ==6){
//        println("$shh la so hoan hao")
//    }
}