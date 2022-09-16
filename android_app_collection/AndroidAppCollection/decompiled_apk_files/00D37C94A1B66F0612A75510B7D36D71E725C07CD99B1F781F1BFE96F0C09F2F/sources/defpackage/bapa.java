package defpackage;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: bapa  reason: default package */
/* loaded from: classes2.dex */
public final class bapa {
    private bapa() {
    }

    public static String a(int i) {
        return i == 4 ? "AV1X" : i != 1 ? i != 2 ? "H264" : "VP9" : "VP8";
    }

    public static Object b(Handler handler, Callable callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        baow baowVar = new baow();
        baov baovVar = new baov();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new baox(baowVar, callable, baovVar, countDownLatch));
        c(countDownLatch);
        Exception exc = baovVar.a;
        if (exc == null) {
            return baowVar.a;
        }
        RuntimeException runtimeException = new RuntimeException(exc);
        StackTraceElement[] stackTrace = baovVar.a.getStackTrace();
        StackTraceElement[] stackTrace2 = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace2.length;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[length + length2];
        System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, length);
        System.arraycopy(stackTrace2, 0, stackTraceElementArr, length, length2);
        runtimeException.setStackTrace(stackTraceElementArr);
        throw runtimeException;
    }

    public static void c(CountDownLatch countDownLatch) {
        boolean z = false;
        while (true) {
            try {
                countDownLatch.await();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void d() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return;
        }
        throw new IllegalStateException("Not on main thread!");
    }

    public static void e(Handler handler, Runnable runnable) {
        b(handler, new baoy(runnable));
    }

    public static boolean f(Thread thread) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = 2000;
        boolean z = false;
        while (j > 0) {
            try {
                thread.join(j);
                break;
            } catch (InterruptedException unused) {
                j = 2000 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }

    public static float[] g(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static bapa h() {
        Thread.currentThread();
        Process.myTid();
        return new bapa();
    }
}
