package com.EnesPolatVideolari

fun main() {
    var baslik =" Türkiye'ye hoş geldiniz."
    println(baslik)
    println("başlık:" +baslik)
    println("başlık:$baslik")

    var isim="enes" +" polat "
    println(isim)
    println("isim:$isim")

    println("başlığın 3.karakteri:"+baslik[2])
    println("Başlık:"+baslik.toLowerCase())
    println("Başlık:"+baslik.toUpperCase())
    println("split özelliği:"+baslik.split(" "))
    println("Boşlukları birleştirme özelliği:"+baslik.trim())
}