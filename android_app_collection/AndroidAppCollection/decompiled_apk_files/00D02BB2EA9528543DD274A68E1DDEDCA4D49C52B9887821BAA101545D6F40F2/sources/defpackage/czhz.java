package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: czhz  reason: default package */
/* loaded from: classes.dex */
public final class czhz {
    private static Thread a;
    private static volatile Handler b;

    public static boolean a() {
        if (a == null) {
            a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == a;
    }

    public static void b() {
        if (a()) {
            return;
        }
        throw new RuntimeException("Must be called on the UI thread");
    }

    public static void c() {
        if (!a()) {
            return;
        }
        throw new RuntimeException("Must be called on a background thread");
    }

    public static Handler d() {
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        return b;
    }

    public static void e(Runnable runnable) {
        d().post(runnable);
    }

    public static void f(Runnable runnable, long j) {
        d().postDelayed(runnable, j);
    }
}
