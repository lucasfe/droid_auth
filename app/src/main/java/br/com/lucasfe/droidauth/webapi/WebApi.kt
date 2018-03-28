package br.com.lucasfe.droidauth.webapi

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WebApi {

    @GET("/api/v1/Customer/auth")
    fun authenticate(@Query("email") email: String, @Query("password") password: String): Call<String>


}