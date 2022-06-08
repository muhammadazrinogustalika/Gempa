package com.example.praktikum65

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.praktikum65.databinding.ActivityDetailBinding
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_scrolling.*

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        val myData by getParcelableExtra<MyData>(DetailActivity.EXTRA_MYDATA)
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = title
        binding.fab.setOnClickListener { view ->
            val moveWithObjectIntent = Intent(this, MapsActivity::class.java)
            moveWithObjectIntent.putExtra(MapsActivity.EXTRA_MYDATA, myData)
            startActivity(moveWithObjectIntent)
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        supportActionBar?.title = myData?.name.toString()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        tv_detail_description.text = myData?.description.toString()
        Glide.with(this)
            .load(myData?.photo)
            .apply(RequestOptions().override(700, 700))
            .into(iv_detail_photo)
    }
    companion object {
        const val EXTRA_MYDATA = "extra_mydata"
    }
    inline fun <reified T : Parcelable> Activity.getParcelableExtra(key: String) = lazy {
        intent.getParcelableExtra<T>(key)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}