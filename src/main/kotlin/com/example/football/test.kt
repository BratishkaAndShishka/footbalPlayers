package com.example.football

import org.springframework.boot.runApplication

class test

fun main(args: Array<String>) {
    val footbalPlayers: MutableMap<String, Int> = mutableMapOf()
    footbalPlayers["Alexandr Gusev"] = 1
    footbalPlayers["Gleb"] = 2
    footbalPlayers["Mikhail Timoshin"] = 3
    footbalPlayers["Sergey fishman"] = 4
    footbalPlayers["Misha Nintando"] = 5
    footbalPlayers["Max"] = 6
    footbalPlayers["Viktor Voroshilov"] = 7
    footbalPlayers["Serega"] = 8
    footbalPlayers["Vova"] = 9
    footbalPlayers["Mihosik"] = 10
    footbalPlayers["Viktor Kuznetsov"] = 1
    footbalPlayers["Sergey Mikhailechenko"] = 2
    footbalPlayers["Kolyan"] = 3
    footbalPlayers["Antosha"] = 4

    val team1: MutableMap<String, Int> = mutableMapOf()
    val team2: MutableMap<String, Int> = mutableMapOf()

    val footbalPlayersList: MutableMap<String, Int> = footbalPlayers
    val x = footbalPlayersList.toList().sortedBy { (key, value) -> value }.toMap()

    println(x)

}

