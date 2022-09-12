package com.widiyulianti.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.widiyulianti.myapplication.fragment.FragmentA
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_a.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val btnA : Button = findViewById(R.id.buttonA)
        val btnB : Button = findViewById(R.id.buttonB)
        val btnC : Button = findViewById(R.id.buttonC)
        val btnD : Button = findViewById(R.id.buttonD)
        val btnE : Button = findViewById(R.id.buttonE)
        val btnF : Button = findViewById(R.id.buttonF)
        val btnG : Button = findViewById(R.id.buttonG)
        val btnH : Button = findViewById(R.id.buttonH)
        val btnI : Button = findViewById(R.id.buttonI)
        val btnJ : Button = findViewById(R.id.buttonJ)



        btnA.setOnClickListener {
            val fmA = FragmentA()
            val fragment : Fragment? =
            supportFragmentManager.findFragmentByTag(FragmentA::class.java.simpleName)
            if (fragment !is FragmentA ){
                supportFragmentManager.beginTransaction()
                    .add(R.id.frame,fmA,FragmentA::class.java.simpleName)
                    .commit()
            }
            btnA.visibility = View.GONE
            btnB.visibility = View.GONE
            btnC.visibility = View.GONE
            btnD.visibility = View.GONE
            btnE.visibility = View.GONE
            btnF.visibility = View.GONE
            btnG.visibility = View.GONE
            btnH.visibility = View.GONE
            btnI.visibility = View.GONE
            btnJ.visibility = View.GONE
        }

        btnA.setOnClickListener{
            val uri = Uri.parse("https://stackoverflow.com/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

    }


}

