package com.example.appreceitas.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appreceitas.model.PersonRepository

class MainViewModel : ViewModel() {
    private var textWelcome = MutableLiveData<String>()
    private var login = MutableLiveData<Boolean>()
    private var personRepository = PersonRepository()

    init {
        textWelcome.value = "Aplicativo de Receitas!"
    }

    fun getWelcome() : LiveData<String> {
        return textWelcome
    }

    fun getLogin() : LiveData<Boolean> {
        return login
    }

    fun doLogin(email: String, password: String) {
        login.value = personRepository.login(email, password)
    }
}