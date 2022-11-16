package com.EmreKoseVideolari

/*
    SOYUTLAMA
    1.Soyut sınıftan nesne türetilemez.
    2.Eğer bir sınıfın içerisinde soyut bir metod varsa mutlaka o sınıfta soyut olmalıdır.
    3.Soyut sınıflardan soyut alt sınıflar türetilebilir.
    Bu durumda üst sınıfın soyut metodunu override etmek zorunda değildir.

 */

fun main() {
    val ahmet = Ogretmen("Ahmet")
    ahmet.isTanimiYaz("Matematik Öğretmeni")
    ahmet.yasGoster(29)

    //var kisi=Kisi() →HATA VERİR.SOYUT SINIFTAN NESNE OLUŞTURULAMAZ...

}

abstract class Kisi(ad:String){
    init {
        println("Ad: $ad")
    }

    fun yasGoster(yas:Int){
        println("Yaş: $yas")
    }
    abstract fun isTanimiYaz(istanimi:String)
}

class Ogretmen(ad:String): Kisi(ad){
    override fun isTanimiYaz(istanimi: String) {
        println(istanimi)
    }

}