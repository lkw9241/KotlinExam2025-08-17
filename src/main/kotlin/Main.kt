package com.ll


fun main() {
    // ===== 클래스 정의 =====
    class Hand {
        fun grab() {
            println("Grabbed something!")
        }
    }

    class Arm(val hand: Hand?)

    class Person(val leftArm: Arm?)

    // ===== 1. 모든 단계에서 null 발생 =====
    val personNull: Person? = null
    println("=== Case 1: person이 null ===")
    personNull?.leftArm?.hand?.grab()
    // 출력 없음 (아무 일도 안 일어남)

    // ===== 2. person은 존재하지만 leftArm이 null =====
    val personNoArm = Person(null)
    println("\n=== Case 2: leftArm이 null ===")
    personNoArm.leftArm?.hand?.grab()
    // 출력 없음

    // ===== 3. leftArm은 있지만 hand가 null =====
    val personNoHand = Person(Arm(null))
    println("\n=== Case 3: hand가 null ===")
    personNoHand.leftArm?.hand?.grab()
    // 출력 없음

    // ===== 4. 모든 값이 null이 아님 =====
    val personWithHand = Person(Arm(Hand()))
    println("\n=== Case 4: 모든 값이 null이 아님 ===")
    personWithHand.leftArm?.hand?.grab()
    // 출력: Grabbed something!
}
