package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
/* compiled from: ThemeUtils.java */
/* loaded from: classes.dex */
class ah {
    private static final ThreadLocal<TypedValue> i = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    static final int[] f908a = {-16842910};

    /* renamed from: b  reason: collision with root package name */
    static final int[] f909b = {16842908};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f910c = {16843518};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f911d = {16842919};
    static final int[] e = {16842912};
    static final int[] f = {16842913};
    static final int[] g = {-16842919, -16842908};
    static final int[] h = new int[0];
    private static final int[] j = new int[1];

    public static int a(Context context, int i2) {
        j[0] = i2;
        am a2 = am.a(context, (AttributeSet) null, j);
        try {
            return a2.b(0, 0);
        } finally {
            a2.a();
        }
    }

    public static ColorStateList b(Context context, int i2) {
        j[0] = i2;
        am a2 = am.a(context, (AttributeSet) null, j);
        try {
            return a2.d(0);
        } finally {
            a2.a();
        }
    }

    public static int c(Context context, int i2) {
        ColorStateList b2 = b(context, i2);
        if (b2 != null && b2.isStateful()) {
            return b2.getColorForState(f908a, b2.getDefaultColor());
        }
        TypedValue a2 = a();
        context.getTheme().resolveAttribute(16842803, a2, true);
        return a(context, i2, a2.getFloat());
    }

    private static TypedValue a() {
        TypedValue typedValue = i.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            i.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    static int a(Context context, int i2, float f2) {
        int a2 = a(context, i2);
        return android.support.v4.b.a.b(a2, Math.round(Color.alpha(a2) * f2));
    }
}
