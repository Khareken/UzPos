package uz.aliensoft.uzpos.ui.warehouse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_warehouse.*
import uz.aliensoft.uzpos.R
import uz.aliensoft.uzpos.data.model.WarehouseItemData
import uz.aliensoft.uzpos.data.model.WarehouseProductData
import uz.aliensoft.uzpos.ui.warehouse.list.OnWarehouseBtnClickListener
import uz.aliensoft.uzpos.ui.warehouse.list.WarehouseProductAdapter


class WarehousePageFragment : Fragment(R.layout.fragment_warehouse), OnWarehouseBtnClickListener {

    private val mAdapterWarehousePage: WarehouseProductAdapter = WarehouseProductAdapter(this)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        warehouse_recycler.adapter = mAdapterWarehousePage
        warehouse_recycler.layoutManager = GridLayoutManager(context, 7)
        getData()
    }

    private fun getData() {
        val models: MutableList<WarehouseItemData> = arrayListOf()
        for (i in 1..100) {
            models.add(
                WarehouseProductData(
                    1,
                    "Напитки",
                    "ФЦВЦФ ВФЦвф вВФЦВФЦ ВФВФЦВФЦВФЦ"
                )
            )
        }
        models.add(WarehouseItemData(2))
        mAdapterWarehousePage.setData(models)
    }

    override fun onBtnClicked() {
        Toast.makeText(context,"Button item clicked",Toast.LENGTH_SHORT).show()
    }

    override fun onItemClicked(position: Int) {
        Toast.makeText(context, position.toString(),Toast.LENGTH_SHORT).show()
    }

}