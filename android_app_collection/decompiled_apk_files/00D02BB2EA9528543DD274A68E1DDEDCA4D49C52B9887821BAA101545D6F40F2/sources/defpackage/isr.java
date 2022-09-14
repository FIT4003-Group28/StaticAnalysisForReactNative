package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: isr  reason: default package */
/* loaded from: classes6.dex */
public final class isr implements bzgh {
    private static final long f = TimeUnit.SECONDS.toMillis(1);
    public final Executor a;
    public final Handler b;
    public boolean c;
    public final Runnable d;
    int e;
    private final bzge g;
    @dzsi
    private isq h;
    @dzsi
    private akqq i;
    private long j;
    private final isp k;

    public isr(Context context, Executor executor) {
        isp ispVar = new isp(context);
        Handler handler = new Handler(Looper.getMainLooper());
        this.g = new bzge();
        this.c = false;
        this.e = 1;
        this.h = null;
        this.i = null;
        this.j = f;
        this.d = new Runnable(this) { // from class: ism
            private final isr a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final isr isrVar = this.a;
                synchronized (isrVar) {
                    if (isrVar.e == 3) {
                        isrVar.e = 2;
                        isrVar.a.execute(new Runnable(isrVar) { // from class: iso
                            private final isr a;

                            {
                                this.a = isrVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.b();
                            }
                        });
                    }
                }
            }
        };
        this.a = executor;
        this.k = ispVar;
        this.b = handler;
    }

    public final synchronized boolean a(akqq akqqVar) {
        if (!akqqVar.equals(this.i) && !this.c) {
            this.i = akqqVar;
            this.j = f;
            if (this.e != 2) {
                this.e = 2;
                this.b.removeCallbacks(this.d);
                this.a.execute(new Runnable(this) { // from class: isn
                    private final isr a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                });
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        r10.e = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
        if (r3.isEmpty() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
        r2 = r3.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
        r10.h = new defpackage.isk(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
        r10.g.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r10 = this;
        L0:
            android.os.Handler r0 = r10.b
            java.lang.Runnable r1 = r10.d
            r0.removeCallbacks(r1)
            monitor-enter(r10)
            boolean r0 = r10.c     // Catch: java.lang.Throwable -> L95
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L27
            akqq r0 = r10.i     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L21
            isq r3 = r10.h     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L21
            isk r3 = (defpackage.isk) r3     // Catch: java.lang.Throwable -> L95
            akqq r3 = r3.a     // Catch: java.lang.Throwable -> L95
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L21
            goto L27
        L21:
            akqq r0 = r10.i     // Catch: java.lang.Throwable -> L95
            r3 = 2
            r10.e = r3     // Catch: java.lang.Throwable -> L95
            goto L2a
        L27:
            r10.e = r1     // Catch: java.lang.Throwable -> L95
            r0 = r2
        L2a:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L95
            if (r0 != 0) goto L37
            boolean r0 = r10.c
            if (r0 != 0) goto L36
            bzge r0 = r10.g
            r0.a()
        L36:
            return
        L37:
            isp r3 = r10.k     // Catch: java.io.IOException -> L77
            double r5 = r0.a     // Catch: java.io.IOException -> L77
            double r7 = r0.b     // Catch: java.io.IOException -> L77
            android.location.Geocoder r4 = r3.a     // Catch: java.io.IOException -> L77
            r9 = 1
            java.util.List r3 = r4.getFromLocation(r5, r7, r9)     // Catch: java.io.IOException -> L77
            long r4 = defpackage.isr.f
            r10.j = r4
            monitor-enter(r10)
            akqq r4 = r10.i     // Catch: java.lang.Throwable -> L74
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Throwable -> L74
            if (r4 != 0) goto L53
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L74
            goto L0
        L53:
            r10.e = r1     // Catch: java.lang.Throwable -> L74
            if (r3 == 0) goto L66
            boolean r1 = r3.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L5e
            goto L66
        L5e:
            r1 = 0
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Throwable -> L74
            r2 = r1
            android.location.Address r2 = (android.location.Address) r2     // Catch: java.lang.Throwable -> L74
        L66:
            isk r1 = new isk     // Catch: java.lang.Throwable -> L74
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L74
            r10.h = r1     // Catch: java.lang.Throwable -> L74
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L74
            bzge r0 = r10.g
            r0.a()
            return
        L74:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L74
            throw r0
        L77:
            r0 = move-exception
            r0.getMessage()
            monitor-enter(r10)
            r0 = 3
            r10.e = r0     // Catch: java.lang.Throwable -> L92
            android.os.Handler r0 = r10.b     // Catch: java.lang.Throwable -> L92
            java.lang.Runnable r1 = r10.d     // Catch: java.lang.Throwable -> L92
            long r2 = r10.j     // Catch: java.lang.Throwable -> L92
            r0.postDelayed(r1, r2)     // Catch: java.lang.Throwable -> L92
            long r0 = r10.j     // Catch: java.lang.Throwable -> L92
            r2 = 4
            long r0 = r0 * r2
            r10.j = r0     // Catch: java.lang.Throwable -> L92
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L92
            return
        L92:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L92
            throw r0
        L95:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L95
            goto L99
        L98:
            throw r0
        L99:
            goto L98
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isr.b():void");
    }

    @dzsi
    public final synchronized isq c() {
        return this.h;
    }

    @Override // defpackage.bzgh
    public final void d(bzgf bzgfVar, bzgj bzgjVar, @dzsi Executor executor) {
        this.g.b(bzgfVar, bzgjVar, executor);
    }
}
