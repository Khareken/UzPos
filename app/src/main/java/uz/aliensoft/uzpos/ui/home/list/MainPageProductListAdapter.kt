package uz.aliensoft.uzpos.ui.home.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.aliensoft.uzpos.R
import uz.aliensoft.uzpos.data.model.MainPageProductData

class MainPageProductListAdapter : RecyclerView.Adapter<ProductItemViewHolder>(),
    OnMainPageItemClickListener {
    private var models: MutableList<MainPageProductData> = arrayListOf()

    fun setData(mainPageProductData: MutableList<MainPageProductData>) {
        this.models = mainPageProductData
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItemViewHolder {
        val itemView =LayoutInflater.from(parent.context).
            inflate(R.layout.item_line_home_page, parent, false)
        return ProductItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun onBindViewHolder(holder: ProductItemViewHolder, position: Int) {
        holder.populateProduct(models[position], position, this)
    }

    override fun removeItem(mainPageProductData: MainPageProductData) {
        val pos: Int = models.indexOf(mainPageProductData)
        models.remove(mainPageProductData)
    notifyItemRemoved(pos)
        models.forEachIndexed { indexed, _ ->
            notifyItemChanged(indexed)
        }
    }

    override fun increaseCount(position: Int) {
        models[position].count++
        notifyItemChanged(position)
    }

    override fun decreaseCount(position: Int) {
        models[position].count--
        notifyItemChanged(position)
    }
}