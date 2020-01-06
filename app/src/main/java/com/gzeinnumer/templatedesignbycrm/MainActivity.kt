package com.gzeinnumer.templatedesignbycrm

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dmax.dialog.SpotsDialog

class MainActivity : AppCompatActivity() {

    private lateinit var alertLoading: AlertDialog
    lateinit var builderLoading: SpotsDialog.Builder

    fun onHideLoading() {
        alertLoading.apply {
            dismiss()
        }
    }

    fun onShowLoading() {
        alertLoading.apply {
            show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        builderLoading = SpotsDialog
            .Builder()
            .setContext(this)
            .setMessage("Mohon Menunggu")
            .setCancelable(false)

        alertLoading = builderLoading.build()
        onShowLoading()
        onHideLoading()

        SimpleMaterialDialog(this).dialogInfo()
            .content("pesan")
            .onPositive { dialog, which ->
                //aksi jika sukses
            }
            .show()

        SimpleMaterialDialog(this).dialogSuccess()
            .content("pesan")
            .onAny { dialog, which ->
                dialog.dismiss()
                //aksi
            }
            .show()

        SimpleMaterialDialog(this).dialogError()
            .content("pesan")
            .onAny { dialog, which ->
                dialog.dismiss()
            }
            .show()

        SimpleMaterialDialog(this).dialogWarning()
            .content("Delete Semua Data Foto .?")
            .positiveText("DELETE")
            .negativeText("CANCEL")
            .onPositive { dialog, which ->
                //aksi jika sukses
            }
            .onNegative { dialog, which ->
                dialog.dismiss()
            }
            .show()
    }


}
