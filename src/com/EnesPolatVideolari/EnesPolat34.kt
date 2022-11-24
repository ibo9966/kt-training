package com.EnesPolatVideolari

fun topla(n1:Int,n2:Int):Int
{
    var sonuc=n1+n2
    return sonuc


}

fun sayigösterin(n1:Int=0):Unit {
    println("sayi:$n1")
}

fun selamver()
{
    println("Merhaba Arkadaşlar")
}
fun main() {
    println("toplam 2 + 4 :"+ topla(2,4))

    sayigösterin(45)

    selamver()

    sayigösterin()
}