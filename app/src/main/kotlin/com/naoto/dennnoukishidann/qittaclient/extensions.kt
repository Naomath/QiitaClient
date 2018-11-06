package com.naoto.dennnoukishidann.qittaclient

import android.content.Context
import android.support.annotation.IdRes
import android.view.ContextMenu
import android.view.View
import android.widget.Toast

/**
 * Created by gotounaoto on 2018/10/06.
 */
fun <T : View> View.bindView(@IdRes id: Int): Lazy<T> = lazy { findViewById<View>(id) as T }

fun Context.toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}