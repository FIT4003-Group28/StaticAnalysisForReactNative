package defpackage;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import com.google.android.apps.maps.R;
import java.util.Calendar;
/* compiled from: PG */
/* renamed from: cbar  reason: default package */
/* loaded from: classes4.dex */
public class cbar implements cbqr {
    public final cbau a;
    public final gga b;
    public int c;
    public dpsd d;
    private final cazb e;
    private final cazb f;
    private final cbdw g;
    private final cbdw h;
    private final cbbc i;
    private final idl j;
    private final cbaq k;
    private final ArrayAdapter<String> l;
    private boolean m;
    private Runnable n = null;

    public cbar(final cbau cbauVar, final cazb cazbVar, final cazb cazbVar2, final cbdw cbdwVar, final cbdw cbdwVar2, cbbc cbbcVar, cqhn cqhnVar, gga ggaVar, cbqd cbqdVar) {
        boolean z;
        this.a = cbauVar;
        this.e = cazbVar;
        this.f = cazbVar2;
        this.g = cbdwVar;
        this.h = cbdwVar2;
        this.b = ggaVar;
        this.j = cbqdVar.a(cbqv.MONTHLY);
        dpsd a = cbauVar.a();
        boolean z2 = true;
        if (a == null || a.d.size() <= 0) {
            dpye bZ = dpyf.f.bZ();
            dpvi b = cbauVar.b();
            dptj bZ2 = dptk.d.bZ();
            dqji bZ3 = dqjj.e.bZ();
            int i = b.e;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dqjj dqjjVar = (dqjj) bZ3.b;
            int i2 = dqjjVar.a | 1;
            dqjjVar.a = i2;
            dqjjVar.b = i;
            int i3 = b.f;
            dqjjVar.a = i2 | 2;
            dqjjVar.c = i3;
            dqjj bK = bZ3.bK();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dptk dptkVar = (dptk) bZ2.b;
            bK.getClass();
            dptkVar.b = bK;
            dptkVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpyf dpyfVar = (dpyf) bZ.b;
            dptk bK2 = bZ2.bK();
            bK2.getClass();
            dpyfVar.e = bK2;
            dpyfVar.a |= 1;
            Calendar calendar = Calendar.getInstance();
            calendar.set(b.b, b.c - 1, b.d);
            dpol d = cbpy.d(Integer.valueOf(calendar.get(7)));
            if (d != null) {
                bZ.a(d);
            }
            double d2 = b.d;
            Double.isNaN(d2);
            int ceil = (int) Math.ceil(d2 / 7.0d);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpyf dpyfVar2 = (dpyf) bZ.b;
            dpyfVar2.b();
            dpyfVar2.d.h(ceil);
            dpsd a2 = cbauVar.a();
            a2 = a2 == null ? dpsd.f : a2;
            dsqp dsqpVar = (dsqp) a2.cu(5);
            dsqpVar.bC(a2);
            dpsc dpscVar = (dpsc) dsqpVar;
            if (dpscVar.c) {
                dpscVar.bF();
                z = false;
                dpscVar.c = false;
            } else {
                z = false;
            }
            ((dpsd) dpscVar.b).d = dpsd.ck();
            if (dpscVar.c) {
                dpscVar.bF();
                dpscVar.c = z;
            }
            dpsd dpsdVar = (dpsd) dpscVar.b;
            dpyf bK3 = bZ.bK();
            bK3.getClass();
            dpsdVar.c();
            dpsdVar.d.add(bK3);
            a = dpscVar.bK();
            cbauVar.d(a);
        }
        this.d = a;
        cazbVar.d(new Runnable(this, cazbVar, cazbVar2, cbauVar) { // from class: cbak
            private final cbar a;
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
                cbar cbarVar = this.a;
                cazb cazbVar3 = this.b;
                cazb cazbVar4 = this.c;
                cbau cbauVar2 = this.d;
                final dpvi g = cazbVar3.g();
                if (g != null) {
                    dpvi g2 = cazbVar4.g();
                    if (g2 != null && !cbar.y(g, g2)) {
                        cbarVar.x();
                    }
                    cbarVar.w(g);
                    cazbVar4.i(new cbbs(g) { // from class: cbao
                        private final dpvi a;

                        {
                            this.a = g;
                        }

                        @Override // defpackage.cbbs
                        public final dpvi a() {
                            return cbpy.b(this.a, 3);
                        }
                    });
                    cbauVar2.i(g);
                }
                cqkx.p(cbarVar);
            }
        });
        cazbVar2.d(new Runnable(this, cbauVar, cazbVar2) { // from class: cbal
            private final cbar a;
            private final cbau b;
            private final cazb c;

            {
                this.a = this;
                this.b = cbauVar;
                this.c = cazbVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbar cbarVar = this.a;
                this.b.l(this.c.g());
                cqkx.p(cbarVar);
            }
        });
        cbdwVar.c = new Runnable(this, cbdwVar, cbauVar) { // from class: cbam
            private final cbar a;
            private final cbdw b;
            private final cbau c;

            {
                this.a = this;
                this.b = cbdwVar;
                this.c = cbauVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbar cbarVar = this.a;
                cbarVar.d = cbar.z(this.b, true, cbarVar.d, this.c);
                cqkx.p(cbarVar);
            }
        };
        cbdwVar2.c = new Runnable(this, cbdwVar2, cbauVar) { // from class: cban
            private final cbar a;
            private final cbdw b;
            private final cbau c;

            {
                this.a = this;
                this.b = cbdwVar2;
                this.c = cbauVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cbar cbarVar = this.a;
                cbarVar.d = cbar.z(this.b, false, cbarVar.d, this.c);
                cqkx.p(cbarVar);
            }
        };
        this.i = cbbcVar;
        this.k = new cbaq(this);
        dcdc<dpol> f = cbpy.f();
        dccx dccxVar = new dccx();
        int size = f.size();
        for (int i4 = 0; i4 < size; i4++) {
            dccxVar.g(cbbcVar.e(f.get(i4)));
        }
        this.l = new ArrayAdapter<>(ggaVar, 17367043, dccxVar.f());
        this.c = cbpy.f().indexOf(dpyf.c.a(Integer.valueOf(this.d.d.get(0).b.f(0))));
        dpvi c = cbauVar.c();
        if (c != null && !y(cbauVar.b(), c)) {
            cbauVar.l(null);
        }
        this.m = cbauVar.c() == null ? false : z2;
        w(cazbVar.g());
    }

    private final void A() {
        Runnable runnable = this.n;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static boolean y(dpvi dpviVar, dpvi dpviVar2) {
        return cbpy.a(dpviVar2).B(cbpy.a(cbpy.c(cbpy.b(dpviVar, 1), -2)));
    }

    public static dpsd z(cbdw cbdwVar, boolean z, dpsd dpsdVar, cbau cbauVar) {
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
            dptk dptkVar = dpsdVar.d.get(0).e;
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
            dpye ca2 = dpyf.f.ca(dpsdVar.d.get(0));
            if (ca2.c) {
                ca2.bF();
                ca2.c = false;
            }
            dpyf dpyfVar = (dpyf) ca2.b;
            dptk bK2 = ca.bK();
            bK2.getClass();
            dpyfVar.e = bK2;
            dpyfVar.a |= 1;
            dpyf bK3 = ca2.bK();
            dsqp dsqpVar = (dsqp) dpsdVar.cu(5);
            dsqpVar.bC(dpsdVar);
            dpsc dpscVar = (dpsc) dsqpVar;
            if (dpscVar.c) {
                dpscVar.bF();
                dpscVar.c = false;
            }
            ((dpsd) dpscVar.b).d = dpsd.ck();
            dpscVar.b(bK3);
            dpsdVar = dpscVar.bK();
        }
        cbauVar.d(dpsdVar);
        return dpsdVar;
    }

    @Override // defpackage.jbg
    public AdapterView.OnItemSelectedListener Rs() {
        return new cbap(this);
    }

    @Override // defpackage.jbg
    public Integer Rt() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.jbg
    public SpinnerAdapter Rv() {
        return this.l;
    }

    @Override // defpackage.cbrj
    public String a() {
        return this.b.getString(R.string.UGC_EVENTS_START_DATE_HINT);
    }

    @Override // defpackage.cbrj
    public String b() {
        return this.i.i(this.a.b(), true);
    }

    @Override // defpackage.cbrj
    public Boolean c() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.cbrj
    public cqkl d() {
        this.e.e();
        A();
        return cqkl.a;
    }

    @Override // defpackage.cbrj
    public cqkl e() {
        x();
        return cqkl.a;
    }

    @Override // defpackage.cbqw
    public String f() {
        dqjj dqjjVar;
        dpyf dpyfVar = this.d.d.get(0);
        dptk dptkVar = dpyfVar.e;
        if (dptkVar == null) {
            dptkVar = dptk.d;
        }
        cbbc cbbcVar = this.i;
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
        return this.b.getString(dpyfVar.d.size() == 1 ? R.string.MONTHLY_REPEATING_DYNAMIC_SUMMARY_SINGLE_WEEK_OF_MONTH : R.string.MONTHLY_REPEATING_DYNAMIC_SUMMARY_MULTI_WEEK_OF_MONTH, new Object[]{this.i.g(dcdc.r(dpyfVar.d)), this.i.d(dpyf.c.a(Integer.valueOf(dpyfVar.b.f(0)))), cbbcVar.c(dqjjVar2, dqjjVar)});
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
            return this.i.i(c, true);
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
        this.f.e();
        A();
        return cqkl.a;
    }

    public cbqt l() {
        return this.a;
    }

    public void m(Runnable runnable) {
        this.n = runnable;
        A();
    }

    @Override // defpackage.cbrk
    public String n() {
        return "";
    }

    @Override // defpackage.cbrk
    public String o() {
        return this.i.a(this.a.b());
    }

    @Override // defpackage.cbrk
    public cqkl p() {
        this.g.g();
        A();
        return cqkl.a;
    }

    @Override // defpackage.cbrk
    @dzsi
    public String q() {
        dptk dptkVar = this.d.d.get(0).e;
        if (dptkVar == null) {
            dptkVar = dptk.d;
        }
        if ((dptkVar.a & 2) != 0) {
            cbbc cbbcVar = this.i;
            dqjj dqjjVar = dptkVar.c;
            if (dqjjVar == null) {
                dqjjVar = dqjj.e;
            }
            return cbbcVar.b(dqjjVar);
        }
        return null;
    }

    @Override // defpackage.cbrk
    public cqkl r() {
        this.h.g();
        A();
        return cqkl.a;
    }

    @Override // defpackage.cbrk
    public cqkl s() {
        dptk dptkVar = this.d.d.get(0).e;
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
        dpyf dpyfVar = this.d.d.get(0);
        dsqp dsqpVar2 = (dsqp) dpyfVar.cu(5);
        dsqpVar2.bC(dpyfVar);
        dpye dpyeVar = (dpye) dsqpVar2;
        if (dpyeVar.c) {
            dpyeVar.bF();
            dpyeVar.c = false;
        }
        dpyf dpyfVar2 = (dpyf) dpyeVar.b;
        bK.getClass();
        dpyfVar2.e = bK;
        dpyfVar2.a |= 1;
        dpyf bK2 = dpyeVar.bK();
        dpsd dpsdVar = this.d;
        dsqp dsqpVar3 = (dsqp) dpsdVar.cu(5);
        dsqpVar3.bC(dpsdVar);
        dpsc dpscVar = (dpsc) dsqpVar3;
        if (dpscVar.c) {
            dpscVar.bF();
            dpscVar.c = false;
        }
        ((dpsd) dpscVar.b).d = dpsd.ck();
        dpscVar.b(bK2);
        dpsd bK3 = dpscVar.bK();
        this.d = bK3;
        this.a.d(bK3);
        this.a.m(null);
        cqkx.p(this);
        A();
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

    @Override // defpackage.cbqr
    public bsgz v() {
        return this.k;
    }

    public final void w(dpvi dpviVar) {
        this.f.h(cbpy.c(cbpy.b(dpviVar, 1), -1));
    }

    public final void x() {
        this.m = false;
        this.a.l(null);
        this.f.f();
        cqkx.p(this);
        A();
    }
}
