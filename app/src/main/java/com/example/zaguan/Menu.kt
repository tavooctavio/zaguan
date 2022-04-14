package com.example.zaguan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val ivQuesadillas = findViewById<ImageView>(R.id.IVQuesadillas)
        val ivTostadas = findViewById<ImageView>(R.id.IVTostadas)
        val ivPambazos = findViewById<ImageView>(R.id.IVPambazos)
        val ivPozole = findViewById<ImageView>(R.id.IVPozole)
        val ivPostres = findViewById<ImageView>(R.id.IVPostres)
        val ivBebidas = findViewById<ImageView>(R.id.IVBebidas)

        ivQuesadillas.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        ivTostadas.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        ivPambazos.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        ivPozole.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        ivPostres.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        ivBebidas.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}