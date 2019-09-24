package uz.aliensoft.uzpos

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class WarehouseButtonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val button: Button = itemView.findViewById(R.id.warehouse_add_btn)
    private val btn_text: TextView = itemView.findViewById(R.id.warehouse_add_btn_text)
}