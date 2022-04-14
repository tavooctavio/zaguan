package com.example.zaguan

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

        }

        ivTostadas.setOnClickListener {

        }

        ivPambazos.setOnClickListener {

        }

        ivPozole.setOnClickListener {

        }

        ivPostres.setOnClickListener {

        }

        ivBebidas.setOnClickListener {

        }


    }
}