package com.EmreKoseVideolari

/*
    public      ->Herkese açık. Tüm sınıflar erişebilir.
    Private     ->Sadece kendi sınıfından erişim sağlanabilir.
    protected   ->Kendi sınıfı ve alt sınıflarından erişebilir.
    internatl   ->Sadece kendi modülünden erişim

*/

fun main() {

}

class PublicClass{
    val i = 1
    fun func(){
        var pc=PrivateClass()
        //pc.a              →→ ERİŞİM SAĞLANAMAZ
        //pc.privatefunc()  →→ ERİŞİM SAĞLANAMAZ
    }
}

private class PrivateClass{
    private val a=0
    private fun privatefunc(){

    }
}

open class A{
    protected val b=2
}

class  B: A(){
    fun getMethod()=b

}

class C {
    fun getValue(){
        var a=A()
        //a.b →→ ERİŞİM SAĞLANAMAZ
    }
}