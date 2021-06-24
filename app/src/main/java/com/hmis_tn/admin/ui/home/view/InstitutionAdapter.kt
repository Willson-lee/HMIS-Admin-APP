package com.hmis_tn.admin.ui.home.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hmis_tn.admin.R
import kotlinx.android.synthetic.main.item_institutions.view.*

class InstitutionAdapter(
    private val list: ArrayList<String>
) : RecyclerView.Adapter<InstitutionAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_institutions, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val x = list[position]


        initViews(holder, x)
        listeners(holder, x)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    private fun initViews(holder: MyViewHolder, x: String) {
        holder.itemView.tvInstitution.text = x


    }

    private fun listeners(holder: MyViewHolder, x: String) {
        holder.itemView.llInstitution.setOnClickListener {

        }
    }
}