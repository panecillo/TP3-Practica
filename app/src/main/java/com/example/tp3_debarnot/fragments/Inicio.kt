package com.example.tp3_debarnot.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.tp3_debarnot.R
import com.example.tp3_debarnot.entities.Usuario
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_inicio.*

class Inicio : Fragment() {

    lateinit var v: View
    lateinit var usuario: Usuario

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, saveInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_inicio, container, false)

        return v
    }

    override fun onStart() {
        super.onStart()
        usuario = InicioArgs.fromBundle(requireArguments()).usuario

        Snackbar.make(v, usuario.email, Snackbar.LENGTH_SHORT).show()
    }

}