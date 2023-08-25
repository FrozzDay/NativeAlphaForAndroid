package com.cylonid.nativealpha.util

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat

class ResourceImageGetter(private val context: Context) : ImageGetter {
    override fun getDrawable(source: String): Drawable {
        val resId = context.resIdByName(source, "drawable")
        val drawable = AppCompatResources.getDrawable(context, resId)

        drawable?.setBounds(0, 0, drawable.intrinsicWidth, drawable.intrinsicHeight)
        return drawable!!
    }
}
fun Context.resIdByName(resName: String, resType: String): Int {
    return resources.getIdentifier(resName, resType, packageName)
}