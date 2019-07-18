package com.devika.android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.devika.androidkotlinfundamentalspractice.R
import com.devika.androidkotlinfundamentalspractice.databinding.AboutBinding

class AboutFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        var binding7=DataBindingUtil.inflate<AboutBinding>(inflater,
            R.layout.about,container,false)
    return binding7.root

    }
}