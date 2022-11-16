package com.EmreKoseVideolari

fun main() {
    val z =z()
    z.hello()
    z.tFunc()

}

interface B{
    interface C{
        fun cFunc()
    }
}


interface  X {
    fun hello() = println("Hello from X")
}

interface  T {
    fun tFunc()
}

interface Y {
    fun hello() = println("Hello from Y")
}

class z:X , Y, T, B.C {
    override fun cFunc(){

    }
    override fun tFunc(){

    }
    override fun hello() {
        super<X>.hello()
        super<Y>.hello()

    }
}