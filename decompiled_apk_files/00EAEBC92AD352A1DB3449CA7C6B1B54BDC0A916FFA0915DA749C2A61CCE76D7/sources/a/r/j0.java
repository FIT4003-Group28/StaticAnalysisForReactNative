package a.r;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
class j0 {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f639a = true;

    /* renamed from: b  reason: collision with root package name */
    private static Method f640b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f641c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!f641c) {
            try {
                f640b = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", Integer.TYPE, Integer.TYPE);
                f640b.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f641c = true;
        }
        Method method = f640b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i0 a(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new h0(viewGroup) : g0.a(viewGroup);
    }

    @SuppressLint({"NewApi"})
    private static void a(ViewGroup viewGroup, boolean z) {
        if (f639a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f639a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            a(viewGroup, z);
        } else {
            k0.a(viewGroup, z);
        }
    }
}
