package com.example.appreceitas.model

class PersonRepository {
    fun login(email: String, password: String): Boolean{
        return (email == "contato@email.com" && password == "123")
    }
}