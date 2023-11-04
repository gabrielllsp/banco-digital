package com.example.bancodigital.util

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.bancodigital.R

fun Fragment.initToolbar(toolbar: androidx.appcompat.widget.Toolbar, homeAsUpEnabled: Boolean = true){
    (activity as AppCompatActivity).setSupportActionBar(toolbar)
    (activity as AppCompatActivity).title = ""
    (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(homeAsUpEnabled)
    (activity as AppCompatActivity).supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_arrow_back)
    toolbar.setNavigationOnClickListener { activity?.onBackPressed() }
}