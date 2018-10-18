package erfolgi.com.football_app.layout


import android.view.Gravity
import android.widget.LinearLayout
import erfolgi.com.football_app.activities.DetailActivity
import org.jetbrains.anko.*


class DetailUI : AnkoComponent<DetailActivity> {

    override fun createView(ui: AnkoContext<DetailActivity>)= with(ui) {
        linearLayout {
            orientation = LinearLayout.VERTICAL
            imageView {
                id = Ids.detail_image
            }.lparams(width = 300, height = 300){
                gravity = Gravity.CENTER_HORIZONTAL
            }
            textView("Persib") {
                textSize=24f
                id = Ids.detail_name
            }.lparams(width = wrapContent, height = wrapContent) {
                gravity = Gravity.CENTER
                margin = dip(10)
            }
            textView("isi dengan deskripsi") {
                textSize=16f
                id = Ids.detail_desc
            }.lparams(width = wrapContent, height = wrapContent) {

                margin = dip(10)
            }

        }

    }
    companion object Ids {
        val detail_image = 3
        val detail_name = 4
        val detail_desc = 5
    }

}