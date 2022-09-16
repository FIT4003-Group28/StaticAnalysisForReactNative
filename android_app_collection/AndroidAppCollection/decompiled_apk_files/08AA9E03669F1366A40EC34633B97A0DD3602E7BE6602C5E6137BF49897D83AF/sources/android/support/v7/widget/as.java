package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public class as {

    /* renamed from: a  reason: collision with root package name */
    private static Method f941a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f941a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                if (f941a.isAccessible()) {
                    return;
                }
                f941a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    public static boolean a(View view) {
        return android.support.v4.j.s.c(view) == 1;
    }

    public static void a(View view, Rect rect, Rect rect2) {
        if (f941a != null) {
            try {
                f941a.invoke(view, rect, rect2);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }
}
