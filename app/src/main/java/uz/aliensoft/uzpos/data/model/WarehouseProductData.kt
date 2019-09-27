package uz.aliensoft.uzpos.data.model

class WarehouseProductData(override var type:Int, val category: String, val categoryDescripton: String ): WarehouseItemData(type)
