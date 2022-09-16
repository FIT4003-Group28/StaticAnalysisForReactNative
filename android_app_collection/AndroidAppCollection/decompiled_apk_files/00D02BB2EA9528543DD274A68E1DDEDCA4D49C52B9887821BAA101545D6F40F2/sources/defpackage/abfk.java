package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abfk  reason: default package */
/* loaded from: classes.dex */
public final class abfk implements aeaw {
    private static final dcqe b = dcqe.c("abfk");
    @dzsi
    public abfj a;
    private final btvo c;
    private final Executor d;
    private final dxio<ckcw> e;
    private final dxio<aaap> f;
    private final dxio<brba> g;
    private final dqfo h;
    @dzsi
    private final dxio<aeaa> i;
    private final abse j;

    public abfk(Executor executor, dxio<ckcw> dxioVar, dxio<aaap> dxioVar2, dxio<brba> dxioVar3, btvo btvoVar, dqfo dqfoVar, @dzsi dxio<aeaa> dxioVar4, @dzsi abse abseVar) {
        this.e = dxioVar;
        this.c = btvoVar;
        this.f = dxioVar2;
        this.i = dxioVar4;
        this.h = dqfoVar;
        this.g = dxioVar3;
        this.d = executor;
        this.j = abseVar == null ? abse.e : abseVar;
    }

    private final void f(cjqm cjqmVar, String str, boolean z) {
        abfj abfjVar;
        dxio<aeaa> dxioVar;
        if (!z || this.i != null) {
            int i = true != z ? 4 : 3;
            if (!z || (dxioVar = this.i) == null) {
                abfjVar = null;
            } else {
                abfj abfjVar2 = new abfj(this, dxioVar.a());
                this.a = abfjVar2;
                abfjVar = abfjVar2;
            }
            this.g.a().M(str, i, i(cjqmVar), abfjVar, z ? null : k(), h());
        }
    }

    private final void g(cjqm cjqmVar, dpvg dpvgVar, boolean z) {
        dxio<aeaa> dxioVar;
        if (!z || this.i != null) {
            int i = 3;
            int i2 = true != z ? 4 : 3;
            abfj abfjVar = null;
            if (z && (dxioVar = this.i) != null) {
                abfjVar = new abfj(this, dxioVar.a());
                this.a = abfjVar;
            }
            abfj abfjVar2 = abfjVar;
            iqy iqyVar = z ? new iqy() : k();
            iqyVar.k = true;
            if (!this.h.e.isEmpty()) {
                iqyVar.l = this.h.e;
            }
            dqen bZ = dqep.c.bZ();
            if (z) {
                i = 2;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dqep dqepVar = (dqep) bZ.b;
            dqepVar.b = i - 1;
            dqepVar.a |= 1;
            this.g.a().N(dpvgVar, i2, iqyVar, i(cjqmVar), abfjVar2, bZ.bK(), h());
        }
    }

    @dzsi
    private final dwiq h() {
        if ((this.j.a & 4) == 0 || !this.c.getEnableFeatureParameters().aZ) {
            return null;
        }
        dwip bZ = dwiq.e.bZ();
        String str = this.j.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwiq dwiqVar = (dwiq) bZ.b;
        str.getClass();
        dwiqVar.a |= 4;
        dwiqVar.d = str;
        dwiq.c(dwiqVar);
        return bZ.bK();
    }

    private static dnqh i(cjqm cjqmVar) {
        dnqg bZ = dnqh.p.bZ();
        int i = ddda.aA.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        if (cjqmVar.a().a()) {
            String b2 = cjqmVar.a().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            b2.getClass();
            dnqhVar2.a |= 2;
            dnqhVar2.c = b2;
        }
        return bZ.bK();
    }

    private final void j(dbsg<ckhf> dbsgVar) {
        if (dbsgVar.a()) {
            ((ckhe) this.e.a().a(dbsgVar.b())).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.iqy k() {
        /*
            r6 = this;
            iqy r0 = new iqy
            r0.<init>()
            dpvf r1 = defpackage.dpvf.UNKNOWN_CATEGORY
            dqfo r1 = r6.h
            int r1 = r1.b
            int r1 = defpackage.dqfl.a(r1)
            int r2 = r1 + (-1)
            if (r1 == 0) goto L65
            r1 = 5
            r3 = 7
            r4 = 2
            if (r2 == 0) goto L58
            if (r2 == r4) goto L1c
            r1 = 0
            goto L59
        L1c:
            dqfo r2 = r6.h
            int r5 = r2.b
            if (r5 != r3) goto L27
            java.lang.Object r2 = r2.c
            dpvg r2 = (defpackage.dpvg) r2
            goto L29
        L27:
            dpvg r2 = defpackage.dpvg.d
        L29:
            int r2 = r2.b
            dpvf r2 = defpackage.dpvf.b(r2)
            if (r2 != 0) goto L33
            dpvf r2 = defpackage.dpvf.UNKNOWN_CATEGORY
        L33:
            int r2 = r2.ordinal()
            r5 = 1
            if (r2 == r5) goto L59
            if (r2 == r1) goto L56
            r1 = 10
            if (r2 == r1) goto L54
            r1 = 23
            if (r2 == r1) goto L52
            r1 = 41
            if (r2 == r1) goto L50
            r1 = 61
            if (r2 == r1) goto L4d
            goto L58
        L4d:
            r1 = 8
            goto L59
        L50:
            r1 = 7
            goto L59
        L52:
            r1 = 6
            goto L59
        L54:
            r1 = 3
            goto L59
        L56:
            r1 = 4
            goto L59
        L58:
            r1 = 2
        L59:
            if (r1 == 0) goto L64
            r0.q = r1
            dbsg r1 = r0.a()
            r6.j(r1)
        L64:
            return r0
        L65:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abfk.k():iqy");
    }

    public final void a(cjqm cjqmVar) {
        String str;
        dpvf dpvfVar = dpvf.UNKNOWN_CATEGORY;
        int a = dqfl.a(this.h.b);
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                dqfo dqfoVar = this.h;
                f(cjqmVar, dqfoVar.b == 2 ? (String) dqfoVar.c : "", false);
                return;
            } else if (i != 1) {
                if (i != 2) {
                    bvoo.h("Sub-intent does not know how to handle unknown query data.", new Object[0]);
                    return;
                }
                dqfo dqfoVar2 = this.h;
                g(cjqmVar, dqfoVar2.b == 7 ? (dpvg) dqfoVar2.c : dpvg.d, false);
                return;
            } else {
                dqfo dqfoVar3 = this.h;
                dprx dprxVar = dqfoVar3.b == 6 ? (dprx) dqfoVar3.c : dprx.h;
                dqfo dqfoVar4 = this.h;
                dpsh dpshVar = (dqfoVar4.b == 6 ? (dprx) dqfoVar4.c : dprx.h).f;
                if (dpshVar == null) {
                    dpshVar = dpsh.e;
                }
                if (dpshVar.b) {
                    j(dbsg.i(ckfb.f));
                }
                dqfo dqfoVar5 = this.h;
                if (((dqfoVar5.b == 6 ? (dprx) dqfoVar5.c : dprx.h).a & 32) != 0) {
                    dqfo dqfoVar6 = this.h;
                    str = (dqfoVar6.b == 6 ? (dprx) dqfoVar6.c : dprx.h).g;
                } else {
                    str = this.h.e;
                }
                this.f.a().e(str, dprxVar, cjqmVar);
                return;
            }
        }
        throw null;
    }

    @Override // defpackage.aeaw
    public final aeav b() {
        return aeav.QUERY_SUGGESTION;
    }

    @Override // defpackage.aeaw
    public final void c(deig<Boolean> deigVar, deig<Void> deigVar2) {
        dprx dprxVar;
        dpvg dpvgVar;
        deigVar.j(false);
        dpvf dpvfVar = dpvf.UNKNOWN_CATEGORY;
        int a = dqfl.a(this.h.b);
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                cjqm cjqmVar = cjqm.a;
                dqfo dqfoVar = this.h;
                f(cjqmVar, dqfoVar.b == 2 ? (String) dqfoVar.c : "", true);
                return;
            } else if (i == 1) {
                aaap a2 = this.f.a();
                dqfo dqfoVar2 = this.h;
                if (dqfoVar2.b == 6) {
                    dprxVar = (dprx) dqfoVar2.c;
                } else {
                    dprxVar = dprx.h;
                }
                a2.f(dprxVar);
                return;
            } else if (i != 2) {
                int i2 = this.h.b;
                return;
            } else {
                cjqm cjqmVar2 = cjqm.a;
                dqfo dqfoVar3 = this.h;
                if (dqfoVar3.b == 7) {
                    dpvgVar = (dpvg) dqfoVar3.c;
                } else {
                    dpvgVar = dpvg.d;
                }
                g(cjqmVar2, dpvgVar, true);
                return;
            }
        }
        throw null;
    }

    @Override // defpackage.aeaw
    public final int d() {
        return this.h.g;
    }

    @Override // defpackage.aeaw
    public final dbsg<Executor> e() {
        return dbsg.i(this.d);
    }
}
