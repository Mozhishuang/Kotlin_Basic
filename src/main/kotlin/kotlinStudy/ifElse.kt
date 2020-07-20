package kotlinStudy

fun main() {

    // 问好表达式  2>1?a:b
    //判空表达式 a?:b  成立结果为a 不成立结果为b
    var school = javaStudy.test.getName()
    val resu = school ?: "没有内容"
    println(resu)

}

fun test1(){
    var num = 20

    if (num > 20){

    }else{

    }

    // kotlin里面if-else是一个表达式 有结果的
    var result = if (num > 10) "下载成功·" else "下载失败"

    // if和else语句的最后内容就是这个表达式的返回值
    val res = if (num > 10){
        println("$num > 10")
        20
    }else{
        println("$num < 10")
        "失败"
    }
}