package com.example.zaguan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val quesadilla: ArrayList<String> = ArrayList()
    val pozole: ArrayList<String> = ArrayList()
    val panbazo: ArrayList<String> = ArrayList()
    val tostada: ArrayList<String> = ArrayList()
    val postre: ArrayList<String> = ArrayList()
    val bebida: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addQuesadilla()
        addPozole()
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

    private fun addPozole() {
        pozole.add("Pozole Carne Surtida")
        pozole.add("Pozole Carne Maciza")
        pozole.add("Pozole Carne Pollo")
        pozole.add("Pozole Sin Carne")
    }

    private fun addPambazos (){
        panbazo.add("Pambazo de Papa")
        panbazo.add("Pambazo de Picadillo")
        panbazo.add("Pambazo de Pollo")
    }

    private fun addTostadas (){
        tostada.add("Tostada de Tinga Pollo")
        tostada.add("Tostada de Tinga Res")
        tostada.add("Tostada de Pata")
        tostada.add("Tostada de Picadillo")
    }

    private fun addPostres (){
        postre.add("Fresas con Crema")
        postre.add("Gelatinas de Agua")
        postre.add("Gelatina de leche")
        postre.add("Gelatina combinada")
        postre.add("Pan ideal")
    }

    private fun addBebidas () {
        bebida.add("Agua de Sabor")
        bebida.add("Coca Cola")
        bebida.add("Boing")
        bebida.add("Sidral")
    }
}