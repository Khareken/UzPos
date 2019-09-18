package uz.aliensoft.uzpos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.aliensoft.uzpos.R

class ItemLineActivity : AppCompatActivity() {
    private val mAdapter: ProductListAdapter = ProductListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_main_page)
        val recyclerView: RecyclerView = findViewById(R.id.products_recyclerView)
        recyclerView.adapter = mAdapter
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        getData()
    }
    fun getData(){
        val products: MutableList<Product> = arrayListOf()
        for(i in 1..100){
            products.add(Product(1,"Coca - cola 1,5L","4703265110064","6,990 sum",4,27.960))
        }
        mAdapter.setData(products)
    }
}
