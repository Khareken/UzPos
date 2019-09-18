package uz.aliensoft.uzpos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main_page.*

class MainPageFragment : Fragment() {
    private val mAdapter: ProductListAdapter = ProductListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_page, container, false)
    }

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
