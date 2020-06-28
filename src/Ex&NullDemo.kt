import java.lang.Exception

fun main(){


//    try {
//        val number = 70/0
//    }
//    catch (e : Exception)
//    {
//        println("error : ${e.message}" )
//    }
//    finally {
//        val number = 70
//        println("finally answer is $number")
//    }



    // tạo một chuỗi có chứa null
    val sound = listOf<String?>("room","rum","rem","ram",null,"rim","rym")



//    for(i in sound)
//    {
//        println(i)
//    }

    // toán tử elvis
    for(i in sound)
    {
        val j = i ?: "rom"
        println(j)
    }



}