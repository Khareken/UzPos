package uz.aliensoft.uzpos.ui.home

import uz.aliensoft.uzpos.data.model.MainPageProductData

interface MainPageView {
    fun setData(models: MutableList<MainPageProductData>)
}