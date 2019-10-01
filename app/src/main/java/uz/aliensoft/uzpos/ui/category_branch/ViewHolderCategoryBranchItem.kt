package uz.aliensoft.uzpos.ui.category_branch

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.aliensoft.uzpos.R
import uz.aliensoft.uzpos.data.model.CategoryBranchProductData

class ViewHolderCategoryBranchItem(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val itemName: TextView = itemView.findViewById(R.id.category_branch_item_name)
    private val itemImage: ImageView = itemView.findViewById(R.id.category_branch_item_image)
    private val itemPrice: TextView = itemView.findViewById(R.id.category_branch_item_sum)
    private val itemKg_Sht: TextView = itemView.findViewById(R.id.category_branch_item_kg_sht)
    fun populateModel(categoryBranchProductData: CategoryBranchProductData,
                      onCategoryBranchClickedListener: OnCategoryBranchClickedListener,
                      position:Int){
        itemName.text = categoryBranchProductData.name
        itemPrice.text = categoryBranchProductData.price.toString()
        itemKg_Sht.text = categoryBranchProductData.kg_sht
        itemView.setOnClickListener {
            onCategoryBranchClickedListener.onItemClicked(position)
        }
    }
}