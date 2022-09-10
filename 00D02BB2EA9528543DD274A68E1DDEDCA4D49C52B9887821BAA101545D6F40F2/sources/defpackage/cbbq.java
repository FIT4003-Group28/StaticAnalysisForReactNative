package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbbq  reason: default package */
/* loaded from: classes4.dex */
public class cbbq implements cbqz {
    public final cbau a;
    public final gga b;
    public dpsd c;
    private final cbbp d;
    private final cbbo e;
    private final cazb f;
    private final cazb g;
    private final cbdw h;
    private final cbdw i;
    private final idl j;
    private final cbbc k;
    private Runnable l = null;
    private boolean m;

    public cbbq(final cbau cbauVar, final cazb cazbVar, final cazb cazbVar2, final cbdw cbdwVar, final cbdw cbdwVar2, cbbc cbbcVar, cqhn cqhnVar, cbqd cbqdVar, gga ggaVar) {
        this.a = cbauVar;
        this.f = cazbVar;
        this.g = cazbVar2;
        this.h = cbdwVar;
        this.i = cbdwVar2;
        this.k = cbbcVar;
        this.b = ggaVar;
        dpsd a = cbauVar.a();
        boolean z = true;
        if (a == null || a.c.size() <= 0) {
            dpvi b = cbauVar.b();
            dptj bZ = dptk.d.bZ();
            dqji bZ2 = dqjj.e.bZ();
            int i = b.e;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqjj dqjjVar = (dqjj) bZ2.b;
            int i2 = dqjjVar.a | 1;
            dqjjVar.a = i2;
            dqjjVar.b = i;
            int i3 = b.f;
            dqjjVar.a = i2 | 2;
            dqjjVar.c = i3;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dptk dptkVar = (dptk) bZ.b;
            dqjj bK = bZ2.bK();
            bK.getClass();
            dptkVar.b = bK;
            dptkVar.a |= 1;
            dpvi c = cbauVar.c();
            if (c != null) {
                dqji bZ3 = dqjj.e.bZ();
                int i4 = c.e;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dqjj dqjjVar2 = (dqjj) bZ3.b;
                int i5 = dqjjVar2.a | 1;
                dqjjVar2.a = i5;
                dqjjVar2.b = i4;
                int i6 = c.f;
                dqjjVar2.a = i5 | 2;
                dqjjVar2.c = i6;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dptk dptkVar2 = (dptk) bZ.b;
                dqjj bK2 = bZ3.bK();
                bK2.getClass();
                dptkVar2.c = bK2;
                dptkVar2.a |= 2;
            }
            dqmm bZ4 = dqmn.f.bZ();
            dpol b2 = dpol.b(cbpy.a(b).p());
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dqmn dqmnVar = (dqmn) bZ4.b;
            b2.getClass();
            dqmnVar.b();
            dqmnVar.c.h(b2.i);
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dqmn dqmnVar2 = (dqmn) bZ4.b;
            dptk bK3 = bZ.bK();
            bK3.getClass();
            dqmnVar2.e = bK3;
            dqmnVar2.a |= 2;
            dpsc bZ5 = dpsd.f.bZ();
            bZ5.d(bZ4.bK());
            a = bZ5.bK();
            cbauVar.d(a);
        }
        this.c = a;
        this.e = new cbbo(this);
        this.d = new cbbp(this);
        cazbVar.d(new Runnable(this, cazbVar, cazbVar2, cbauVar) { // from class: cbbj
            private final cbbq a;
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
                cbbq cbbqVar = this.a;
                cazb cazbVar3 = this.b;
                cazb cazbVar4 = this.c;
                cbau cbauVar2 = this.d;
                final dpvi g = cazbVar3.g();
                if (g != null) {
                    dpvi g2 = cazbVar4.g();
                    if (g2 != null && !cbbq.z(g, g2)) {
                        cbbqVar.y();
                    }
                    cbbqVar.x(g);
                    cazbVar4.i(new cbbs(g) { // from class: cbbn
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
                cqkx.p(cbbqVar);
            }
        });
        cazbVar2.d(new Runnable(this, cazbVar2, cbauVar) { // from class: cbbk
            private final cbbq a;
            private final cazb b;
            private final cbau c;

            {
                this.a = this;
                this.b = cazbVar2;
                this.c = cbauVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbbq cbbqVar = this.a;
                cazb cazbVar3 = this.b;
                cbau cbauVar2 = this.c;
                dpvi g = cazbVar3.g();
                if (g != null) {
                    cbauVar2.n(g);
                    dptk dptkVar3 = cbbqVar.c.c.get(0).e;
                    if (dptkVar3 == null) {
                        dptkVar3 = dptk.d;
                    }
                    if ((dptkVar3.a & 2) != 0) {
                        dptk dptkVar4 = cbbqVar.c.c.get(0).e;
                        if (dptkVar4 == null) {
                            dptkVar4 = dptk.d;
                        }
                        dqjj dqjjVar3 = dptkVar4.c;
                        if (dqjjVar3 == null) {
                            dqjjVar3 = dqjj.e;
                        }
                        cbauVar2.m(dqjjVar3);
                    }
                }
                cqkx.p(cbbqVar);
            }
        });
        cbdwVar.c = new Runnable(this, cbdwVar, cbauVar) { // from class: cbbl
            private final cbbq a;
            private final cbdw b;
            private final cbau c;

            {
                this.a = this;
                this.b = cbdwVar;
                this.c = cbauVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbbq cbbqVar = this.a;
                cbbqVar.c = cbbq.A(this.b, this.c, true);
                cqkx.p(cbbqVar);
            }
        };
        cbdwVar2.c = new Runnable(this, cbdwVar2, cbauVar) { // from class: cbbm
            private final cbbq a;
            private final cbdw b;
            private final cbau c;

            {
                this.a = this;
                this.b = cbdwVar2;
                this.c = cbauVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbbq cbbqVar = this.a;
                cbbqVar.c = cbbq.A(this.b, this.c, false);
                cqkx.p(cbbqVar);
            }
        };
        this.j = cbqdVar.a(cbqv.WEEKLY);
        dpvi c2 = cbauVar.c();
        if (c2 != null && !z(cbauVar.b(), c2)) {
            cbauVar.l(null);
        }
        this.m = cbauVar.c() == null ? false : z;
        x(cazbVar.g());
    }

    public static dpsd A(cbdw cbdwVar, cbau cbauVar, boolean z) {
        dpsd a = cbauVar.a();
        if (a == null) {
            a = dpsd.f;
        }
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
            dptk dptkVar = a.c.get(0).e;
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
            dccx dccxVar = new dccx();
            for (dqmn dqmnVar : a.c) {
                dsqp dsqpVar = (dsqp) dqmnVar.cu(5);
                dsqpVar.bC(dqmnVar);
                dqmm dqmmVar = (dqmm) dsqpVar;
                if (dqmmVar.c) {
                    dqmmVar.bF();
                    dqmmVar.c = false;
                }
                dqmn dqmnVar2 = (dqmn) dqmmVar.b;
                dptk bK2 = ca.bK();
                bK2.getClass();
                dqmnVar2.e = bK2;
                dqmnVar2.a |= 2;
                dccxVar.g(dqmmVar.bK());
            }
            dsqp dsqpVar2 = (dsqp) a.cu(5);
            dsqpVar2.bC(a);
            dpsc dpscVar = (dpsc) dsqpVar2;
            if (dpscVar.c) {
                dpscVar.bF();
                dpscVar.c = false;
            }
            ((dpsd) dpscVar.b).c = dpsd.ck();
            dpscVar.a(dccxVar.f());
            a = dpscVar.bK();
        }
        cbauVar.d(a);
        return a;
    }

    private final void B() {
        Runnable runnable = this.l;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static boolean z(dpvi dpviVar, dpvi dpviVar2) {
        return cbpy.a(dpviVar2).B(cbpy.a(cbpy.c(dpviVar, 5)));
    }

    @Override // defpackage.cbrj
    public String a() {
        return this.b.getString(R.string.STARTING_TITLE);
    }

    @Override // defpackage.cbrj
    public String b() {
        return this.k.i(this.a.b(), true);
    }

    @Override // defpackage.cbrj
    public Boolean c() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.cbrj
    public cqkl d() {
        this.f.e();
        B();
        return cqkl.a;
    }

    @Override // defpackage.cbrj
    public cqkl e() {
        y();
        return cqkl.a;
    }

    @Override // defpackage.cbqw
    public String f() {
        dqjj dqjjVar;
        dptk dptkVar = this.c.c.get(0).e;
        if (dptkVar == null) {
            dptkVar = dptk.d;
        }
        cbbc cbbcVar = this.k;
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
        String f = this.k.f(dcdc.r(new dsrh(this.c.c.get(0).c, dqmn.d)));
        if (f.isEmpty()) {
            return "";
        }
        if (this.c.c.get(0).b == 1) {
            if (this.c.c.get(0).c.size() > 1) {
                return this.b.getString(R.string.WEEKLY_REPEATING_DYNAMIC_SUMMARY_MULTI_DAY_EVERY_WEEK, new Object[]{f, c});
            }
            gga ggaVar = this.b;
            dpol dpolVar = dpol.DAY_OF_WEEK_UNSPECIFIED;
            int ordinal = dqmn.d.a(Integer.valueOf(this.c.c.get(0).c.f(0))).ordinal();
            int i = R.string.WEEKLY_REPEATING_DYNAMIC_SUMMARY_EVERY_SUNDAY;
            switch (ordinal) {
                case 1:
                    i = R.string.WEEKLY_REPEATING_DYNAMIC_SUMMARY_EVERY_MONDAY;
                    break;
                case 2:
                    i = R.string.WEEKLY_REPEATING_DYNAMIC_SUMMARY_EVERY_TUESDAY;
                    break;
                case 3:
                    i = R.string.WEEKLY_REPEATING_DYNAMIC_SUMMARY_EVERY_WEDNESDAY;
                    break;
                case 4:
                    i = R.string.WEEKLY_REPEATING_DYNAMIC_SUMMARY_EVERY_THURSDAY;
                    break;
                case 5:
                    i = R.string.WEEKLY_REPEATING_DYNAMIC_SUMMARY_EVERY_FRIDAY;
                    break;
                case 6:
                    i = R.string.WEEKLY_REPEATING_DYNAMIC_SUMMARY_EVERY_SATURDAY;
                    break;
            }
            return ggaVar.getString(i, new Object[]{c});
        }
        return this.b.getString(R.string.WEEKLY_REPEATING_DYNAMIC_SUMMARY_MULTI_WEEK, new Object[]{Integer.valueOf(this.c.c.get(0).b), f, c});
    }

    @Override // defpackage.cbqw
    public idl g() {
        return this.j;
    }

    @Override // defpackage.cbrj
    public String h() {
        return this.b.getString(R.string.ENDING_TITLE);
    }

    @Override // defpackage.cbrj
    @dzsi
    public String i() {
        dpvi c = this.a.c();
        if (c != null) {
            return this.k.i(c, true);
        }
        return null;
    }

    @Override // defpackage.cbrj
    public String j() {
        return this.b.getString(R.string.DOES_NOT_END_TEXT);
    }

    @Override // defpackage.cbrj
    public cqkl k() {
        if (!this.m) {
            this.m = true;
            cqkx.p(this);
        }
        this.g.e();
        B();
        return cqkl.a;
    }

    @Override // defpackage.cbqz
    public bsgz l() {
        return this.d;
    }

    @Override // defpackage.cbqz
    public bsgz m() {
        return this.e;
    }

    @Override // defpackage.cbrk
    public String n() {
        return this.b.getString(R.string.TIME_TITLE);
    }

    @Override // defpackage.cbrk
    public String o() {
        return this.k.a(this.a.b());
    }

    @Override // defpackage.cbrk
    public cqkl p() {
        this.h.g();
        B();
        return cqkl.a;
    }

    @Override // defpackage.cbrk
    @dzsi
    public String q() {
        dptk dptkVar = this.c.c.get(0).e;
        if (dptkVar == null) {
            dptkVar = dptk.d;
        }
        if ((dptkVar.a & 2) != 0) {
            cbbc cbbcVar = this.k;
            dptk dptkVar2 = this.c.c.get(0).e;
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
        this.i.g();
        B();
        return cqkl.a;
    }

    @Override // defpackage.cbrk
    public cqkl s() {
        dptk dptkVar = this.c.c.get(0).e;
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
        dqmn dqmnVar = this.c.c.get(0);
        dsqp dsqpVar2 = (dsqp) dqmnVar.cu(5);
        dsqpVar2.bC(dqmnVar);
        dqmm dqmmVar = (dqmm) dsqpVar2;
        if (dqmmVar.c) {
            dqmmVar.bF();
            dqmmVar.c = false;
        }
        dqmn dqmnVar2 = (dqmn) dqmmVar.b;
        bK.getClass();
        dqmnVar2.e = bK;
        dqmnVar2.a |= 2;
        dqmn bK2 = dqmmVar.bK();
        dpsd dpsdVar = this.c;
        dsqp dsqpVar3 = (dsqp) dpsdVar.cu(5);
        dsqpVar3.bC(dpsdVar);
        dpsc dpscVar = (dpsc) dsqpVar3;
        if (dpscVar.c) {
            dpscVar.bF();
            dpscVar.c = false;
        }
        ((dpsd) dpscVar.b).c = dpsd.ck();
        dpscVar.d(bK2);
        dpsd bK3 = dpscVar.bK();
        this.c = bK3;
        this.a.d(bK3);
        this.a.m(null);
        cqkx.p(this);
        B();
        return cqkl.a;
    }

    @Override // defpackage.cbrk
    public String t() {
        return this.b.getString(R.string.STARTS_HINT);
    }

    @Override // defpackage.cbrk
    public String u() {
        return this.b.getString(R.string.ENDS_HINT);
    }

    public cbqt v() {
        return this.a;
    }

    public void w(Runnable runnable) {
        this.l = runnable;
        B();
    }

    public final void x(dpvi dpviVar) {
        this.g.h(cbpy.c(dpviVar, 6));
    }

    public final void y() {
        if (this.m) {
            this.m = false;
            this.a.l(null);
            this.g.f();
            cqkx.p(this);
            B();
        }
    }
}
