package kotlinStudy

fun main() {
    // ʹ��.. ��ʾ��Χ
    for (i in 1..10){
        //print("$i ")
    }
    // ʹ��until���������һ��ֵ
    for (i in 1 until 10){
        //print("$i ")
    }
    //println("")

    // ʹ��step �ı�����
    for (i in 1..10 step 2){
        //print("$i ")
    }

    // ʹ��downto�ݼ�
    for (i in 10 downTo 1 step 2){
        //print("$i ")
    }

    val names = arrayOf("jack", "rose", "bob")
    for (i in 0 until names.size){
        println(names[i])
    }

    // ���λ�ȡÿһ��item
    for (name in names){
        print(name )
    }

    // ��ȡ��Ӧ������ֵ
    for (i in names.indices){
        println(names[i])
    }

    for ((index, item) in names.withIndex()){
        println("$index-$item")
    }

}