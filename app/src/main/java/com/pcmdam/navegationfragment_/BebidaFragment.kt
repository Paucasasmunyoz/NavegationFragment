package com.pcmdam.navegationfragment_.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pcmdam.navegationfragment_.R
import kotlinx.android.synthetic.main.fragment_bebida.*

class BebidaFragment : Fragment(R.layout.fragment_bebida) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_next_total.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, TotalFragment())
                .addToBackStack(null)
                .commit()
        }

        val randomPrice = (5..20).random()
        tv_bebida_price.text = "Precio: $randomPrice €"
    }
}
