package com.EmreKoseVideolari

fun main() {
    val myinterface =InterfaceImpl()
    println("Prop: ${myinterface.prop}")


    myinterface.foo()
    myinterface.hello()
}
interface  InterfaceName{
    //properties
    //methods
}

interface  MyInterface {
    var prop: String

    fun foo()
    fun hello()="Hello World"
}

class InterfaceImpl:MyInterface{
    override var prop: String=""

    override fun foo() {
    }

}