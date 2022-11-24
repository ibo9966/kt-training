package com.EnesPolatVideolari

fun main() {
    /*
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
    */

    var grubunYasi=Array<Int>(5) {0}
    grubunYasi[2]=30
    grubunYasi[4]=50
    for (i in grubunYasi){
        println(i)
    }

    println("İndeks olarak dizinin elemanları yazdırıyoruz.")
    for (i in 0..4){
        println("dizi[$i]:" +grubunYasi[i])
    }

    var grupUyeleri=Array<String>(5) {""}
    grupUyeleri[2]="İbrahim"
    grupUyeleri[4]="Duygu"
    for (i in grupUyeleri){
        println(i)
    }
    println("İndeks olarak dizinin elemanlarını yazdırıyoruz.")
    for (i in 0..4){
        println("dizi[$i]:"+grupUyeleri[i])
    }


    println("Karşılıklı olarak yazalım:")
    for (i in 0..4){
        println("dizi[$i]"+grubunYasi[i] + " yaşında olan " +grupUyeleri[i])
    }
}