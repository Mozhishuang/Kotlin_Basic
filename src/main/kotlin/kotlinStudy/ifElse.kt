package kotlinStudy

fun main() {

    // �ʺñ��ʽ  2>1?a:b
    //�пձ��ʽ a?:b  �������Ϊa ���������Ϊb
    var school = javaStudy.test.getName()
    val resu = school ?: "û������"
    println(resu)

}

fun test1(){
    var num = 20

    if (num > 20){

    }else{

    }

    // kotlin����if-else��һ�����ʽ �н����
    var result = if (num > 10) "���سɹ���" else "����ʧ��"

    // if��else����������ݾ���������ʽ�ķ���ֵ
    val res = if (num > 10){
        println("$num > 10")
        20
    }else{
        println("$num < 10")
        "ʧ��"
    }
}