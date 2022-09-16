package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
/* compiled from: PG */
/* renamed from: yzh  reason: default package */
/* loaded from: classes4.dex */
public final class yzh {
    private static final int[] c = {-16842910};
    private static final int[] d = {16842908};
    private static final int[] e = {16843518};
    private static final int[] f = {16842919};
    private static final int[] g = {16842912};
    private static final int[] h = {16842913};
    private static final int[] i = new int[0];
    public final Context a;
    public ColorStateList b;
    private final TypedValue j = new TypedValue();

    public yzh(Context context) {
        context.getClass();
        this.a = context;
    }

    public static void e(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (drawable != null) {
            h(drawable, i2, mode);
        }
    }

    public static void f(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable != null) {
            i(drawable, colorStateList, mode);
        }
    }

    public static final Drawable g(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            h(mutate, i2, mode);
            return mutate;
        }
        return null;
    }

    private static void h(Drawable drawable, int i2, PorterDuff.Mode mode) {
        drawable.setTint(i2);
        drawable.setTintMode(mode);
    }

    private static void i(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        drawable.setTintList(colorStateList);
        drawable.setTintMode(mode);
    }

    public final ColorStateList a(int i2, int i3, int i4, int i5, int i6, int i7) {
        int alpha = Color.alpha(i7);
        this.a.getTheme().resolveAttribute(16842803, this.j, true);
        return new ColorStateList(new int[][]{c, d, e, f, g, h, i}, new int[]{zdb.d(i7, Math.round(alpha * this.j.getFloat())), i2, i3, i4, i5, i6, i7});
    }

    public final Drawable b(Drawable drawable, int i2) {
        return g(drawable, i2, PorterDuff.Mode.SRC_IN);
    }

    public final Drawable c(Drawable drawable, ColorStateList colorStateList) {
        return d(drawable, colorStateList, PorterDuff.Mode.SRC_IN);
    }

    public final Drawable d(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            i(mutate, colorStateList, mode);
            return mutate;
        }
        return null;
    }
}
