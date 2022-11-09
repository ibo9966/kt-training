package com.EmreKoseVideolari

import javax.print.attribute.standard.MediaSize

/*
1.Bütün infix fonksiyonlar extension fonksiyondur ancak bütün extension fonksiyonlar
infix fonksiyon değildir.
2.Infix fonksiyonlar tek parametre alır.
 */

fun main(){
    5 downTo 1
    5.downTo(1)
    var sonuc = 4 topla 5
    println(sonuc)
    4.topla(5)

    println("Kotlin".concat(" Android"))
}

infix  fun Int.topla(sayi: Int): Int = this + sayi

infix  fun String.concat(other: String) = this + other
