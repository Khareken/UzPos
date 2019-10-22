package uz.aliensoft.uzpos.ui.home

interface CategoryItemClickListener {
    fun onCategoryItemClicked(step: Int, isCategory: Boolean)
    fun onBackPressed()
    fun onHomePressed()
}