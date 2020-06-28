data class Point(val x: Int, val y: Int)
data class Fame(var famePoint: Int, var crimePoint : Int)


operator fun Fame.inc() : Fame{
    return Fame(famePoint + 10,crimePoint- 10)
}

operator fun Fame.dec() : Fame{
    return Fame(famePoint-20,crimePoint + 25)
}

operator fun Fame.compareTo(fame: Fame) : Int {
    return (famePoint) - (fame.crimePoint)
}


// nếu ta cộng danh vọng thì danh vọng tăng và điểm phạm tội giảm
operator fun Point.unaryMinus() = Point(-x, -y)

val point = Point(10, 20)
val heroFame = Fame(50,50)
fun main() {


    println(-point)  // prints "Point(x=-10, y=-20)"
    println("hero have done a good action gifted a fame point ${heroFame.inc()}")
    println("hero commit a crime minus a Fame point ${heroFame.dec()}")
    val wostPerson : Fame = Fame(11,90)


    if(heroFame > wostPerson)
    {
        println("you are a good guy")
    }
    else{
        println("you are the worst")
    }
}