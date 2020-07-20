package kotlinStudy

fun main() {
    // 使用.. 表示范围
    for (i in 1..10){
        //print("$i ")
    }
    // 使用until不包括最后一个值
    for (i in 1 until 10){
        //print("$i ")
    }
    //println("")

    // 使用step 改变增量
    for (i in 1..10 step 2){
        //print("$i ")
    }

    // 使用downto递减
    for (i in 10 downTo 1 step 2){
        //print("$i ")
    }

    val names = arrayOf("jack", "rose", "bob")
    for (i in 0 until names.size){
        println(names[i])
    }

    // 依次获取每一个item
    for (name in names){
        print(name )
    }

    // 获取对应的索引值
    for (i in names.indices){
        println(names[i])
    }

    for ((index, item) in names.withIndex()){
        println("$index-$item")
    }

}