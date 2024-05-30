package kr.ac.kopo.addactivitytest2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    lateinit var rg : RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rg = findViewById(R.id.rg)
        rg.check(R.id.radioSecond)
        var btnMain = findViewById<Button>(R.id.btnMain)
        var intent = Intent(this@MainActivity,SecondActivity::class.java)

        rg.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.radioSecond -> intent = Intent(this@MainActivity,SecondActivity::class.java)
                R.id.radioSecond -> intent = Intent(this@MainActivity,SecondActivity::class.java)
            }
        }
        btnMain.setOnClickListener{
            startActivity(intent)
        }

    }
}