package com.EnesPolatVideolari

fun goster(isim:String):Unit
{
    println("isim : $isim")
}
fun  goster(numara:Int):Unit
{
    println("numara:$numara")
}

fun goster(numaraD:Double):Unit
{
    println("numaraD :$numaraD")
}
fun main() {
    goster("ahmet")
    goster(15)
    goster(15.6)
}