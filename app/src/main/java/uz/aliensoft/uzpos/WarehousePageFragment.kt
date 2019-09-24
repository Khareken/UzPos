package uz.aliensoft.uzpos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_warehouse.*


class WarehousePageFragment : AppCompatActivity() {
    private val mAdapterWarehousePage: WarehouseProductAdapter = WarehouseProductAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        warehouse_recycler.adapter = mAdapterWarehousePage
        warehouse_recycler.layoutManager = GridLayoutManager(this, 7)
getData()

    }

    fun getData() {
        val models: MutableList<WarehouseItemData> = arrayListOf()
        for (i in 1..100) {
            models.add(WarehouseProductData(1, "Напитки", "ФЦВЦФ ВФЦвф вВФЦВФЦ ВФВФЦВФЦВФЦ"))
        }
            models.add(WarehouseItemData(2))
    mAdapterWarehousePage.setData(models)
    }
}