package com.EnesPolatVideolari

fun main() {
    var map=HashMap<Int,String>()

    map.put(1,"Samet")
    map.put(2,"Emre")
    map.put(7,"Eren")

    println(map.get(7))

    //Tüm değerleri cağırma
    map.put(77,"Murat")
    println("---------------------------")
    for (k in map.keys)
        println(map.get(k))


}