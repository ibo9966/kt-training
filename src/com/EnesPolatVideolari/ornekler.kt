package com.EnesPolatVideolari

fun main() {
    print("Lütfen sayı 1 giriniz:")
    var sayi1= readLine()!!.toDouble()
    print("Lütfen sayı 2 giriniz:")
    var sayi2= readLine()!!.toDouble()
    print("Lütfen sayı 3 giriniz:")
    var sayi3= readLine()!!.toDouble()
    var ortalama=(sayi1+sayi2+sayi3)/3
    if (ortalama>=50){
        println("Ortalamanız:${ortalama} bu yüzden geçer not aldınız.")
    }
    else{
        println("Ortalamanız:$ortalama bu yüzden kaldınız.")
    }
/*
bir dikdörtgenin alanını bulunuz.
*/

    print("Lütfen a kenarını giriniz:")
    var a = readLine()!!.toInt()
    print("Lütfen b kenarını giriniz:")
    var b= readLine()!!.toInt()
    var alan=(a*b)
}