package com.example.a26deagostoenclasesejemplo.network

import android.telecom.Call
import retrofit2.http.GET


interface ApiClient {

    @GET("posts/")
    fun groupList(): Call

}