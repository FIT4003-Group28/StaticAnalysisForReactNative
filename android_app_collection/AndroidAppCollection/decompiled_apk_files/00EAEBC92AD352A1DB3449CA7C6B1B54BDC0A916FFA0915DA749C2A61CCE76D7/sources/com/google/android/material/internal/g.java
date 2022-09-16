package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.x0;
import c.e.a.c.k;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f8148a = {c.e.a.c.b.colorPrimary};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f8149b = {c.e.a.c.b.colorPrimaryVariant};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f8150c = {16842752, c.e.a.c.b.theme};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f8151d = {c.e.a.c.b.materialThemeOverlay};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8150c);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    public static void a(Context context) {
        a(context, f8148a, "Theme.AppCompat");
    }

    private static void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(k.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(c.e.a.c.b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                b(context);
            }
        }
        a(context);
    }

    private static void a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ThemeEnforcement, i, i2);
        if (!obtainStyledAttributes.getBoolean(k.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        boolean b2 = (iArr2 == null || iArr2.length == 0) ? obtainStyledAttributes.getResourceId(k.ThemeEnforcement_android_textAppearance, -1) != -1 : b(context, attributeSet, iArr, i, i2, iArr2);
        obtainStyledAttributes.recycle();
        if (!b2) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void a(Context context, int[] iArr, String str) {
        if (a(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    private static boolean a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static Context b(Context context, AttributeSet attributeSet, int i, int i2) {
        int c2 = c(context, attributeSet, i, i2);
        if (c2 != 0) {
            if ((context instanceof a.a.o.d) && ((a.a.o.d) context).a() == c2) {
                return context;
            }
            a.a.o.d dVar = new a.a.o.d(context, c2);
            int a2 = a(dVar, attributeSet);
            return a2 != 0 ? new a.a.o.d(dVar, a2) : dVar;
        }
        return context;
    }

    public static void b(Context context) {
        a(context, f8149b, "Theme.MaterialComponents");
    }

    private static boolean b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    private static int c(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8151d, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static TypedArray c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        a(context, attributeSet, i, i2);
        a(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static x0 d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        a(context, attributeSet, i, i2);
        a(context, attributeSet, iArr, i, i2, iArr2);
        return x0.a(context, attributeSet, iArr, i, i2);
    }
}
