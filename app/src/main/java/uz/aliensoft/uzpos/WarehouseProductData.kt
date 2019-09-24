package uz.aliensoft.uzpos

import java.io.FileDescriptor

 class WarehouseProductData(override var type:Int, val category: String, val categoryDescripton: String ): WarehouseItemData(type)
