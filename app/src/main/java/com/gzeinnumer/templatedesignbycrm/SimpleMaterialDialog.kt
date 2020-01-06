package com.gzeinnumer.templatedesignbycrm

import android.content.Context
import androidx.core.content.ContextCompat
import com.afollestad.materialdialogs.GravityEnum
import com.afollestad.materialdialogs.MaterialDialog

class SimpleMaterialDialog(val context: Context) {

    fun dialogInfo(): MaterialDialog.Builder {
        return MaterialDialog.Builder(context)
            .title("Sukses")
            .positiveText("Ok")
            .iconRes(R.drawable.ic_info_blue_24dp)
            .titleColorRes(R.color.blue_700)
            .contentColorRes(android.R.color.black)
            .buttonsGravity(GravityEnum.CENTER)
            .positiveColor(ContextCompat.getColor(context, R.color.blue_700))
    }

    fun dialogSuccess(): MaterialDialog.Builder {
        return MaterialDialog.Builder(context)
            .title("Sukses")
            .positiveText("Ok")
            .iconRes(R.drawable.ic_check_circle_green_24dp)
            .titleColorRes(R.color.green_500)
            .contentColorRes(android.R.color.black)
            .buttonsGravity(GravityEnum.CENTER)
            .positiveColor(ContextCompat.getColor(context, R.color.green_500))
    }

    fun dialogError(): MaterialDialog.Builder {
        return MaterialDialog.Builder(context)
            .title("Error")
            .positiveText("Ok")
            .iconRes(R.drawable.ic_cancel_red_24dp)
            .titleColorRes(R.color.red_500)
            .contentColorRes(android.R.color.black)
            .buttonsGravity(GravityEnum.CENTER)
            .negativeColor(ContextCompat.getColor(context, R.color.green_500))
    }

    fun dialogWarning(): MaterialDialog.Builder {
        return MaterialDialog.Builder(context)
            .title("Warning")
            .positiveText("Ok")
            .iconRes(R.drawable.ic_error_yellow_24dp)
            .titleColorRes(R.color.red_500)
            .contentColorRes(android.R.color.black)
            .buttonsGravity(GravityEnum.CENTER)
            .negativeColor(ContextCompat.getColor(context, R.color.green_500))
    }

}