package br.com.lucasfe.droidauth.webapi

import retrofit2.http.GET

interface WebApi {

        @GET("webapi")
        fun authenticate()


}