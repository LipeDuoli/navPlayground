package com.example.navigationplayground.main


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationplayground.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class DetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.findViewById<BottomNavigationView>(R.id.bottomNavigationView)?.visibility = View.GONE

//        view.findViewById<BottomNavigationView>(R.id.bottomNavigationView).visibility = View.GONE

    }


}
