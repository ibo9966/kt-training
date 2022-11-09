package com.EmreKoseVideolari

/*
FONKSİYONLAR
1.Parametreli-Parametresiz
2.Dönüş değeri olan-olmayan

 */

fun main () {
    var mesaj = getMessage()
    println(mesaj)
    var mesaj2:String= getMessage2()
    println(mesaj2)

    var nameLastName= getName("Emre" , "Köse")
    println(nameLastName)
}

/*
    fun fonksiyonAdi(parametreler){
        //çalışacak kodlar
    }
*/

fun helloWorld(){
    println("Hello World")
}

fun helloWorld2()= println("Hello World 2")

fun messageYaz(message:String){
    println("Mesajınız: $message")
}

fun getMessage():String{
    return "welcome"

}

fun getMessage2():String = "welcome2"

fun getName(name: String , lastName:String):String="Adınız: $name Soyadınız: $lastName"

fun myFunc()= println("Fonksiyon çalıştı")