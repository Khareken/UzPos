package uz.aliensoft.uzpos.ui.warehouse

import uz.aliensoft.uzpos.data.model.WarehouseItemData
import uz.aliensoft.uzpos.data.model.WarehouseProductData

class WarehousePresenter(var view: WarehousePageView) {

    fun getData() {
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
        view.setData(models)
    }

}