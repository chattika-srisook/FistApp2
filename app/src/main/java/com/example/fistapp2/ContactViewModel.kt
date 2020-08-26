package com.example.fistapp2

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.fistapp2.database.DatabaseDAO
import com.example.fistapp2.databinding.FragmentContactBinding

class ContactViewModel(
    val database: DatabaseDAO,
    private val binding:FragmentContactBinding,
    application: Application
) : AndroidViewModel(application) {
}