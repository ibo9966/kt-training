package com.EmreKoseVideolari

class ClassName{
    //property
    //methods
}

fun main(){
    var lamp=Lamp()
    lamp.isOn=true
    lamp.turnOn()
    lamp.turnOff()

    var lamp2=Lamp()
    lamp2.isOn

    var araba=Araba()
    araba.model=2017
    araba.renk="Beyaz"
    araba.calisma()
    araba.hizlanma()

}
class Lamp{
    var isOn:Boolean=false
    fun turnOn(){
        isOn=true
    }

    fun turnOff(){
        isOn=false
    }
}
