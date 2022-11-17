package com.EnesPolatVideolari

fun main() {


//ÖRNEK1 1 ile 5 arasında çift ve tek sayıları yazdırın.
/*

for (i in 1..5)
        if (i % 2==0){
            println("$i çiftsayıdır.")
        }
        else{
            println("$i teksayıdır.")
        }

*/


//ÖRNEK2 1 ile verilen sayı arasında tek ve çift sayıları kontrol et.Kaç adet tek ve çift sayı olduğunu yazınız.

/*
    var sayactek =0
    var sayaccift=0
    print("Lütfen sayı giriniz.")
    var sayi = readLine()!!.toInt()
    for (i in 1..sayi)
        if (i % 2 ==0){
            sayaccift++
        }
        else{
            sayactek++
        }
        println("0 ile $sayi arasında $sayactek adet tek $sayaccift  adet çift sayı vardır.")
*/

//ÖRNEK 3 Girilen sayının mutlak değerini yazdırınız.

/*
   print("Lütfen sayı giriniz:")
    var sayi= readLine()!!.toInt()

    if (sayi<0){
        println("$sayi sayısının mutlak değeri ${(sayi*-1)}")
    }
    else if (sayi == 0){
        println("Sayı sıfıra eşittir.")
    }
    else{
        println("$sayi sayısının mutlak değeri $sayi")
    }
*/

//ÖRNEK 4
// Kargo Bedeli 7.5 TL.’dir
//Satın Alınan Ürünlerin Toplam Fiyatı 250 TL üzeri olduğunda kargo bedavadır.
//Kullanıcıdan fiyat bilgisi alıp ekrana ödenecek tutarı yazan prog.?

    /*
 var kargoBedeli = 7.5
    print("Lütfen 1.ürünün fiyatını giriniz:")
    var urun1 = readLine()!!.toInt()
    print("Lütfen 2.ürünün fiyatını giriniz:")
    var urun2 = readLine()!!.toInt()
    var urunToplam = urun1+urun2
    if (urunToplam>=250){
        println("Toplam ürün tutarunız : $urunToplam TL bundan dolayı kargo ödemeyeceksiniz.")
        println("Toplam ödenecek fiyat : $urunToplam")
    }
    else{
        println("Toplam ürün tutarınız: $urunToplam TL bundan dolayı kargo ödeyeceksiniz.")
        println("Toplam ödenecek fiyat: ${(urunToplam + 7.5)}")
    }

*/

//ÖRNEK5:
//Matematik dersinde ögrencinin almış olduğu notları isteyiniz . Ortalamasını alarak harf notlarını yazınız.


/*
        println("1.ögrenci adını giriniz:")
        var ogrenci1= readLine()!!.toString()
        print("Lütfen 1. notunuzu giriniz:")
        var not1= readLine()!!.toInt()
        print("Lütfen 2. notunuzu giriniz:")
        var not2= readLine()!!.toInt()
        print("Lütfen 3. notunuzu giriniz:")
        var not3= readLine()!!.toInt()
        var ort= (not1+not2+not3)/3
        if (ort>=85){
            println("$ogrenci1 adlı öğrencinin not ortalaması $ort bundan dolayı notu A")
        }
        else if (ort>=70){
            println("$ogrenci1 adlı öğrencinin not ortalaması $ort bundan dolayı notu B")
}
        else if (ort>=55){
            println("$ogrenci1 adlı öğrencinin not ortalaması $ort bundan dolayı notu C")
        }
        else if (ort>=45){
            println("$ogrenci1 adlı öğrencinin not ortalaması $ort bundan dolayı notu D")
        }
        else{
            println("$ogrenci1 adlı öğrencinin not ortalaması $ort bundan dolayı notu F")

        }

*/

//ÖRNEK6 : Sonsuz döngü içerisinde ögrenci isimleri sorarak yazdırınız.

/*        var sinif= mutableListOf<String>()
        while (true){
        println("Lütfen öğrenci adını giriniz: çıkmak için QQ yazınız.")
        var ogrenci= readLine()!!.toString()
        if (ogrenci=="QQ"){
            println("Çıkış yaptınız tekrar bekleriz.")
            break
        }
        sinif.add(ogrenci)
        println("Sınıfta bulunan öğrencilerin ismi $sinif")

    }
*/
//ÖRNEK7 :Sayi 1 ve Sayi2 alınız hangisi daha büyük kontrol ediniz.
/*
    print("Lütfen 1.Sayıyı giriniz:")
    var sayi1= readLine()!!.toInt()
    print("Lütfen 2.Sayıyı giriniz:")
    var sayi2= readLine()!!.toInt()
    if (sayi1>sayi2){
        println("$sayi1 sayısı $sayi2 'den daha büyüktür.")
    }
    else if (sayi1==sayi2){
        println("$sayi1 = $sayi2 eşittir.")
    }
    else{
        println("$sayi2 sayısı $sayi1 'den daha büyüktür.")

    }
    */

//ÖRNEK 8:Dikdörtgen çevresini bulunuz.

/*
    print("Kısakenarı giriniz.")
    var kisaKenar= readLine()!!.toInt()
    print("Uzunkenarı giriniz.")
    var uzunKenar= readLine()!!.toInt()
    var cevre=((kisaKenar*2)+(uzunKenar*2))
    if (kisaKenar>uzunKenar){
        println("Kısa kenar uzun kenardan uzun olamaz")
    }
    else{
        println("Dikdörtgenin çevresi $cevre")
    }

*/

}

