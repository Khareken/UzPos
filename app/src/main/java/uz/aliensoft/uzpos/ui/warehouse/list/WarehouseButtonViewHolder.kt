package uz.aliensoft.uzpos.ui.warehouse.list

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class WarehouseButtonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun populateModel(onWarehouseBtnClickListener: OnWarehouseBtnClickListener){
        itemView.setOnClickListener {
            onWarehouseBtnClickListener.onBtnClicked()
        }
    }
}