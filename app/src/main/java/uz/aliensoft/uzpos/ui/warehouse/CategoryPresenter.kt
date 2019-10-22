package uz.aliensoft.uzpos.ui.warehouse

import uz.aliensoft.uzpos.data.model.WarehouseItemData
import uz.aliensoft.uzpos.data.model.WarehouseProductData

class CategoryPresenter(var view: CategoryPageView) {

    fun getData(step: Int) {
        val models: MutableList<WarehouseItemData> = arrayListOf()
        for (i in 1..40) {
            models.add(
                WarehouseProductData(
                    1,
                    "Напитки",
                    "Coca-cola,Sprite,Fanta"
                )
            )
        }
        when(step) {
            0 -> {
                view.setData(models)
                return
            }
            1 -> models.add(0, WarehouseItemData(2))
            else -> {
                models.add(0, WarehouseItemData(2))
                models.add(0, WarehouseItemData(3))
            }
        }

        view.setData(models)
    }

}