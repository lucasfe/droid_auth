package br.com.lucasfe.droidauth.model

import android.databinding.BaseObservable
import java.util.*

class UserViewModel(private val user: User) : Observer, BaseObservable() {

    init {
        user.addObserver(this)
    }

    override fun update(p0: Observable?, p1: Any?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}