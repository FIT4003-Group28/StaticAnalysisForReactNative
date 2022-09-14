package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvqe  reason: default package */
/* loaded from: classes5.dex */
public final class cvqe implements cvpv {
    private final cvkf a;
    private final cvqi b;
    private final cvro c;
    private final cvsx d;

    public cvqe(cvkf cvkfVar, cvqi cvqiVar, cvsx cvsxVar, cvro cvroVar) {
        this.a = cvkfVar;
        this.b = cvqiVar;
        this.d = cvsxVar;
        this.c = cvroVar;
    }

    private final void h(@dzsi cvkc cvkcVar, List<String> list) {
        if (this.b.e(dbsg.j(cvkcVar), list)) {
            i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        r7.d.b();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i() {
        /*
            r7 = this;
            cvsx r0 = r7.d
            monitor-enter(r0)
            cvqi r1 = r7.b     // Catch: java.lang.Throwable -> L49
            dbpy<java.lang.Object> r2 = defpackage.dbpy.a     // Catch: java.lang.Throwable -> L49
            long r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L49
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L12
            goto L47
        L12:
            cvkf r1 = r7.a     // Catch: java.lang.Throwable -> L49
            java.util.List r1 = r1.a()     // Catch: java.lang.Throwable -> L49
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L49
        L1c:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L49
            cvkc r2 = (defpackage.cvkc) r2     // Catch: java.lang.Throwable -> L49
            cvqi r5 = r7.b     // Catch: java.lang.Throwable -> L49
            dbsg r2 = defpackage.dbsg.i(r2)     // Catch: java.lang.Throwable -> L49
            long r5 = r5.a(r2)     // Catch: java.lang.Throwable -> L49
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L1c
            goto L47
        L37:
            cvsx r1 = r7.d     // Catch: defpackage.cvno -> L3d java.lang.Throwable -> L49
            r1.b()     // Catch: defpackage.cvno -> L3d java.lang.Throwable -> L49
            goto L47
        L3d:
            java.lang.String r1 = "QualityPlugin"
            java.lang.String r2 = "Failed stopping scheduled periodic job."
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L49
            defpackage.cvlw.e(r1, r2, r3)     // Catch: java.lang.Throwable -> L49
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            return
        L49:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            goto L4d
        L4c:
            throw r1
        L4d:
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvqe.i():void");
    }

    @Override // defpackage.cvpv
    public final void a() {
    }

    @Override // defpackage.cvpv
    public final void b(@dzsi cvkc cvkcVar) {
        if (this.b.d(dbsg.j(cvkcVar))) {
            i();
        }
    }

    @Override // defpackage.cvpv
    public final void c(@dzsi cvkc cvkcVar, long j) {
        if (this.b.f(dbsg.j(cvkcVar), j)) {
            i();
        }
    }

    @Override // defpackage.cvpv
    public final int d(@dzsi cvkc cvkcVar, cvkj cvkjVar) {
        if (!dxxq.b()) {
            cvlw.b("QualityPlugin", "Not intercepting thread %s: QualityOptimizationFeature.enabled is false.", cvkjVar.a());
            return 1;
        }
        dbsg<cvkc> j = dbsg.j(cvkcVar);
        dbsg<cvqh> c = this.b.c(j, cvkjVar.a());
        if (c.a()) {
            if (c.b().b().longValue() >= cvkjVar.b().longValue()) {
                cvlw.b("QualityPlugin", "Postponing thread %s: Thread already in storage.", cvkjVar.a());
                return 2;
            }
            h(j.f(), Collections.singletonList(cvkjVar.a()));
        }
        dsfr m = cvkjVar.m();
        if (m == null) {
            cvlw.b("QualityPlugin", "Not intercepting thread %s: Thread has no schedule.", cvkjVar.a());
            return 1;
        } else if (this.c.a(m)) {
            cvlw.b("QualityPlugin", "Not intercepting thread %s: Schedule is good.", cvkjVar.a());
            return 1;
        } else {
            synchronized (this.d) {
                try {
                    try {
                        boolean a = this.d.a();
                        dbsk.s(cvkjVar);
                        dbsk.s(cvkjVar.m());
                        cvqf d = cvqh.d();
                        d.b(cvkjVar.a());
                        d.c(cvkjVar.b());
                        d.d(cvkjVar.m());
                        int g = this.b.g(j, d.a());
                        if (g == 0) {
                            throw null;
                        }
                        if (g != 4) {
                            cvlw.b("QualityPlugin", "Postponing optimized thread %s.", cvkjVar.a());
                            return 2;
                        }
                        if (a) {
                            try {
                                this.d.b();
                            } catch (cvno unused) {
                                cvlw.e("QualityPlugin", "Failed reverting scheduled periodic job.", new Object[0]);
                            }
                        }
                        cvlw.b("QualityPlugin", "Not intercepting thread %s: Failed inserting to storage.", cvkjVar.a());
                        return 1;
                    } catch (cvno unused2) {
                        cvlw.g("QualityPlugin", "Failed scheduling periodic job.", new Object[0]);
                        return 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.cvpv
    public final void e() {
    }

    @Override // defpackage.cvpv
    public final void f() {
    }

    @Override // defpackage.cvpv
    public final void g(@dzsi cvkc cvkcVar, List<String> list, dsef dsefVar) {
        int a;
        int a2 = dsdz.a(dsefVar.e);
        if ((a2 != 0 && a2 == 3) || ((a = dscl.a(dsefVar.c)) != 0 && a == 3)) {
            h(cvkcVar, list);
        }
    }
}
