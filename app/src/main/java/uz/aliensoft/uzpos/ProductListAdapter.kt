package uz.aliensoft.uzpos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductListAdapter : RecyclerView.Adapter<ProductItemViewHolder>() {
    private var data: List<Product> = arrayListOf()
    fun setData(products: List<Product>) {
        this.data = products
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItemViewHolder {
        val itemView =LayoutInflater.from(parent.context).inflate(R.layout.activity_item_line, parent, false)
        return ProductItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ProductItemViewHolder, position: Int) {
        holder.populateProduct(data[position])
    }

}