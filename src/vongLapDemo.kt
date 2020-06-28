fun main(){
    for(i in 1..20 step 5){
        println(i)
    }
    println("-----------------------------")

    val sound = listOf<String>("rem","ram","rum","rom","rim","rym")
    for(s in sound)
    {
        println(s)
    }

    val excaliber : Saber = Saber("excaliber","long sword",100,true)
    while (excaliber.durability != 0)
    {
        when(excaliber.durability) {
            100 -> println("tốt nhất")
            50 -> println("hàng second hand")
            1 -> println("sắp gãy")
            0 -> print("phế vật")
        }

        excaliber.durability.minus(1)
    }
}