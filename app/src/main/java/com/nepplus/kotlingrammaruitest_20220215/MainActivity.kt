package com.nepplus.kotlingrammaruitest_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnLogin.setOnClickListener {
            var inputId = edtId.text.toString()
            var inputPass = edtPass.text.toString()

            Log.d("아이디",inputId)
            Log.d("비밀번호",inputPass)
            
            if(inputId=="admin" && inputPass=="asdf"){
                Toast.makeText(this, "관리자님 환영합니다", Toast.LENGTH_SHORT).show()
            }
            else if(inputId!="admin"){
                Toast.makeText(this, "아이디가 잘못되었습니다", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "비밀번호가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}