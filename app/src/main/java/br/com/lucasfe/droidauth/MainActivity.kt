package br.com.lucasfe.droidauth

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.lucasfe.droidauth.webapi.RetrofitInit
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity(), retrofit2.Callback<String> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { login() }
    }


    private fun login() {
        val call = RetrofitInit().webapi().authenticate("lucasfe@gmail.com", "123456")
        call.enqueue(this)
    }


    override fun onFailure(call: Call<String>?, t: Throwable?) {
        toast("failure")
    }

    override fun onResponse(call: Call<String>?, response: Response<String>?) {

        toast("response")
    }


}
