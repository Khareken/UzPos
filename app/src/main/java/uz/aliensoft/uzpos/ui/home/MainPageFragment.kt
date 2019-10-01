package uz.aliensoft.uzpos.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_main_page.*
import uz.aliensoft.uzpos.R
import uz.aliensoft.uzpos.data.model.MainPageProductData
import uz.aliensoft.uzpos.ui.home.list.MainPageProductListAdapter

class MainPageFragment : Fragment(), MainPageView {
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
        productsRecyclerView.adapter = mAdapterMainPage
        productsRecyclerView.layoutManager = LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        productsRecyclerView.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        presenter.getData()
    }

    override fun setData(models: MutableList<MainPageProductData>) {
        mAdapterMainPage.setData(models)
    }
}
