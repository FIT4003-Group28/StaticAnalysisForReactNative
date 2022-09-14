package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: deix  reason: default package */
/* loaded from: classes.dex */
public final class deix {
    public static void a(CountDownLatch countDownLatch) {
        boolean z = false;
        while (true) {
            try {
                countDownLatch.await();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static <V> V b(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(long r4, java.util.concurrent.TimeUnit r6) {
        /*
            r0 = 1
            r1 = 0
            long r4 = r6.toNanos(r4)     // Catch: java.lang.Throwable -> L27
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L27
            long r2 = r2 + r4
        Lb:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            r6.sleep(r4)     // Catch: java.lang.Throwable -> L1a java.lang.InterruptedException -> L1d
            if (r1 == 0) goto L19
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L19:
            return
        L1a:
            r4 = move-exception
            r0 = r1
            goto L29
        L1d:
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L25
            long r4 = r2 - r4
            r1 = 1
            goto Lb
        L25:
            r4 = move-exception
            goto L29
        L27:
            r4 = move-exception
            r0 = 0
        L29:
            if (r0 == 0) goto L32
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L32:
            goto L34
        L33:
            throw r4
        L34:
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deix.c(long, java.util.concurrent.TimeUnit):void");
    }
}
