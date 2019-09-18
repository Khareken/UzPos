package uz.aliensoft.uzpos

import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.aliensoft.uzpos.R

class ProductItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val productNumber: TextView = itemView.findViewById(R.id.product_number_id)
    private val productName: TextView = itemView.findViewById(R.id.product_name_id)
    private val productCode: TextView = itemView.findViewById(R.id.product_code_id)
    private val productPrice: TextView = itemView.findViewById(R.id.product_price_id)
    private val productAmountMinus: ImageButton = itemView.findViewById(R.id.product_amount_minus_id)
    private val productAmountText: TextView = itemView.findViewById(R.id.product_amount_text_id)
    private val productAmountPlus: ImageButton = itemView.findViewById(R.id.product_amount_plus_id)
    private val productSum: TextView = itemView.findViewById(R.id.product_sum_id)
    private val productClear: ImageButton = itemView.findViewById(R.id.product_clearBtn_id)

    fun populateProduct(product: Product) {
        productNumber.text = product.number.toString()
        productName.text = product.name
        productCode.text = product.code
        productPrice.text = product.price
        productAmountText.text = product.amount.toString()
        productSum.text = product.sum.toString()

    }
}