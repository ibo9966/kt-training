package com.EnesPolatVideolari

fun main() {
    var arraylist=ArrayList<String>()

    arraylist.add("enes")
    arraylist.add("ahmet")
    arraylist.add("emre")
    arraylist.add("ibo")


    println("birinci eleman:"+arraylist.get(1))

    //Eleman değiştirme
    arraylist.set(1,"DUYGU")

    println("Tüm Elemanlar")
    for(eleman in arraylist){
        println(eleman)
    }

    //Arama
    if (arraylist.contains("ibo"))
        println("sonuç bulundu.")
    else
        println("Sonuuç bulunamadı.")

    println("İndeks ile gösterin")
    for (i in 0..arraylist.size-1)
        println(arraylist.get(i))
}
