package defpackage;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: cmyz  reason: default package */
/* loaded from: classes5.dex */
public final class cmyz {
    public static void a(Runnable runnable) {
        b(Looper.getMainLooper(), runnable);
    }

    public static void b(Looper looper, Runnable runnable) {
        new cojb(looper).post(runnable);
    }

    public static <T> T c(Callable<T> callable, T t) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        FutureTask futureTask = new FutureTask(callable);
        a(futureTask);
        try {
            return (T) futureTask.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            return t;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }
}
