package com.EnesPolatVideolari

import kotlin.math.max
import kotlin.math.min


fun main() {
    /*ÖRNEK 1
     Kullanıcıdan bir sayı alınız.
    - Pozitifse karesini yazdırın.
    - Negatifse 1 azaltarak yazdırın.
    - 0'sa sıfır yazsın
     */

    /*
    println("Lütfen bir sayı giriniz:")
    var sayi= readLine()!!.toInt()
    if (sayi>0){
        println("Sayı pozitif olduğunu için ${(sayi*sayi)}")
    }
    else if (sayi<0){
        println("Sayı negatif olduğu için${sayi-1}")
    }
    else{
        println("Sayı sıfıra eşittir.")
    }
    */


    //ÖRNEK 2:fonksiyonla hesap makinası yap
/*
fun topla(n1:Int,n2:Int):Int
    {
    var sonuc=n1+n2
    return sonuc
}
fun cikar(n1:Int,n2:Int):Int
{
    var sonuc=n1-n2
    return sonuc
}
fun carp(n1:Int,n2:Int):Int
{
    var sonuc=n1*n2
    return sonuc
}
fun bol(n1:Int,n2:Int):Int
{
    var sonuc=n1/n2
    return sonuc
}
println("TOPLAMA:"+topla(2,4))
println("ÇIKARMA:"+cikar(2,4))
println("ÇARP:"+carp(2,4))
println("BÖLME:"+bol(8,4))
*/


    //ÖRNEK3:Birbirinden farklı olarak verilen iki adet sayıdan,
    // büyük olanı bulup gösteren algoritma ve akış diyagramını tasarlayınız.

/*

    println("Lütfen 1.sayıyı giriniz:")
    var sayi1= readLine()!!.toInt()
    println("Lütfen 2.sayıyı giriniz:")
    var sayi2= readLine()!!.toInt()
    if (sayi1>sayi2){
        println("Sayı 1:$sayi1 sayı 2:$sayi2'den daha büyüktür.")
    }
    else if (sayi1==sayi2){
        println("Sayı 1 ve sayı 2 eşittir.")
    }
    else
        println("Sayı 2:$sayi2 sayı 1:$sayi1'den daha büyüktür.")

*/
    //ÖRNEK4:Girilen vize ve final notlarına göre öğrencinin dersten geçip
    // geçmediğini bulan algoritma ve akış diyagramını tasarlayınız.

    /*

    println("Lütfen vize notunuzu giriniz:")
    var vizeNotu= readLine()!!.toInt()
    println("Lütfen final notunuzu giriniz:")
    var finalNotu= readLine()!!.toInt()
    var ortalama=(vizeNotu+finalNotu)/2
    if (ortalama>=85 && ortalama<=100){
        println("Ortalama:$ortalama bundan dolayı harf notunuz A")
    }
    else if (ortalama>=70){
        println("Ortalama:$ortalama bundan dolayı harf notunuz B")
    }
    else if (ortalama>=55){
        println("Ortalama:$ortalama bundan dolayı harf notunuz C")
    }
    else if (ortalama>=45){
        println("Ortalama:$ortalama bundan dolayı harf notunuz D")
    }
    else{
        println("Ortalama:$ortalama bundan dolayı harf notunuz F")
    }
*/

    //ÖRNEK 5 : Verilen tamsayının sıfır, pozitif ya da negatif olup olmadığını bulan algoritma ve
    // akış diyagramını tasarlayınız.

    /*
    println("Lütfen bir tamsayı giriniz:")
    var sayi= readLine()!!.toInt()
    if (sayi>0){
        println("$sayi sayısı pozitiftir.")
    }
    else if (sayi<0){
        println("$sayi sayısı negatiftir.")
    }
    else{
        println("Sayı sıfırdır.")
    }
    */

    // ÖRNEK 6 :Ekrana 10 defa programcının adını yazan algoritmayı yapınız”.

/*
    var i=0
    while (i<10){
        println("Programcı adı : İbrahim KAYATEPE")
        i++
    }

*/

    //Örnek 7: 1’den 100’e kadar tek sayıları yazdıran algoritma ve akış diyagramını yapınız.

    /*   var i =0
    while (i<100){
        if (i % 2 ==1){
            println(i)
        }
    }*/

    //Örnek 8: Klavyeden girilen fiyatı, KDV(%18) ekleyerek ekrana yazdırın.

/*    println("Lütfen Fiyat giriniz:")
    var fiyat= readLine()!!.toInt()
    var sonFiyat=(fiyat*0.18)+fiyat
    println("KDV eklenerek son fiyat : $sonFiyat TLdir.")
    */

    //Örnek 9: Beş sayının toplamını ve ortalamasını veren programa ait algoritmayı oluşturunuz.

    /*
    println("Lütfen 1.sayıyı giriniz:")
    var sayi1= readLine()!!.toInt()
    println("Lütfen 2.sayıyı giriniz:")
    var sayi2= readLine()!!.toInt()
    println("Lütfen 3.sayıyı giriniz:")
    var sayi3= readLine()!!.toInt()
    println("Lütfen 4.sayıyı giriniz:")
    var sayi4= readLine()!!.toInt()
    println("Lütfen 5.sayıyı giriniz:")
    var sayi5= readLine()!!.toInt()
    var toplam=(sayi1+sayi2+sayi3+sayi4+sayi5)
    var ort=(toplam/5)
    println("Girilen 5 sayının toplamı: $toplam ve ortalaması : $ort")
    */

    //Örnek 10: Klavyeden girilen sayı kadar (N) sayının faktoryelini alan programın akış şeması.


    /*

    var result=1
    println("Lütfen bir sayı giriniz:")
    var sayi= readLine()!!.toInt()
    for (i in sayi downTo 1){
        result*=i

    }
    println("$sayi sayısının faktöriyeli : $result 'tur.")

    */


    //Örnek 11: Klavyeden girilen Fahrenayt derecesini Cantigrad’a çeviren programın akış şemasını çizin.

    /*
    println("Lütfen Fahrenay derecesini giriniz:")
    var F= readLine()!!.toDouble()
    var C=(F-32)/1.8000
    println("$F fahrenayt derecesi $C santigrat derecesine eşittir.")

    */

    //Örnek 12: ax²+bx+c=0 şeklinde verilen 2. derece denklemin köklerini bulan programın akış diyagramını çizin.

/*
    println("a değerini giriniz:")
    var a = readLine()!!.toInt()
    println("b değerini giriniz:")
    var b = readLine()!!.toInt()
    println("c değerini giriniz:")
    var c = readLine()!!.toInt()
    var delta=((b*b)-(4*a*c))
    println("delta: $delta")
    if (delta>0){
        println(" Denklemin birbirinden farklı iki reel sayı kökü vardır")
    }
    else if (delta<0){
        println(" Denklemin reel sayı değil, birbirinin eşleniği iki karmaşık sayı kökü vardır.")
    }
    else{
        println(" Denklemin tek bir reel sayı kökü vardır.")
    }
*/

    //Örnek  13: Bir ürünü alış fiyatı üzerinden klavyeden vergi oranı
    // ve kar oranı eklenerek satış fiyatına hesaplayan programın algoritması nedir?

    /* println("Lütfen ürün fiyatı giriniz:")
    var urunFiyati= readLine()!!.toInt()
    var vergiOrani=(urunFiyati*0.18)
    var karOrani=(urunFiyati*0.50)
    var satisFiyatı=urunFiyati+karOrani-vergiOrani
    println("Ürünün fiyatı : $urunFiyati 'dır . Vergi oranını çıkarıp kar oranını hesapladığımız zaman satış fiyatı $satisFiyatı'dır.")*/


    //Örnek  14: Üniversite bir dersin başarı notu bir vize bir final sınav notu ile hesaplanır .
    // vize notunun kat sayısı %30 final notunun kat sayısı %70’dir. Bir öğrencinin sınavda almış olduğu bu notlar
    // neticesinde ders ortalaması bulan programın algoritmasını ve akış şemasını çiziniz.

    /*

    println("Lütfen vize notunuzu giriniz:")
    var vizeNotu= readLine()!!.toInt()
    println("Lütfen final notunuzu giriniz:")
    var finalNotu= readLine()!!.toInt()
    var ortalama=((vizeNotu*0.3)+(finalNotu*0.7))
    if (ortalama>=85 && ortalama<=100){
        println("Ortalama:$ortalama bundan dolayı harf notunuz A")
    }
    else if (ortalama>=70){
        println("Ortalama:$ortalama bundan dolayı harf notunuz B")
    }
    else if (ortalama>=55){
        println("Ortalama:$ortalama bundan dolayı harf notunuz C")
    }
    else if (ortalama>=45){
        println("Ortalama:$ortalama bundan dolayı harf notunuz D")
    }
    else{
        println("Ortalama:$ortalama bundan dolayı harf notunuz F")
    }

    */

    //Örnek  15: Yükseklik ve taban uzunluğu klaveden
    // girilen üçgenin alanını hesaplayan uygulamayı gerçekleştiriniz .

    /*  println("Lütfen üçgenin yüksekliğini giriniz:")
    var yukseklik= readLine()!!.toInt()
    println("Lütfen üçgenin taban uzunluğu giriniz:")
    var taban= readLine()!!.toInt()
    var alan=(yukseklik*taban)/2
    println("Üçgenin alanı : $alan")*/


    //Örnek  16: Bir iletkenin kutupları arasındaki gerilim (V) iletkenden geçen amper türünde akım (I)
    // iletken üzerinde var olan direncin (R) çarpımına eşittir. V=I*R formülüyle gösterilir. Formülden
    // faydalanarak kullanıcı tarafından girilen akım ve direnç değerlerine göre iletkenin kutupları
    // arasındaki gerilimi hesaplayan programın algoritmasını oluşturunuz.

    /*
    println("Akımı giriniz:")
    var I = readLine()!!.toInt()
    println("Direnci giriniz:")
    var R = readLine()!!.toInt()
    var V = I*R
    println("Gerilim: $V")

    */

    //Örnek  17: Klavyeden girilen bir sayının pozitif ya da nagatif olduğunu ekrana yazdıran algoritmayı oluşturunuz.
/*
    println("Lütfen sayı giriniz:")
    var sayi= readLine()!!.toInt()
    if (sayi>0){
        println("Sayı pozitiftir.")
    }
    else if (sayi<0){
        println("Sayı negatiftir.")
    }
    else{
        println("Sayı sıfıra eşittir.")
    }
*/
    //Örnek 18: Öğrencinin bir dersten aldığı not klavyeden girilerek başarı durumu
    // ekrana geçti veya kaldı şeklinde yazan uygulamanın algoritmasını oluşturunuz .

    /*

    println("Lütfen 1.notunuzu giriniz:")
    var not1= readLine()!!.toInt()
    println("Lütfen 2.notunuzu giriniz:")
    var not2= readLine()!!.toInt()
    var ort=(not1+not2)/2
    if (ort>=50){
        println("GEÇTİNİZ")
    }
    else{
        println("KALDINIZ.")
    }
*/

    //Örnek 19: Bir öğrencinin derslerinden 2 not ve 1 sözlü klavyeden
    // girilerek başarı durumu ekrana “geçti” ve “kald”ı şeklinde yazan algoritmayı oluşturun.

    /* println("Lütfen 1.notunuzu giriniz:")
    var not1= readLine()!!.toInt()
    println("Lütfen 2.notunuzu giriniz:")
    var not2= readLine()!!.toInt()
    println("Lütfen sözlü notunuzu giriniz:")
    var sozlu= readLine()!!.toInt()
    var ort=(not1+not2+sozlu)/3
    if (ort>=50){
        println("GEÇTİNİZ")
    }
    else{
        println("KALDINIZ.")
    }*/

    //Örnek 20: Kullanıcıdan alınan sayının tek ya da çift olduğunu  kontrol edip ekranda yazdıran algoritmayı oluşturun.

/*

    println("Lütfen sayı giriniz:")
    var sayi= readLine()!!.toInt()
    if (sayi % 2 ==0){
        println("$sayi sayısı çifttir.")
    }
    else{
        println("$sayi sayısı tektir..")
    }
    */

    //Örnek 21: Üniversite için vize final notları yapılmaktadır.
    // Bir öğrencinin dersten geçme şartı vizenin %30 ile final notunun %70 in toplamı 50 ve üzeri ve
    // final notunun 50 ve daha yüksek olmasıdır. Buna uygun algoritmayı oluşturunuz.

    /*  println("Lütfen vize notunuzu giriniz:")
    var vizeNotu= readLine()!!.toInt()
    println("Lütfen final notunuzu giriniz:")
    var finalNotu= readLine()!!.toInt()
    var ortalama=((vizeNotu*0.3)+(finalNotu*0.7))
    if (ortalama>50 ){
        if (finalNotu>50){
            println("Ortalama : $ortalama final notu :$finalNotu bundan dolayı GEÇTİ")
        }
        else{
            println("Ortalama : $ortalama final notu :$finalNotu bundan dolayı KALDI")

        }

    }
    else{
        println("Ortalama : $ortalama gerekenin altında olduğu için KALDI")
    }
*/


    //Örnek 22: Kullanıcının klavyeden girdiği sayı 3’ e ve 5’ e tam bölünüyorsa ekrana tam bölünüyor
    // yazan bölünmüyor sa bölünmüyor yazan algoritmayı oluşturun.

    /*println("Lütfen sayı giriniz:")
    var sayi= readLine()!!.toInt()
    if (sayi % 3 ==0){
        if (sayi % 5 == 0 ){
            println("$sayi hem 3 e hem 5 e bölünmektedir.")

        }
        else{
            println("$sayi 3 e bölünmektedir. Fakat 5 'e bölünmez.")
        }
    }
    else{
        println("$sayi 3 'e bölünmemektedir.")
    }
    */

    //Örnek 23: Kullanıcının klavyeden girdiği sayı 0-100
    // aralığındaysa ekranda “geçerli” değilse “geçersiz” yazan algoritmayı oluşturun.

    /* println("Lütfen bir sayı giriniz:")
    var sayi= readLine()!!.toInt()
    if (sayi>0 && sayi<100){
        println("Geçerli")

    }
    else{
        println("Geçersiz")
    }
*/

    //Örnek 24: Suyun sıcaklık derecesine göre katı sıvı gaz
    // halinde olduğu bulan ve ekrana yazan algoritma ?

    /* println("Lütfen suyun derecesini giriniz:")
    var derece= readLine()!!.toDouble()
    if (derece>=100){
        println("KATIDIR.")
    }
    else if (derece>0 && derece<100){
        println("SIVIDIR.")
    }
    else{
        println("GAZDIR.")
    }*/

    //Örnek 25: Klavyeden girilen sayının basamak
    // sayısını ekrana yazdıran algoritma ?


    /* var sayac=0
    println("Lütfen bir sayı giriniz:")
    var sayi = readLine()!!.toInt()
    while (sayi != 0) {
        sayi/=10
        sayac++
    }
    println("Basamak sayısı : $sayac")*/


    //Örnek 26: Bir fabrikada sabit maaşla çalışan işçiler aile durumlarına göre ek
    // maaş almaktadırlr. Çocuk sayısı 1 ise maaşının %5’i kadar , çocuk sayısı 2 ise %10’u 3 ve
    // daha fazla ise %15’i kadar aile yardımı almaktadır. Buna göre kullanıcıdan işçinin
    // maaşı ve çocuk sayısı istenerek gerekli hesaplamayı yapan algoritma ?

    /*

    println("Lütfen maaşınızı yazınız.")
    var maas= readLine()!!.toInt()
    println("Lütfen kaç çocugunuz olduğunuz belirtiniz:")
    var cocukSayisi= readLine()!!.toInt()
    if (cocukSayisi==1){
        println("Maaşınız: ${maas+(maas*5/100)}")
    }
    else if (cocukSayisi==2){
        println("Maaşınız: ${maas+(maas*10/100)}")
    }
    else if (cocukSayisi==3){
        println("Maaşınız: ${maas+(maas*15/100)}")
    }
    else if (cocukSayisi==0){
        println("Maaşınız : $maas")
    }
    else {
        println("3.Çocuk üstünde olan kişiler 3 çocugu varmış politikası uygulanmaktadır.")
        println("Maaşınız: ${maas+(maas*15/100)}")
    }

*/
    //Örnek 27:  Bir fabrikada işçinin alacağı ücret hesaplanırken şu kraterlere uyulmaktadır ;
    //Eğer işçi 40 saatten az çalışmışsa çalıştığı saat ve saat ücreti çarpılarak alacağı
    // ücret hesaplanıyor , eğer işçi 40 saat ve daha fazla çalışmışsa çalıştığı saat 2 saat
    // olarak hesaplanacak buna göre bilgileri alınarak ödenecek tutarı yazdıran algoritması.

    /*
    println("Lütfen çalışanın saatlik ücretini yazınız:")
    var saatlikucret= readLine()!!.toInt()
    println("Çalıştığını saati giriniz:")
    var calisansaat= readLine()!!.toInt()
    if (calisansaat>=40){
        println("Maaş: ${saatlikucret*(calisansaat*2)}")
    }
    else{
        println("Maas: ${saatlikucret*calisansaat}")
    }
    */

    //Örnek 28: 2.Dereceden Denkelem köklerini bulan programa ait akış şeması örneği.

    /*
    println("a sayısını giriniz:")
    var a= readLine()!!.toInt()
    println("b sayısını giriniz:")
    var b= readLine()!!.toInt()
    println("c sayısını giriniz:")
    var c= readLine()!!.toInt()
    var delta=(b*b)-(4*a*c)
    if (delta>0){
        println("Delta sıfırdan büyük bundan dolayı 2 kök vardır.")
    }
    else if (delta<0){
        println("Delta sıfırdan küçük bundan dolayı reel küme yoktur.")
    }
    else{
        println("delta sıfıra eşittir bundan dolayı aynı 2 reel kökü vardır.")
    }
    */

    //Örnek 29: Bir ücretlinin sicil numarası, çalışma saati ve saat ücreti bilgisayara giriş
    // olarak veriliyor.Ücretlinin bu bilgilerle maaşını hesaplayan algoritmayı ve akış şemasını çiziniz.


    /*
        println("Lütfen çalışanın sicil numarasını giriniz ")
        var sicilNo= readLine()!!.toInt()
        println("Lütfen çalışanın saatlik ücretini yazınız:")
        var saatlikucret= readLine()!!.toInt()
        println("Çalıştığını saati giriniz:")
        var calisansaat= readLine()!!.toInt()
        if (calisansaat>=40){
            println("Sicil NO: $sicilNo olan çalışanın Maaş: ${saatlikucret*(calisansaat*2)}")
        }
        else{
            println("Sicil NO: $sicilNo olan çalışanın Maas: ${saatlikucret*calisansaat}")

        }
        */

    //Örnek 30:  İki sayının farkını bulan algoritmayı yapınız.

    /*
        println("Lütfen 1 .sayıyı giriniz:")
        var n1= readLine()!!.toInt()
        println("Lütfen 2 .sayıyı giriniz:")
        var n2= readLine()!!.toInt()
        var sonuc=fark(n1,n2)
        println("İşlem sonucunuz :" +sonuc)
        */


//30. Örnek için oluşturulan fonksiyon
/*}
fun fark(n1:Int,n2:Int):Int{
        return n1-n2*/

    //Örnek 31: Klavyeden girilen N sayısına göre 1 den N ye kadar olan tek sayıların
    // toplamı ve çarpımı çift sayıların ise  toplamını bulan programın
    // algoritmasını oluşturunuz.

    /*
        var tekToplam=0
        var tekCarpım=1
        var ciftToplam=0
        println("Lütfem sayı giriniz:")
        var sayi= readLine()!!.toInt()
        for (i in 1..sayi){
                if (i % 2 ==1){
                        tekToplam+=i
                        tekCarpım*=i
                }
                else{
                        ciftToplam+=i
                }
        }
        println("Tek sayıların toplamı : $tekToplam")
        println("Tek sayıların çarpımı : $tekCarpım")
        println("Çift sayıların toplamı : $ciftToplam")
        */

    //Örnek 32: Klavyeden girilen 10 sayıyı toplayan ve sonucu ekranda gösteren programın algoritmasını yazınız.

    /*
        var sayac=0
        var toplam=0
        var i = 0
        while (i < 10){
                println("Lütfen sayı giriniz:")
                var sayi= readLine()!!.toInt()
                sayac+=1
                toplam+=sayi
                i++
        }
        println("$sayac adet sayı yazılmıştır.")
        println("$toplam sayıların toplamıdır.")

*/

    //Örnek 33: Klavyeden girilen a ve b sayıları arasındaki sayıları listeleyen
    // Akış Şeması Örneği:

    /*  println("Lütfen a sayısını giriniz:")
        var a= readLine()!!.toInt()
        println("Lütfen b sayısını giriniz:")
        var b= readLine()!!.toInt()
        for (i in a..b){
                println(i)
        }*/

    //Örnek 34: Klavyeden 2 sayı girilecek daha sonra işlem numarası girilecek
    // girilen işlem numarasına gööre işlem yapılacak sonuç ekranda
    // görüntelenecek algoritma akış diyagramı


/*
        var result=0
        println("LÜTFEN YAPMAK İSTEDİĞİNİZ SEÇİMİ TUŞLAYINIZ:")
        println("1->TOPLAMA")
        println("2->ÇIKARMA")
        println("3->ÇARPMA")
        println("4->BÖLME")
        var secim= readLine()!!.toInt()
        println("Lütfen 1.sayıyı giriniz")
        var sayi1= readLine()!!.toInt()
        println("Lütfen 2.sayıyı giriniz")
        var sayi2= readLine()!!.toInt()
        when(secim){
            1->{
                result= sum(sayi1,sayi2)
            }
            2-> {
                 result= extraction(sayi1,sayi2)
            }
            3-> {
                result= multiply(sayi1,sayi2)
            }
            4-> {
                result= divide(sayi1,sayi2)
            }
            else-> println("Lütfen 1 ile 4 arası seçim yapınız.")
        }
        println("işleminizin sonucu : "+result)
    }
    fun sum(n1:Int,n2:Int):Int{
        return n1+n2
    }

    fun extraction(n1:Int,n2:Int):Int{
        return n1+n2
    }

    fun multiply(n1:Int,n2:Int):Int{
        return n1+n2
    }

    fun divide(n1:Int,n2:Int):Int{
        return n1+n2

*/

    //Örnek 35: Klavyeden girilen 3 basamaklı sayının 1. 2. ve 3. basamağını
    // (Basamak Değerlerini) yazdıran programın algoritması.


    /*  println("sayi giriniz")
    val sayi = readLine().toString()
    repeat(sayi.length) {
        println(sayi[it])
    }*/


    //Örnek 36:  Ekrana 10 defa Adını yazdıran Akış Şeması

    /*
       var i = 0
        println("Lütfen adınızı giriniz:")
        var ad = readLine()!!.toString()
        while (i < 10) {
                i++
                println(ad)
        }
*/
    //Örnek 37: Bir dersten 3 sınav notu alan bir öğrencinin : a- ortalamasını,
    // b-5 li sistemdeki not karşılığını, c-harfli sistemdeki not karşılığını
    // yazdıran programın algoritmasını ve akış diyagramını tasarlayınız.

    /*println("Lütfen 1. sınav notunuzu yazınız:")
    var sinav1= readLine()!!.toInt()
    println("Lütfen 2. sınav notunuzu yazınız:")
    var sinav2= readLine()!!.toInt()
    println("Lütfen 3. sınav notunuzu yazınız:")
    var sinav3= readLine()!!.toInt()
    var ortalama=(sinav1+sinav2+sinav3)/3
    println("ortalamanız : $ortalama")
    if (ortalama>=85 && ortalama<=100){
        println("5")
    }
    else if (ortalama>=70){
        println("4")
    }
    else if (ortalama>=55){
        println("3")
    }
    else if (ortalama>=45){
        println("2")
    }
    else if (ortalama>=25){
        println("1")
    }
    else{
        println("0")
    }
    if (ortalama>=85 && ortalama<=100){
        println("A")
    }
    else if (ortalama>=70){
        println("B")
    }
    else if (ortalama>=55){
        println("C")
    }
    else if (ortalama>=45){
        println("D")
    }
    else if (ortalama>=25){
        println("F")
    }
    else{
        println("F-")
    }
*/

    //Örnek 38: Bir fabrikada sabit maaşla çalışan işçiler aile durumlarına ve ürettikleri
    // parça sayısına göre de ek maaş almaktadır. Aşağıda verilen yönergelere göre işçilerin
    // maaşlarını hesaplayan programın algoritmasını ve akış diyagramını tasarlayınız.


/*
    var sonuc=0
    var ekstra=1
    println("Çalışan ismi")
    var isim= readLine()!!.toString()
    println("çalışan aile durumu 'İYİ' , 'ORTA', 'KÖTÜ' olara seçebilirsiniz.")
    var aileDurumu= readLine()!!.toString()
    println("Çalışanın ürettiği parça sayısı")
    var parcaSayisi= readLine()!!.toInt()
    var maas=5000
    if (aileDurumu=="İYİ"){
        sonuc=maas+1000
        if (parcaSayisi>=2000){
            ekstra=parcaSayisi*2
        }
        else{
            ekstra=parcaSayisi*1
        }
    }
    else if (aileDurumu=="ORTA"){
        sonuc=maas+1500
        if (parcaSayisi>=2000){
            ekstra=parcaSayisi*2
        }
        else{
            ekstra=parcaSayisi*1
        }
    }
    else if (aileDurumu=="KÖTÜ"){
        sonuc=maas+2000
        if (parcaSayisi>=2000){
            ekstra=parcaSayisi*2
        }
        else{
            ekstra=parcaSayisi*1
        }
    }
    else{
        println("Lütfen geçerli bir kategori seçiniz.")
    }
    println("$isim isimli çalışanın ailevi durumu: $aileDurumu ürettiği parça sayısı: $parcaSayisi olduğuna göre total maaş: ${sonuc+ekstra}")

   */

    //Örnek 39:  Klavyeden 3 adet kenar uzunluğu giriliyor. Girilen kenar uzunlukları ile :
    // a-Üçgenin çizilip çizilemeyeceğini,
    // b-Eğer üçgen çizilirse Üçgenin çeşidini(ikizkenar, çeşitkenar, eşkenar),
    // c- çizilen üçgenin çevresini bulup ekrana yazan programın algoritmasını ve akış diyagramını tasarlayınız.

/*

    println("Lütfen a kenarını giriniz:")
    var a= readLine()!!.toInt()
    println("Lütfen b kenarını giriniz:")
    var b= readLine()!!.toInt()
    println("Lütfen c kenarını giriniz:")
    var c= readLine()!!.toInt()
    println("ÜÇGEN OLUŞABİLİR Mİ KONTROL EDİYORUZ:")
    if (a+b>c && a+c>b && b+c>a){
        println("EVET")
    }
    else{
        println("HAYIR.")
    }
    if (a==b && a==c && b==c){
        println("EŞKENAR ÜÇGEN")
    }
    else if (a==b && a!=c || a==c && a!=b){
        println("İKİZ KENAR")
    }
    else {
        println("ÇEŞİT KENAR")
    }
    println("LÜTFEN ÜÇGEN ÇEVRESİNİ HESAPLAYINIZ.")
    var cevre=(a+b+c)
    println("üçgen çevresi: $cevre")
    */

    //Örnek 40: Girilen 10 adet sayi içerisinden pozitiflerin ve negatiflerin ve “0”  sayısını ayrı ayrı bulan akış şeması.

    /*
    var sayilar= mutableListOf<Int>()
     for (i in 1..10){
        println("LÜTFEN SAYI GİRİNİZ:")
        var sayi= readLine()!!.toInt()
        if (sayi>0){
            println("$sayi ' sayısı pozitiftir.")
        }
        else if (sayi<0){
            println("$sayi ' sayısı negatiftir..")
        }
        else{
            println("$sayi sayısı sıfırdır.")
        }
         sayilar.add(sayi)
     }
    println(sayilar)
    */

    //Örnek 41: Kürenin alanını ve hacmini hesaplayan algoritma ve akış şeması örneği.

    /*
    println("Lütfen kürenin yarıçapını giriniz:")
    var r= readLine()!!.toInt()
    var alan=(4*(3.14)*(r*r))
    var hacim=((4/3)*(3.14)*(r*r*r))
    println("alan : $alan")
    println("hacim : $hacim")
*/

    //Örnek 42: Silindirin Alanı ve Hacmini hesaplayan algoritma ve akış şeması örneği
/*
    println("Lütfen silindirin yarıçapını giriniz:")
    var r= readLine()!!.toInt()
    println("Lütfen silindirin yüksekliğini giriniz:")
    var h= readLine()!!.toInt()
    var alan=(2*(3.14)*r*h)+(2*(3.14)*r*r)
    var hacim=((3.14)*r*r*h)
    println("alan : $alan")
    println("hacim : $hacim")
*/
    //Örnek 43: Girilen 3 sayıdan en büyüğünü bulan algoritma örneği

    /*
    var eb=0
    println("Lütfen 1. sayı giriniz:")
    var sayi1= readLine()!!.toInt()
    if (sayi1>eb){
        eb=sayi1
    }
    println("Lütfen 2. sayı giriniz:")
    var sayi2= readLine()!!.toInt()
    if (sayi2>eb){
        eb=sayi2
    }
    println("Lütfen 3. sayı giriniz:")
    var sayi3= readLine()!!.toInt()
    if (sayi3>eb){
        eb=sayi3
    }
    println("Girilen en büyük sayı: $eb")
    */


    //Örnek 44: 7-24 arası tek sayıların toplamını ve ortalamasını bulan algoritma

    /*

    var sayac=0
    var toplam=0
    var ortalama=1
    for (i in 7..24){
        if (i % 2 ==1){
            println(i)
            toplam+=i
            sayac+=1
            ortalama=toplam/sayac
        }

    }
    println("Döngüdeki sayıların toplamı "+toplam)
    println("Döngüdeki adet sayısı: " +sayac)
    println("Döngünün ortalaması : "+ortalama)

    */

    //Örnek 45: Klavyeden Girilen 3 sayının ortalamasını alan algoritma

/*
    var toplam=0
    var ortalama=1
    for (i in 1..3){
        println("Lütfen sayı giriniz:")
        var sayi= readLine()!!.toInt()
        toplam+=sayi
        ortalama=toplam/i
    }
    println("TOPLAM :"+toplam)
    println("ORTALAMA :"+ortalama)
*/

    //Örnek 46: Klavyeden girirlen 5 adet sayının ortalamasının döngü mantnığı
    // ile bulup ekrana yazdıran akış diyagramını oluşturunuz.

    /*  var toplam=0
    var ortalama=1
    for (i in 1..5){
        println("Lütfen sayı giriniz:")
        var sayi= readLine()!!.toInt()
        toplam+=sayi
        ortalama=toplam/i
    }
    println("TOPLAM :"+toplam)
    println("ORTALAMA :"+ortalama)
*/

    //Örnek 47: 1 ile 40 arasında bulunan 5 in katı olan sayıları ekrana yazan akış şeması.

    /*

   for (i in 1..40){
        if (i % 5 == 0){
            println(i)
        }
    }

*/
    //Örnek 49: Taban uzunluğu ve yüksekliği girilen paralelkenarın alanını hesaplayan algoritma.

    /* println("Taban uzunluğu:")
    var tUzunlugu= readLine()!!.toInt()
    println("Yükseklik:")
    var h= readLine()!!.toInt()
    var alan=tUzunlugu*h
    println(alan)
*/
    //Örnek 50:  Arka arkaya girilen rastgele 10 tamsayının ortalaması ile bu sayılardan
    // en büyük ve en küçük olanının ortalamasını bularak elde edilen bu iki ortalamanın farkını alan algoritma örneği.

    /*
   var toplam=0
    var ort=1
    var sayiKumesi= mutableListOf<Int>()
    for (i in 1..10){
        println("Lütfen sayı:")
        var sayi= readLine()!!.toInt()
        toplam+=sayi
        ort=toplam/i
        sayiKumesi.add(sayi)
    }
    println(sayiKumesi)
    println(ort)
    var mini=sayiKumesi.min()
    var maxi =sayiKumesi.max()
    var avarage= (maxi!!+mini!!)/2
    println(avarage)
    var asilOrt=ort-avarage
    println("İki ortalamanın farkı :$asilOrt ")
    */


    //Örnek 51: Öğrencinin sınavdan aldığı puan (0-100) karşılığı olan notu (1-5) ekranda gösteren algoritma örneği.

    /*
    println("Lütfen 1. sınav notunuzu yazınız:")
    var sinav1 = readLine()!!.toInt()
    println("Lütfen 2. sınav notunuzu yazınız:")
    var sinav2 = readLine()!!.toInt()
    println("Lütfen 3. sınav notunuzu yazınız:")
    var sinav3 = readLine()!!.toInt()
    var ortalama = (sinav1 + sinav2 + sinav3) / 3
    println("ortalamanız : $ortalama")
    if (ortalama >= 85 && ortalama <= 100) {
        println("5")
    } else if (ortalama >= 70) {
        println("4")
    } else if (ortalama >= 55) {
        println("3")
    } else if (ortalama >= 45) {
        println("2")
    } else if (ortalama >= 25) {
        println("1")
    } else {
        println("0")

    }
    */

    //Örnek 56: Klavyeden girilen 1-25 arasındaki bir tamsayının faktöriyelini
    // alan programın algoritma ve akış diyagramını yazınız.

    /*   var result=1
    println("Lütfen bir sayı giriniz:")
    var sayi= readLine()!!.toInt()
    if (sayi>=1 && sayi<=25){
        for (i in sayi downTo 1) {
            result *= i
    }
        println("$sayi sayısının faktöriyeli : $result 'tur.")

    }
    else{
        println("Lütfen 1-25 arasında değer giriniz.")
    }
*/
    //Örnek 57: Klavyeden ardı ardına sayı girişi isteyen ve bu sayı 10 ile 15
    // arasında olmadığı sürece bu işleme devam eden programın algoritma ve akış diyagramını yazınız.

    /*
   while (true){
        println("Lütfen sayı giriniz.10 ile 15 arasında bir değer girince çıkış yapar.")
        var sayi= readLine()!!.toInt()
        if (sayi>10 && sayi<15){
            println("ÇIKIŞ")
            break
        }

    }
    */

    //Örnek 58:  1den 25 e kadar olan sayıların kareleri toplamını
    // bulan programın algoritma ve akış diyagramını yazınız.

    /*
    var kare=1
    var toplam=0
    for (i in 1..25){
        println(i)
        kare=(i*i)
        toplam+=kare
    }
    println("toplam :" +toplam)
*/

    //Örnek 59: Klavyeden 10 tane tamsayı girilmesini isteyen ve bu girilen
    // tamsayılardan kaç tanesinin negatif olduğunu bulan programın algoritma ve akış diyagramını yazınız.

    /*var pozitifAdet=0
    var negatifAdet=0
    var sifirAdet=0
    for (i in 1..10){
        println("Lütfen sayı giriniz:")
        var sayi= readLine()!!.toInt()
        if (sayi>0){
            println("$sayi POZİTİF")
            pozitifAdet++
        }
        else if (sayi<0){
            println("$sayi NEGATİF")
            negatifAdet++
        }
        else{
            println("SAYI SIFIRDIR.")
            sifirAdet++
        }
    }
    println("Pozitif sayıların adeti :$pozitifAdet")
    println("Negatif sayıların adeti :$negatifAdet")
    println("SIFIR ADET :$sifirAdet")*/

    //Örnek 61: Klavyeden girilen 1-12 arasındaki tamsayıların hangi aya denk geldiğini bulup ekrana yazan programın
    //algoritma ve akış diyagramını yazınız.

    /*
    println("Lütfen 1-12 arasında bir sayı giriniz.")
    var ay= readLine()!!.toInt()
    if (ay==1){
        println("OCAK")
    }
    else if (ay==2){
        println("ŞUBAT")
    }
    else if (ay==3){
        println("MART")
    }
    else if (ay==4){
        println("NİSAN")
    }
    else if (ay==5){
        println("MAYIS")
    }
    else if (ay==6){
        println("HAZİRAN")
    }
    else if (ay==7){
        println("TEMMUZ")
    }
    else if (ay==12){
        println("AĞUSTOS")
    }
    else if (ay==9){
        println("EYLÜL")
    }
    else if (ay==10){
        println("EKİM")
    }
    else if (ay==11){
        println("KASIM")
    }
    else if (ay==12){
        println("ARALIK")
    }
    else{
        println("LÜTFEN 1-12 arası değer giriniz.")
    }
    */

    //Örnek 62: Dört işleme birer kod numarası vererek, klavyeden girilen iki sayıyı yine klavyeden girilen işlem koduna
    // göre toplayan, çıkaran, çarpan veya bölen programın algoritma ve akış diyagramını yazınız.

    /*

    var result=0
    println("LÜTFEN HESAP MAKİNASINDA YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ:")
    println("1->TOPLAMA")
    println("2->ÇIKARMA")
    println("3->ÇARPMA")
    println("4->BÖLME")
    var secim= readLine()!!.toInt()
    println("Lütfen 1.sayıyı giriniz")
    var sayi1= readLine()!!.toInt()
    println("Lütfen 2.sayıyı giriniz")
    var sayi2= readLine()!!.toInt()
    when(secim){
        1->{
            result= sum(sayi1,sayi2)
        }
        2-> {
            result= extraction(sayi1,sayi2)
        }
        3-> {
            result= multiply(sayi1,sayi2)
        }
        4-> {
            result= divide(sayi1,sayi2)
        }
        else-> println("Lütfen 1 ile 4 arası seçim yapınız.")
    }
    println("işleminizin sonucu : "+result)
}
fun sum(n1:Int,n2:Int):Int{
    return n1+n2
}

fun extraction(n1:Int,n2:Int):Int{
    return n1+n2
}

fun multiply(n1:Int,n2:Int):Int{
    return n1+n2
}

fun divide(n1:Int,n2:Int):Int{
    return n1+n2
}

*/

    //Örnek 63: Klavyeden ardı ardına girilen sayıları toplayan ve girilen sayı negatif olduğunda duran programın algoritma ve
    //akış diyagramını yazınız.


    /*

    var sayac=0
    var toplam=0
    while (true){
        println("Lütfen sayı giriniz:")
        var sayi= readLine()!!.toInt()
        if (sayi<0){
            println("ÇIKIŞ")
            break
        }
        sayac+=1
        toplam+=sayac
    }
    println("Girilen sayı adeti=$sayac ve toplamları =$toplam")

    */

    //Örnek 64: Klavyeden bir not girilmesini isteyen ve bu not 0-49 arasındaysa “Başarısız”, 50-64 arasındaysa “Orta”, 65-84
    //arasındaysa “İyi”, 85-100 arasındaysa “Çok iyi “ Yazan programın algoritma ve akış diyagramını yazınız.

/*
    println("Lütfen not giriniz:")
    var not= readLine()!!.toInt()
    if (not>0 && not<=49){
        println("BAŞARISIZ.")
    }
    else if (not>=50 && not<=64){
        println("ORTA")
    }
    else if (not>=65 && not<=84){
        println("İYİ")
    }
    else if (not>=85 && not<=100){
        println("ÇOK İYİ")
    }
    else{
        println("GEÇERLİ NOT GİR.")
    }
    */

    //Örnek 65:  Klavyeden girilen iki tamsayıdan büyük olanı bulup ekrana yazdıran programın algoritma ve akış diyagramını
    //yazınız.

/*
    var eb=0
    println("Lütfen 1. sayı giriniz:")
    var sayi1= readLine()!!.toInt()
    if (sayi1>eb){
        eb=sayi1
    }
    println("Lütfen 2. sayıyı giriniz:")
    var sayi2= readLine()!!.toInt()
    if (sayi2>eb){
        eb=sayi2
    }
    println("En büyük sayı: $eb")

*/

    //Örnek 66: Klavyeden girilen iki pozitif tamsayıdan birincisinin ikincisi cinsinden kuvvetini alan programın algoritma ve
    //akış diyagramını hazır fonksiyon kullanmadan yazınız.

    //------------------------------------
    //------------------------------------
    //------------------------------------
    //------------------------------------

    //Örnek 67:  n! değerini hesaplayan programın algoritma ve akış diyagramını yazınız.


    /*
    var result=1
    println("Lütfen bir sayı giriniz:")
    var sayi= readLine()!!.toInt()
    for (i in sayi downTo 1){
        result*=i
    }
    println("$sayi sayısının faktöriyeli : $result 'tur.")
    */

    //Örnek 68:  1+4+9+ … +100= değerini hesaplayan programın algoritma ve akış diyagramını yazınız.

/*
    var i=1
    var toplam=0
    while (i<11){
        var kare=i*i
        i++
        toplam+=kare
    }
    println("karelerin toplamı: " +toplam)
    */

    //Örnek 69:  Toplama, çıkarama, çarpma ve bölme işlemi yapan programın algoritma ve akış diyagramını yazınız.

    /*
    var result=0
    println("LÜTFEN YAPMAK İSTEDİĞİNİZ SEÇİMİ TUŞLAYINIZ:")
    println("1->TOPLAMA")
    println("2->ÇIKARMA")
    println("3->ÇARPMA")
    println("4->BÖLME")
    var secim= readLine()!!.toInt()
    println("Lütfen 1.sayıyı giriniz")
    var sayi1= readLine()!!.toInt()
    println("Lütfen 2.sayıyı giriniz")
    var sayi2= readLine()!!.toInt()
    when(secim){
        1->{
            result= sum(sayi1,sayi2)
        }
        2-> {
            result= extraction(sayi1,sayi2)
        }
        3-> {
            result= multiply(sayi1,sayi2)
        }
        4-> {
            result= divide(sayi1,sayi2)
        }
        else-> println("Lütfen 1 ile 4 arası seçim yapınız.")
    }
    println("işleminizin sonucu : "+result)
}
fun sum(n1:Int,n2:Int):Int{
    return n1+n2
}

fun extraction(n1:Int,n2:Int):Int{
    return n1+n2
}

fun multiply(n1:Int,n2:Int):Int{
    return n1+n2
}

fun divide(n1:Int,n2:Int):Int{
    return n1+n2
}
*/

    //Örnek 70:  Saatte ortalama 60 km yol giden bir aracın, klavyeden girilen mesafeyi kaç saatte gideceğini hesaplayan
    //programın algoritma ve akış diyagramını yazınız.

    /*
    var hiz=60
    println("Lütfen aracın gideceği km bilgisini giriniz:")
    var km= readLine()!!.toDouble()
    var saat=(km/hiz).toDouble()
    println("saatte $hiz km hız ile giden araç $km km yolu $saat saatte gider.")
    */
}










