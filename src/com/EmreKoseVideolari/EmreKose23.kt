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
    //SET:Verileri unique (Tek) olarak barındıran yapı

    /*Immutable Set
    var set = setOf<Int>(1,2,3,4,5,6,7,8,9,9,9,9,9,9,10)
    println(set.size)
    */

    //Mutable Set
    var set2 = mutableSetOf<Int>(1,2,3,4,5,6,7,8,9,9,9,9,9,9,10)
    set2.add(12)
    for (i in set2) println(i)
    set2.remove(5)
    println("-----------------------")
    for (i in set2) println(i)

    var set3= hashSetOf<Int>(1,2,3,4,5,6,7,8,9,9,9,9,9,9,10)
    println()
    for (i in set3) println(i)


}