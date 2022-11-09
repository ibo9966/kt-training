package com.EmreKoseVideolari;

fun main() {
/*
WHİLE DÖNGÜSÜ
while(koşul) {
    //çalışacak kodlar
    }

*/

/*
   var i = 1
    while (i <= 10) {
        println("kotlin")
        i++
    }
*/


// 0 ile 100 arası çif sayıları yazdıran program yazdırınız.
/*
 var sayi = 0
    while (sayi <= 100) {
        println(sayi)
        sayi+=2
    }
*/


// 0 ile  100 arası tek sayıların toplamını yazdıran program yazınız.

/*
    var sayi=0
    var toplam=0
    while (sayi <= 100) {
        if (sayi % 2 ==1) {
            toplam +=sayi
        }
        sayi++
    }
    println("Tek sayılarını toplamı = $toplam")
*/

/*
 DO WHİLE DÖNGÜSÜ
 do{
    // çalışacak kodlar
    }while (şart)
 */

// 1 den 10 a kadar olan sayıları yazdıran program yazınız.

  /*  var i = 1
    do {
        println(i)
        i++
    }while(i<11)
*/

// kullanıcı adı ve şifre doğru girilene kadar ad ve şifreyi isteyen programı yazınız.

    var ad:String
    var sifre:String
    do{
        println("Adınızı giriniz:")
        ad= readLine().toString()

        println("Şifreyi giriniz:")
        sifre= readLine().toString()
    }while (ad != "kotlin" || sifre!="123")

    println("GİRİŞ BAŞARILI")

}