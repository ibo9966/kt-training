package com.EnesPolatVideolari

fun main() {
   /* for (a in 1..10)
    {
        if(a==7) break
        if(a==4) continue
        println("sayi $a")
    }*/

    loop@for (a in 1..10)
    {
        ahmet@for (b in 1..5){
            println("sayi : $a")
            if (b == 2) break@loop
        }
    }
    println("Döngü dışı" )
}