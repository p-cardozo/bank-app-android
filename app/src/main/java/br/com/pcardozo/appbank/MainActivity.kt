package br.com.pcardozo.appbank

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.login_button_access).setOnClickListener {
            Toast.makeText(this, "agora vaii", Toast.LENGTH_LONG).show()
        }
    }


}