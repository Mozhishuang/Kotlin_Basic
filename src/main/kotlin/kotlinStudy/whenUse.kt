package kotlinStudy

fun main() {

    //�����
    val num = 70
    when (num) {
        10 -> println("10")
        20 -> println("20")
        30 ->println("30")
        40 -> println("40")
        else -> println("����")
    }

    //�����
    when(num){
        in 1..10 -> println("Z")
        in 11..59 -> println("E")
        in 60..79 -> println("B")
        else -> println("û�гɼ�")
    }

    // ������
    val result =   when (num) {
        10 -> 'A'
        20 -> 'B'
        30 -> 'C'
        40 -> 'D'
        else -> "����"
    }

    println("result is $result")

    var temp = "jack"
    when(temp){
        is String -> println("��һ��String")
        else -> println("��֪����ʲô����")
    }
}