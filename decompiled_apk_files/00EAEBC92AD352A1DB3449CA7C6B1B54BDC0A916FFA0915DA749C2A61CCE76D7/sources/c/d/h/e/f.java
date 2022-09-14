package c.d.h.e;

import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class f {
    public static int a(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    public static int a(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    public static void a(Drawable drawable, Drawable.Callback callback, t tVar) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (!(drawable instanceof s)) {
                return;
            }
            ((s) drawable).a(tVar);
        }
    }

    public static void a(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static void a(Drawable drawable, e eVar) {
        if (drawable == null || eVar == null) {
            return;
        }
        eVar.a(drawable);
    }
}
