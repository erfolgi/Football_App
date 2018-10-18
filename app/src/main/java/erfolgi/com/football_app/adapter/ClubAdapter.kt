package erfolgi.com.football_app.adapter

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import erfolgi.com.football_app.activities.DetailActivity
import erfolgi.com.football_app.layout.ClubItemUI
import erfolgi.com.football_app.model.ClubModel
import org.jetbrains.anko.AnkoContext

class ClubAdapter(private val context: Context, private val items: List<ClubModel>, private val listener: (ClubModel) -> Unit)
    : RecyclerView.Adapter<ClubAdapter.ClubViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ClubViewHolder(ClubItemUI().createView(AnkoContext.create(context)))

    override fun onBindViewHolder(holder: ClubViewHolder, position: Int) {
        holder.bindItem(items[position],listener,position, context)

    }

    override fun getItemCount(): Int = items.size

    class ClubViewHolder(containerView: View) : RecyclerView.ViewHolder(containerView) {

        fun bindItem(items: ClubModel, listener: (ClubModel) -> Unit, post: Int, con:Context) {
            val name = itemView.findViewById<TextView>(ClubItemUI.name)
            val image = itemView.findViewById<ImageView>(ClubItemUI.image)

            name.text = items.club_name
            var nama =items.club_name
            Glide.with(itemView.context).load(items.club_image).into(image)

            itemView.setOnClickListener {
                listener(items)
                Log.d("Ini..","Sudah Diklik")
                val intent = Intent (MainActivity@con, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_POST, post.toString())
                itemView.context.startActivity(intent)

            }
//            itemView.setOnClickListener {
//             //
//
//            }
        }
    }
}