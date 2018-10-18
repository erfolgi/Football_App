package erfolgi.com.football_app.layout

import android.content.Context
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.*

class ClubItemUI : AnkoComponent<Context> {
    lateinit var image: ImageView
    lateinit var name: TextView

    override fun createView(ui: AnkoContext<Context>): View = with(ui){
        linearLayout {
            orientation = LinearLayout.HORIZONTAL
            lparams(width= wrapContent, height = wrapContent){
                margin = dip(10)
            }

            imageView {
                id = Ids.image

            }.lparams(width = 110, height = 110)

            textView("Persib") {
                textSize=14f
                id = Ids.name
            }.lparams(width = wrapContent, height = wrapContent) {
                gravity = Gravity.CENTER_VERTICAL
                margin = dip(10)
            }
        }

    }

    companion object Ids {
        val image = 1
        val name = 2
    }

}