package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbad  reason: default package */
/* loaded from: classes4.dex */
public class cbad implements cbqq {
    public dpsd a;
    private final cbau b;
    private final cazb c;
    private final cazb d;
    private final cbdw e;
    private final cbdw f;
    private final idl g;
    private final cbbc h;
    private final gga i;
    private boolean j;
    private Runnable k = null;

    public cbad(final cbau cbauVar, final cazb cazbVar, final cazb cazbVar2, final cbdw cbdwVar, final cbdw cbdwVar2, cbbc cbbcVar, cqhn cqhnVar, cbqd cbqdVar, gga ggaVar) {
        this.b = cbauVar;
        this.c = cazbVar;
        this.d = cazbVar2;
        this.e = cbdwVar;
        this.f = cbdwVar2;
        this.g = cbqdVar.a(cbqv.DAILY);
        this.i = ggaVar;
        this.j = cbauVar.c() != null;
        dpsd a = cbauVar.a();
        if (a == null || (a.a & 1) == 0) {
            dpvi b = cbauVar.b();
            dqji bZ = dqjj.e.bZ();
            int i = b.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dqjj dqjjVar = (dqjj) bZ.b;
            int i2 = dqjjVar.a | 1;
            dqjjVar.a = i2;
            dqjjVar.b = i;
            int i3 = b.f;
            dqjjVar.a = i2 | 2;
            dqjjVar.c = i3;
            dqjj bK = bZ.bK();
            dpog bZ2 = dpoh.c.bZ();
            dptj bZ3 = dptk.d.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dptk dptkVar = (dptk) bZ3.b;
            bK.getClass();
            dptkVar.b = bK;
            dptkVar.a |= 1;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpoh dpohVar = (dpoh) bZ2.b;
            dptk bK2 = bZ3.bK();
            bK2.getClass();
            dpohVar.b = bK2;
            dpohVar.a |= 1;
            dpoh bK3 = bZ2.bK();
            dpsd a2 = cbauVar.a();
            a2 = a2 == null ? dpsd.f : a2;
            dsqp dsqpVar = (dsqp) a2.cu(5);
            dsqpVar.bC(a2);
            dpsc dpscVar = (dpsc) dsqpVar;
            if (dpscVar.c) {
                dpscVar.bF();
                dpscVar.c = false;
            }
            dpsd dpsdVar = (dpsd) dpscVar.b;
            bK3.getClass();
            dpsdVar.b = bK3;
            dpsdVar.a |= 1;
            a = dpscVar.bK();
            cbauVar.d(a);
        }
        this.a = a;
        cazbVar.d(new Runnable(this, cazbVar, cazbVar2, cbauVar) { // from class: cazy
            private final cbad a;
            private final cazb b;
            private final cazb c;
            private final cbau d;

            {
                this.a = this;
                this.b = cazbVar;
                this.c = cazbVar2;
                this.d = cbauVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbad cbadVar = this.a;
                cazb cazbVar3 = this.b;
                cazb cazbVar4 = this.c;
                cbau cbauVar2 = this.d;
                final dpvi g = cazbVar3.g();
                if (g != null) {
                    dpvi g2 = cazbVar4.g();
                    if (g2 != null && !cbpy.a(g).C(cbpy.a(g2))) {
                        cbadVar.e();
                    }
                    cazbVar4.h(g);
                    cazbVar4.i(new cbbs(g) { // from class: cbac
                        private final dpvi a;

                        {
                            this.a = g;
                        }

                        @Override // defpackage.cbbs
                        public final dpvi a() {
                            return cbpy.b(this.a, 1);
                        }
                    });
                    cbauVar2.i(g);
                }
                cqkx.p(cbadVar);
            }
        });
        cazbVar2.d(new Runnable(this, cazbVar2, cbauVar) { // from class: cazz
            private final cbad a;
            private final cazb b;
            private final cbau c;

            {
                this.a = this;
                this.b = cazbVar2;
                this.c = cbauVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbad cbadVar = this.a;
                cazb cazbVar3 = this.b;
                cbau cbauVar2 = this.c;
                dpvi g = cazbVar3.g();
                if (g != null) {
                    cbauVar2.n(g);
                    dpoh dpohVar2 = cbadVar.a.b;
                    if (dpohVar2 == null) {
                        dpohVar2 = dpoh.c;
                    }
                    dptk dptkVar2 = dpohVar2.b;
                    if (dptkVar2 == null) {
                        dptkVar2 = dptk.d;
                    }
                    if ((dptkVar2.a & 2) != 0) {
                        dpoh dpohVar3 = cbadVar.a.b;
                        if (dpohVar3 == null) {
                            dpohVar3 = dpoh.c;
                        }
                        dptk dptkVar3 = dpohVar3.b;
                        if (dptkVar3 == null) {
                            dptkVar3 = dptk.d;
                        }
                        dqjj dqjjVar2 = dptkVar3.c;
                        if (dqjjVar2 == null) {
                            dqjjVar2 = dqjj.e;
                        }
                        cbauVar2.m(dqjjVar2);
                    }
                }
                cqkx.p(cbadVar);
            }
        });
        cbdwVar.c = new Runnable(this, cbdwVar, cbauVar) { // from class: cbaa
            private final cbad a;
            private final cbdw b;
            private final cbau c;

            {
                this.a = this;
                this.b = cbdwVar;
                this.c = cbauVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbad cbadVar = this.a;
                cbadVar.a = cbad.v(this.b, true, cbadVar.a, this.c);
                cqkx.p(cbadVar);
            }
        };
        cbdwVar2.c = new Runnable(this, cbdwVar2, cbauVar) { // from class: cbab
            private final cbad a;
            private final cbdw b;
            private final cbau c;

            {
                this.a = this;
                this.b = cbdwVar2;
                this.c = cbauVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbad cbadVar = this.a;
                cbadVar.a = cbad.v(this.b, false, cbadVar.a, this.c);
                cqkx.p(cbadVar);
            }
        };
        cazbVar2.h(cazbVar.g());
        this.h = cbbcVar;
    }

    public static dpsd v(cbdw cbdwVar, boolean z, dpsd dpsdVar, cbau cbauVar) {
        dpvi dpviVar = cbdwVar.d;
        if (dpviVar != null) {
            dqji bZ = dqjj.e.bZ();
            int i = dpviVar.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dqjj dqjjVar = (dqjj) bZ.b;
            int i2 = dqjjVar.a | 1;
            dqjjVar.a = i2;
            dqjjVar.b = i;
            int i3 = dpviVar.f;
            dqjjVar.a = i2 | 2;
            dqjjVar.c = i3;
            dqjj bK = bZ.bK();
            dpoh dpohVar = dpsdVar.b;
            if (dpohVar == null) {
                dpohVar = dpoh.c;
            }
            dptk dptkVar = dpohVar.b;
            if (dptkVar == null) {
                dptkVar = dptk.d;
            }
            dptj ca = dptk.d.ca(dptkVar);
            if (z) {
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dptk dptkVar2 = (dptk) ca.b;
                bK.getClass();
                dptkVar2.b = bK;
                dptkVar2.a |= 1;
                cbauVar.k(bK);
            } else {
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dptk dptkVar3 = (dptk) ca.b;
                bK.getClass();
                dptkVar3.c = bK;
                dptkVar3.a |= 2;
                if (cbauVar.c() != null) {
                    cbauVar.m(bK);
                }
            }
            dpoh dpohVar2 = dpsdVar.b;
            if (dpohVar2 == null) {
                dpohVar2 = dpoh.c;
            }
            dpog ca2 = dpoh.c.ca(dpohVar2);
            if (ca2.c) {
                ca2.bF();
                ca2.c = false;
            }
            dpoh dpohVar3 = (dpoh) ca2.b;
            dptk bK2 = ca.bK();
            bK2.getClass();
            dpohVar3.b = bK2;
            dpohVar3.a |= 1;
            dpoh bK3 = ca2.bK();
            dsqp dsqpVar = (dsqp) dpsdVar.cu(5);
            dsqpVar.bC(dpsdVar);
            dpsc dpscVar = (dpsc) dsqpVar;
            if (dpscVar.c) {
                dpscVar.bF();
                dpscVar.c = false;
            }
            dpsd dpsdVar2 = (dpsd) dpscVar.b;
            bK3.getClass();
            dpsdVar2.b = bK3;
            dpsdVar2.a |= 1;
            dpsdVar = dpscVar.bK();
        }
        cbauVar.d(dpsdVar);
        return dpsdVar;
    }

    private final void w() {
        Runnable runnable = this.k;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.cbrj
    public String a() {
        return this.i.getString(R.string.DAILY_REPEATING_EVENT_START_DATE_INPUT_TITLE);
    }

    @Override // defpackage.cbrj
    public String b() {
        return this.h.i(this.b.b(), true);
    }

    @Override // defpackage.cbrj
    public Boolean c() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.cbrj
    public cqkl d() {
        this.c.e();
        w();
        return cqkl.a;
    }

    @Override // defpackage.cbrj
    public cqkl e() {
        this.j = false;
        this.b.l(null);
        this.d.f();
        cqkx.p(this);
        w();
        return cqkl.a;
    }

    @Override // defpackage.cbqw
    public String f() {
        dqjj dqjjVar;
        dpoh dpohVar = this.a.b;
        if (dpohVar == null) {
            dpohVar = dpoh.c;
        }
        dptk dptkVar = dpohVar.b;
        if (dptkVar == null) {
            dptkVar = dptk.d;
        }
        cbbc cbbcVar = this.h;
        dqjj dqjjVar2 = dptkVar.b;
        if (dqjjVar2 == null) {
            dqjjVar2 = dqjj.e;
        }
        if ((dptkVar.a & 2) != 0) {
            dqjjVar = dptkVar.c;
            if (dqjjVar == null) {
                dqjjVar = dqjj.e;
            }
        } else {
            dqjjVar = null;
        }
        String c = cbbcVar.c(dqjjVar2, dqjjVar);
        dpvi c2 = this.b.c();
        if (c2 != null) {
            return this.i.getString(R.string.DAILY_REPEATING_EVENT_DYNAMIC_SUMMARY_STRING_START_DATE_AND_END_DATE, new Object[]{this.h.h(this.b.b(), c2), c});
        }
        return this.i.getString(R.string.DAILY_REPEATING_EVENT_DYNAMIC_SUMMARY_STRING_START_DATE_ONLY, new Object[]{this.h.i(this.b.b(), false), c});
    }

    @Override // defpackage.cbqw
    public idl g() {
        return this.g;
    }

    @Override // defpackage.cbrj
    public String h() {
        return this.i.getString(R.string.ENDING_TITLE);
    }

    @Override // defpackage.cbrj
    @dzsi
    public String i() {
        dpvi c = this.b.c();
        if (c != null) {
            return this.h.i(c, true);
        }
        return null;
    }

    @Override // defpackage.cbrj
    public String j() {
        return this.i.getString(R.string.DOES_NOT_END_TEXT);
    }

    @Override // defpackage.cbrj
    public cqkl k() {
        if (!this.j) {
            this.j = true;
            cqkx.p(this);
        }
        this.d.e();
        w();
        return cqkl.a;
    }

    public cbqt l() {
        return this.b;
    }

    public void m(Runnable runnable) {
        this.k = runnable;
        w();
    }

    @Override // defpackage.cbrk
    public String n() {
        return this.i.getString(R.string.TIME_TITLE);
    }

    @Override // defpackage.cbrk
    public String o() {
        cbbc cbbcVar = this.h;
        dpoh dpohVar = this.a.b;
        if (dpohVar == null) {
            dpohVar = dpoh.c;
        }
        dptk dptkVar = dpohVar.b;
        if (dptkVar == null) {
            dptkVar = dptk.d;
        }
        dqjj dqjjVar = dptkVar.b;
        if (dqjjVar == null) {
            dqjjVar = dqjj.e;
        }
        return cbbcVar.b(dqjjVar);
    }

    @Override // defpackage.cbrk
    public cqkl p() {
        this.e.g();
        w();
        return cqkl.a;
    }

    @Override // defpackage.cbrk
    @dzsi
    public String q() {
        dpoh dpohVar = this.a.b;
        if (dpohVar == null) {
            dpohVar = dpoh.c;
        }
        dptk dptkVar = dpohVar.b;
        if (dptkVar == null) {
            dptkVar = dptk.d;
        }
        if ((dptkVar.a & 2) != 0) {
            cbbc cbbcVar = this.h;
            dpoh dpohVar2 = this.a.b;
            if (dpohVar2 == null) {
                dpohVar2 = dpoh.c;
            }
            dptk dptkVar2 = dpohVar2.b;
            if (dptkVar2 == null) {
                dptkVar2 = dptk.d;
            }
            dqjj dqjjVar = dptkVar2.c;
            if (dqjjVar == null) {
                dqjjVar = dqjj.e;
            }
            return cbbcVar.b(dqjjVar);
        }
        return null;
    }

    @Override // defpackage.cbrk
    public cqkl r() {
        this.f.g();
        w();
        return cqkl.a;
    }

    @Override // defpackage.cbrk
    public cqkl s() {
        dpoh dpohVar = this.a.b;
        if (dpohVar == null) {
            dpohVar = dpoh.c;
        }
        dptk dptkVar = dpohVar.b;
        if (dptkVar == null) {
            dptkVar = dptk.d;
        }
        dsqp dsqpVar = (dsqp) dptkVar.cu(5);
        dsqpVar.bC(dptkVar);
        dptj dptjVar = (dptj) dsqpVar;
        if (dptjVar.c) {
            dptjVar.bF();
            dptjVar.c = false;
        }
        dptk dptkVar2 = (dptk) dptjVar.b;
        dptkVar2.c = null;
        dptkVar2.a &= -3;
        dptk bK = dptjVar.bK();
        dpoh dpohVar2 = this.a.b;
        if (dpohVar2 == null) {
            dpohVar2 = dpoh.c;
        }
        dsqp dsqpVar2 = (dsqp) dpohVar2.cu(5);
        dsqpVar2.bC(dpohVar2);
        dpog dpogVar = (dpog) dsqpVar2;
        if (dpogVar.c) {
            dpogVar.bF();
            dpogVar.c = false;
        }
        dpoh dpohVar3 = (dpoh) dpogVar.b;
        bK.getClass();
        dpohVar3.b = bK;
        dpohVar3.a |= 1;
        dpoh bK2 = dpogVar.bK();
        dpsd dpsdVar = this.a;
        dsqp dsqpVar3 = (dsqp) dpsdVar.cu(5);
        dsqpVar3.bC(dpsdVar);
        dpsc dpscVar = (dpsc) dsqpVar3;
        if (dpscVar.c) {
            dpscVar.bF();
            dpscVar.c = false;
        }
        dpsd dpsdVar2 = (dpsd) dpscVar.b;
        bK2.getClass();
        dpsdVar2.b = bK2;
        dpsdVar2.a |= 1;
        dpsd bK3 = dpscVar.bK();
        this.a = bK3;
        this.b.d(bK3);
        this.b.m(null);
        cqkx.p(this);
        w();
        return cqkl.a;
    }

    @Override // defpackage.cbrk
    public String t() {
        return this.i.getString(R.string.STARTS_HINT);
    }

    @Override // defpackage.cbrk
    public String u() {
        return this.i.getString(R.string.ENDS_HINT);
    }
}
