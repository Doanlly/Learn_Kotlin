fun main(args: Array<String>) {
    for(i in 1..9){
        for(j in 1..5){
            print(" $i * $j = ${i*j} ")
        }
        println()
    }
    //ve hinh chu N
    var n = 7
    for(i in 0 until  n){
        for(j in 0 until n){
            if(i == j || j == 0 || j == n-1 ){
                print("$j")
            }
            print("\t")


        }
        println()
    }
    //hinh trai tim
    println("______________Hinh Trai Tim___________")
    for(i in 1..n){
        for(j in 1..n){
            if( i == 1 && j != 1 && j !=  n &&  j != (n+1)/2) {
                print(j)
            }
            if (i == 2 && j == 1){
                print(j)
            }
            if (i == 2 && j == n){
                print(j)
            }
            if (i == 2 && j == (n+1)/2){
                print(j)
            }
            if(i == 3){
                if(j == 1|| j == n ){
                    print(j)
                }
            }
            if(i == 4){
                if(j == 1|| j == n ){
                    print(j)
                }
            }
            if(i == 5){
                if(j == 2|| j == 6){
                    print(j)
                }
            }
            if(i == 6){
                if(j == 3|| j == 5){
                    print(j)
                }
            }
            if( i == 7 && j == (n+1)/2 ){
                print(j)
            }
            else{
                print("")
            }
            print("\t")
        }
        println()
    }
}