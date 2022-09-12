package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: eahe  reason: default package */
/* loaded from: classes6.dex */
public final class eahe implements Closeable {
    public static final ExecutorService a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), eafa.h("OkHttp Http2Connection", true));
    final boolean b;
    final eagy c;
    final String e;
    int f;
    int g;
    boolean h;
    public final ScheduledExecutorService i;
    public boolean j;
    long l;
    public final eahr m;
    final eahr n;
    boolean o;
    final Socket p;
    public final eahm q;
    public final eahd r;
    final Set<Integer> s;
    private final ExecutorService t;
    final Map<Integer, eahl> d = new LinkedHashMap();
    long k = 0;

    public eahe(eagw eagwVar) {
        eahr eahrVar = new eahr();
        this.m = eahrVar;
        eahr eahrVar2 = new eahr();
        this.n = eahrVar2;
        this.o = false;
        this.s = new LinkedHashSet();
        this.b = true;
        this.c = eagwVar.e;
        this.g = 3;
        eahrVar.e(7, 16777216);
        String str = eagwVar.b;
        this.e = str;
        this.i = new ScheduledThreadPoolExecutor(1, eafa.h(eafa.v("OkHttp %s Writer", str), false));
        this.t = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), eafa.h(eafa.v("OkHttp %s Push Observer", str), true));
        eahrVar2.e(7, 65535);
        eahrVar2.e(5, 16384);
        this.l = eahrVar2.d();
        this.p = eagwVar.a;
        this.q = new eahm(eagwVar.d);
        this.r = new eahd(this, new eahh(eagwVar.c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean q(int i) {
        return (i & 1) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized eahl a(int i) {
        return this.d.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized eahl b(int i) {
        eahl remove;
        remove = this.d.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public final synchronized int c() {
        eahr eahrVar = this.n;
        if ((eahrVar.a & 16) != 0) {
            return eahrVar.b[4];
        }
        return Integer.MAX_VALUE;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        p(1, 9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(long j) {
        long j2 = this.k + j;
        this.k = j2;
        if (j2 >= this.m.d() / 2) {
            f(0, this.k);
            this.k = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.q.a);
        r6 = r3;
        r8.l -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r9, boolean r10, defpackage.eaiz r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 == 0) goto L60
        L7:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L5f
            monitor-enter(r8)
        Lc:
            long r3 = r8.l     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L2a
            java.util.Map<java.lang.Integer, eahl> r3 = r8.d     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
            if (r3 == 0) goto L22
            r8.wait()     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
            goto Lc
        L22:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
            throw r9     // Catch: java.lang.Throwable -> L4e java.lang.InterruptedException -> L50
        L2a:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L4e
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L4e
            eahm r3 = r8.q     // Catch: java.lang.Throwable -> L4e
            int r3 = r3.a     // Catch: java.lang.Throwable -> L4e
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L4e
            long r4 = r8.l     // Catch: java.lang.Throwable -> L4e
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L4e
            long r4 = r4 - r6
            r8.l = r4     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4e
            long r12 = r12 - r6
            eahm r4 = r8.q
            if (r10 == 0) goto L49
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L49
            r5 = 1
            goto L4a
        L49:
            r5 = 0
        L4a:
            r4.d(r5, r9, r11, r3)
            goto L7
        L4e:
            r9 = move-exception
            goto L5d
        L50:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L4e
            r9.interrupt()     // Catch: java.lang.Throwable -> L4e
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L4e
            r9.<init>()     // Catch: java.lang.Throwable -> L4e
            throw r9     // Catch: java.lang.Throwable -> L4e
        L5d:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4e
            throw r9
        L5f:
            return
        L60:
            eahm r12 = r8.q
            r12.d(r10, r9, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eahe.e(int, boolean, eaiz, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i, long j) {
        try {
            this.i.execute(new eagr(this, new Object[]{this.e, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void g() {
        this.q.c();
    }

    public final void h() {
        try {
            p(2, 2);
        } catch (IOException unused) {
        }
    }

    public final synchronized boolean i() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i, List<eagj> list) {
        synchronized (this) {
            Set<Integer> set = this.s;
            Integer valueOf = Integer.valueOf(i);
            if (set.contains(valueOf)) {
                m(i, 2);
                return;
            }
            this.s.add(valueOf);
            try {
                l(new eags(this, new Object[]{this.e, valueOf}, i));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(int i, List<eagj> list, boolean z) {
        try {
            l(new eagt(this, new Object[]{this.e, Integer.valueOf(i)}, i));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final synchronized void l(eaex eaexVar) {
        if (!i()) {
            this.t.execute(eaexVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(int i, int i2) {
        try {
            this.i.execute(new eagq(this, new Object[]{this.e, Integer.valueOf(i)}, i, i2));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(int i, int i2) {
        this.q.i(i, i2);
    }

    public final void o(int i) {
        synchronized (this.q) {
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.h = true;
                this.q.j(this.f, i, eafa.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(int i, int i2) {
        eahl[] eahlVarArr;
        try {
            o(i);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.d.isEmpty()) {
                eahlVarArr = (eahl[]) this.d.values().toArray(new eahl[this.d.size()]);
                this.d.clear();
            } else {
                eahlVarArr = null;
            }
        }
        if (eahlVarArr != null) {
            for (eahl eahlVar : eahlVarArr) {
                try {
                    eahlVar.j(i2);
                } catch (IOException e2) {
                    e = e != null ? e2 : null;
                }
            }
        }
        try {
            this.q.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.p.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.i.shutdown();
        this.t.shutdown();
        if (e == null) {
            return;
        }
        throw e;
    }
}
