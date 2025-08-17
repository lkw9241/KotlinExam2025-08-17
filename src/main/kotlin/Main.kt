package com.ll


fun main() {
    val name: String? = null // nullable 타입

    println(name?.length ?: " Name is null")

}