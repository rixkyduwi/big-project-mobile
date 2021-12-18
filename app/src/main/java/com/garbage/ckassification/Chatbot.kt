package com.garbage.ckassification

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.garbage.ckassification.modelchatbot.APIService
import com.garbage.ckassification.modelchatbot.ChatResponse
import com.garbage.ckassification.modelchatbot.AdapterChatbot
import com.garbage.ckassification.modelchatbot.ChatModel
import kotlinx.android.synthetic.main.chatbot.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Chatbot : AppCompatActivity() {
    private val adapterChatBot = AdapterChatbot()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scan)

        getSupportActionBar()!!.setDisplayShowHomeEnabled(true);
        getSupportActionBar()!!.setLogo(R.drawable.icon);
        getSupportActionBar()!!.setDisplayUseLogoEnabled(true);
        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.8.100:5000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiService = retrofit.create(APIService::class.java)

        rvChatList.layoutManager = LinearLayoutManager(this)
        rvChatList.adapter = adapterChatBot

        btnSend.setOnClickListener {
            if(etChat.text.isNullOrEmpty()){
                Toast.makeText(this@Chatbot, "Please enter a text", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            adapterChatBot.addChatToList(ChatModel(etChat.text.toString()))
            apiService.chatWithTheBit(etChat.text.toString()).enqueue(callBack)
            etChat.text.clear()
        }
    }

    private val callBack = object  : Callback<ChatResponse>{
        override fun onResponse(call: Call<ChatResponse>, response: Response<ChatResponse>) {
            if(response.isSuccessful &&  response.body()!= null){
                adapterChatBot.addChatToList(ChatModel(response.body()!!.chatBotReply, true))
            }else{
                Toast.makeText(this@Chatbot, "Something went wrong", Toast.LENGTH_LONG).show()
            }
        }

        override fun onFailure(call: Call<ChatResponse>, t: Throwable) {
            Toast.makeText(this@Chatbot, "Something went wrong", Toast.LENGTH_LONG).show()
        }

    }
}