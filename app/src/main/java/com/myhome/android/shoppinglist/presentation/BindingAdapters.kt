package com.myhome.android.shoppinglist.presentation

import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputLayout
import com.myhome.android.shoppinglist.R

@BindingAdapter("errorInputName")
fun bindErrorInputName(textInputLayout: TextInputLayout, isError: Boolean){
    val message = if (isError) {
       textInputLayout.context.getString(R.string.error_input)
    } else {
        null
    }
    textInputLayout.error = message
}

@BindingAdapter("errorInputCount")
fun bindErrorInputCount(textInputLayout: TextInputLayout, isError: Boolean){
    val message = if (isError) {
        textInputLayout.context.getString(R.string.error_input)
    } else {
        null
    }
    textInputLayout.error = message
}