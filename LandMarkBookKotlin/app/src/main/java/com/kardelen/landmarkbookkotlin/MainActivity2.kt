package com.kardelen.landmarkbookkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kardelen.landmarkbookkotlin.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        val intent=intent

        //val selectedLandMark=intent.getSerializableExtra("landmark") as LandMark
        //casting as landmark gönderdiğim şeyin landmark objesi olduğuna eminim gönderilen şeyi landmark olarak kaydet
        var selectedLandMark=Mysingleton.chosenLandMark
        binding.nameText.text=selectedLandMark.name
        binding.countryText.text=selectedLandMark.country
        binding.imageView.setImageResource(selectedLandMark.image)



    }
}