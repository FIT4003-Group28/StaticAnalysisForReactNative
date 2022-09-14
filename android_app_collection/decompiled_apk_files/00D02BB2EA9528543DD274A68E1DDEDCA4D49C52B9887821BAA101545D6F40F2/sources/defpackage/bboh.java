package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bboh  reason: default package */
/* loaded from: classes3.dex */
public class bboh implements bbnf {
    public static final /* synthetic */ int i = 0;
    private static final dnqh j;
    public final gga a;
    public final dxio<bsvm> b;
    public final dxio<bbdv> c;
    public final Executor d;
    public final bbdu e;
    public final bwrs<ilo> f;
    public final Runnable g;
    @dzsi
    public final bbdy h;
    private final btvo k;
    private final dxio<angp> l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private List<jbf> p;
    private List<bbne> q;

    static {
        dnqg bZ = dnqh.p.bZ();
        int i2 = ddda.eH.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i2;
        j = bZ.bK();
    }

    public bboh(gga ggaVar, btvo btvoVar, dxio<bsvm> dxioVar, final dxio<bbdv> dxioVar2, dxio<angp> dxioVar3, Executor executor, bbnl bbnlVar, final bwrs<ilo> bwrsVar, boolean z, boolean z2, boolean z3, @dzsi final bbdy bbdyVar, Runnable runnable) {
        this.a = ggaVar;
        this.k = btvoVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.l = dxioVar3;
        this.d = executor;
        this.f = bwrsVar;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.h = bbdyVar;
        this.g = runnable;
        this.e = new bbdu(bbdyVar, dxioVar2, bwrsVar) { // from class: bbnm
            private final bbdy a;
            private final dxio b;
            private final bwrs c;

            {
                this.a = bbdyVar;
                this.b = dxioVar2;
                this.c = bwrsVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
                if (r5 == 1) goto L5;
             */
            @Override // defpackage.bbdu
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(android.app.Activity r4, int r5) {
                /*
                    r3 = this;
                    bbdy r4 = r3.a
                    dxio r0 = r3.b
                    bwrs r1 = r3.c
                    int r2 = defpackage.bboh.i
                    r2 = 1
                    if (r4 == 0) goto L16
                    if (r5 != r2) goto L11
                    r4.aJ(r2)
                    goto L18
                L11:
                    r5 = 2
                    r4.aJ(r5)
                    goto L22
                L16:
                    if (r5 != r2) goto L22
                L18:
                    java.lang.Object r4 = r0.a()
                    bbdv r4 = (defpackage.bbdv) r4
                    r4.J(r1)
                    return
                L22:
                    java.io.Serializable r4 = r1.c()
                    ilo r4 = (defpackage.ilo) r4
                    defpackage.dbsk.s(r4)
                    ily r4 = r4.g()
                    r4.e = r2
                    ilo r4 = r4.d()
                    r1.d(r4)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bbnm.a(android.app.Activity, int):void");
            }
        };
    }

    public static cqtd f(int i2) {
        return cqtt.i(cqrt.g(i2, ibm.n()), cqrp.d(24.0d), cqrp.d(24.0d));
    }

    private static int i(dpqg dpqgVar) {
        return dpqgVar == dpqg.TYPE_INTERESTED ? 2131232444 : 2131232441;
    }

    private final boolean j() {
        return this.o && this.k.getLocalPreferencesParameters().a;
    }

    @Override // defpackage.bbnf
    public List<jbf> a() {
        if (this.p == null) {
            dcbg t = dcbg.b((List) dbsg.j(this.f.c()).h(bbnz.a).h(bboa.a).c(dcdc.e())).o(bbob.a).t(new dbrn(this) { // from class: bboc
                private final bboh a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    bboh bbohVar = this.a;
                    dqbq dqbqVar = (dqbq) obj;
                    int i2 = dqbqVar.a;
                    if (i2 != 2) {
                        if (i2 == 3) {
                            return dcbg.b(((dqbn) dqbqVar.b).a).s(new dbrn(bbohVar) { // from class: bbnt
                                private final bboh a;

                                {
                                    this.a = bbohVar;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj2) {
                                    bboh bbohVar2 = this.a;
                                    dqbm dqbmVar = (dqbm) obj2;
                                    ixw ixwVar = new ixw();
                                    ixwVar.g = bboh.f(2131232441);
                                    ixwVar.a = bbohVar2.a.getString(R.string.PERSONAL_SCORE_EDIT_MATCH_NOT_INTERESTED, new Object[]{dqbmVar.b});
                                    ixwVar.d = bbohVar2;
                                    ixwVar.f = cjtd.a(dtxy.be);
                                    ixwVar.c = true;
                                    ixwVar.e = bbohVar2.h(new Runnable(bbohVar2, dqbmVar) { // from class: bbno
                                        private final bboh a;
                                        private final dqbm b;

                                        {
                                            this.a = bbohVar2;
                                            this.b = dqbmVar;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            bboh bbohVar3 = this.a;
                                            dqbm dqbmVar2 = this.b;
                                            bbohVar3.c.a().F(bbohVar3.f);
                                            ily ilyVar = new ily();
                                            ilyVar.k(dqbmVar2.a);
                                            ilyVar.F(dqbmVar2.b);
                                            bbohVar3.c.a().r(ilyVar.d(), bbohVar3.e);
                                        }
                                    });
                                    return ixwVar.a();
                                }
                            }).z();
                        }
                        return dcdc.e();
                    }
                    ixw ixwVar = new ixw();
                    ixwVar.g = bboh.f(2131232205);
                    ixwVar.a = bbohVar.a.getString(R.string.PERSONAL_SCORE_EDIT_MATCH_HAVENT_BEEN);
                    ixwVar.d = bbohVar;
                    ixwVar.f = cjtd.a(dtxy.bd);
                    ixwVar.c = true;
                    ixwVar.e = bbohVar.h(new Runnable(bbohVar) { // from class: bbnn
                        private final bboh a;

                        {
                            this.a = bbohVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.g();
                        }
                    });
                    return dcdc.f(ixwVar.a());
                }
            });
            if (j()) {
                ixw ixwVar = new ixw();
                ixwVar.g = f(2131232249);
                ixwVar.a = this.a.getString(R.string.PERSONAL_SCORE_PREFERENCES_ENTRY_LABEL);
                ixwVar.f = cjtd.a(dtxy.bb);
                ixwVar.d = new bboe();
                ixwVar.c = true;
                ixwVar.e = h(new Runnable(this) { // from class: bbnp
                    private final bboh a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bboh bbohVar = this.a;
                        bbohVar.b.a().C(bbohVar.f);
                    }
                });
                t = t.n(ixwVar.a());
            }
            ixw ixwVar2 = new ixw();
            ixwVar2.g = f(2131232273);
            ixwVar2.a = this.a.getString(R.string.PERSONAL_SCORE_FEEDBACK_EDIT_MATCH_FEEDBACK_ENTRY);
            ixwVar2.f = cjtd.a(dtxy.bc);
            ixwVar2.d = new bbof();
            ixwVar2.c = true;
            ixwVar2.e = h(new Runnable(this) { // from class: bbnr
                private final bboh a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bboh bbohVar = this.a;
                    bbohVar.c.a().o(bbohVar.f);
                }
            });
            this.p = t.n(ixwVar2.a()).z();
        }
        return this.p;
    }

    @Override // defpackage.bbnf
    public List<bbne> b() {
        Runnable h;
        bbnk a;
        dqcw dqcwVar;
        dpro dproVar;
        if (this.q == null) {
            ArrayList arrayList = new ArrayList();
            ilo c = this.f.c();
            if (c != null) {
                dqbi dqbiVar = c.h().bg;
                if (dqbiVar == null) {
                    dqbiVar = dqbi.g;
                }
                for (final dqbv dqbvVar : dqbiVar.e) {
                    if (!this.m || dqbu.a(dqbvVar.a) != 3) {
                        int a2 = dqbu.a(dqbvVar.a);
                        int i2 = a2 - 1;
                        if (a2 == 0) {
                            throw null;
                        }
                        if (i2 == 0) {
                            h = h(new Runnable(this, dqbvVar) { // from class: bbnx
                                private final bboh a;
                                private final dqbv b;

                                {
                                    this.a = this;
                                    this.b = dqbvVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    dqem dqemVar;
                                    bboh bbohVar = this.a;
                                    dqbv dqbvVar2 = this.b;
                                    bbohVar.c.a().F(bbohVar.f);
                                    bbdv a3 = bbohVar.c.a();
                                    if (dqbvVar2.a == 1) {
                                        dqemVar = (dqem) dqbvVar2.b;
                                    } else {
                                        dqemVar = dqem.e;
                                    }
                                    deha.q(a3.p(dqemVar), new bbod(bbohVar), bbohVar.d);
                                }
                            });
                        } else if (i2 == 1) {
                            h = h(new Runnable(this) { // from class: bbnw
                                private final bboh a;

                                {
                                    this.a = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.g();
                                }
                            });
                        } else if (i2 == 2) {
                            h = h(new Runnable(this, dqbvVar) { // from class: bbnv
                                private final bboh a;
                                private final dqbv b;

                                {
                                    this.a = this;
                                    this.b = dqbvVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    dqcw dqcwVar2;
                                    bboh bbohVar = this.a;
                                    dqbv dqbvVar2 = this.b;
                                    ilo c2 = bbohVar.f.c();
                                    if (c2 == null) {
                                        bbohVar.e();
                                        return;
                                    }
                                    if (dqbvVar2.a == 3) {
                                        dqcwVar2 = (dqcw) dqbvVar2.b;
                                    } else {
                                        dqcwVar2 = dqcw.b;
                                    }
                                    dpqg b = dpqg.b(dqcwVar2.a);
                                    if (b == null) {
                                        b = dpqg.TYPE_UNKNOWN;
                                    }
                                    bbohVar.d(c2, b);
                                }
                            });
                        } else {
                            h = i2 != 3 ? null : h(new Runnable(this, dqbvVar) { // from class: bbnu
                                private final bboh a;
                                private final dqbv b;

                                {
                                    this.a = this;
                                    this.b = dqbvVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    dpro dproVar2;
                                    dpro dproVar3;
                                    bboh bbohVar = this.a;
                                    dqbv dqbvVar2 = this.b;
                                    if (dqbvVar2.a == 4) {
                                        dproVar2 = (dpro) dqbvVar2.b;
                                    } else {
                                        dproVar2 = dpro.c;
                                    }
                                    dprn dprnVar = dproVar2.a;
                                    if (dprnVar == null) {
                                        dprnVar = dprn.c;
                                    }
                                    ily ilyVar = new ily();
                                    ilyVar.k(dprnVar.a);
                                    ilyVar.F(dprnVar.b);
                                    ilo d = ilyVar.d();
                                    if (dqbvVar2.a == 4) {
                                        dproVar3 = (dpro) dqbvVar2.b;
                                    } else {
                                        dproVar3 = dpro.c;
                                    }
                                    dpqg b = dpqg.b(dproVar3.b);
                                    if (b == null) {
                                        b = dpqg.TYPE_UNKNOWN;
                                    }
                                    bbohVar.d(d, b);
                                }
                            });
                        }
                        if (h == null) {
                            a = null;
                        } else {
                            dqbt dqbtVar = dqbvVar.c;
                            if (dqbtVar == null) {
                                dqbtVar = dqbt.c;
                            }
                            String str = dqbtVar.b;
                            ckqc ckqcVar = ckqc.FULLY_QUALIFIED;
                            int a3 = dqbu.a(dqbvVar.a);
                            int i3 = a3 - 1;
                            if (a3 != 0) {
                                int i4 = 2131232205;
                                if (i3 != 1) {
                                    if (i3 == 2) {
                                        if (dqbvVar.a == 3) {
                                            dqcwVar = (dqcw) dqbvVar.b;
                                        } else {
                                            dqcwVar = dqcw.b;
                                        }
                                        dpqg b = dpqg.b(dqcwVar.a);
                                        if (b == null) {
                                            b = dpqg.TYPE_UNKNOWN;
                                        }
                                        i4 = i(b);
                                    } else if (i3 == 3) {
                                        if (dqbvVar.a == 4) {
                                            dproVar = (dpro) dqbvVar.b;
                                        } else {
                                            dproVar = dpro.c;
                                        }
                                        dpqg b2 = dpqg.b(dproVar.b);
                                        if (b2 == null) {
                                            b2 = dpqg.TYPE_UNKNOWN;
                                        }
                                        i4 = i(b2);
                                    }
                                }
                                jic jicVar = new jic(str, ckqcVar, cqrt.g(i4, ibm.n()), 0);
                                cjta b3 = cjtd.b();
                                b3.d = dtxy.aV;
                                b3.g(dqbvVar.d);
                                cjtd a4 = b3.a();
                                dqbt dqbtVar2 = dqbvVar.c;
                                if (dqbtVar2 == null) {
                                    dqbtVar2 = dqbt.c;
                                }
                                a = bbnl.a(jicVar, a4, h, dqbtVar2.a);
                            } else {
                                throw null;
                            }
                        }
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                }
            }
            if (j()) {
                arrayList.add(bbnl.a(new jic((String) null, ckqc.FULLY_QUALIFIED, cqrt.g(2131232249, ibm.n()), 0), cjtd.a(dtxy.bb), h(new Runnable(this) { // from class: bbnq
                    private final bboh a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bboh bbohVar = this.a;
                        bbohVar.b.a().C(bbohVar.f);
                    }
                }), this.a.getString(R.string.PERSONAL_SCORE_PREFERENCES_ENTRY_LABEL)));
            }
            this.q = arrayList;
        }
        return this.q;
    }

    @Override // defpackage.bbnf
    public Boolean c() {
        return Boolean.valueOf(this.n);
    }

    public final void d(ilo iloVar, dpqg dpqgVar) {
        this.c.a().F(this.f);
        this.c.a().B(iloVar, dpqgVar, this.e);
    }

    public final void e() {
        this.d.execute(new Runnable(this) { // from class: bbny
            private final bboh a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(this.a.a, (int) R.string.PERSONAL_SCORE_EDIT_HISTORY_FAILURE, 1).show();
            }
        });
    }

    public final void g() {
        if (!this.a.aZ) {
            return;
        }
        angp a = this.l.a();
        dbpy<Object> dbpyVar = dbpy.a;
        dbpy<Object> dbpyVar2 = dbpy.a;
        ilo c = this.f.c();
        dbsk.s(c);
        a.g(dbpyVar, dbpyVar2, c.h(), dbpy.a, j, dbpy.a, dbsg.i(new bbog(this)));
        this.c.a().E(this.f);
    }

    public final Runnable h(final Runnable runnable) {
        return new Runnable(this, runnable) { // from class: bbns
            private final bboh a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bboh bbohVar = this.a;
                Runnable runnable2 = this.b;
                bbohVar.g.run();
                runnable2.run();
            }
        };
    }
}
