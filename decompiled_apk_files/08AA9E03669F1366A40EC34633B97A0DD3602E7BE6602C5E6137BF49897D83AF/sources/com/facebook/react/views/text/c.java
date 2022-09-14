package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
/* compiled from: DefaultStyleValuesUtil.java */
/* loaded from: classes.dex */
public final class c {
    public static ColorStateList a(Context context) {
        return a(context, 16842906);
    }

    public static ColorStateList b(Context context) {
        return a(context, 16842904);
    }

    public static int c(Context context) {
        return a(context, 16842905).getDefaultColor();
    }

    private static ColorStateList a(Context context, int i) {
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
            try {
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                return colorStateList;
            } catch (Throwable th) {
                th = th;
                typedArray = obtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
