package c.e.a.c.y;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f4804a;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f4805b;

    /* renamed from: c  reason: collision with root package name */
    static final String f4806c;

    static {
        f4804a = Build.VERSION.SDK_INT >= 21;
        new int[1][0] = 16842919;
        new int[1][0] = 16842908;
        new int[1][0] = 16843623;
        new int[1][0] = 16842913;
        f4805b = new int[]{16842910, 16842919};
        f4806c = b.class.getSimpleName();
    }

    private b() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f4805b, 0)) != 0) {
                Log.w(f4806c, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean a(int[] iArr) {
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
}
