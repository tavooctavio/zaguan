package com.example.zaguan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val items: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addItems()

        val rvOpciones = findViewById<RecyclerView>(R.id.rvOpciones)
        rvOpciones.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvOpciones.adapter = MyAdapter(items, this)
    }

    private fun addItems(){
        items.add("Item A")
        items.add("Item B")
        items.add("Item C")
        items.add("Item D")
        items.add("Item E")
        items.add("Item F")
        items.add("Item G")
        items.add("Item H")
        items.add("Item I")
        items.add("Item J")
        items.add("Item K")
        items.add("Item L")
        items.add("Item M")
        items.add("Item N")
        items.add("Item O")
        items.add("Item P")
        items.add("Item Q")
        items.add("Item R")
        items.add("Item S")
        items.add("Item T")
        items.add("Item U")
        items.add("Item V")
        items.add("Item X")
        items.add("Item Y")
        items.add("Item Z")

    }
}