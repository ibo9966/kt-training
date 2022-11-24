package com.EnesPolatVideolari

class Araba1(Tipi:String, Model:Int,Fiyatı:Double,
            Km:Int,Sahibi:String)
{
    var Sahibi:String?=null
    var Fiyatı:Double?=null
    var Km:Int=0
    init {
        println("Tip "+Tipi)
        println("Model "+Model)
        println("Fiyat "+Fiyatı)
        println("Km "+Km)
        println("Sahibi "+Sahibi)
        this.Sahibi=Sahibi
        this.Fiyatı=Fiyatı
        this.Km=Km
    }
    fun fiyatAl():Double{
        return this.Fiyatı!!-(this.Km!!.toDouble()*5)
    }
    fun sahibiBul():String?{
        return this.Sahibi
    }
}

fun main() {
    var EnesAraba=Araba1("BMW",2000,800000.0,120,"ENES")
    var OrhunAraba=Araba1("Mercedes", 2005 , 700000.0, 150,"Orhun")

    println("------------------------------------")

    println("Enes'in arabasının fiyat: "+EnesAraba.fiyatAl())
    println("Ford'un sahibi: "+OrhunAraba.sahibiBul())
}

