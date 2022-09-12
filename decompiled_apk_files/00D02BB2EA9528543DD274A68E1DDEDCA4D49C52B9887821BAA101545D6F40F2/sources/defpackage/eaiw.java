package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: eaiw  reason: default package */
/* loaded from: classes6.dex */
public class eaiw extends eaka {
    public static final long b;
    public static final long c;
    @dzsi
    static eaiw d;
    private boolean a;
    @dzsi
    public eaiw e;
    private long i;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        b = millis;
        c = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    private static synchronized void j(eaiw eaiwVar, long j, boolean z) {
        synchronized (eaiw.class) {
            if (d == null) {
                d = new eaiw();
                new eaiv().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                eaiwVar.i = Math.min(j, eaiwVar.n() - nanoTime) + nanoTime;
            } else if (j != 0) {
                eaiwVar.i = j + nanoTime;
            } else if (z) {
                eaiwVar.i = eaiwVar.n();
            } else {
                throw new AssertionError();
            }
            long f = eaiwVar.f(nanoTime);
            eaiw eaiwVar2 = d;
            while (true) {
                eaiw eaiwVar3 = eaiwVar2.e;
                if (eaiwVar3 == null || f < eaiwVar3.f(nanoTime)) {
                    break;
                }
                eaiwVar2 = eaiwVar2.e;
            }
            eaiwVar.e = eaiwVar2.e;
            eaiwVar2.e = eaiwVar;
            if (eaiwVar2 == d) {
                eaiw.class.notify();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000d, code lost:
        r1.e = r3.e;
        r3.e = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized boolean k(defpackage.eaiw r3) {
        /*
            java.lang.Class<eaiw> r0 = defpackage.eaiw.class
            monitor-enter(r0)
            eaiw r1 = defpackage.eaiw.d     // Catch: java.lang.Throwable -> L19
        L5:
            if (r1 == 0) goto L17
            eaiw r2 = r1.e     // Catch: java.lang.Throwable -> L19
            if (r2 == r3) goto Ld
            r1 = r2
            goto L5
        Ld:
            eaiw r2 = r3.e     // Catch: java.lang.Throwable -> L19
            r1.e = r2     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r3.e = r1     // Catch: java.lang.Throwable -> L19
            r3 = 0
        L15:
            monitor-exit(r0)
            return r3
        L17:
            r3 = 1
            goto L15
        L19:
            r3 = move-exception
            monitor-exit(r0)
            goto L1d
        L1c:
            throw r3
        L1d:
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eaiw.k(eaiw):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public IOException b(@dzsi IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void d() {
        if (!this.a) {
            long m = m();
            boolean s = s();
            if (m == 0 && !s) {
                return;
            }
            this.a = true;
            j(this, m, s);
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean e() {
        if (!this.a) {
            return false;
        }
        this.a = false;
        return k(this);
    }

    public final long f(long j) {
        return this.i - j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(boolean z) {
        if (!e() || !z) {
            return;
        }
        throw b(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final IOException h(IOException iOException) {
        return !e() ? iOException : b(iOException);
    }
}
