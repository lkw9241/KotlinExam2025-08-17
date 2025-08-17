package com.ll

class MapExam

fun main(){
    val ages = mapOf("Alice" to 25, "Bob" to 30, "Carol" to 45)

    for((name, age) in ages){
        println("$name is $age years old")
    }
}