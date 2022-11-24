package com.EnesPolatVideolari

fun main() {
    var setElement= setOf(11,22,66,44,58,58)

    for (element in setElement)
        println(element)

    println("-----------------------")
    var mutset= mutableSetOf(11,22,66,66,56,56,56,56)

    mutset.add(29)
    for (element in setElement)
        println(element)

}