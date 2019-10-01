package uz.aliensoft.uzpos.ui.category_branch

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ViewHolderCategoryBranchAddBtn(itemView: View) :RecyclerView.ViewHolder(itemView) {
    fun populateModel(onCategoryBranchClickedListener: OnCategoryBranchClickedListener){
        itemView.setOnClickListener {
            onCategoryBranchClickedListener.onBtnClicked()
        }

    }
}