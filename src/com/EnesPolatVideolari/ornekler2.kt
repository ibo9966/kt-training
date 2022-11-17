package com.EnesPolatVideolari

fun main() {
    var futbol=Futbol()
    futbol.antrenman()
    var voleybol=Voleybol()
    voleybol.antrenman()
    futbol.yazdir()
    var ibo=Ibo()
    ibo.antrenman()
}

open class Takim{
    var teamName:String="Beşiktaş"
    var teamStadName:String="İnönü"
    var players:List<String> = listOf("ibo","yusuf")
    open fun antrenman()= println("Takımlar antrenman yapar.")

}

open class Futbol:Takim(){
    override fun antrenman() {
        println("Futbol takımları antrenman yapar.")
    }
    var futboTeamName=teamName
    var futbolStadName=teamStadName
    var futbolPlayerName=players

    fun yazdir(){
        println(futboTeamName)
        println(futbolStadName)
        println(futbolPlayerName)

    }
}

class Ibo:Futbol(){
    override fun antrenman() {
        println("İboda çalışıyor.")
    }
}
class Voleybol:Takim(){
    override fun antrenman() {
        println("Voleybol takımlar antrenman yapmazlar.")
    }

}