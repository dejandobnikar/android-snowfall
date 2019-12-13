package com.jetradarmobile.snowfall.sample

import android.app.Activity
import android.os.Bundle
import com.jetradarmobile.snowfall.SnowfallView

class SnowfallActivity : Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_snowfall)
    val view = findViewById<SnowfallView>(R.id.snowfall_view)
    view.setHighlightSnowflakes(0.01f, R.drawable.snowflake_red)
  }
}
