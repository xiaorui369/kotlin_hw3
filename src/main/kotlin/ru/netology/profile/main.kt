package ru.netology.profile

class Profile(private val id: Int,
              private val username: String,
              private val name: String,
              private val surname: String,
              private val status: String,
              private val avatar:String
){
    val fullname
        get()= ("$name $surname")
}
fun main() {
    val user = Profile(999,"Username","Andrey","Orlovsky","Single","None")
    println(user.fullname)
}
