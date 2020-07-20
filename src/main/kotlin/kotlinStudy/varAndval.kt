package kotlinStudy

fun main() {
    // var 定义常量
    // val 定义变量

    // 定义时指明类型
    val pi: Double = 3.14

    // 类型自动推导
    val name = "中国"

    var temp = 20
    var score = 95.5

    // 类型安全的语言 不一样的就不能够赋值
    // 通过Number类提供的对应的to方法进行显示转换
    temp = score.toInt()
    score = temp.toDouble()

}