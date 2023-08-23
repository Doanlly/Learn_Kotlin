fun main(args: Array<String>) {
    var a:Int = 0;
    for(i in 0..10 step  3){
        a = a +  i
        println(""+ a+ " ")
    }
    println("Bang cuu chuong 20")
    var bcc = 1;
    for( i in 1 until 21){
        bcc = i.times(20)
        println(" 20* $i  =  $bcc")
    }
    //for_ open range: for(i in a until b) -  chay tu a - b-1
    // for DownTo: chay giat lui
    for(i in 30 downTo  20){
        print(" $i ")
    }

    var name_list = arrayOf("Doan","Thao","Phu","huong","Ly")
    for(item in name_list){
        println(" $item ")
    }
}