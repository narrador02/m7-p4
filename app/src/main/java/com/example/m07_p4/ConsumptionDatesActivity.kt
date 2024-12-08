package com.example.m07_p4

import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ConsumptionDatesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumption_dates)

        val datePickerButton = findViewById<Button>(R.id.btn_date_picker)
        val addFoodButton = findViewById<Button>(R.id.btn_add_food)
        val foodListView = findViewById<ListView>(R.id.lv_consumed_food)

        // Placeholder para manejar el selector de fecha
        datePickerButton.setOnClickListener {
            Toast.makeText(this, "Abrir selector de fecha", Toast.LENGTH_SHORT).show()
        }

        // Placeholder para manejar agregar alimentos
        addFoodButton.setOnClickListener {
            Toast.makeText(this, "Ir a agregar alimento", Toast.LENGTH_SHORT).show()
        }

        // Placeholder para el listado de alimentos consumidos
        val foodList = listOf("Manzana", "Pan integral", "Pollo a la plancha")
        val adapter = android.widget.ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            foodList
        )
        foodListView.adapter = adapter
    }
}
