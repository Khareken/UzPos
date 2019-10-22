package uz.aliensoft.uzpos.ui.warehouse

import uz.aliensoft.uzpos.data.model.WarehouseItemData

interface CategoryPageView {
    fun setData(models: MutableList<WarehouseItemData>)
}