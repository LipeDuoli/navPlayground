package com.example.navigationplayground.main


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationplayground.R
import com.example.navigationplayground.detail.DetailActivity
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
            startActivity(Intent(context, DetailActivity::class.java))
        }

    }


}
