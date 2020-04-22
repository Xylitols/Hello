package com.kuku2.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    // MainActivity가 최초 실행될 때 실행된다
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Activity 의 UI 를 R.layout.activity_main 으로 지정한다.
        // git test1

        setContentView(R.layout.activity_main)
    }
}
