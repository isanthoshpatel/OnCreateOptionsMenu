package com.example.oncreateoptionsmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import java.io.FileInputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1->Toast.makeText(this,"Item1",Toast.LENGTH_LONG).show()
            R.id.item2->Toast.makeText(this,"Item2",Toast.LENGTH_LONG).show()
            R.id.item3->Toast.makeText(this,"Item3",Toast.LENGTH_LONG).show()
            R.id.item4->Toast.makeText(this,"Item4",Toast.LENGTH_LONG).show()
            R.id.item5->Toast.makeText(this,"Item5",Toast.LENGTH_LONG).show()
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }
}
