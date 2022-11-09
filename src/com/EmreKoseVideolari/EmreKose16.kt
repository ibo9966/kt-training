package com.EmreKoseVideolari

import java.util.*

// sayı tahmin uygulaması
fun main() {
/*
  for (i in 1..5) {
        var rastgele = Random()
        var sayi = rastgele.nextInt(5) + 1
        println(sayi)
    }
*/

/*
    var rastgele = Random()
    var sayi = rastgele.nextInt(100) + 1
    var tahmin: Int
    var sayac = 1

    while (true) {

        println("Tahmininiz:")
        tahmin = readLine()!!.toInt()
        if (tahmin > sayi) {
            println("Sayıyı küçültün")
            sayac++
        } else if (tahmin < sayi) {
            println("Sayıyı büyültün")
            sayac++
        } else if (tahmin == sayi) {
            println("Tebrik $sayac seferde doğru bildiniz.")
            break

        }
    }

*/


// Girilen sayıya kadar olan asal sayıları bulunuz.

    var ustSinir:Int
    var bolenSayisi:Int
    println("Üst sınır giriniz:")
    ustSinir= readLine()!!.toInt()
    for (i in 2..ustSinir){
        bolenSayisi=0
        for (j in 1..i){
            if (i % j == 0 ) bolenSayisi++
        }
        if (bolenSayisi==2) println(i)
    }
}


