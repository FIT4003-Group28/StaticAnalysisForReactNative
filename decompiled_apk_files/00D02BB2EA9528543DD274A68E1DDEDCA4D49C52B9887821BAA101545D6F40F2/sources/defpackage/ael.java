package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: ael  reason: default package */
/* loaded from: classes.dex */
public final class ael {
    private static final ThreadLocal<TypedValue> f = new ThreadLocal<>();
    static final int[] a = {-16842910};
    static final int[] b = {16842908};
    static final int[] c = {16842919};
    static final int[] d = {16842912};
    static final int[] e = new int[0];
    private static final int[] g = new int[1];

    public static int a(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        aeq a2 = aeq.a(context, null, iArr);
        try {
            return a2.s(0);
        } finally {
            a2.q();
        }
    }

    public static ColorStateList b(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        aeq a2 = aeq.a(context, null, iArr);
        try {
            return a2.j(0);
        } finally {
            a2.q();
        }
    }

    public static int c(Context context, int i) {
        ColorStateList b2 = b(context, i);
        if (b2 == null || !b2.isStateful()) {
            ThreadLocal<TypedValue> threadLocal = f;
            TypedValue typedValue = threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            context.getTheme().resolveAttribute(16842803, typedValue, true);
            float f2 = typedValue.getFloat();
            int a2 = a(context, i);
            return kc.f(a2, Math.round(Color.alpha(a2) * f2));
        }
        return b2.getColorForState(a, b2.getDefaultColor());
    }

    public static void d(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(sj.j);
        try {
            if (!obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowActionBar)) {
                String str = "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).";
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
