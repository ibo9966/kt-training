package com.EnesPolatVideolari

fun main() {
   /*
    var a1=20
    var a2=30
    var max :Int?

    if(a1>a2)
        max=a1
    else
        max=a2
    print("max : $max")
    */

/*    var a1=52
    var a2=30
    var max =if (a1>a2) a1 else a2
    print("max : $max")*/

    println("Yaşınız giriniz:")
    var yas= readLine()!!.toInt()
    var gencmi=when(yas) {
        30->true
        else->false
    }
    println("Genç olma durumunuz : $gencmi")

}