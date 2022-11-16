package com.EnesPolatVideolari

fun main() {

    print("Notunuzu giriniz:")
    var not = readLine()!!.toDouble()

    if(not>=90)
    {
        println("A ile geçtiniz.")
    }

    if(not >= 50 && not <=70)
    {
        not=not+10
        print("Notunuz 10 artırılmıştır.")

    }

    print("Yılsınız notunuz $not 'dur.")
}