package uz.aliensoft.uzpos.ui.warehouse.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.aliensoft.uzpos.R
import uz.aliensoft.uzpos.data.model.WarehouseItemData
import uz.aliensoft.uzpos.data.model.WarehouseProductData

class WarehouseProductAdapter(private val onWarehouseBtnClickListener: OnWarehouseBtnClickListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var data: List<WarehouseItemData> = arrayListOf()

    fun setData(warehouseItemData: List<WarehouseItemData>) {
        this.data = warehouseItemData
    }

    override fun getItemViewType(position: Int): Int {
        return data[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView: View
        return if (viewType == 1) {
            itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_warehouse_product, parent, false)
            WarehouseProductViewHolder(itemView)
        } else {
            itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_warehouse_button, parent, false)
            WarehouseButtonViewHolder(itemView)
        }
    }

    override fun getItemCount(): Int = data.size
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == 1) {
            (holder as WarehouseProductViewHolder).populateModel(data[position] as WarehouseProductData,onWarehouseBtnClickListener,position)
        }else{
            (holder as WarehouseButtonViewHolder).populateModel(onWarehouseBtnClickListener)
        }
    }


}