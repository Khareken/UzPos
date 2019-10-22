package uz.aliensoft.uzpos.ui.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import uz.aliensoft.uzpos.R

class AddProductDialog(context: Context) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_page)
    }
}