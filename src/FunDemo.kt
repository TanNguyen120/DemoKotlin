fun greatQuote ( name : String) : String
{
    var quote = "$name once said i want to eat your pancreas"
    return quote
}

// high order function
fun moreGreateQuote(quote : String, func : (String) -> String) {
    println("moreGreateQuote: $quote")
    func("quote")
}

fun main()
{
    println(greatQuote("a wise man"))

    // high order function with function is a parameter
    moreGreateQuote("in an accent book",::greatQuote)

    // lamda expr
    var sum = {a : Int, b : Int -> a + b}
    val result = sum(6,10)
    println("tổng của 6 và 10 là $result ")

}