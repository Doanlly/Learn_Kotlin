import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.SimpleTimeZone

fun main(args: Array<String>) {
    var cal = Calendar.getInstance()
    println("cal:  $cal")
    cal.set(Calendar.YEAR,2001)
    cal.set(Calendar.MONTH,23)
    cal.set(Calendar.DAY_OF_MONTH,22)

    var thang = cal.get(Calendar.MONTH)
    var nam =  cal.get(Calendar.YEAR)
    var ngay = cal.get(Calendar.DAY_OF_MONTH)
    println("Ngày tháng năm hiện tai = $ngay - ${thang+1} -$nam")

    //xuất ngày tháng năm
    var date =cal.time
   // println("Ngày tháng năm hiện tai = $ngaysing - ${tuoitac} -$naminh")
    var dingdang = SimpleDateFormat("dd/MM/yyyy")
    println(dingdang.format(date))
    //khai bao định dạng loại 2
    var dingdang2 = SimpleDateFormat("dd/MM/yyyy hh:mm:ss a") // chu 2 xuat heo dinh dang am,pm
    println(dingdang2.format(date))

    println("Moi ban nhap vao ngay thang nam sinh dd/MM/yyyy: ")
    var s = readLine()
    if(s ==null){
        return
    }
    dingdang = SimpleDateFormat("dd/MM/yyyy")
    var dateInput = dingdang.parse(s) // chuỗi s thành đối tượng Date dựa trên định dạng dd/MM/yyyy.

    // tạo một đối tượng Calendar (lịch) tương ứng với thời điểm hiện tại.
    var timeNamsinh = Calendar.getInstance()
    println(timeNamsinh)
    //set timeNamsinh
    timeNamsinh.time = dateInput // đặt thời gian
    var namsinh = timeNamsinh.get(Calendar.YEAR) //lấy năm từ đối tượng timeNamsinh để biết năm sinh của người dùng.
    var thangsinh = timeNamsinh.get(Calendar.MONTH)
    var ngaysinh = timeNamsinh.get(Calendar.DAY_OF_MONTH)
    println("Ngay thangnam sinh cua ban la:  $ngaysinh/${thangsinh+1}/$namsinh ")

    //khoi tao datetime
    var timenow = Calendar.getInstance()// tạo một đối tượng Calendar tương ứng với thời điểm hiện tại.
    //lấy năm hiện tại
    var yearnow = timenow.get(Calendar.YEAR)

    //tinh tuoi
    println("Tuoi cua ban nam $yearnow: sinh nam: $namsinh, hiện bạn : ${yearnow -namsinh} tuổi")
}