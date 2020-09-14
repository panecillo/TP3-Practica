package com.example.tp3_debarnot.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tp3_debarnot.R
import com.example.tp3_debarnot.entities.Usuario

class FichaTecnica : Fragment() {

    lateinit var v: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, saveInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_inicio, container, false)
        return v
    }


}