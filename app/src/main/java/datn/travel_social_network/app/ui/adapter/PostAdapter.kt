package datn.travel_social_network.app.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import datn.travel_social_network.app.data.model.JsonPost

import datn.travel_social_network.app.data.model.PostData
import datn.travel_social_network.databinding.ItemPostBinding

class PostAdapter :  RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    private lateinit var listPost : List<JsonPost>


    class PostViewHolder(private val binding: ItemPostBinding): RecyclerView.ViewHolder(binding.root) {
        fun bin(post : JsonPost){
            binding.let {
//                it.imgUser.setImageResource(post.account[post.accountId].avatar.length)
//                it.tvNameUser.text = post.account[post.accountId].fullName
//                it.tvContent.text = post.content

            }

        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val  binding = ItemPostBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PostViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listPost.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}