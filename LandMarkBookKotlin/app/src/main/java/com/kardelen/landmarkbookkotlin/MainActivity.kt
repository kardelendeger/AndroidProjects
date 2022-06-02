package com.kardelen.landmarkbookkotlin

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.kardelen.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList:ArrayList<LandMark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        var view=binding.root
        setContentView(view)
        landmarkList=ArrayList<LandMark>()
        val pisa = LandMark("Pisa","Italy",R.drawable.pisa)
        val colosseum = LandMark("Colosseum","Italy",R.drawable.colle)
        val eiffel = LandMark("Eiffel","France",R.drawable.eyfel)
        val londonBridge = LandMark("London Bridge","UK",R.drawable.bridge)
        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)
        binding.recyckerView.layoutManager=LinearLayoutManager(this)
        val landMarkAdapter=LandMarkAdapter(landmarkList)
        binding.recyckerView.adapter=landMarkAdapter



        /*
       val adapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,
           landmarkList.map { landmark -> landmark.name })
        binding.listView.adapter = adapter
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            landmarkList.get(i)
            val intent=Intent(MainActivity@this,MainActivity2::class.java)
            intent.putExtra("landmark",landmarkList.get(i))
            startActivity(intent)
        }

         */


    }
}