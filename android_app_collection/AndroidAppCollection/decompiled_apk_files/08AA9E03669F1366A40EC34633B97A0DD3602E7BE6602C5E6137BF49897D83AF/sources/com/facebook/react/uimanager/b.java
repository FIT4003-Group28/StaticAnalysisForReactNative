package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: DisplayMetricsHolder.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static DisplayMetrics f3837a;

    /* renamed from: b  reason: collision with root package name */
    private static DisplayMetrics f3838b;

    public static void a(DisplayMetrics displayMetrics) {
        f3837a = displayMetrics;
    }

    public static void a(Context context) {
        if (b() != null) {
            return;
        }
        b(context);
    }

    public static void b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        a(displayMetrics);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        com.facebook.j.a.a.a(windowManager, "WindowManager is null!");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics2);
        } else {
            try {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                displayMetrics2.widthPixels = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                displayMetrics2.heightPixels = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException("Error getting real dimensions for API level < 17", e);
            }
        }
        b(displayMetrics2);
    }

    @Deprecated
    public static DisplayMetrics a() {
        return f3837a;
    }

    public static void b(DisplayMetrics displayMetrics) {
        f3838b = displayMetrics;
    }

    public static DisplayMetrics b() {
        return f3838b;
    }
}
