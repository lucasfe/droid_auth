package br.com.lucasfe.droidauth.model

import android.databinding.BaseObservable
import android.databinding.Bindable
import br.com.lucasfe.droidauth.BR
import java.util.*

class UserViewModel(private val user: User) : Observer, BaseObservable() {

    init {
        user.addObserver(this)
    }

    override fun update(p0: Observable?, p1: Any?) {

        if (p1 is String) {
            if (p1 == "name") {
                notifyPropertyChanged(BR.name)
            }
        }
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    val name: String
    @Bindable get() {
        return user.name
    }

}