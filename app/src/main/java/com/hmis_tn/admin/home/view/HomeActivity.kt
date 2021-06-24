package com.hmis_tn.admin.home.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hmis_tn.admin.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initViews()
        listeners()
    }

    private fun initViews() {
        rvInstitutions?.layoutManager = LinearLayoutManager(this)
        val adapter
    }

    private fun listeners() {

    }
}