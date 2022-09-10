package defpackage;

import android.content.Context;
import java.lang.Thread;
/* compiled from: PG */
/* renamed from: bvqo  reason: default package */
/* loaded from: classes.dex */
public final class bvqo implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler a;
    private final String b;

    public bvqo(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread) {
        context.getApplicationContext();
        this.b = String.format("tname=%s", thread.getName());
        if (uncaughtExceptionHandler == null) {
            this.a = Thread.getDefaultUncaughtExceptionHandler();
        } else {
            this.a = uncaughtExceptionHandler;
        }
    }

    public static void a(Thread thread, Context context) {
        thread.setUncaughtExceptionHandler(new bvqo(context, thread.getUncaughtExceptionHandler(), thread));
    }

    static Throwable b(String str, Throwable th) {
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = th.getMessage() == null ? "Exception message empty." : th.getMessage();
        String format = String.format("%s - %s", objArr);
        try {
            Throwable th2 = (Throwable) th.getClass().getConstructor(String.class).newInstance(format);
            th2.setStackTrace(th.getStackTrace());
            if (th.getCause() != null) {
                th2.initCause(th.getCause());
            }
            return th2;
        } catch (Throwable unused) {
            return new Throwable(format, th);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Throwable b;
        if (th instanceof bvqw) {
            while (th instanceof bvqw) {
                th = th.getCause();
            }
            b = b(this.b, th);
        } else {
            b = b(this.b, th);
        }
        try {
            deki.b(b);
            bvoo.g(b);
        } catch (Throwable th2) {
            th = th2;
            while (th.getCause() != null) {
                try {
                    th = th.getCause();
                } catch (Throwable unused) {
                }
            }
            th.initCause(b);
            b = th;
        }
        this.a.uncaughtException(thread, b);
    }
}
