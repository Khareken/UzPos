package uz.aliensoft.uzpos.ui.home

import uz.aliensoft.uzpos.data.model.MainPageProductData

class MainPagePresenter {

    lateinit var view: MainPageView

    fun init(view: MainPageView) {
        this.view = view
    }

    fun getData() {
        val mainPageProductData: MutableList<MainPageProductData> = arrayListOf()
        for(i in 1..100){
            mainPageProductData.add(
                MainPageProductData(
                    i,
                    "Coca - cola 1,5L",
                    "4703265110064",
                    "6,990 sum",
                    4,
                    27.960
                )
            )
        }
        view.setData(mainPageProductData)
    }
}