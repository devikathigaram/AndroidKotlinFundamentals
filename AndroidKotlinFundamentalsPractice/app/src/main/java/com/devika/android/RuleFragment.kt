package com.devika.android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.devika.androidkotlinfundamentalspractice.R
import com.devika.androidkotlinfundamentalspractice.databinding.RulesBinding

class RuleFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var binding6=DataBindingUtil.inflate<RulesBinding>(inflater,
            R.layout.rules,container,false)

   return binding6.root
    }
}