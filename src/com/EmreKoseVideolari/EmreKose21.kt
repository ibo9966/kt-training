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

fun main() {
    //var list= listOf<String>("Kotlin" , "Java" , "Asp.Net" , "Python", "Ruby") // İmmutable , sabit
    //list[2]="CSharp" // Eleman değiştirilemez , silinemez , eklenemez.

    //for (i in list) println(i)

    //for (i in 0..list.size-1) println(list[i]) // size -1dememiz index sayısı eleman sayısından bir küçük olduğu için .
                                                    //Yani 3 elemanlı bir listenin son index sayısı 2'dir.

    var list= mutableListOf<String>("Kotlin" , "Java" , "Asp.Net" , "Python", "Ruby")
    println(list)
    list[2]="Csharp"
    println(list)
    list.add("Javascript")
    println(list)
    list.remove("Java")
    println(list)
    list.removeAt(0)
    println(list)

}