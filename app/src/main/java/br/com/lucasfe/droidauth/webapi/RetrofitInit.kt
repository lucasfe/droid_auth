package br.com.lucasfe.droidauth.webapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInit {


    val retrofit = Retrofit.Builder()
            .baseUrl("http://api-vanhack-event-sp.azurewebsites.net")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun webapi(): WebApi {
        return retrofit.create(WebApi::class.java)
    }

}