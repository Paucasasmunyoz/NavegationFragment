package com.pcmdam.navegationfragment_.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pcmdam.navegationfragment_.R
import kotlinx.android.synthetic.main.fragment_plat.*

class PlatFragment : Fragment(R.layout.fragment_plat) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_next_bebida.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, BebidaFragment())
                .addToBackStack(null)
                .commit()
        }

        val randomPrice = (10..50).random()
        tv_plat_price.text = "Precio: $randomPrice €"
    }
}
