package uz.aliensoft.uzpos.ui.warehouse

import ListPaddingDecoration
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_warehouse.*
import uz.aliensoft.uzpos.R
import uz.aliensoft.uzpos.data.model.WarehouseItemData
import uz.aliensoft.uzpos.ui.home.CategoryItemClickListener
import uz.aliensoft.uzpos.ui.warehouse.list.CategoryProductAdapter
import uz.aliensoft.uzpos.ui.warehouse.list.OnCategoryBtnClickListener

class CategoryPageFragment(private val categoryItemClickListener: CategoryItemClickListener) :
    Fragment(R.layout.fragment_warehouse), OnCategoryBtnClickListener,
    CategoryPageView {

    companion object {
        const val TAG = "CategoryPageFragment"
    }

    private val mAdapterCategoryPage: CategoryProductAdapter = CategoryProductAdapter(this)
    private var presenter: CategoryPresenter = CategoryPresenter(this)
    private var step = 0
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        warehouse_recycler.adapter = mAdapterCategoryPage
        warehouse_recycler.layoutManager = GridLayoutManager(context, 4)
      //warehouse_recycler.addItemDecoration(ListPaddingDecoration(activity as Activity, 4, 4))
      //  warehouse_recycler.addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.HORIZONTAL))
        if (arguments?.getInt("step") != null) {
            step = arguments!!.getInt("step")
        }
        presenter.getData(step)
    }

    override fun onBackBtnClicked() {
        categoryItemClickListener.onBackPressed()
        //Toast.makeText(context,"Button item clicked",Toast.LENGTH_SHORT).show()
    }

    override fun onItemClicked(position: Int) {
        Toast.makeText(context, position.toString(), Toast.LENGTH_SHORT).show()
        if (step < 2) {
            categoryItemClickListener.onCategoryItemClicked(++step, true)
        } else {
            categoryItemClickListener.onCategoryItemClicked(3, false)
        }
    }

    override fun setData(models: MutableList<WarehouseItemData>) {
        mAdapterCategoryPage.setData(models)
    }

    override fun onHomeBtnClicked() {

    }
}