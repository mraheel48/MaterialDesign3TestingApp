package com.example.materialdesign3testingapp.uiTesing

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.materialdesign3testingapp.R
import com.example.materialdesign3testingapp.databinding.ActivityDialogTextBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class DialogText : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityDialogTextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogTextBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDialog.setOnClickListener(this)
        binding.btnMaterialDialog.setOnClickListener(this)
        binding.btnDialogStyled.setOnClickListener(this)
        binding.btnCutShapedDialog.setOnClickListener(this)
        binding.btnRoundShapedDialog.setOnClickListener(this)
        binding.btnFontDialog.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        when (v.id) {
            R.id.btnDialog -> AlertDialog.Builder(this@DialogText)
                .setTitle("Title")
                .setMessage("Your message goes here. Keep it short but clear.")
                .setPositiveButton(
                    "GOT IT"
                ) { _, _ -> }
                .setNegativeButton(
                    "CANCEL"
                ) { _, _ -> }
                .show()
            R.id.btnMaterialDialog -> MaterialAlertDialogBuilder(this@DialogText)
                .setTitle("Title")
                .setMessage("Your message goes here. Keep it short but clear.")
                .setPositiveButton(
                    "GOT IT"
                ) { _, _ -> }
                .setNegativeButton(
                    "CANCEL"
                ) { _, _ -> }
                .show()
            R.id.btnDialogStyled -> createDialog(R.style.AlertDialogTheme)
            R.id.btnCutShapedDialog -> createDialog(R.style.CutShapeTheme)
            R.id.btnRoundShapedDialog -> createDialog(R.style.RoundShapeTheme)
            R.id.btnFontDialog -> createDialog(R.style.CustomFont)
        }
    }

    private fun createDialog(customStyle: Int) {
        MaterialAlertDialogBuilder(this@DialogText, customStyle)
            .setTitle("Title")
            .setMessage("Your message goes here. Keep it short but clear.")
            .setPositiveButton(
                "GOT IT"
            ) { _, _ -> }
            .setNeutralButton(
                "LATER"
            ) { _, _ -> }
            .show()
    }
}