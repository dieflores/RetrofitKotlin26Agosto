package com.example.a26deagostoenclasesejemplo.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ClientRetrofit {

    companion object{
        private const val BASE_URL = "https://jsonplaceholder.typicode.com/posts"

        fun retrofitInstance(): ApiClient{

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(ApiClient::class.java)
        }
    }
}