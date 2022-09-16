package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s0 {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1373a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    static final int[] f1374b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f1375c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f1376d;

    /* renamed from: e  reason: collision with root package name */
    static final int[] f1377e;

    /* renamed from: f  reason: collision with root package name */
    static final int[] f1378f;

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f1379g;

    static {
        new int[1][0] = 16843518;
        f1376d = new int[]{16842919};
        f1377e = new int[]{16842912};
        new int[1][0] = 16842913;
        f1378f = new int[0];
        f1379g = new int[1];
    }

    public static int a(Context context, int i) {
        ColorStateList c2 = c(context, i);
        if (c2 == null || !c2.isStateful()) {
            TypedValue a2 = a();
            context.getTheme().resolveAttribute(16842803, a2, true);
            return a(context, i, a2.getFloat());
        }
        return c2.getColorForState(f1374b, c2.getDefaultColor());
    }

    static int a(Context context, int i, float f2) {
        int b2 = b(context, i);
        return a.g.f.a.c(b2, Math.round(Color.alpha(b2) * f2));
    }

    private static TypedValue a() {
        TypedValue typedValue = f1373a.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            f1373a.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    public static int b(Context context, int i) {
        int[] iArr = f1379g;
        iArr[0] = i;
        x0 a2 = x0.a(context, (AttributeSet) null, iArr);
        try {
            return a2.a(0, 0);
        } finally {
            a2.a();
        }
    }

    public static ColorStateList c(Context context, int i) {
        int[] iArr = f1379g;
        iArr[0] = i;
        x0 a2 = x0.a(context, (AttributeSet) null, iArr);
        try {
            return a2.a(0);
        } finally {
            a2.a();
        }
    }
}
