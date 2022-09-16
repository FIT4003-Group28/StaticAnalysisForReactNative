package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.CoroutineExceptionHandler;
/* compiled from: PG */
/* renamed from: ayno  reason: default package */
/* loaded from: classes2.dex */
public final class ayno {
    public static long a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, c(j2, j)));
        return j2;
    }

    public static long b(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, c(j2, j)));
        return j2;
    }

    public static long c(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static long d(long j, long j2) {
        long j3 = j * j2;
        if (((j | j2) >>> 31) == 0 || j3 / j == j2) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static void e(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("More produced than requested: ");
                sb.append(j3);
                azqc.d(new IllegalStateException(sb.toString()));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    public static void f(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE || j2 == Long.MAX_VALUE) {
                return;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("More produced than requested: ");
                sb.append(j3);
                azqc.d(new IllegalStateException(sb.toString()));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    public static final Throwable g(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        azqc.a(runtimeException, th);
        return runtimeException;
    }

    public static final void h(azrd azrdVar, Throwable th) {
        azrdVar.getClass();
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) azrdVar.get(CoroutineExceptionHandler.a);
            if (coroutineExceptionHandler == null) {
                azut.a(azrdVar, th);
            } else {
                coroutineExceptionHandler.handleException(azrdVar, th);
            }
        } catch (Throwable th2) {
            azut.a(azrdVar, g(th, th2));
        }
    }

    public static final Object i(Object obj) {
        Throwable a = azqh.a(obj);
        return a == null ? obj : new azuk(a);
    }
}
