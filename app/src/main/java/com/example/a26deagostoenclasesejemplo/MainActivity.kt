package com.example.a26deagostoenclasesejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a26deagostoenclasesejemplo.network.ClientRetrofit
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    private fun loadApiData(){
        val service = ClientRetrofit.retrofitInstance()
        val call = service.groupList()
        call.enqu

    }
}