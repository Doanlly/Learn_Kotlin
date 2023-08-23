fun main(){
    var a = 100
    //cach 1 dung ky hieu, cach 2 dung phuong thuc
    println("a> 0 && a<200? "+   (a>0 && a<200))
    println("a> 0 || a<100? "+   (a>0 || a<100) + (a>0).or(a<100))
    if(!((a<0).and(a>200) )  ){
        println("a > 0")
    }
    //and or not
    //tien to prefix ++ , hau to postfix-- giam gia tri di 1
    ++a //prefix
    a+=2
    a--  //postfix
    a.inc()
    a.inc()
    a.dec()

    println("a(a.inc(); a.dec())  = " + a)
    var b = 20
    var c = a - b +3
    println("c old = "+ c)
    c = a++ - --b + 3
    println("a = "+ a + " b = "+ b)
    println("c  = "+ c)
    //uu tien dinh prefix truoc va cac bieu thuc khac trong 1 ham, sau do moi tinh postfix
}
