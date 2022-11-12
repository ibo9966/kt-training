package com.EmreKoseVideolari

//ÖRNEK1
//Bankacılık işlemlerinden eft işlemi yapılmak isteniyor.
//İşlem yapılacak gün ve saat bilgisini mesai günleri ve saatleri içinde olup olmamasına göre kullanıcının işlemin yapılabilmesi

fun main() {
/*
    var kullaniciIslemGunu = 5
    var kullaniciIslemSaati = 19

    if (kullaniciIslemGunu >0 && kullaniciIslemGunu <= 7)
    {
        if (kullaniciIslemGunu <=5)
        {
            if (kullaniciIslemSaati>0 && kullaniciIslemSaati<=24)
            {
                if (kullaniciIslemSaati>=9 && kullaniciIslemSaati<18)
                {
                    println("İşleminiz başarılı bir şekilde gerçekleşmiştir.")
                }
                else
                {
                    if(kullaniciIslemGunu ==5 )
                    {
                        println("İşleminiz 2 gün sonra saat 09.00 dan gerçekleşecektir.")
                    }
                    else
                    {
                        println("İşleminiz yarın saat 09.00 da gerçekleştirilecektir.")
                    }
                }
            }
            else
                println("Geçersiz saat")

        }
        else if (kullaniciIslemGunu == 6)
        {
            println("İşleminiz 2 gün sonra saat 09.00 da gerçekleştirilecektir.")
        }
        else
        {
            println("İşleminiz yarın saat 09.00 da gerçekleştirilecektir.")

        }
    }
    else
    {
        println("Geçersiz Gün.")
    }
    */

    //when-else
  /*
  when(deger)
    {
        1-> println("1")
    }
    */

   /*
   var d = 4
    when(d)
    {
        1-> println("1 en küçük ")
        2-> println("2 orta ")
        3->
        {
            println("3 daha büyük")
        }
        in 1..5->
        {
            println("1-5 arasında")
        }
        !in 1..5->
        {
            println("1-5 arasında değil")
        }
        else->
        {
            println("else")
        }

    }
    */

//ÖRNEK2
//Bankacılık işlemlerinden eft işlemi yapılmak isteniyor.
//İşlem yapılacak gün ve saat bilgisini mesai günleri ve saatleri içinde olup olmamasına göre kullanıcının işlemin yapılabilmesi

   /*
    var kullaniciIslemGunu = 7
    var kullaniciIslemSaati = 19
    when(kullaniciIslemGunu)
    {
        in 1..5->
        {
            when (kullaniciIslemSaati)
            {
                in 9..17->
                {
                    println("İşleminiz gerçekleşmiştir.")
                }
                in 0..8->
                {
                    println("İşleminiz bugun saat 09.00 da yapılacaktır.")
                }
                in 18..24->
                {
                    when(kullaniciIslemGunu)
                    {
                        5->
                        {
                            println("İşleminiz 2 gün sonra saat 09.00da gerçekleşecektir.")
                        }
                        else->
                        {
                            println("İşleminiz yarın saat 09.00da gerçekleşecektir.")
                        }
                    }
                }
            }
        }
        6->
        {
            println("İşleminiz 2 gün sonra saat 09.00da gerçekleşecektir.")
        }
        7->
        {
            println("İşleminiz yarın saat 09.00da gerçekleşecektir.")
        }
    }
    */

    //while
   /* while (kosul)
    {

    }*/

    /*var sayac = 20

    while(sayac<10)
    {
        sayac++
        println(sayac)
    }

    // do-while

    do
    {
        println(sayac)
    }while (sayac<10)
    */

/*

    for(i in 1..10)
    {
        println(i)
    }

    for (i : Int in 1..3)
    {
        println(i)
    }
    */

    //continue
    /*for (i in 1..10)
    {
        if (i==5)
        {
            continue
        }
        println(i)

    }
*/
    //break

/*
    var sayac=4

    yusuf@for (i in 1..100)
    {
        furkan@for(i in 1..100)
        {
            if (i==sayac)
            {
                break@yusuf
            }
            println(i)
        }

    }
*/

}


