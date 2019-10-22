package uz.aliensoft.uzpos.ui.home

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_main_page.*
import uz.aliensoft.uzpos.R
import uz.aliensoft.uzpos.data.model.MainPageProductData
import uz.aliensoft.uzpos.ui.home.list.MainPageProductListAdapter
import uz.aliensoft.uzpos.ui.warehouse.CategoryPageFragment

class MainPageFragment : Fragment(), MainPageView, CategoryItemClickListener {
    private val mAdapterMainPage: MainPageProductListAdapter =
        MainPageProductListAdapter()

    private val presenter: MainPagePresenter = MainPagePresenter()

    companion object {
        const val TAG = "MainPageFragment"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.init(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val countries: Array<out String> = resources.getStringArray(R.array.products_array)
        ArrayAdapter<String>(
            context!!,
            android.R.layout.simple_list_item_1,
            countries
        ).also { adapter ->
            searchView.setAdapter(adapter)
        }

        replaceFragment(CategoryPageFragment(this), CategoryPageFragment.TAG)

        productsRecyclerView.adapter = mAdapterMainPage
        productsRecyclerView.layoutManager = LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        productsRecyclerView.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        presenter.getData()
    }

    private fun replaceFragment(fragment: Fragment, tag: String) {
        activity?.supportFragmentManager?.beginTransaction()
            ?.add(R.id.fragmentContainer, fragment, tag)?.commit()
    }

    override fun onCategoryItemClicked(step: Int, isCategory: Boolean) {
        val bundle = Bundle()
        if (isCategory) {
            bundle.putInt("step", step)
            val fragment = CategoryPageFragment(this)
            fragment.arguments = bundle
            replaceFragment(fragment, "${CategoryPageFragment.TAG}$step")
        }
        else{
            val dialog = AlertDialog.Builder(context)
            val dialogView = layoutInflater.inflate(R.layout.dialog_page,null)
            dialog.setView(dialogView)
            dialog.setCancelable(true)
            dialog.show()
        }
    }

    override fun onBackPressed() {

    }

    override fun onHomePressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setData(models: MutableList<MainPageProductData>) {
        mAdapterMainPage.setData(models)
    }
}
