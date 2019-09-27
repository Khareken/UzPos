package uz.aliensoft.uzpos.ui.home.list

import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.aliensoft.uzpos.R
import uz.aliensoft.uzpos.data.model.MainPageProductData

class ProductItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val productNumber: TextView = itemView.findViewById(R.id.product_number_id)
    private val productName: TextView = itemView.findViewById(R.id.product_name_id)
    private val productCode: TextView = itemView.findViewById(R.id.product_code_id)
    private val productPrice: TextView = itemView.findViewById(R.id.product_price_id)
    private val productAmountMinus: ImageButton = itemView.findViewById(R.id.product_amount_minus_id)
    private val productAmountText: EditText = itemView.findViewById(R.id.product_amount_text)
    private val productAmountPlus: ImageButton = itemView.findViewById(R.id.product_amount_plus_id)
    private val productSum: TextView = itemView.findViewById(R.id.product_sum_id)
    private val productClear: ImageButton = itemView.findViewById(R.id.product_clearBtn_id)

    fun populateProduct(
        mainPageProductData: MainPageProductData,
        onMainPageItemBtnClickListener: OnMainPageItemBtnClickListener,
        position: Int
    ) {
        productNumber.text = (position+1).toString()
        productName.text = mainPageProductData.name
        productCode.text = mainPageProductData.code
        productPrice.text = mainPageProductData.price
        productAmountText.setText(mainPageProductData.count.toString())
        productSum.text = mainPageProductData.sum.toString()
        productClear.setOnClickListener {
            onMainPageItemBtnClickListener.removeItem(mainPageProductData)
        }
        productAmountPlus.setOnClickListener {
            onMainPageItemBtnClickListener.increaseCount(position)
        }
        productAmountMinus.setOnClickListener {
            onMainPageItemBtnClickListener.decreaseCount(position)
        }

    }
}