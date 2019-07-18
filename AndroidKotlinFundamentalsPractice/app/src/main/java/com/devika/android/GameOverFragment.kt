package com.devika.android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.devika.androidkotlinfundamentalspractice.R
import com.devika.androidkotlinfundamentalspractice.databinding.GameOverBinding

class GameOverFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var binding4=DataBindingUtil.inflate<GameOverBinding>(inflater,
            R.layout.game_over,container,false)
    binding4.gameOverButton.setOnClickListener { view:View ->
        view.findNavController().navigate(GameOverFragmentDirections.actionGameOverFragmentToGameFragment())
    }
        return binding4.root
    }
}