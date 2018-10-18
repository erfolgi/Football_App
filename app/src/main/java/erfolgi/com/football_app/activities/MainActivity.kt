package erfolgi.com.football_app.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import erfolgi.com.football_app.R
import erfolgi.com.football_app.adapter.ClubAdapter
import erfolgi.com.football_app.layout.MainUI
import erfolgi.com.football_app.model.ClubModel
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {
    lateinit var Main : MainUI
    private var items: MutableList<ClubModel> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Main=MainUI()
        Main.setContentView(this)

        initData()
        Main.RV.layoutManager = LinearLayoutManager(this)
        Main.RV.adapter = ClubAdapter(this, items) {

        }
    }

    private fun initData(){
        val name = resources.getStringArray(R.array.clubname)
        val image = resources.obtainTypedArray(R.array.clubimage)
        items.clear()
        for (i in name.indices) {
            items.add(ClubModel(name[i], image.getResourceId(i, 0)))
        }
        image.recycle()
    }
}
