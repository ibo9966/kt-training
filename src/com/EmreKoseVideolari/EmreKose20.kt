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
    var array = Array<Int>(5) {0} // Bütün içerik değerleri 0 oldu.
    var array2= arrayOf(1,2,3)
    println(array2[2])
    array2[0]=20
    println(array2[0])

    for (items in array2) println(items)

    //array2[3]=5 // Hata verecek , burada diyor ki senin listen 3 elemanlı ve sen 4. eleman yani 3. indexi istiyorsun bu yüzden hata verecektir.
}