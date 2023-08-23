fun sayHello(name: String): Unit{
    println("Hello "+ name)
}
//Unit la kieu ko tra ve value
fun sum(x: Double,y:Double): Double{
    return x+y
}

fun showColor(red:Int,green:Int, blue: Int,alpha:Float){

    println("color: $red - $green - $blue - $alpha")
}
//vararg: so luong vo toi va
fun like(vararg fruit: String){
    for(fr in fruit){
        println("I like $fr")
    }
}
//infix function: goi ma ko can ( )
infix fun Int.plus(x: Int): Int{
    //this la so o trai hoac phai
    return this + x
}
infix  fun Int.nhan(x:Int): Int = this * x // 1 dong function don gian
infix  fun String.yeu(x:String) = "$this Yeu $x" // 1 dong function don gian
//higher order function is: tham so dau vao la 1 fun khac hoac val la val khac dau ra la 1 fun khac
fun doSomething(x:Int, y:Int,completion: (Int)->Unit){ // completion la ham co tham so dau vao la int nhung dau ra ko la gi ca
    println("do somthings")
    val resul = x+y
    completion(resul)

}
fun main(array: Array<String>) {
    println("Tớ thích cậu \t \n  \t \tlisa à")
}
