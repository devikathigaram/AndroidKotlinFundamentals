package com.devika.android

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.devika.androidkotlinfundamentalspractice.R
import com.devika.androidkotlinfundamentalspractice.databinding.GameWonBinding

class GameWonFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var binding3=DataBindingUtil.inflate<GameWonBinding>(inflater,
            R.layout.game_won,container,false)
    binding3.gameWonButton.setOnClickListener { view:View->
        view.findNavController().navigate(
            GameWonFragmentDirections.actionWonToGameOverFragment()
        )
    }
        setHasOptionsMenu(true)

        return binding3.root
    }
    private fun getShareIntent(): Intent {
       // val args = Game_Won_FragmentArgs.fromBundle(arguments!!)
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.setType("text/plain").putExtra("NAme", "3")
        return shareIntent
    }
    private fun shareSuccess(){

        startActivity(getShareIntent())
    }
    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.winner_menu, menu)
        if (null == getShareIntent().resolveActivity(activity!!.packageManager)) {
            // hide the menu item if it doesn't resolve
            menu?.findItem(R.id.share)?.setVisible(false)
        }
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            R.id.share -> shareSuccess()
        }
        return super.onOptionsItemSelected(item)
    }

}