package com.kuku2.hello

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {  // MainActivity가 최초 실행될 때 실행된다
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)  // Activity 의 UI 를 R.layout.activity_main 으로 지정한다.
        setContentView(R.layout.activity_main)
        Toast.makeText(getApplicationContext(),"프로그래밍을 시작해보자!",Toast.LENGTH_LONG).show() // "프로그래밍을 시작해보자!" 메세지를 잠시 보여준다
    }
}
