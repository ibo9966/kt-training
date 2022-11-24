package com.EnesPolatVideolari

fun main() {
    var map= hashMapOf(1 to "Sefa" , 2 to "Enes", 4 to "Emre")
    map.put(6,"Sedat")

    for (item in map){
        println(item)
    }
    var array= arrayOf(1,23,44,66,77,88,99)

    println(array[1])

    println("-----------------------------------------------")

    var list= mutableListOf(11,22,33,44,55)
    list[0]=22
    for (item in list){
        println(item)
    }

}