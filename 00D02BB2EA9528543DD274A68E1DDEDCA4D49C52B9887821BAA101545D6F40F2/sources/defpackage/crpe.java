package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crpe  reason: default package */
/* loaded from: classes5.dex */
public final class crpe {
    private static final long a = TimeUnit.HOURS.toMillis(1);
    private static final Comparator<djos> m = crpc.a;
    private final ckcw b;
    private final dehq c;
    private final crpm d;
    private final Map<djos, btzc> e = new dzqz();
    private final List<djos> f = new ArrayList();
    private final List<djos> g = new ArrayList();
    private final ArrayList<djos> h = new ArrayList<>();
    private boolean i;
    private int j;
    private long k;
    private int l;
    private final buwx n;

    public crpe(boolean z, ckcw ckcwVar, dehq dehqVar, crpm crpmVar, buwv buwvVar) {
        this.b = ckcwVar;
        this.c = dehqVar;
        this.d = crpmVar;
        btyr bZ = btys.f.bZ();
        long j = crpmVar.a.H;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        btys btysVar = (btys) bZ.b;
        btysVar.a |= 4;
        btysVar.d = j;
        btys bK = bZ.bK();
        synchronized (buwvVar) {
            buac a2 = buwvVar.a();
            a2.c(bK);
            btyq btyqVar = buwvVar.a().a().a;
            dsqp dsqpVar = (dsqp) btyqVar.cu(5);
            dsqpVar.bC(btyqVar);
            btyp btypVar = (btyp) dsqpVar;
            if (btypVar.c) {
                btypVar.bF();
                btypVar.c = false;
            }
            btyq btyqVar2 = (btyq) btypVar.b;
            btyqVar2.a |= 1;
            btyqVar2.b = z;
            a2.a = btypVar.bK();
            this.n = buwvVar.c();
        }
    }

    public static long a(djos djosVar) {
        ddvw ddvwVar;
        ddvw ddvwVar2;
        ddvs ddvsVar;
        ddvy ddvyVar;
        if ((djosVar.a & 2) != 0) {
            ddwb ddwbVar = djosVar.c;
            if (ddwbVar == null) {
                ddwbVar = ddwb.e;
            }
            if (ddwbVar.c.size() != 0) {
                ddwb ddwbVar2 = djosVar.c;
                if (ddwbVar2 == null) {
                    ddwbVar2 = ddwb.e;
                }
                ddvu ddvuVar = ddwbVar2.c.get(0);
                int i = ddvuVar.a;
                int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 4 : 3 : 2 : 1 : 5;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                if (i3 == 0) {
                    if (i == 1) {
                        ddvwVar = (ddvw) ddvuVar.b;
                    } else {
                        ddvwVar = ddvw.b;
                    }
                    if (ddvwVar.a.size() == 0) {
                        return Long.MIN_VALUE;
                    }
                    if (ddvuVar.a == 1) {
                        ddvwVar2 = (ddvw) ddvuVar.b;
                    } else {
                        ddvwVar2 = ddvw.b;
                    }
                    return ddvwVar2.a.get(0).d;
                } else if (i3 == 1) {
                    if (i == 2) {
                        ddvsVar = (ddvs) ddvuVar.b;
                    } else {
                        ddvsVar = ddvs.g;
                    }
                    dstv dstvVar = ddvsVar.e;
                    if (dstvVar == null) {
                        dstvVar = dstv.c;
                    }
                    return dsvb.b(dstvVar);
                } else if (i3 != 3) {
                    return Long.MIN_VALUE;
                } else {
                    if (i == 4) {
                        ddvyVar = (ddvy) ddvuVar.b;
                    } else {
                        ddvyVar = ddvy.b;
                    }
                    dstv dstvVar2 = ddvyVar.a;
                    if (dstvVar2 == null) {
                        dstvVar2 = dstv.c;
                    }
                    return dsvb.b(dstvVar2);
                }
            }
        }
        return Long.MIN_VALUE;
    }

    private final synchronized void j(djos djosVar, btzc btzcVar) {
        this.e.put(djosVar, btzcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(djos djosVar) {
        int binarySearch = Collections.binarySearch(this.h, djosVar, m);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 1);
        }
        this.h.add(binarySearch, djosVar);
        this.h.size();
    }

    public final synchronized void c(djos djosVar) {
        ((ckcm) this.b.a(ckhj.j)).a(true);
        this.f.add(djosVar);
        this.j++;
        long j = this.k;
        int i = djosVar.bE;
        if (i == -1) {
            i = dsst.a.b(djosVar).e(djosVar);
            djosVar.bE = i;
        }
        this.k = j + i;
    }

    public final synchronized void d(djos djosVar, btzy btzyVar) {
        ((ckcm) this.b.a(ckhj.j)).a(false);
        ((ckco) this.b.a(ckhj.k)).a(btzyVar.p.ordinal());
        if (!this.i) {
            this.f.add(djosVar);
            this.g.add(djosVar);
        }
        this.l++;
    }

    final synchronized int e() {
        if (!this.f.isEmpty()) {
            this.f.size();
            ((dznt) this.e).keySet().removeAll(this.f);
            this.f.clear();
        }
        return ((dzqz) this.e).h;
    }

    final synchronized int f() {
        if (!this.g.isEmpty()) {
            this.g.size();
            for (djos djosVar : this.g) {
                b(djosVar);
            }
            this.g.clear();
        }
        return this.h.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
        if (r9 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
        ((defpackage.ckcn) r6.b.a(defpackage.ckhj.l)).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(long r7, boolean r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            bvrj r0 = defpackage.bvrj.NAVIGATION_INTERNAL     // Catch: java.lang.Throwable -> Lc1
            r0.c()     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = r6.i     // Catch: java.lang.Throwable -> Lc1
            r0 = r0 ^ 1
            defpackage.dbsk.l(r0)     // Catch: java.lang.Throwable -> Lc1
            int r0 = r6.f()     // Catch: java.lang.Throwable -> Lc1
            if (r0 != 0) goto L15
            monitor-exit(r6)
            return
        L15:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Lc1
            crpm r1 = r6.d     // Catch: java.lang.Throwable -> Lc1
            ddww r1 = r1.a     // Catch: java.lang.Throwable -> Lc1
            int r1 = r1.h     // Catch: java.lang.Throwable -> Lc1
            long r1 = (long) r1     // Catch: java.lang.Throwable -> Lc1
            long r0 = r0.toMillis(r1)     // Catch: java.lang.Throwable -> Lc1
            long r0 = r7 - r0
        L24:
            java.util.ArrayList<djos> r2 = r6.h     // Catch: java.lang.Throwable -> Lc1
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lc1
            r3 = 0
            if (r2 != 0) goto L63
            java.util.ArrayList<djos> r2 = r6.h     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> Lc1
            djos r2 = (defpackage.djos) r2     // Catch: java.lang.Throwable -> Lc1
            long r4 = a(r2)     // Catch: java.lang.Throwable -> Lc1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L63
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Lc1
            java.util.ArrayList<djos> r4 = r6.h     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> Lc1
            djos r4 = (defpackage.djos) r4     // Catch: java.lang.Throwable -> Lc1
            long r4 = a(r4)     // Catch: java.lang.Throwable -> Lc1
            long r4 = r7 - r4
            r2.toSeconds(r4)     // Catch: java.lang.Throwable -> Lc1
            java.util.ArrayList<djos> r2 = r6.h     // Catch: java.lang.Throwable -> Lc1
            r2.remove(r3)     // Catch: java.lang.Throwable -> Lc1
            ckcw r2 = r6.b     // Catch: java.lang.Throwable -> Lc1
            ckgu r3 = defpackage.ckhj.m     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r2 = r2.a(r3)     // Catch: java.lang.Throwable -> Lc1
            ckcn r2 = (defpackage.ckcn) r2     // Catch: java.lang.Throwable -> Lc1
            r2.a()     // Catch: java.lang.Throwable -> Lc1
            goto L24
        L63:
            java.util.ArrayList<djos> r7 = r6.h     // Catch: java.lang.Throwable -> Lc1
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> Lc1
            if (r7 != 0) goto Lbf
            java.util.ArrayList<djos> r7 = r6.h     // Catch: java.lang.Throwable -> Lc1
            int r7 = r7.size()     // Catch: java.lang.Throwable -> Lc1
            r8 = -1
            int r7 = r7 + r8
            java.util.ArrayList<djos> r0 = r6.h     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> Lc1
            djos r0 = (defpackage.djos) r0     // Catch: java.lang.Throwable -> Lc1
            int r1 = r6.e()     // Catch: java.lang.Throwable -> Lc1
            crpm r2 = r6.d     // Catch: java.lang.Throwable -> Lc1
            ddww r2 = r2.a     // Catch: java.lang.Throwable -> Lc1
            int r2 = r2.G     // Catch: java.lang.Throwable -> Lc1
            if (r1 < r2) goto L98
            if (r9 == 0) goto Lbf
            ckcw r7 = r6.b     // Catch: java.lang.Throwable -> Lc1
            ckgu r8 = defpackage.ckhj.l     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r7 = r7.a(r8)     // Catch: java.lang.Throwable -> Lc1
            ckcn r7 = (defpackage.ckcn) r7     // Catch: java.lang.Throwable -> Lc1
            r7.a()     // Catch: java.lang.Throwable -> Lc1
            monitor-exit(r6)
            return
        L98:
            int r9 = r0.bE     // Catch: java.lang.Throwable -> Lc1
            if (r9 != r8) goto La8
            dsst r8 = defpackage.dsst.a     // Catch: java.lang.Throwable -> Lc1
            dstc r8 = r8.b(r0)     // Catch: java.lang.Throwable -> Lc1
            int r8 = r8.e(r0)     // Catch: java.lang.Throwable -> Lc1
            r0.bE = r8     // Catch: java.lang.Throwable -> Lc1
        La8:
            buwx r8 = r6.n     // Catch: java.lang.Throwable -> Lc1
            crpd r9 = new crpd     // Catch: java.lang.Throwable -> Lc1
            r9.<init>(r6)     // Catch: java.lang.Throwable -> Lc1
            dehq r1 = r6.c     // Catch: java.lang.Throwable -> Lc1
            btzc r8 = r8.b(r0, r9, r1)     // Catch: java.lang.Throwable -> Lc1
            r6.j(r0, r8)     // Catch: java.lang.Throwable -> Lc1
            java.util.ArrayList<djos> r8 = r6.h     // Catch: java.lang.Throwable -> Lc1
            r8.remove(r7)     // Catch: java.lang.Throwable -> Lc1
            r9 = 0
            goto L63
        Lbf:
            monitor-exit(r6)
            return
        Lc1:
            r7 = move-exception
            monitor-exit(r6)
            goto Lc5
        Lc4:
            throw r7
        Lc5:
            goto Lc4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crpe.g(long, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void h() {
        dbsk.l(!this.i);
        this.i = true;
        ((ckcn) this.b.a(ckhj.n)).b(e() + f());
        this.h.clear();
        dzrn it = ((dzqr) ((dznt) this.e).values()).iterator();
        while (it.hasNext()) {
            ((btzc) it.next()).a();
        }
        this.e.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i(StringBuilder sb, long j) {
        if (j == 0) {
            return;
        }
        int e = e();
        int f = f();
        sb.append(", GWS successful rpcs: ");
        sb.append(this.j);
        sb.append(" (");
        long j2 = a;
        sb.append((this.j * j2) / j);
        sb.append(" per hour)");
        sb.append(", GWS successful bytes: ");
        sb.append(this.k);
        sb.append(" (");
        sb.append((this.k * j2) / j);
        sb.append(" per hour)");
        sb.append(", GWS failed rpcs: ");
        sb.append(this.l);
        sb.append(" (");
        sb.append((this.l * j2) / j);
        sb.append(" per hour)");
        sb.append(", GWS in-flight rpcs: ");
        sb.append(e);
        sb.append(", GWS pending requests: ");
        sb.append(f);
    }
}
