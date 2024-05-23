package com.example.link

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var spinUrl: Spinner
    private lateinit var btnGo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinUrl = findViewById(R.id.spinnerUrl)
        btnGo = findViewById(R.id.buttonWeb)

        btnGo.setOnClickListener {
            val spinPosition = spinUrl.selectedItemPosition

            val intentBrowser = Intent(Intent.ACTION_VIEW,Uri.parse(getUrl(spinPosition)))
            startActivity(intentBrowser)
        }
    }
    fun getUrl(index:Int): String{
        val url = resources.getStringArray(R.array.url)
        return url[index]
    }

}