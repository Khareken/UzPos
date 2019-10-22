package uz.aliensoft.uzpos.ui.dialog

import uz.aliensoft.uzpos.data.model.CategoryBranchProductData

interface AddProductDialogButtonClickListener {
    fun plusBtnClicked()
    fun minusBtnClicked()
    fun toBasket(model: CategoryBranchProductData)
}