package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvsy  reason: default package */
/* loaded from: classes5.dex */
public final class cvsy implements cvle {
    private final cvkf a;
    private final cvqi b;
    private final cvro c;
    private final cvmd d;
    private final cvsx e;
    private final cvmy f;

    public cvsy(cvkf cvkfVar, cvqi cvqiVar, cvro cvroVar, cvmy cvmyVar, cvmd cvmdVar, cvsx cvsxVar) {
        this.a = cvkfVar;
        this.b = cvqiVar;
        this.c = cvroVar;
        this.f = cvmyVar;
        this.d = cvmdVar;
        this.e = cvsxVar;
    }

    private final cviw a(dbsg<cvkc> dbsgVar) {
        cvmr a;
        cviw cviwVar;
        List<cvqh> b = this.b.b(dbsgVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (cvqh cvqhVar : b) {
            if (this.c.a(cvqhVar.c())) {
                arrayList.add(cvqhVar.a());
            } else {
                arrayList2.add(cvqhVar.a());
            }
        }
        if (!arrayList2.isEmpty()) {
            cvlw.b("OptimizedThreadScheduledEvaluator", "Optimized threads still postponed because of negative schedule evaluation: %s", arrayList2);
        }
        if (!arrayList.isEmpty()) {
            cvlw.b("OptimizedThreadScheduledEvaluator", "Presenting optimized threads because of good schedule evaluation: %s", arrayList);
            cvmy cvmyVar = this.f;
            String b2 = dbsgVar.a() ? dbsgVar.b().b() : null;
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            try {
                cvnc cvncVar = cvmyVar.f;
                dryy bZ = dryz.g.bZ();
                String a2 = cvncVar.a.a();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dryz dryzVar = (dryz) bZ.b;
                a2.getClass();
                dryzVar.a |= 1;
                dryzVar.b = a2;
                dsba b3 = cvncVar.c.b(b2);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dryz dryzVar2 = (dryz) bZ.b;
                b3.getClass();
                dryzVar2.d = b3;
                dryzVar2.a |= 2;
                dsau a3 = cvncVar.b.a();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dryz dryzVar3 = (dryz) bZ.b;
                a3.getClass();
                dryzVar3.e = a3;
                int i = dryzVar3.a | 4;
                dryzVar3.a = i;
                dryzVar3.f = 6;
                dryzVar3.a = i | 16;
                List asList = Arrays.asList(strArr);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dryz dryzVar4 = (dryz) bZ.b;
                dsrj<String> dsrjVar = dryzVar4.c;
                if (!dsrjVar.a()) {
                    dryzVar4.c = dsqw.cl(dsrjVar);
                }
                dsod.bv(asList, dryzVar4.c);
                dryz bK = bZ.bK();
                cvty<drzb> e = cvmyVar.b.e(b2, bK);
                cvmyVar.a(b2, e, 38);
                a = cvmr.f(bK, e);
            } catch (cvml e2) {
                cvmp g = cvmr.g();
                g.c = e2;
                g.b(true);
                a = g.a();
            }
            if (a.e()) {
                cvlw.e("OptimizedThreadScheduledEvaluator", "Failed fetching thread: %s", arrayList);
                if (a.d()) {
                    cviwVar = cviw.d(a.c());
                } else {
                    cviwVar = cviw.c(a.c());
                }
            } else {
                HashSet hashSet = new HashSet(arrayList);
                ArrayList arrayList3 = new ArrayList();
                for (dscr dscrVar : ((drzb) a.b()).a) {
                    dsed dsedVar = dscrVar.e;
                    if (dsedVar == null) {
                        dsedVar = dsed.e;
                    }
                    int a4 = dsdz.a(dsedVar.d);
                    if (a4 != 0 && a4 == 2) {
                        hashSet.remove(dscrVar.c);
                        arrayList3.add(cvkj.v(dscrVar));
                    }
                }
                if (!hashSet.isEmpty()) {
                    cvlw.b("OptimizedThreadScheduledEvaluator", "Optimized threads no longer relevant (not returned by fetchThreadsById or state not SHOW_IN_SYSTEM_TRAY): %s", hashSet);
                }
                this.b.e(dbsgVar, arrayList);
                if (!arrayList3.isEmpty()) {
                    this.d.a(dbsgVar.f(), arrayList3, cvix.d(), null);
                }
                cviwVar = cviw.a;
            }
            if (!cviwVar.equals(cviw.a)) {
                return cviwVar;
            }
        }
        return cviw.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r9.b.a(defpackage.dbsg.i(r1.next())) > 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(android.os.Bundle r10) {
        /*
            r9 = this;
            java.lang.String r0 = "EVALUATION_INTERVAL_MS"
            cvqi r1 = r9.b
            dbpy<java.lang.Object> r2 = defpackage.dbpy.a
            long r1 = r1.a(r2)
            r3 = 0
            java.lang.String r4 = "OptimizedThreadScheduledEvaluator"
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L14
            goto L38
        L14:
            cvkf r1 = r9.a
            java.util.List r1 = r1.a()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.next()
            cvkc r2 = (defpackage.cvkc) r2
            cvqi r7 = r9.b
            dbsg r2 = defpackage.dbsg.i(r2)
            long r7 = r7.a(r2)
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L1e
        L38:
            cvsx r1 = r9.e     // Catch: defpackage.cvno -> L4f
            android.os.Bundle r2 = defpackage.cvsx.d()     // Catch: defpackage.cvno -> L4f
            long r5 = r2.getLong(r0)     // Catch: defpackage.cvno -> L4f
            long r7 = r10.getLong(r0)     // Catch: defpackage.cvno -> L4f
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L4b
            return
        L4b:
            r1.c()     // Catch: defpackage.cvno -> L4f
            return
        L4f:
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r0 = "Failed syncing periodic job configuration."
            defpackage.cvlw.g(r4, r0, r10)
            return
        L57:
            cvsx r10 = r9.e     // Catch: defpackage.cvno -> L5d
            r10.b()     // Catch: defpackage.cvno -> L5d
            return
        L5d:
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r0 = "Failed stopping scheduled periodic job."
            defpackage.cvlw.e(r4, r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvsy.b(android.os.Bundle):void");
    }

    @Override // defpackage.cvle
    public final String c() {
        return "ON_QUALITY_EVALUATION";
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        r0 = defpackage.cviw.a;
     */
    @Override // defpackage.cvle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cviw d(android.os.Bundle r4) {
        /*
            r3 = this;
            boolean r0 = defpackage.dxxq.b()
            if (r0 != 0) goto L19
            cvsx r4 = r3.e     // Catch: defpackage.cvno -> Lc
            r4.b()     // Catch: defpackage.cvno -> Lc
            goto L16
        Lc:
            java.lang.String r4 = "OptimizedThreadScheduledEvaluator"
            java.lang.String r0 = "Failed cancelling periodic job."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            defpackage.cvlw.g(r4, r0, r1)
        L16:
            cviw r4 = defpackage.cviw.a
            return r4
        L19:
            dbpy<java.lang.Object> r0 = defpackage.dbpy.a     // Catch: java.lang.Throwable -> L5c
            cviw r0 = r3.a(r0)     // Catch: java.lang.Throwable -> L5c
            cviw r1 = defpackage.cviw.a     // Catch: java.lang.Throwable -> L5c
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L51
            cvkf r0 = r3.a     // Catch: java.lang.Throwable -> L5c
            java.util.List r0 = r0.a()     // Catch: java.lang.Throwable -> L5c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5c
        L31:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L5c
            cvkc r1 = (defpackage.cvkc) r1     // Catch: java.lang.Throwable -> L5c
            dbsg r1 = defpackage.dbsg.i(r1)     // Catch: java.lang.Throwable -> L5c
            cviw r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L5c
            cviw r2 = defpackage.cviw.a     // Catch: java.lang.Throwable -> L5c
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> L5c
            if (r2 != 0) goto L31
            r0 = r1
            goto L51
        L4f:
            cviw r0 = defpackage.cviw.a     // Catch: java.lang.Throwable -> L5c
        L51:
            cvsx r1 = r3.e
            monitor-enter(r1)
            r3.b(r4)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            return r0
        L59:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            throw r4
        L5c:
            r0 = move-exception
            cvsx r1 = r3.e
            monitor-enter(r1)
            r3.b(r4)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L65
            throw r0
        L65:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L65
            goto L69
        L68:
            throw r4
        L69:
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvsy.d(android.os.Bundle):cviw");
    }
}
