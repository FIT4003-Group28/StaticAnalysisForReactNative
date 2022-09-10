package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ude  reason: default package */
/* loaded from: classes7.dex */
public final class ude implements udl {
    public static final dcqe a = dcqe.c("ude");
    public final dxio<udg> b;
    public final ucv c;
    public final dxio<brba> d;
    public final gfw e;
    public final pso f;
    public final tmb g;
    public final ufg h;
    public final akfa i;
    public final Executor j;
    public final Executor k;

    public ude(dxio<udg> dxioVar, ucv ucvVar, dxio<brba> dxioVar2, Executor executor, Executor executor2, gfw gfwVar, pso psoVar, tmb tmbVar, ufg ufgVar, akfa akfaVar) {
        this.b = dxioVar;
        this.c = ucvVar;
        this.d = dxioVar2;
        this.j = executor;
        this.k = executor2;
        this.e = gfwVar;
        this.f = psoVar;
        this.g = tmbVar;
        this.h = ufgVar;
        this.i = akfaVar;
    }

    public static udj d() {
        return udj.d(dbpy.a, dbpy.a, 1);
    }

    private static dcdc<String> e(amte amteVar) {
        dvzu dvzuVar = amteVar.a.a().b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        return dcbg.b(dvzuVar.b).o(udb.a).s(udc.a).z();
    }

    @Override // defpackage.udl
    public final dehn<udj> a(amte amteVar) {
        dbsg dbsgVar;
        dcdc<String> e = e(amteVar);
        if (e.size() != 1) {
            bvoo.h("Attempted to initiate search for unsupported directions that have multiple ambiguous waypoints.", new Object[0]);
            return deha.a(d());
        }
        final ucv ucvVar = this.c;
        amsy amsyVar = amteVar.a;
        int i = -1;
        int i2 = 0;
        int i3 = -1;
        while (true) {
            if (i2 >= amsyVar.i()) {
                i = i3;
                break;
            }
            if (ucv.d(amsyVar.h(i2))) {
                if (i3 != -1) {
                    break;
                }
                i3 = i2;
            }
            i2++;
        }
        final amsy amsyVar2 = amteVar.a;
        dvzu dvzuVar = amsyVar2.a().b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        dcdc z = dcbg.b(dvzuVar.b).o(uct.a).s(new dbrn(ucvVar, amsyVar2) { // from class: ucu
            private final ucv a;
            private final amsy b;

            {
                this.a = ucvVar;
                this.b = amsyVar2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ucv ucvVar2 = this.a;
                amvh c = amvj.c(this.b.c(), (dpkf) obj, ucvVar2.a);
                dbsk.s(c);
                return c;
            }
        }).z();
        if (i < 0 || i >= amteVar.c.length) {
            dbsgVar = dbpy.a;
        } else if (z.size() > 1) {
            dbsgVar = dbsg.i(amsz.a(amteVar, 0, i));
        } else {
            dbsgVar = dbsg.i(amsz.b((amvh) z.get(0), i, amteVar.d(), amteVar.i()));
        }
        if (!dbsgVar.a()) {
            bvoo.h("Attempted to initiate search for directions that can't be disambiguated.", new Object[0]);
            return deha.a(d());
        }
        final deig d = deig.d();
        final amsz amszVar = (amsz) dbsgVar.b();
        dbsk.s(amszVar);
        final String str = e.get(0);
        final dbpy<Object> dbpyVar = dbpy.a;
        this.c.b.a = amszVar;
        this.j.execute(new Runnable(this, amszVar, str, dbpyVar, d) { // from class: ucz
            private final ude a;
            private final amsz b;
            private final String c;
            private final dbsg d;
            private final deig e;

            {
                this.a = this;
                this.b = amszVar;
                this.c = str;
                this.d = dbpyVar;
                this.e = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                amvh d2;
                ude udeVar = this.a;
                amsz amszVar2 = this.b;
                String str2 = this.c;
                deig deigVar = this.e;
                udg a2 = udeVar.b.a();
                deig d3 = deig.d();
                dnqg bZ = dnqh.p.bZ();
                int i4 = ddda.cl.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar = (dnqh) bZ.b;
                dnqhVar.a |= 64;
                dnqhVar.g = i4;
                dwim bZ2 = dwir.R.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwir dwirVar = (dwir) bZ2.b;
                str2.getClass();
                dwirVar.a |= 1;
                dwirVar.c = str2;
                dhjx aa = a2.c.aa();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwir dwirVar2 = (dwir) bZ2.b;
                aa.getClass();
                dwirVar2.d = aa;
                dwirVar2.a |= 2;
                dnqh bK = bZ.bK();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwir dwirVar3 = (dwir) bZ2.b;
                bK.getClass();
                dwirVar3.s = bK;
                dwirVar3.a |= 33554432;
                if (!amszVar2.c() && (d2 = amszVar2.d()) != null) {
                    dwip bZ3 = dwiq.e.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dwiq dwiqVar = (dwiq) bZ3.b;
                    str2.getClass();
                    dwiqVar.a |= 1;
                    dwiqVar.b = str2;
                    if (d2.l()) {
                        String str3 = d2.c;
                        dbsk.s(str3);
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dwiq dwiqVar2 = (dwiq) bZ3.b;
                        str3.getClass();
                        dwiqVar2.a |= 2;
                        dwiqVar2.c = str3;
                    }
                    if (d2.m()) {
                        akqi akqiVar = d2.d;
                        dbsk.s(akqiVar);
                        String o = akqiVar.o();
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dwiq dwiqVar3 = (dwiq) bZ3.b;
                        o.getClass();
                        dwiqVar3.a |= 4;
                        dwiqVar3.d = o;
                    }
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dwir dwirVar4 = (dwir) bZ2.b;
                    dwiq bK2 = bZ3.bK();
                    bK2.getClass();
                    dwirVar4.u = bK2;
                    dwirVar4.a |= 134217728;
                }
                if (amszVar2.c()) {
                    dodt e2 = psp.e(amszVar2, a2.b);
                    if (e2 != null) {
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dwir dwirVar5 = (dwir) bZ2.b;
                        e2.getClass();
                        dwirVar5.y = e2;
                        dwirVar5.a |= Integer.MIN_VALUE;
                    } else {
                        bvoo.h("SearchAlongRouteContext is null for a middle waypoint", new Object[0]);
                    }
                }
                a2.e.a().r(bZ2);
                iqy iqyVar = new iqy();
                iqyVar.l = str2;
                brln brlnVar = new brln(bZ2.bK(), iqyVar, amszVar2, psp.a(amszVar2, a2.b));
                brlnVar.f = new udf(a2, d3);
                a2.f.a();
                a2.d.a().a(brlnVar);
                deha.q(degp.q(d3), new udd(udeVar, deigVar), udeVar.k);
            }
        });
        return d;
    }

    @Override // defpackage.udl
    public final boolean b(amte amteVar) {
        return e(amteVar).size() == 1;
    }

    public final dbsg<amsz> c() {
        return this.c.a();
    }
}
