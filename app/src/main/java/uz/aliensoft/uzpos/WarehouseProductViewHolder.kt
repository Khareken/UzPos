package uz.aliensoft.uzpos

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WarehouseProductViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    private val productImage: ImageView = itemView.findViewById(R.id.warehouse_item_image)
    private val productCategory: TextView = itemView.findViewById(R.id.warehouse_item_category_text)
    private val productCategoryDescription: TextView = itemView.findViewById(R.id.warehouse_item_category_description_text)
    fun populateModel(warehouseProductData: WarehouseProductData){
        productCategory.text = warehouseProductData.category
        productCategoryDescription.text = warehouseProductData.categoryDescripton
    }
}