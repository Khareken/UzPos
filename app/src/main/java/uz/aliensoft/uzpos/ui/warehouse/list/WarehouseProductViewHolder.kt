package uz.aliensoft.uzpos.ui.warehouse.list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_login.view.*
import uz.aliensoft.uzpos.R
import uz.aliensoft.uzpos.data.model.WarehouseProductData

class WarehouseProductViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    private val productImage: ImageView = itemView.findViewById(R.id.warehouse_item_image)
    private val productCategory: TextView = itemView.findViewById(R.id.warehouse_item_category_text)
    private val productCategoryDescription: TextView = itemView.findViewById(R.id.warehouse_item_category_description_text)

    fun populateModel(warehouseProductData: WarehouseProductData,onWarehouseBtnClickListener: OnWarehouseBtnClickListener, position:Int) {
        productCategory.text = warehouseProductData.category
        productCategoryDescription.text = warehouseProductData.categoryDescripton
        itemView.setOnClickListener {
            onWarehouseBtnClickListener.onItemClicked(position)
        }

    }
}