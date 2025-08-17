package com.ll

class NullExam

fun main(){
val name: String? = null // 변수 타입 뒤에 ?를 붙이면 null을 가질 수 있는 타입
println(name?.length) // null 출력 (NPE 발생 안 함), 객체가 null이 아니면 메서드/프로퍼티에 접근하고,
    // null이면 NPE 없이 그냥 null 반환.

val length = name?.length ?: 0 // 왼쪽 값이 null이면 **오른쪽 값(대체값)**을 반환.
println(length) // 0 출력
}