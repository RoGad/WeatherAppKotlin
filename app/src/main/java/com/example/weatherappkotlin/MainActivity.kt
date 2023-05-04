package com.example.weatherappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.weatherappkotlin.databinding.ActivityMainBinding
import com.example.weatherappkotlin.fragment.MainFragment
import org.json.JSONObject


class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle? ) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            supportFragmentManager.beginTransaction().replace(R.id.placeHolder, MainFragment.newInstance()).commit()
    }
}