fun main() {
    // = , != ; -= ; *= ; %=
    var x = 8;
    println("x = "+ x);

    x+= 10
    println(" x + 10 = "+ x)
    x-= 5
    println(" x  -=5  =  "+ x)
    x*= 10
    println(" x*10 = x*=10 = "+ x)
    x%= 10
    println("x%10 = "+ x)

    var a = 10
    var b = 12
    println("a == b?  " + (a==b))
    println("a >= b?  " + (a>=b))
    println("a <= b?  " + (a<=b))
    println("a < b?  " + (a<b))
    println("a > b?  " + (a>b))
    println("a != b?  " + (a!=b))

    //phuont thuc

    println("a == b? == a.equal(b ) " + a.equals(b))
    println("a != b? == !a.equal(b ) " + !a.equals(b))
    println("a < b = -(compareto); a = b = 0; a> b =1 and \n ket qua: " + a.compareTo(b))




}