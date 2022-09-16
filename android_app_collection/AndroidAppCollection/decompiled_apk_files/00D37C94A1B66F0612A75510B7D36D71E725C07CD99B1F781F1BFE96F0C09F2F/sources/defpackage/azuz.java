package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* compiled from: PG */
/* renamed from: azuz  reason: default package */
/* loaded from: classes2.dex */
public final class azuz extends azvh implements Runnable {
    private static volatile Thread _thread;
    public static final azuz b;
    private static volatile int debugStatus;
    private static final long g;

    static {
        Long l;
        azuz azuzVar = new azuz();
        b = azuzVar;
        azuzVar.f(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        g = timeUnit.toNanos(l.longValue());
    }

    private azuz() {
    }

    private final synchronized Thread n() {
        Thread thread = _thread;
        if (thread == null) {
            Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread2;
            thread2.setDaemon(true);
            thread2.start();
            return thread2;
        }
        return thread;
    }

    private final synchronized void o() {
        if (!q()) {
            return;
        }
        debugStatus = 3;
        aztu aztuVar = ((azvh) this).e;
        int i = aztv.a;
        aztuVar.a = null;
        this.f.a = null;
        notifyAll();
    }

    private final synchronized boolean p() {
        if (q()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private static final boolean q() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.azvg
    public final Thread c() {
        Thread thread = _thread;
        return thread == null ? n() : thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        azwe azweVar = azwe.a;
        azwe.b.set(this);
        try {
            if (!p()) {
                _thread = null;
                o();
                if (m()) {
                    return;
                }
                c();
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long k = k();
                if (k == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = g + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        o();
                        if (m()) {
                            return;
                        }
                        c();
                        return;
                    } else if (k > j2) {
                        k = j2;
                    }
                } else {
                    j = Long.MAX_VALUE;
                }
                if (k > 0) {
                    if (q()) {
                        _thread = null;
                        o();
                        if (m()) {
                            return;
                        }
                        c();
                        return;
                    }
                    LockSupport.parkNanos(this, k);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            o();
            if (!m()) {
                c();
            }
            throw th;
        }
    }
}
