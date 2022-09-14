package com.facebook.react.bridge;

import android.os.Handler;
import android.os.Looper;
/* compiled from: UiThreadUtil.java */
/* loaded from: classes.dex */
public class ap {

    /* renamed from: a  reason: collision with root package name */
    private static Handler f3233a;

    public static boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void b() {
        ao.a(a(), "Expected to run on UI thread!");
    }

    public static void a(Runnable runnable) {
        synchronized (ap.class) {
            if (f3233a == null) {
                f3233a = new Handler(Looper.getMainLooper());
            }
        }
        f3233a.post(runnable);
    }
}
