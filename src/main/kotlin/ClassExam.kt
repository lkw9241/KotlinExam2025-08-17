package com.ll

class ClassExam

class Person(val name: String){
    fun greet(){
        println("Hello, my name is $name")
    }
}

fun main(){
    val person = Person("Jisun")

    person.greet()
}