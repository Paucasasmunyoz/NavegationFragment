package com.pcmdam.navegationfragment_.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pcmdam.navegationfragment_.R
import kotlinx.android.synthetic.main.fragment_total.*

class TotalFragment : Fragment(R.layout.fragment_total) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val platPrice = (10..50).random()
        val bebidaPrice = (5..20).random()
        val total = platPrice + bebidaPrice

        tv_total.text = "Total: $total €"
    }
}
