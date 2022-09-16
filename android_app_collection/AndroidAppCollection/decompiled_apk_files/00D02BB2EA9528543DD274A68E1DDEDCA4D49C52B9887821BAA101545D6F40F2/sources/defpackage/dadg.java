package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
/* compiled from: PG */
/* renamed from: dadg  reason: default package */
/* loaded from: classes.dex */
public final class dadg {
    public static final int[] a = {16842919};
    public static final int[] b = {16842913, 16842919};
    public static final int[] c = {16842913};
    private static final int[] d = {16842910, 16842919};

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
                Color.alpha(colorStateList.getColorForState(d, 0));
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean b(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    public static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        int alpha = Color.alpha(colorForState);
        return kc.f(colorForState, Math.min(alpha + alpha, 255));
    }
}
