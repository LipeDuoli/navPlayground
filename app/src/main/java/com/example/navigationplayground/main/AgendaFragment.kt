package com.example.navigationplayground.main


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationplayground.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_agenda.*


class AgendaFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_agenda, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonDetail.setOnClickListener {
            view.findNavController().navigate(AgendaFragmentDirections.openDetail())
        }

        activity?.findViewById<BottomNavigationView>(R.id.bottomNavigationView)?.visibility = View.VISIBLE

    }


}
