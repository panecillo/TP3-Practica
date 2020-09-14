package com.example.tp3_debarnot.entities

import android.os.Parcel
import android.os.Parcelable
import android.os.WorkSource

class Usuario (var email: String, var password: String) : Parcelable{

    constructor(source: Parcel) : this(
        source.readString()!!,
        source.readString()!!
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(email)
        writeString(password)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Usuario> = object : Parcelable.Creator<Usuario> {
            fun createFormParcel(source: Parcel) : Usuario = Usuario(source)
            override fun newArray(size: Int): Array<Usuario?> = arrayOfNulls(size)
            override fun createFromParcel(source: Parcel?): Usuario {
                TODO("Not yet implemented")
            }
        }
    }
}