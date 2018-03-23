package br.com.lucasfe.droidauth.webapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInit {

    private val retrofit = Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun webapi(): WebApi {
        return retrofit.create(WebApi::class.java)
    }

}