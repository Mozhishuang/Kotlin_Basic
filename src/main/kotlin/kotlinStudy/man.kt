package kotlinStudy

fun main() {
    // 输出语句
    println("hello world")
    print("hello world")
    print("hello world")
    // 输出变量
    val name = "rose"
    println(name)

    // 字符串模板
    println("my name is $name")
    // 当输出的变量的值是有多个部分组成 使用${变量}
    println("my name is $name length is ${name.length}")
}