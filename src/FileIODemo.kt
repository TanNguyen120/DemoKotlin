
// ta import java io
import java.io.File

fun main(){
    val input = File("input.txt")

    // khi mà input còn có thể đọc được thì ta in các dòng của input
    // từ khoá it dùng để chỉ đến đối tượng chủ của hàm này. câu lệnh dưới cũng có thể hiểu là với mỗi dòng của file thì ta in ra
    input.forEachLine{ println(it) }

    // hoặc ta cũng có thể đọc dạng byte

    input.forEachLine {   println(input.readBytes())}

    val outPut = File("output.txt")

    // viết một dòng
    outPut.writeText(greatQuote("a wise man "))

    //append text
    outPut.appendText(greatQuote("a cannibal "))

}