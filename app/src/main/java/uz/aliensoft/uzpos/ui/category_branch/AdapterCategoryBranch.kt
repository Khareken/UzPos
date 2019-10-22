package uz.aliensoft.uzpos.ui.category_branch

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.aliensoft.uzpos.R
import uz.aliensoft.uzpos.data.model.CategoryBranchItemData
import uz.aliensoft.uzpos.data.model.CategoryBranchProductData

class AdapterCategoryBranch : RecyclerView.Adapter<RecyclerView.ViewHolder>(),OnCategoryBranchClickedListener {
    override fun onItemClicked(position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBtnClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private var models: MutableList<CategoryBranchItemData> = arrayListOf()
    fun setData(categoryBranchItemData: MutableList<CategoryBranchItemData>){
        this.models = categoryBranchItemData
    }

    override fun getItemViewType(position: Int): Int {
        return models[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
    val itemView: View
        return if(viewType == 1 ) {
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_category_branch, parent, false)
        ViewHolderCategoryBranchItem(itemView)
        }else{
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_btn_back_green_button,parent,false)
            ViewHolderCategoryBranchAddBtn(itemView)
        }
    }

    override fun getItemCount(): Int = models.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
   if(getItemViewType(position) == 1){
       (holder as ViewHolderCategoryBranchItem).populateModel(models[position] as CategoryBranchProductData,this,position)
   }
        else{
       (holder as ViewHolderCategoryBranchAddBtn).populateModel(this)
   }
    }

//    override fun onItemClicked(position: Int) {
//        Toast.makeText(this,"$position - item clicked",Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onBackBtnClicked() {
//        Toast.makeText(this,"Add button clicked",Toast.LENGTH_SHORT).show()
//    }

}