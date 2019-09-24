package uz.aliensoft.uzpos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_main_page.*

class MainPageFragment : Fragment() {
    private val mAdapterMainPage: MainPageProductListAdapter = MainPageProductListAdapter()

    companion object {
        const val TAG = "MainPageFragment"
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
        getData()

    }

    private fun getData(){
        val mainPageProductData: MutableList<MainPageProductData> = arrayListOf()
        for(i in 1..100){
            mainPageProductData.add(MainPageProductData(1,"Coca - cola 1,5L","4703265110064","6,990 sum",4,27.960))
        }
        mAdapterMainPage.setData(mainPageProductData)
    }
}
