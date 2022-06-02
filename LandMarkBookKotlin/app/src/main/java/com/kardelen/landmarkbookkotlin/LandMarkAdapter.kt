package com.kardelen.landmarkbookkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kardelen.landmarkbookkotlin.databinding.RecyclerRowBinding

class LandMarkAdapter (val landMarkList:ArrayList<LandMark>):RecyclerView.Adapter<LandMarkAdapter.LanMarkHolder>() {
    class LanMarkHolder (val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanMarkHolder {
        val binding= RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LanMarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LanMarkHolder, position: Int) {
        holder.binding.recyclerViewTextView.text= landMarkList.get(position).name
        holder.itemView.setOnClickListener{
            val intent=Intent(holder.itemView.context,MainActivity2::class.java)
            Mysingleton.chosenLandMark=landMarkList.get(position)
            /*
            intent.putExtra("landmark",landMarkList.get(position))
            holder.itemView.context.startActivity(intent)

             */
        }
    }

    override fun getItemCount(): Int {
        return landMarkList.size
    }
}