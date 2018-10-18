package erfolgi.com.football_app.activities

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import erfolgi.com.football_app.R
import erfolgi.com.football_app.layout.DetailUI
import org.jetbrains.anko.setContentView

class DetailActivity : Activity() {
    companion object {
        var EXTRA_POST="0"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DetailUI().setContentView(this)
        val img=findViewById<ImageView>(DetailUI.detail_image)
        val txt =findViewById<TextView>(DetailUI.detail_name)
        val dsc =findViewById<TextView>(DetailUI.detail_desc)
        EXTRA_POST= intent.getStringExtra(EXTRA_POST)
        val name = resources.getStringArray(R.array.clubname)
        val image = resources.obtainTypedArray(R.array.clubimage)
        val desc = resources.getStringArray(R.array.clubdesc)

        Glide.with(this).load(image.getResourceId(EXTRA_POST.toInt(), 0)).into(img)
        txt.text=name[EXTRA_POST.toInt()]
        dsc.text=desc[EXTRA_POST.toInt()]


    }
}
