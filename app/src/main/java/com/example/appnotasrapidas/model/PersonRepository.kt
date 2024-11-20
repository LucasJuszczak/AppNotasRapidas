package com.example.appnotasrapidas.model

class PersonRepository {
    fun login(email: String, password: String): Boolean{
        return (email == "contato@email.com" && password == "123456789")
    }
}