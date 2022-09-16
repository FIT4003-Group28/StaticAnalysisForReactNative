package defpackage;

import android.media.MediaRouter;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: kx  reason: default package */
/* loaded from: classes3.dex */
public final class kx {
    private static Method a;
    private static boolean b;
    private static Field c;
    private static boolean d;

    public kx() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view) {
        view.requestApplyInsets();
    }

    public static void d(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            ne.oC(popupWindow, z);
            return;
        }
        if (!d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            d = true;
        }
        Field field = c;
        if (field == null) {
            return;
        }
        try {
            field.set(popupWindow, Boolean.valueOf(z));
        } catch (IllegalAccessException unused2) {
        }
    }

    public static void e(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            ne.oD(popupWindow, i);
            return;
        }
        if (!b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            b = true;
        }
        Method method = a;
        if (method == null) {
            return;
        }
        try {
            method.invoke(popupWindow, Integer.valueOf(i));
        } catch (Exception unused2) {
        }
    }

    public static void f(Object obj, Object obj2) {
        ((MediaRouter) obj).removeCallback((MediaRouter.Callback) obj2);
    }

    public static Object g(Object obj) {
        return ((MediaRouter) obj).getSelectedRoute(8388611);
    }
}
