package uz.aliensoft.uzpos.ui.warehouse.list

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.aliensoft.uzpos.R
import uz.aliensoft.uzpos.data.model.WarehouseProductData

class CategoryProductViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    private val productCategory: TextView = itemView.findViewById(R.id.warehouse_item_category_text)

    fun populateModel(warehouseProductData: WarehouseProductData, onCategoryBtnClickListener: OnCategoryBtnClickListener, position:Int) {
        productCategory.text = warehouseProductData.category
        itemView.setOnClickListener {
            onCategoryBtnClickListener.onItemClicked(position)
        }

    }
}