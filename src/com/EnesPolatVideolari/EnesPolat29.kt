package com.EnesPolatVideolari

fun main() {
    var dizitamsyi = Array<Int>(5) { 0 }
    dizitamsyi[2] = 45
    println(dizitamsyi[2])

    println("Dizinin tüm elemanları nesne olarak")
    for (eleman in dizitamsyi) {
        println(eleman)

    }

    println("İndeks olarak dizinin elemanları:")
    for (index in 0..4) {
        println("dizi[$index]:" + dizitamsyi[index])
    }

    var diziStr = Array<String>(4){""}
    for (index in 0..3) {
        print("diziStr[$index]:")
        diziStr[index] = readLine()!!
    }

    for (index in 0..3) {
        println("diziStr[$index]:" +diziStr[index])
    }
}