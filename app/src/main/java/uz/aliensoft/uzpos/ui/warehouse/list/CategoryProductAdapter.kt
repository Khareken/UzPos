package uz.aliensoft.uzpos.ui.warehouse.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.aliensoft.uzpos.R
import uz.aliensoft.uzpos.data.model.WarehouseItemData
import uz.aliensoft.uzpos.data.model.WarehouseProductData

class CategoryProductAdapter(private val onCategoryBtnClickListener: OnCategoryBtnClickListener) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var data: List<WarehouseItemData> = arrayListOf()

    fun setData(warehouseItemData: List<WarehouseItemData>) {
        this.data = warehouseItemData
    }

    override fun getItemViewType(position: Int): Int {
        return data[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView: View
        return when (viewType) {
            1 -> {
                itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_warehouse_product, parent, false)
                CategoryProductViewHolder(itemView)
            }
            2 -> {
                itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_btn_back_green_button, parent, false)
                CategoryBackBtnViewHolder(itemView)
            }
            else -> {
                itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_home_green_btn, parent, false)
                CategoryHomeBtnViewHolder(itemView)
            }
        }
    }

    override fun getItemCount(): Int = data.size
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when {
            getItemViewType(position) == 1 -> (holder as CategoryProductViewHolder).populateModel(
                data[position] as WarehouseProductData,
                onCategoryBtnClickListener,
                position
            )
            getItemViewType(position) == 2 -> (holder as CategoryBackBtnViewHolder).populateModel(
                onCategoryBtnClickListener
            )
            else -> (holder as CategoryHomeBtnViewHolder).populateModel(onCategoryBtnClickListener)
        }
    }


}