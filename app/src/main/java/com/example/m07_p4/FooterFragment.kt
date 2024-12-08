package com.example.m07_p4

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class FooterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout del fragmento
        val view = inflater.inflate(R.layout.fragment_footer, container, false)

        // Configurar el botón de home
        val homeButton: ImageButton = view.findViewById(R.id.home_button)
        homeButton.setOnClickListener {
            // Redirigir a HomeActivity
            val intent = Intent(activity, Home::class.java)
            startActivity(intent)
        }

        return view
    }
}
