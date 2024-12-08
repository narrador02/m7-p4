package com.example.m07_p4

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class HeaderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout del fragmento
        val view = inflater.inflate(R.layout.fragment_header, container, false)

        // Configurar el botón de búsqueda
        val searchButton: ImageButton = view.findViewById(R.id.search_button)
        searchButton.setOnClickListener {
            // Redirigir a SearchActivity
            val intent = Intent(activity, SearchActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}
