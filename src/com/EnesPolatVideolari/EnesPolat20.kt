package com.EnesPolatVideolari

fun main() {

    print("a değerini giriniz:")
    var a= readLine()!!.toInt()

    when(a){
        1-> println("a değer 1 'dir.")
        4-> println("a değer 4 'dir.")
        5-> println("a değer 5 'dir.")
        in 6..10-> println("$a değeri 6 ile 10 arasındadır.")
        else->print("$a değeri aralık dizisinde değildir.")

    }
}