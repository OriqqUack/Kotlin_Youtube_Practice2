package com.example.kotlinyoutubepractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinyoutubepractice2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) { //앱이 최초 실행됬을때 수행.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //xml화면 뷰를 연결한다.

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetText.setOnClickListener{//버튼 클릭시 수행할 동작을 setonclicklistener가 처리한다.
            binding.tvResult.setText("안녕하세요")
        }





    }
}