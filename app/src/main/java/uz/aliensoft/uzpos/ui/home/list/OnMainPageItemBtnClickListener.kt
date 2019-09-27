package uz.aliensoft.uzpos.ui.home.list

import uz.aliensoft.uzpos.data.model.MainPageProductData

interface OnMainPageItemBtnClickListener {
    fun removeItem(model: MainPageProductData)
    fun increaseCount(position: Int)
    fun decreaseCount(position: Int)
}