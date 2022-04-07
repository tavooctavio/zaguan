package com.example.zaguan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val quesadilla: ArrayList<String> = ArrayList()
    val panbazos: ArrayList<String> = ArrayList()
    val tostadas: ArrayList<String> = ArrayList()
    val postres: ArrayList<String> = ArrayList()
    val bebidas: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addQuesadilla()
        addPambazos()
        addTostadas()
        addPostres()
        addBebidas()

        val rvOpciones = findViewById<RecyclerView>(R.id.rvOpciones)
        rvOpciones.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvOpciones.adapter = MyAdapter(quesadilla, this)
    }

    private fun addQuesadilla(){
        quesadilla.add("Quesadilla de Queso")
        quesadilla.add("Quesadilla de Pollo")
        quesadilla.add("Quesadilla de Picadillo")
        quesadilla.add("Quesadilla de Tinga Res")
        quesadilla.add("Quesadilla de Tinga Pollo")
        quesadilla.add("Quesadilla de Hongos")
        quesadilla.add("Quesadilla de Huitlacoche")
        quesadilla.add("Quesadilla de Cesos")
        //items.add("Item I") asi estaba en el ejemplo del curso
    }

    private fun addPambazos (){

    }

    private fun addTostadas (){

    }

    private fun addPostres (){

    }

    private fun addBebidas () {

    }
}