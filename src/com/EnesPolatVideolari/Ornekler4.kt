package com.EnesPolatVideolari


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

        //---------------------------------------
        //---------------------------------------
        //---------------------------------------
        //---------------------------------------
        //---------------------------------------

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



}



