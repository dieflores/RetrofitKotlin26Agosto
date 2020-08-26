package com.example.a26deagostoenclasesejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a26deagostoenclasesejemplo.network.ClientRetrofit
import com.example.a26deagostoenclasesejemplo.pojo.Post
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadApiData()

    }

    private fun loadApiData(){
        val service = ClientRetrofit.retrofitInstance()
        val call = service.groupList()
        call.enqueue(object : Callback, retrofit2.Callback<List<Post>> {
            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })


        }



    private fun delete(){
        val service = ClientRetrofit.retrofitInstance()
        
    }
    }
