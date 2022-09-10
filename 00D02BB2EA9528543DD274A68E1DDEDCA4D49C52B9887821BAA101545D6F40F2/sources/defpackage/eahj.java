package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eahj  reason: default package */
/* loaded from: classes6.dex */
public final class eahj implements eajy {
    public final eaiz a = new eaiz();
    public final eaiz b = new eaiz();
    public final long c;
    boolean d;
    boolean e;
    final /* synthetic */ eahl f;

    public eahj(eahl eahlVar, long j) {
        this.f = eahlVar;
        this.c = j;
    }

    private final void c(long j) {
        this.f.d.d(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    @Override // defpackage.eajy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Te(defpackage.eaiz r13, long r14) {
        /*
            r12 = this;
        L0:
            eahl r14 = r12.f
            monitor-enter(r14)
            eahl r15 = r12.f     // Catch: java.lang.Throwable -> L9b
            eahk r15 = r15.i     // Catch: java.lang.Throwable -> L9b
            r15.d()     // Catch: java.lang.Throwable -> L9b
            eahl r15 = r12.f     // Catch: java.lang.Throwable -> L92
            int r0 = r15.k     // Catch: java.lang.Throwable -> L92
            r1 = 0
            if (r0 != 0) goto L12
            r0 = 0
        L12:
            boolean r2 = r12.d     // Catch: java.lang.Throwable -> L92
            if (r2 != 0) goto L8a
            java.util.Deque<eadx> r15 = r15.e     // Catch: java.lang.Throwable -> L92
            r15.isEmpty()     // Catch: java.lang.Throwable -> L92
            eaiz r15 = r12.b     // Catch: java.lang.Throwable -> L92
            long r2 = r15.b     // Catch: java.lang.Throwable -> L92
            r4 = 0
            r6 = -1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L5b
            r8 = 8192(0x2000, double:4.0474E-320)
            long r2 = java.lang.Math.min(r8, r2)     // Catch: java.lang.Throwable -> L92
            long r2 = r15.Te(r13, r2)     // Catch: java.lang.Throwable -> L92
            eahl r13 = r12.f     // Catch: java.lang.Throwable -> L92
            long r8 = r13.a     // Catch: java.lang.Throwable -> L92
            long r8 = r8 + r2
            r13.a = r8     // Catch: java.lang.Throwable -> L92
            if (r0 != 0) goto L59
            eahe r13 = r13.d     // Catch: java.lang.Throwable -> L92
            eahr r13 = r13.m     // Catch: java.lang.Throwable -> L92
            int r13 = r13.d()     // Catch: java.lang.Throwable -> L92
            int r13 = r13 / 2
            long r10 = (long) r13     // Catch: java.lang.Throwable -> L92
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 < 0) goto L71
            eahl r13 = r12.f     // Catch: java.lang.Throwable -> L92
            eahe r15 = r13.d     // Catch: java.lang.Throwable -> L92
            int r0 = r13.c     // Catch: java.lang.Throwable -> L92
            long r8 = r13.a     // Catch: java.lang.Throwable -> L92
            r15.f(r0, r8)     // Catch: java.lang.Throwable -> L92
            eahl r13 = r12.f     // Catch: java.lang.Throwable -> L92
            r13.a = r4     // Catch: java.lang.Throwable -> L92
            goto L71
        L59:
            r1 = r0
            goto L71
        L5b:
            boolean r15 = r12.e     // Catch: java.lang.Throwable -> L92
            if (r15 != 0) goto L6f
            if (r0 != 0) goto L6f
            eahl r15 = r12.f     // Catch: java.lang.Throwable -> L92
            r15.i()     // Catch: java.lang.Throwable -> L92
            eahl r15 = r12.f     // Catch: java.lang.Throwable -> L9b
            eahk r15 = r15.i     // Catch: java.lang.Throwable -> L9b
            r15.c()     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L9b
            goto L0
        L6f:
            r1 = r0
            r2 = r6
        L71:
            eahl r13 = r12.f     // Catch: java.lang.Throwable -> L9b
            eahk r13 = r13.i     // Catch: java.lang.Throwable -> L9b
            r13.c()     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L9b
            int r13 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r13 == 0) goto L81
            r12.c(r2)
            return r2
        L81:
            if (r1 != 0) goto L84
            return r6
        L84:
            eahs r13 = new eahs
            r13.<init>(r1)
            throw r13
        L8a:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L92
            java.lang.String r15 = "stream closed"
            r13.<init>(r15)     // Catch: java.lang.Throwable -> L92
            throw r13     // Catch: java.lang.Throwable -> L92
        L92:
            r13 = move-exception
            eahl r15 = r12.f     // Catch: java.lang.Throwable -> L9b
            eahk r15 = r15.i     // Catch: java.lang.Throwable -> L9b
            r15.c()     // Catch: java.lang.Throwable -> L9b
            throw r13     // Catch: java.lang.Throwable -> L9b
        L9b:
            r13 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L9b
            goto L9f
        L9e:
            throw r13
        L9f:
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eahj.Te(eaiz, long):long");
    }

    @Override // defpackage.eajy
    public final eaka b() {
        return this.f.i;
    }

    @Override // defpackage.eajy, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        synchronized (this.f) {
            this.d = true;
            eaiz eaizVar = this.b;
            j = eaizVar.b;
            eaizVar.z();
            this.f.e.isEmpty();
            this.f.notifyAll();
        }
        if (j > 0) {
            c(j);
        }
        this.f.f();
    }
}
