package androidx.core.widget;

import a.g.m.v;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static Method f1625a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1626b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f1627c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f1628d;

    public static void a(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f1626b) {
            try {
                f1625a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f1625a.setAccessible(true);
            } catch (Exception unused) {
            }
            f1626b = true;
        }
        Method method = f1625a;
        if (method == null) {
            return;
        }
        try {
            method.invoke(popupWindow, Integer.valueOf(i));
        } catch (Exception unused2) {
        }
    }

    public static void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((a.g.m.d.a(i3, v.p(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    public static void a(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (i < 21) {
        } else {
            if (!f1628d) {
                try {
                    f1627c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f1627c.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
                }
                f1628d = true;
            }
            Field field = f1627c;
            if (field == null) {
                return;
            }
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException e3) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
            }
        }
    }
}
