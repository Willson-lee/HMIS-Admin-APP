package com.hmis_tn.admin.home.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.hmis_tn.admin.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val list = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initViews()
        listeners()
    }

    private fun initViews() {
        rvInstitutions?.layoutManager = LinearLayoutManager(this)
        val adapter = InstitutionAdapter(list)
        rvInstitutions?.adapter = adapter
    }

    private fun listeners() {

    }
}