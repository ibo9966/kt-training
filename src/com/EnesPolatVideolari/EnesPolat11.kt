package com.EnesPolatVideolari

fun main() {
/*    var n1:Int=10
    var n2:Int=20
    var sonuc:Int?
    sonuc=n1+n2
    print("$n1 ve $n2 sayılarının toplamı $sonuc 'dur.")*/

    print("1.sayıyı giriniz:")
    var n1:Int= readLine()!!.toInt()
    print("2.sayıyı giriniz:")
    var n2:Int= readLine()!!.toInt()
    var sonuc:Int?
    sonuc=n1+n2
    print("$n1 ve $n2 sayılarının toplamı $sonuc 'dur.")
}