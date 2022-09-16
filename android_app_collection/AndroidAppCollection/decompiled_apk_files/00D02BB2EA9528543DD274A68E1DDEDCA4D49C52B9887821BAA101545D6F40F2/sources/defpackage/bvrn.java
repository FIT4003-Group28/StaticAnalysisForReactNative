package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import java.lang.Thread;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bvrn  reason: default package */
/* loaded from: classes.dex */
public final class bvrn implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler a;
    private final Application b;

    public bvrn(Application application, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = application;
        this.a = uncaughtExceptionHandler;
    }

    public static SharedPreferences a(Application application) {
        return application.getSharedPreferences("classnotfound_exception_preference", 0);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (Arrays.asList("lge,huawei,samsung".split(",")).contains(Build.MANUFACTURER.toLowerCase())) {
            Throwable th2 = th;
            while (!(th2 instanceof NoClassDefFoundError) && !(th2 instanceof ClassNotFoundException)) {
                th2 = th2.getCause();
                if (th2 == null) {
                    break;
                }
            }
            a(this.b).edit().putBoolean("classnotfound_exception_marker", true).commit();
        }
        this.a.uncaughtException(thread, th);
    }
}
