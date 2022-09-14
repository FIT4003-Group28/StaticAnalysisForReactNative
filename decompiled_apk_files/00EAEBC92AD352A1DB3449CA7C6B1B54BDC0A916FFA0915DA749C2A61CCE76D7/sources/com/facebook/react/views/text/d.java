package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
/* loaded from: classes.dex */
public final class d {
    public static ColorStateList a(Context context) {
        return a(context, 16842904);
    }

    private static ColorStateList a(Context context, int i) {
        TypedArray typedArray = null;
        try {
            typedArray = context.getTheme().obtainStyledAttributes(new int[]{i});
            return typedArray.getColorStateList(0);
        } finally {
            if (typedArray != null) {
                typedArray.recycle();
            }
        }
    }

    public static int b(Context context) {
        return a(context, 16842905).getDefaultColor();
    }

    public static ColorStateList c(Context context) {
        return a(context, 16842906);
    }
}
