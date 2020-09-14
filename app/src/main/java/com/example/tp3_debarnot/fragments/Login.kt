package com.example.tp3_debarnot.fragments

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController
import com.example.tp3_debarnot.R
import com.example.tp3_debarnot.entities.Usuario
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_login.*

class Login : Fragment() {

    lateinit var v: View
    lateinit var email: String
    lateinit var password: String
    var usuarios: MutableList<Usuario> = ArrayList<Usuario>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, saveInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_login, container, false)
        usuarios.add(Usuario("gonzalodebarnot@gmail.com","111"))
        usuarios.add(Usuario("222@gmail.com","222"))
        usuarios.add(Usuario("333@gmail.com","333"))
        usuarios.add(Usuario("444@gmail.com","444"))
        usuarios.add(Usuario("555@gmail.com","555"))
        usuarios.add(Usuario("666@gmail.com","666"))
        usuarios.add(Usuario("777@gmail.com","777"))
        return v
    }

    override fun onStart() {
        super.onStart()
        loginBtn.setOnClickListener {
            email = emailTxt.text.toString()
            password = passwordTxt.text.toString()
            var mensaje = ""
            if(email=="" && password=="") {
                mensaje = "Campo Email y Password obligatorio"
            }
            else if (email=="") {
                mensaje = "Campo Email obligatorio"
            }
            else if (password=="") {
                mensaje = "Campo Password obligatorio"
            }
            else {
                var invalid = true
                for(usuario in usuarios) {
                   if(usuario.email.equals(email.toString())) {
                       if(usuario.password.equals(password.toString())) {
                           invalid = false
                       }
                   }
                }
                if (!invalid) {
                    val usuario = Usuario(email.toString(), password.toString())
                    val actionLogin = LoginDirections.actionLoginToInicio(usuario)
                    v.findNavController().navigate(actionLogin)
                }
                else {
                    mensaje = "Email y/o Password inválidos"
                }
            }
            if (mensaje!="") {
                Snackbar.make(v,mensaje,Snackbar.LENGTH_SHORT).show()
            }
        }
    }

}