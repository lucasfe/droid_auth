package br.com.lucasfe.droidauth.webapi

import io.reactivex.Observable
import retrofit2.http.GET

interface WebApi {

        @GET("webapi")
        fun authenticate() : Observable<String>


}