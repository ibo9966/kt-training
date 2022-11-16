package com.EnesPolatVideolari

fun main(args: Array<String>) {

    print("İsminiz:")
    var name= readLine()
    print("Yaşınız:")
    var yas= readLine()!!.toInt()
    print("Bölümünüz:")
    var bolum= readLine()
    print("Pi değerini giriniz:")
    var pi= readLine()!!.toDouble()
    println("Merhaba "+name+". Yaşınız:"+yas+". Bolumunuz:"+bolum+". \nGirdiğiniz Pi değeri:"+pi)


}