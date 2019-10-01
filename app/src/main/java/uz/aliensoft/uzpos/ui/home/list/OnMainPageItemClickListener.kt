package uz.aliensoft.uzpos.ui.home.list

import uz.aliensoft.uzpos.data.model.MainPageProductData

interface OnMainPageItemClickListener {
    fun removeItem(mainPageProductData: MainPageProductData)
    fun increaseCount(position:Int)
    fun decreaseCount(position: Int)
}