package defpackage;

import java.io.InterruptedIOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aezq  reason: default package */
/* loaded from: classes.dex */
public final class aezq {
    private final long b;
    private CyclicBarrier d;
    private final Set a = new HashSet();
    private final Set c = new HashSet();
    private long e = -1;

    public aezq(long j) {
        this.b = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(aeze aezeVar, long j) {
        synchronized (this) {
            if (!this.c.contains(aezeVar)) {
                return j;
            }
            if (this.d == null) {
                this.d = new CyclicBarrier(this.c.size());
            }
            long j2 = this.e;
            if (j2 == -1 || j2 < j) {
                this.e = j;
            }
            try {
                long j3 = this.b;
                if (j3 > 0) {
                    this.d.await(j3, TimeUnit.MILLISECONDS);
                } else {
                    this.d.await();
                }
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (BrokenBarrierException | TimeoutException unused2) {
            }
            synchronized (this) {
                this.d = null;
                this.c.clear();
            }
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized long b(long j) {
        for (aeze aezeVar : this.a) {
            long k = aezeVar.k(j);
            if (k != -1) {
                return k;
            }
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(aeze aezeVar) {
        CyclicBarrier cyclicBarrier = this.d;
        if (cyclicBarrier != null) {
            cyclicBarrier.reset();
            this.d = null;
        }
        this.a.add(aezeVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        CyclicBarrier cyclicBarrier = this.d;
        if (cyclicBarrier != null) {
            cyclicBarrier.reset();
            this.d = null;
        }
        this.c.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(aeze aezeVar) {
        CyclicBarrier cyclicBarrier = this.d;
        if (cyclicBarrier != null) {
            cyclicBarrier.reset();
            this.d = null;
        }
        this.a.remove(aezeVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(aeze aezeVar) {
        if (this.a.contains(aezeVar)) {
            CyclicBarrier cyclicBarrier = this.d;
            if (cyclicBarrier != null) {
                cyclicBarrier.reset();
                this.d = null;
            }
            this.c.add(aezeVar);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
