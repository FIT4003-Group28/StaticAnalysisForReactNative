package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static DisplayMetrics f5883a;

    /* renamed from: b  reason: collision with root package name */
    private static DisplayMetrics f5884b;

    public static DisplayMetrics a() {
        return f5884b;
    }

    public static Map<String, Map<String, Object>> a(double d2) {
        c.d.k.a.a.a(Boolean.valueOf((f5883a == null && f5884b == null) ? false : true), "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        HashMap hashMap = new HashMap();
        hashMap.put("windowPhysicalPixels", a(f5883a, d2));
        hashMap.put("screenPhysicalPixels", a(f5884b, d2));
        return hashMap;
    }

    private static Map<String, Object> a(DisplayMetrics displayMetrics, double d2) {
        HashMap hashMap = new HashMap();
        hashMap.put("width", Integer.valueOf(displayMetrics.widthPixels));
        hashMap.put("height", Integer.valueOf(displayMetrics.heightPixels));
        hashMap.put("scale", Float.valueOf(displayMetrics.density));
        hashMap.put("fontScale", Double.valueOf(d2));
        hashMap.put("densityDpi", Integer.valueOf(displayMetrics.densityDpi));
        return hashMap;
    }

    public static void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        b(displayMetrics);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        c.d.k.a.a.a(windowManager, "WindowManager is null!");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics2);
        } else {
            try {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                displayMetrics2.widthPixels = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                displayMetrics2.heightPixels = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw new RuntimeException("Error getting real dimensions for API level < 17", e2);
            }
        }
        a(displayMetrics2);
    }

    public static void a(DisplayMetrics displayMetrics) {
        f5884b = displayMetrics;
    }

    @Deprecated
    public static DisplayMetrics b() {
        return f5883a;
    }

    public static WritableNativeMap b(double d2) {
        c.d.k.a.a.a(Boolean.valueOf((f5883a == null && f5884b == null) ? false : true), "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("windowPhysicalPixels", b(f5883a, d2));
        writableNativeMap.putMap("screenPhysicalPixels", b(f5884b, d2));
        return writableNativeMap;
    }

    private static WritableNativeMap b(DisplayMetrics displayMetrics, double d2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", displayMetrics.widthPixels);
        writableNativeMap.putInt("height", displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d2);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    public static void b(Context context) {
        if (a() != null) {
            return;
        }
        a(context);
    }

    public static void b(DisplayMetrics displayMetrics) {
        f5883a = displayMetrics;
    }
}
