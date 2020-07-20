package kotlinStudy

fun main() {

    //跟简洁
    val num = 70
    when (num) {
        10 -> println("10")
        20 -> println("20")
        30 ->println("30")
        40 -> println("40")
        else -> println("其他")
    }

    //更灵活
    when(num){
        in 1..10 -> println("Z")
        in 11..59 -> println("E")
        in 60..79 -> println("B")
        else -> println("没有成绩")
    }

    // 更方便
    val result =   when (num) {
        10 -> 'A'
        20 -> 'B'
        30 -> 'C'
        40 -> 'D'
        else -> "其他"
    }

    println("result is $result")

    var temp = "jack"
    when(temp){
        is String -> println("是一个String")
        else -> println("不知道是什么类型")
    }
}