package uz.aliensoft.uzpos.ui.warehouse

import uz.aliensoft.uzpos.data.model.WarehouseItemData

interface WarehousePageView {
    fun setData(models: MutableList<WarehouseItemData>)
}