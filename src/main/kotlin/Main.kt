package com.ll

class Person(val name : String){
    fun greet(){
        print("Hello, my name is $name")

    }
}

fun main(){
    var person = Person("Dmitry")
    person.greet()

}