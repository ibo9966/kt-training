package com.EmreKoseVideolari

/*
    Array : mutable(sabit)

    Collections
    İmmutable (Read only)
        1.Immutable List -> listof
        2.Immutable Map ->mapOf
        3.Immutable Set ->setOf

    Mutable (Read and Write)
    1.Mutable List -> ArrayList, arrayListOf , mutableListOf
    2.Mutable Map ->HashMap, hashMapOf , mutableMapOf
    3.Mutable Set ->mutableSetOf , hashSetOf
 */

fun main(){
    //MAP: Verileri anahtar-değer ikilileriyle tutar.


/* Immutable Map

var map = mapOf<Int,String>() //İmmutable, sabit eleman
    var map2 = mapOf<Int,String>(12 to "Ahmet", 20 to "Mehmet", 18 to " Ayşe " , 24 to "Emre")
    for(anahtar in map2.keys) println("Anahtar : $anahtar Değer:${map2[anahtar]}")

*/

    //Mutable Map

    var map3=HashMap<Int,String>()
    map3.put(12, " Ahmet ")
    map3.put(20, " Mehmet ")
    map3.put(18, " Ayşe ")
    map3.put(24, " Emre ")
    for(anahtar in map3.keys) println("Anahtar : $anahtar Değer:${map3[anahtar]}")

    map3.replace(18, "İbooo")
    println()
    for(anahtar in map3.keys) println("Anahtar : $anahtar Değer:${map3[anahtar]}")

    map3.remove(12)
    println()
    for(anahtar in map3.keys) println("Anahtar : $anahtar Değer:${map3[anahtar]}")

    var map4= hashMapOf<Int,String>(12 to "Ahmet" , 20 to "Mehmet", 18 to "Ayşe", 24 to "Emre") // HashMap
    println()
    for(anahtar in map4.keys) println("Anahtar : $anahtar Değer:${map4[anahtar]}")

    var map5= mutableMapOf<Int,String>(12 to "Ahmet" , 20 to "Mehmet" , 18 to "Ayşe" , 24 to "Emre") //LinkedHashMap Yani sıralaı map 4 den farklıdır.'''''''!!!!!!**
    println()
    for(anahtar in map5.keys) println("Anahtar : $anahtar Değer:${map5[anahtar]}")
}