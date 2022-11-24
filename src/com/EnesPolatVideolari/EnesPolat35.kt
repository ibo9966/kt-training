package com.EnesPolatVideolari


fun toplama(n1:Double,n2:Double):Double
{
    return  n1+n2
}

fun toplama(n1:Double,n2:Double,n3:Double):Double
{
    return n1+n2+n3
}
fun toplama(n1:Double,n2:Double,n3:Double,n4:Double):Double
{
    return n1+n2+n3+n4
}

fun toplama(n1:Int,n2:Int):Int
{
    return n1+n2
}

fun main() {
    println(toplama(2.9,3.8))
    println(toplama(3.9,2.8,89.75))
    println(toplama(3.9,2.8,89.75,5669.45))
    println(toplama(3,5))

}