package com.example.tp3_debarnot.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tp3_debarnot.fragments.Especiales
import com.example.tp3_debarnot.fragments.FichaTecnica
import com.example.tp3_debarnot.fragments.Fotos

@Suppress("DEPRECATION")
class AdaptadorTabs (fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0-> FichaTecnica()
            1-> Especiales()
            else-> Fotos()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0-> "FichaTecnica"
            1-> "Especiales"
            else-> "Fotos"
        }
    }


}