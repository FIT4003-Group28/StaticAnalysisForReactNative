package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
/* compiled from: PG */
/* renamed from: zy  reason: default package */
/* loaded from: classes4.dex */
public final class zy {
    private static final ThreadLocal f = new ThreadLocal();
    static final int[] a = {-16842910};
    static final int[] b = {16842908};
    static final int[] c = {16842919};
    static final int[] d = {16842912};
    static final int[] e = new int[0];
    private static final int[] g = new int[1];

    public static int a(Context context, int i) {
        ColorStateList c2 = c(context, i);
        if (c2 == null || !c2.isStateful()) {
            ThreadLocal threadLocal = f;
            TypedValue typedValue = (TypedValue) threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            context.getTheme().resolveAttribute(16842803, typedValue, true);
            float f2 = typedValue.getFloat();
            int b2 = b(context, i);
            return gy.f(b2, Math.round(Color.alpha(b2) * f2));
        }
        return c2.getColorForState(a, c2.getDefaultColor());
    }

    public static int b(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        aad k = aad.k(context, null, iArr);
        try {
            return k.s(0);
        } finally {
            k.o();
        }
    }

    public static ColorStateList c(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        aad k = aad.k(context, null, iArr);
        try {
            return k.g(0);
        } finally {
            k.o();
        }
    }

    public static void d(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(pm.j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
