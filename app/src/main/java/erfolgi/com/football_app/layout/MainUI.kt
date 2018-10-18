package erfolgi.com.football_app.layout

import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import erfolgi.com.football_app.activities.MainActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.linearLayout
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainUI : AnkoComponent<MainActivity> {
    lateinit var RV : RecyclerView
    override fun createView(ui: AnkoContext<MainActivity>)= with(ui) {
        linearLayout {
            orientation = LinearLayout.VERTICAL
            RV = recyclerView{
                lparams(width= matchParent,height = matchParent)
            }

        }
    }

}