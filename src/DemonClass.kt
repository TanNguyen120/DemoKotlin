// khai báo val read only không thể sửa về sau
// khia báo var có thể sửa đổi
class Saber(val name : String, var shape : String, var durability : Int, var specialAbility : Boolean )


fun main(){


    val excaliber : Saber = Saber("excaliber","long sword",100,true)
    println("you looted a weapon: ${excaliber.name} type ${excaliber.shape}")


    // phần demon cho if else là một biểu thức
    val tinhTrang : String = if (excaliber.durability==0) "gãy rồi" else "còn tốt lắm"

    println("tình trạng của vũ khí : $tinhTrang")

    excaliber.durability = 1


    // phần demon cấu trúc when
    when(excaliber.durability){
        100 -> println("tốt nhất")
        50 -> println("hàng second hand")
        1 -> println("sắp gãy")
        0 -> print("phế vật")
    }

    //








}