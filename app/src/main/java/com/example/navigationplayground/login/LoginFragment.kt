package com.example.navigationplayground.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.navigationplayground.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = view.findNavController()

        loginButton.setOnClickListener {
            val openMain = LoginFragmentDirections.openMain()
            navController.navigate(openMain)

//            //finish with intent
//            val intent = Intent(context, MainActivity::class.java)
//            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
//            startActivity(intent)
        }
    }

}
