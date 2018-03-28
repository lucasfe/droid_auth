package br.com.lucasfe.droidauth.model

import br.com.lucasfe.droidauth.webapi.RetrofitInit
import java.util.Observable;

class User : Observable() {

    var name: String = ""
        set (value) {
            field = value
            setChangedAndNotify("name")
        }

    var email: String = ""
        set(value) {
            field = value
            setChangedAndNotify("email")
        }

    var password: String = ""
        set(value) {
            field = value
            setChangedAndNotify("password")
        }

    private fun setChangedAndNotify(field: Any) {
        setChanged()
        notifyObservers(field)
    }


}

