package defpackage;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: alzn  reason: default package */
/* loaded from: classes.dex */
public final class alzn {
    public final dehq b;
    public final ckcw c;
    private final btzo<dmxh, dmxv> e;
    private List<alzr> g;
    private final alzj h;
    public final dcae<ckjk> a = new dcae<>(new ConcurrentHashMap());
    private final AtomicInteger d = new AtomicInteger(0);
    private final Map<dbsi<akry, alyh>, List<alzr>> f = new HashMap();

    public alzn(dehq dehqVar, btzo btzoVar, alzj alzjVar, btys btysVar, ckcw ckcwVar) {
        this.b = dehqVar;
        this.e = btzoVar;
        btzoVar.a().c(btysVar);
        this.h = alzjVar;
        this.c = ckcwVar;
        this.g = new ArrayList();
    }

    public static akry d(alzo alzoVar) {
        dcdc<alzr> dcdcVar = ((alzs) alzoVar).a;
        dbsk.b(!dcdcVar.isEmpty(), "No tile requests found in the batch.");
        return dcdcVar.get(0).a();
    }

    private final void g() {
        this.g.clear();
        this.g = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r1.get(0).b().a == ((defpackage.alzc) r6).a.a) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(defpackage.alzr r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map<dbsi<akry, alyh>, java.util.List<alzr>> r0 = r5.f     // Catch: java.lang.Throwable -> Lb4
            dbsi r1 = r6.f()     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lb4
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L1b
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lb4
            if (r1 == 0) goto L16
            goto L1b
        L16:
            r0.add(r6)     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r5)
            return
        L1b:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb4
            r0.<init>()     // Catch: java.lang.Throwable -> Lb4
            r0.add(r6)     // Catch: java.lang.Throwable -> Lb4
            java.util.Map<dbsi<akry, alyh>, java.util.List<alzr>> r1 = r5.f     // Catch: java.lang.Throwable -> Lb4
            dbsi r2 = r6.f()     // Catch: java.lang.Throwable -> Lb4
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> Lb4
            alzj r0 = r5.h     // Catch: java.lang.Throwable -> Lb4
            java.util.List<alzr> r1 = r5.g     // Catch: java.lang.Throwable -> Lb4
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lb4
            r3 = 0
            if (r2 == 0) goto L38
            goto L4d
        L38:
            java.lang.Object r2 = r1.get(r3)     // Catch: java.lang.Throwable -> Lb4
            alzr r2 = (defpackage.alzr) r2     // Catch: java.lang.Throwable -> Lb4
            alyh r2 = r2.b()     // Catch: java.lang.Throwable -> Lb4
            int r2 = r2.a     // Catch: java.lang.Throwable -> Lb4
            r4 = r6
            alzc r4 = (defpackage.alzc) r4     // Catch: java.lang.Throwable -> Lb4
            alyh r4 = r4.a     // Catch: java.lang.Throwable -> Lb4
            int r4 = r4.a     // Catch: java.lang.Throwable -> Lb4
            if (r2 != r4) goto L66
        L4d:
            dcdc<alzp> r0 = r0.c     // Catch: java.lang.Throwable -> Lb4
            int r2 = r0.size()     // Catch: java.lang.Throwable -> Lb4
        L53:
            if (r3 >= r2) goto L6e
            int r4 = r3 + 1
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> Lb4
            alzp r3 = (defpackage.alzp) r3     // Catch: java.lang.Throwable -> Lb4
            boolean r3 = r3.b(r1, r6)     // Catch: java.lang.Throwable -> Lb4
            if (r3 != 0) goto L64
            goto L66
        L64:
            r3 = r4
            goto L53
        L66:
            java.util.List<alzr> r0 = r5.g     // Catch: java.lang.Throwable -> Lb4
            r5.b(r0)     // Catch: java.lang.Throwable -> Lb4
            r5.g()     // Catch: java.lang.Throwable -> Lb4
        L6e:
            java.util.List<alzr> r0 = r5.g     // Catch: java.lang.Throwable -> Lb4
            r0.add(r6)     // Catch: java.lang.Throwable -> Lb4
            java.util.List<alzr> r6 = r5.g     // Catch: java.lang.Throwable -> Lb4
            int r6 = r6.size()     // Catch: java.lang.Throwable -> Lb4
            r0 = 1
            if (r6 != r0) goto L9a
            alzj r6 = r5.h     // Catch: java.lang.Throwable -> Lb4
            alzb r6 = r6.b     // Catch: java.lang.Throwable -> Lb4
            int r6 = r6.a     // Catch: java.lang.Throwable -> Lb4
            if (r6 <= r0) goto L9a
            java.util.List<alzr> r6 = r5.g     // Catch: java.lang.Throwable -> Lb4
            dehq r0 = r5.b     // Catch: java.lang.Throwable -> Lb4
            alzl r1 = new alzl     // Catch: java.lang.Throwable -> Lb4
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> Lb4
            r2 = 50
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Lb4
            dehu r6 = r0.d(r1, r2, r6)     // Catch: java.lang.Throwable -> Lb4
            dehq r0 = r5.b     // Catch: java.lang.Throwable -> Lb4
            defpackage.bvqd.a(r6, r0)     // Catch: java.lang.Throwable -> Lb4
        L9a:
            alzj r6 = r5.h     // Catch: java.lang.Throwable -> Lb4
            alzb r6 = r6.b     // Catch: java.lang.Throwable -> Lb4
            int r6 = r6.a     // Catch: java.lang.Throwable -> Lb4
            java.util.List<alzr> r0 = r5.g     // Catch: java.lang.Throwable -> Lb4
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb4
            if (r6 != r0) goto Lb2
            java.util.List<alzr> r6 = r5.g     // Catch: java.lang.Throwable -> Lb4
            r5.b(r6)     // Catch: java.lang.Throwable -> Lb4
            r5.g()     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r5)
            return
        Lb2:
            monitor-exit(r5)
            return
        Lb4:
            r6 = move-exception
            monitor-exit(r5)
            goto Lb8
        Lb7:
            throw r6
        Lb8:
            goto Lb7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alzn.a(alzr):void");
    }

    public final void b(List<alzr> list) {
        if (!list.isEmpty()) {
            alzj alzjVar = this.h;
            alzs alzsVar = new alzs(dcdc.r(list), alzjVar.c, alzjVar.d, alzjVar.a.a());
            this.d.incrementAndGet();
            try {
                dbsk.b(!alzsVar.a.isEmpty(), "No tile requests present in the batch. Can't create a PaintRequest.");
                dmxh dmxhVar = alzsVar.b;
                if (dmxhVar == null) {
                    String valueOf = String.valueOf(alzsVar.f);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
                    sb.append("No paint request template found for given tile type: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                dsqp dsqpVar = (dsqp) dmxhVar.cu(5);
                dsqpVar.bC(dmxhVar);
                dmxg dmxgVar = (dmxg) dsqpVar;
                if (dmxgVar.c) {
                    dmxgVar.bF();
                    dmxgVar.c = false;
                }
                ((dmxh) dmxgVar.b).b = dmxh.ck();
                dcdc<alzr> dcdcVar = alzsVar.a;
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    alzr alzrVar = dcdcVar.get(i);
                    dmyc bZ = dmyd.f.bZ();
                    drst bZ2 = drsu.e.bZ();
                    int i2 = alzrVar.b().a;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    drsu drsuVar = (drsu) bZ2.b;
                    drsuVar.a |= 1;
                    drsuVar.b = i2;
                    int i3 = alzrVar.b().b;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    drsu drsuVar2 = (drsu) bZ2.b;
                    drsuVar2.a |= 2;
                    drsuVar2.c = i3;
                    int i4 = alzrVar.b().c;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    drsu drsuVar3 = (drsu) bZ2.b;
                    drsuVar3.a |= 4;
                    drsuVar3.d = i4;
                    drsu bK = bZ2.bK();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dmyd dmydVar = (dmyd) bZ.b;
                    bK.getClass();
                    dmydVar.b = bK;
                    dmydVar.a |= 1;
                    String c = alzrVar.c();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dmyd dmydVar2 = (dmyd) bZ.b;
                    c.getClass();
                    dmydVar2.a |= 32;
                    dmydVar2.d = c;
                    if (!alzrVar.d()) {
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dmyd dmydVar3 = (dmyd) bZ.b;
                        dmydVar3.a |= 64;
                        dmydVar3.e = false;
                    }
                    dmxgVar.b(bZ.bK());
                }
                dmxn dmxnVar = ((dmxh) dmxgVar.b).d;
                if (dmxnVar == null) {
                    dmxnVar = dmxn.e;
                }
                dsqp dsqpVar2 = (dsqp) dmxnVar.cu(5);
                dsqpVar2.bC(dmxnVar);
                dmxm dmxmVar = (dmxm) dsqpVar2;
                String str = alzsVar.d;
                if (dmxmVar.c) {
                    dmxmVar.bF();
                    dmxmVar.c = false;
                }
                dmxn dmxnVar2 = (dmxn) dmxmVar.b;
                str.getClass();
                int i5 = dmxnVar2.a | 1;
                dmxnVar2.a = i5;
                dmxnVar2.b = str;
                String str2 = alzsVar.e;
                str2.getClass();
                dmxnVar2.a = i5 | 2;
                dmxnVar2.c = str2;
                dmxn bK2 = dmxmVar.bK();
                if (dmxgVar.c) {
                    dmxgVar.bF();
                    dmxgVar.c = false;
                }
                dmxh dmxhVar2 = (dmxh) dmxgVar.b;
                bK2.getClass();
                dmxhVar2.d = bK2;
                dmxhVar2.a |= 2;
                altv altvVar = alzsVar.f == akry.INDOOR ? alzsVar.a.get(0).b().d : null;
                dcdc<alzp> dcdcVar2 = alzsVar.c;
                int size2 = dcdcVar2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    dcdcVar2.get(i6).a(altvVar, dmxgVar);
                }
                try {
                    this.e.b().b((dmxh) dmxgVar.bK(), new alzm(this, alzsVar), this.b);
                } catch (IllegalArgumentException e) {
                    btzy a = btzy.a(e);
                    c(alzsVar, a);
                    alza.a(this.c, d(alzsVar), a.d());
                    this.a.add(a.d());
                }
            } catch (IllegalArgumentException unused) {
                btzy btzyVar = btzy.o;
                c(alzsVar, btzyVar);
                alza.a(this.c, d(alzsVar), btzyVar.d());
                this.a.add(btzyVar.d());
            }
        }
    }

    public final void c(alzo alzoVar, btzy btzyVar) {
        for (alzr alzrVar : ((alzs) alzoVar).a) {
            for (alzr alzrVar2 : e(alzrVar.f())) {
                amap e = alzrVar2.e();
                if (e != null) {
                    amaw amawVar = e.b;
                    amawVar.H(amawVar.t, new amao(e, btzyVar));
                }
            }
        }
    }

    public final synchronized List<alzr> e(dbsi<akry, alyh> dbsiVar) {
        List<alzr> list;
        list = this.f.get(dbsiVar);
        dbsk.s(list);
        this.f.remove(dbsiVar);
        return list;
    }

    public final synchronized void f(String str, PrintWriter printWriter) {
        bvrj.UI_THREAD.c();
        int size = this.g.size();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append(str);
        sb.append("requestsForNextBatch.size(): ");
        sb.append(size);
        printWriter.println(sb.toString());
        int i = this.d.get();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25);
        sb2.append(str);
        sb2.append("sendRpcCount: ");
        sb2.append(i);
        printWriter.println(sb2.toString());
        String valueOf = String.valueOf(this.a);
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf).length());
        sb3.append(str);
        sb3.append("responses: ");
        sb3.append(valueOf);
        printWriter.println(sb3.toString());
    }
}
