package defpackage;
/* compiled from: PG */
/* renamed from: ccrh  reason: default package */
/* loaded from: classes4.dex */
public class ccrh {
    public final cjqy l;
    public final ckcw m;
    public static final dcdn<ccvz, cjtd> a = dcdn.m(ccvz.OFFERING_NAME, cjtd.a(dtxx.l), ccvz.OFFERING_NAME_WITH_SUGGEST, cjtd.a(dtxx.l), ccvz.OFFERING_PRICE, cjtd.a(dtxx.p));
    public static final dcdn<ccvz, cjtd> b = dcdn.l(ccvz.OFFERING_RECOMMENDATION, cjtd.a(dtxx.r), ccvz.OFFERING_PRICE, cjtd.a(dtxx.q));
    public static final dcdn<dgfb, cjtd> c = dcdn.m(dgfb.DISH, cjtd.a(dtxx.n), dgfb.PRODUCT_CATEGORY, cjtd.a(dtxx.at), dgfb.ACTIVITY, cjtd.a(dtxx.g));
    public static final dcdn<dgfb, ddda> d = dcdn.m(dgfb.DISH, ddda.ep, dgfb.PRODUCT_CATEGORY, ddda.ew, dgfb.ACTIVITY, ddda.el);
    private static final dcdn<dgfb, ddda> n = dcdn.k(dgfb.DISH, ddda.eu);
    public static final dcdn<dgfb, cjtd> e = dcdn.m(dgfb.DISH, cjtd.a(dtxx.aq), dgfb.PRODUCT_CATEGORY, cjtd.a(dtxx.au), dgfb.ACTIVITY, cjtd.a(dtxx.h));
    public static final dcdn<dgfb, cjtd> f = dcdn.k(dgfb.DISH, cjtd.a(dtxx.ap));
    public static final dcdn<dgfb, cjtd> g = dcdn.k(dgfb.DISH, cjtd.a(dtxx.ao));
    public static final dcdn<dgfb, cjtd> h = dcdn.k(dgfb.DISH, cjtd.a(dtxx.am));
    private static final dcdn<dgfb, ddda> o = dcdn.m(dgfb.DISH, ddda.eq, dgfb.PRODUCT_CATEGORY, ddda.ex, dgfb.ACTIVITY, ddda.em);
    private static final dcdn<dgfb, ddcu> p = dcdn.m(dgfb.DISH, ddcu.C, dgfb.PRODUCT_CATEGORY, ddcu.F, dgfb.ACTIVITY, ddcu.z);
    public static final dcdn<dgfb, ddda> i = dcdn.m(dgfb.DISH, ddda.er, dgfb.PRODUCT_CATEGORY, ddda.ey, dgfb.ACTIVITY, ddda.en);
    public static final dcdn<dgfb, ddcu> j = dcdn.m(dgfb.DISH, ddcu.D, dgfb.PRODUCT_CATEGORY, ddcu.G, dgfb.ACTIVITY, ddcu.A);
    public static final dcdn<dgfb, ckgu> k = dcdn.m(dgfb.DISH, ckhw.a, dgfb.PRODUCT_CATEGORY, ckhw.b, dgfb.ACTIVITY, ckhw.c);

    public ccrh(cjqy cjqyVar, ckcw ckcwVar) {
        this.l = cjqyVar;
        this.m = ckcwVar;
    }

    public static void b(cjst cjstVar, @dzsi cjqm cjqmVar) {
        if (cjqmVar != null) {
            dbsg<String> a2 = cjqmVar.a();
            if (!a2.a()) {
                return;
            }
            ((cjrr) cjstVar).a = a2.b();
        }
    }

    public final void a(dgfb dgfbVar) {
        dcdn<dgfb, ddda> dcdnVar = n;
        if (dcdnVar.containsKey(dgfbVar)) {
            cjqy cjqyVar = this.l;
            cjsx i2 = cjsy.i();
            i2.b(dcdnVar.get(dgfbVar));
            cjqyVar.k(i2.a());
        }
    }

    public final void c(dehn<?> dehnVar, final dgfb dgfbVar, final int i2) {
        dcdn<dgfb, ddda> dcdnVar = o;
        if (dcdnVar.containsKey(dgfbVar)) {
            cjst d2 = cjsu.d();
            ddda dddaVar = dcdnVar.get(dgfbVar);
            dbsk.s(dddaVar);
            d2.d(dddaVar);
            cjry e2 = cjrz.e();
            ddcu ddcuVar = p.get(dgfbVar);
            dbsk.s(ddcuVar);
            e2.b(ddcuVar);
            dddf bZ = dddg.g.bZ();
            dddj bZ2 = dddk.h.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dddk dddkVar = (dddk) bZ2.b;
            dddkVar.b = dgfbVar.f;
            int i3 = dddkVar.a | 1;
            dddkVar.a = i3;
            int i4 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            dddkVar.g = i4;
            dddkVar.a = i3 | 32;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dddg dddgVar = (dddg) bZ.b;
            dddk bK = bZ2.bK();
            bK.getClass();
            dddgVar.f = bK;
            dddgVar.a |= 128;
            ((cjrn) e2).b = bZ.bK();
            d2.f(e2.a());
            b(d2, null);
            this.l.l(d2.e());
        }
        deha.q(dehnVar, bvqj.b(new bvqg(this, dgfbVar, i2) { // from class: ccrg
            private final ccrh a;
            private final dgfb b;
            private final int c;

            {
                this.a = this;
                this.b = dgfbVar;
                this.c = i2;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ccrh ccrhVar = this.a;
                dgfb dgfbVar2 = this.b;
                int i5 = this.c;
                if (ccrh.i.containsKey(dgfbVar2)) {
                    cjst d3 = cjsu.d();
                    d3.d(ccrh.i.get(dgfbVar2));
                    cjry e3 = cjrz.e();
                    ddcu ddcuVar2 = ccrh.j.get(dgfbVar2);
                    dbsk.s(ddcuVar2);
                    e3.b(ddcuVar2);
                    dddf bZ3 = dddg.g.bZ();
                    dddj bZ4 = dddk.h.bZ();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dddk dddkVar2 = (dddk) bZ4.b;
                    dddkVar2.b = dgfbVar2.f;
                    int i6 = dddkVar2.a | 1;
                    dddkVar2.a = i6;
                    int i7 = i5 - 1;
                    if (i5 == 0) {
                        throw null;
                    }
                    dddkVar2.g = i7;
                    dddkVar2.a = i6 | 32;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dddg dddgVar2 = (dddg) bZ3.b;
                    dddk bK2 = bZ4.bK();
                    bK2.getClass();
                    dddgVar2.f = bK2;
                    dddgVar2.a |= 128;
                    ((cjrn) e3).b = bZ3.bK();
                    d3.f(e3.a());
                    ccrh.b(d3, null);
                    ccrhVar.l.l(d3.e());
                }
            }
        }), dege.a);
    }
}
