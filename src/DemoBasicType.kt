fun main(){

    // kiểu byte
    val season : Byte = 3

    // kiểu short
    val gokuPower : Short = 9000

    // kiểu int
    val trainYear : Int = 2000000000

    // kiểu char
    val alphabet : Char = 'f'

    // kiểu string với nhiều dòng
    val namQuocSonHa : String = """
        Nam quốc sơn hà nam đế cư
            Tuyệt nhiên định phận tại thiên thư
                Như hà nghịch lỗ lai xâm phạm
                    Nhữ đẳng hành khang thủ bại hư
        
    """.trimIndent()
    // sử dụng keyword $ để thêm vào chuỗi giá trị của biến hoặc hàm
    println("My favorite chinese cartoon get a season $season")
    println("his power is over $gokuPower")
    println("he have train $trainYear years for that power")
    println("""bản tuyên ngôn độc lập đầu tiên của việt nam: 
        $namQuocSonHa
        
    """.trimIndent() )

}