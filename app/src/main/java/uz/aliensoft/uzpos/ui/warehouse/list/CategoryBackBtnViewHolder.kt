package uz.aliensoft.uzpos.ui.warehouse.list

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class CategoryBackBtnViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun populateModel(onCategoryBtnClickListener: OnCategoryBtnClickListener){
        itemView.setOnClickListener {
            onCategoryBtnClickListener.onBackBtnClicked()
        }
    }
}