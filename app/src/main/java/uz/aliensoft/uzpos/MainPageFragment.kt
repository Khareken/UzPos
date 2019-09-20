package uz.aliensoft.uzpos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main_page.*

class MainPageFragment : Fragment(R.layout.fragment_main_page) {

    companion object {
        const val TAG = "MainPageFragment"
    }

    private val mAdapter: ProductListAdapter = ProductListAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        productsRecyclerView.adapter = mAdapter
        getData()

    }

    private fun getData(){
        val products: MutableList<Product> = arrayListOf()
        for(i in 1..100){
            products.add(Product(1,"Coca - cola 1,5L","4703265110064","6,990 sum",4,27.960))
        }
        mAdapter.setData(products)
    }
}
