package uz.aliensoft.uzpos.ui.category_branch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_category_branch.*
import uz.aliensoft.uzpos.R
import uz.aliensoft.uzpos.data.model.CategoryBranchItemData
import uz.aliensoft.uzpos.data.model.CategoryBranchProductData

class ActivityCategoryBranch : AppCompatActivity() {
    private val mAdapterCategoryBranch: AdapterCategoryBranch = AdapterCategoryBranch()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_branch)
        categoryBranchRecyclerView.adapter = mAdapterCategoryBranch
        categoryBranchRecyclerView.layoutManager = GridLayoutManager(this, 5)
        getData()
    }

    fun getData() {
        var models: MutableList<CategoryBranchItemData> = arrayListOf()
        for (i in 1..20){
            models.add(CategoryBranchProductData(1,"CocaCola", 10000.0,"шт."))
        }

        models.add(CategoryBranchItemData(2))
        mAdapterCategoryBranch.setData(models)
    }
}
