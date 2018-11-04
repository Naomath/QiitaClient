package com.naoto.dennnoukishidann.qittaclient

import android.support.annotation.IdRes
import android.view.View

/**
 * Created by gotounaoto on 2018/10/06.
 */
fun<T : View> View.bindView(@IdRes id: Int): Lazy<T> = lazy { findViewById<View>(id) as T }