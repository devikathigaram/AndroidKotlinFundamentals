package com.devika.android

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.devika.androidkotlinfundamentalspractice.R
import com.devika.androidkotlinfundamentalspractice.databinding.GameFragmentBinding

class GameFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var binding2 = DataBindingUtil.inflate<GameFragmentBinding>(
            inflater,
            R.layout.game_fragment, container, false
        )
        binding2.gameButton1.setOnClickListener { view: View ->
        }
        binding2.gameButton2.setOnClickListener {
            binding2.gameButton2.findNavController()
                .navigate(GameFragmentDirections.actionGameToGameOverFragment())
        }

        return binding2.root
    }


}