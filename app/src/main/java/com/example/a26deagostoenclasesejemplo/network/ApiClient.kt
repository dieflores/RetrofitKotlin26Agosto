package com.example.a26deagostoenclasesejemplo.network


import com.example.a26deagostoenclasesejemplo.pojo.Post
import retrofit2.Call
import retrofit2.http.GET


interface ApiClient {

    @GET("posts/")
    fun groupList(): Call<List<Post>>

}