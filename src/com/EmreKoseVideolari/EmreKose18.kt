package com.EmreKoseVideolari

fun main(){
    //Extension Functions

    //var sonuc= triple(5)
    //println(sonuc)

    //println(5.triple())
    //println(10.triple())

    //println("kotlin".reversed())

    var list = arrayListOf<String>("Kotlin", "Java", "C#", "Javascript")
    for (item in list) println(item)
    list.swap(0,3)

    println()
    for (item in list) println(item)
}

//fun triple(sayi:Int): Int=sayi * 3

fun Int.triple() = this * 3

fun ArrayList<String>.swap(x: Int , y : Int){
    val temp = this[x]
    this[x]=this[y]
    this[y]=temp
}