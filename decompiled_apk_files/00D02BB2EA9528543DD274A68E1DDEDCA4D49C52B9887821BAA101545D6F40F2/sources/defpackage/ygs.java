package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ygs  reason: default package */
/* loaded from: classes7.dex */
public class ygs implements yfr {
    public dpgw a;
    public final int b;
    @dzsi
    public Integer c = null;
    final /* synthetic */ ygt d;
    private dooa e;
    @dzsi
    private donz f;
    private final boolean g;
    private final xiv h;

    public ygs(ygt ygtVar, dpgw dpgwVar, ygj ygjVar, int i, xiv xivVar) {
        int a;
        this.d = ygtVar;
        this.b = i;
        dphe dpheVar = ygtVar.e.b;
        int a2 = dpkh.a((dpheVar == null ? dphe.x : dpheVar).q);
        boolean z = false;
        if (a2 != 0 && a2 == 3 && (a = dpkh.a(ygjVar.a(akqi.f(dpgwVar.n)).i)) != 0 && a == 3) {
            z = true;
        }
        this.g = z;
        this.h = xivVar;
        l(dpgwVar);
    }

    private final Boolean B() {
        return Boolean.valueOf(this.b == 0);
    }

    private final ygs C() {
        return this.d.f.get(this.b - 1);
    }

    private final ygs D() {
        return this.d.f.get(this.b + 1);
    }

    private final int E() {
        Integer num = this.c;
        dbsk.s(num);
        return num.intValue();
    }

    private final int F() {
        cqtv cqtvVar;
        if (g().booleanValue()) {
            cqtvVar = yep.b;
        } else {
            cqtvVar = yep.a;
        }
        return cqtvVar.NR(this.d.b);
    }

    private final float G() {
        if (!f().booleanValue()) {
            int E = E() - F();
            return this.b + (E / (E + D().F()));
        }
        return this.b;
    }

    @dzsi
    private final Integer H(float f) {
        if (!Float.isNaN(f) && I() && ((B().booleanValue() || C().I()) && (f().booleanValue() || D().I()))) {
            Float m = ygt.m(dclz.f(Float.valueOf(B().booleanValue() ? this.b : C().G()), Float.valueOf(this.b)), dclz.f(0, Integer.valueOf(F())), f);
            if (m == null) {
                m = ygt.m(dclz.f(Float.valueOf(this.b), Float.valueOf(G())), dclz.f(Integer.valueOf(F()), Integer.valueOf(E())), f);
            }
            if (m != null) {
                return Integer.valueOf(Math.round(m.floatValue()));
            }
            return null;
        }
        return null;
    }

    private final boolean I() {
        return this.c != null || A();
    }

    public final boolean A() {
        int height;
        for (View view : cqkx.n(this)) {
            if (view != null && (height = view.getHeight()) != 0) {
                this.c = Integer.valueOf(height);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xkd
    public Boolean Z(donz donzVar) {
        return Boolean.valueOf(this.f == donzVar);
    }

    @Override // defpackage.yfr
    public yfs a() {
        return this.d;
    }

    @Override // defpackage.xkd
    public Boolean aa() {
        return Boolean.valueOf(this.f != null);
    }

    @Override // defpackage.xkc
    public Boolean ad() {
        eaqc ab = ab();
        boolean z = false;
        if (ab != null && new eapd(this.d.c.b()).w(ab)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xkc
    public Boolean ag() {
        return false;
    }

    @Override // defpackage.wpl
    public String b() {
        return this.a.b;
    }

    @Override // defpackage.wpl
    @dzsi
    public akqi c() {
        return akqi.f(this.a.n);
    }

    @Override // defpackage.wpl
    @dzsi
    public String d() {
        dpgw dpgwVar = this.a;
        if ((dpgwVar.a & 512) != 0) {
            return this.d.b.getString(R.string.TRANSIT_DETAILS_TRAIN_PLATFORM, new Object[]{dpgwVar.k});
        }
        return null;
    }

    @Override // defpackage.yfr
    public Integer e() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.yfr
    public Boolean f() {
        return Boolean.valueOf(this.b == this.d.f.size() + (-1));
    }

    @Override // defpackage.yfr
    public Boolean g() {
        boolean z = true;
        if (this.b != this.d.f().intValue() && !dbsd.a(Integer.valueOf(this.b), this.d.g())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.yfr
    @dzsi
    public Integer h() {
        Integer H = H(this.d.a);
        if (H != null) {
            return H;
        }
        Integer H2 = B().booleanValue() ? null : C().H(this.d.a);
        if (H2 != null) {
            return Integer.valueOf(H2.intValue() - C().E());
        }
        Integer H3 = f().booleanValue() ? null : D().H(this.d.a);
        if (H3 == null) {
            return null;
        }
        return Integer.valueOf(H3.intValue() + E());
    }

    @Override // defpackage.yfr
    @dzsi
    public cqkn<yfr> i() {
        return this.d.d;
    }

    @Override // defpackage.yfr
    public View.OnLayoutChangeListener j() {
        return new View.OnLayoutChangeListener(this) { // from class: ygq
            private final ygs a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                final ygs ygsVar = this.a;
                Integer num = ygsVar.c;
                ygsVar.A();
                if (!dbsd.a(num, ygsVar.c)) {
                    view.post(new Runnable(ygsVar) { // from class: ygr
                        private final ygs a;

                        {
                            this.a = ygsVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            cqkx.p(this.a);
                        }
                    });
                }
            }
        };
    }

    @Override // defpackage.yfr
    public xiv k() {
        return this.h;
    }

    public final void l(dpgw dpgwVar) {
        dgaw dgawVar;
        dpbw dpbwVar;
        int i = dpgwVar.a;
        if ((i & 16) == 0 && (i & 64) == 0) {
            if ((i & 8) != 0) {
                dsqp dsqpVar = (dsqp) dpgwVar.cu(5);
                dsqpVar.bC(dpgwVar);
                dpgt dpgtVar = (dpgt) dsqpVar;
                dgaw dgawVar2 = dpgwVar.e;
                if (dgawVar2 == null) {
                    dgawVar2 = dgaw.g;
                }
                if (dpgtVar.c) {
                    dpgtVar.bF();
                    dpgtVar.c = false;
                }
                dpgw dpgwVar2 = (dpgw) dpgtVar.b;
                dgawVar2.getClass();
                dpgwVar2.f = dgawVar2;
                dpgwVar2.a |= 16;
                dpgwVar = dpgtVar.bK();
            }
            if ((dpgwVar.a & 32) != 0) {
                dsqp dsqpVar2 = (dsqp) dpgwVar.cu(5);
                dsqpVar2.bC(dpgwVar);
                dpgt dpgtVar2 = (dpgt) dsqpVar2;
                dgaw dgawVar3 = dpgwVar.g;
                if (dgawVar3 == null) {
                    dgawVar3 = dgaw.g;
                }
                if (dpgtVar2.c) {
                    dpgtVar2.bF();
                    dpgtVar2.c = false;
                }
                dpgw dpgwVar3 = (dpgw) dpgtVar2.b;
                dgawVar3.getClass();
                dpgwVar3.h = dgawVar3;
                dpgwVar3.a |= 64;
                dpgwVar = dpgtVar2.bK();
            }
        }
        int i2 = dpgwVar.a;
        if ((i2 & 8) == 0 && (i2 & 32) == 0) {
            if ((i2 & 16) != 0) {
                dsqp dsqpVar3 = (dsqp) dpgwVar.cu(5);
                dsqpVar3.bC(dpgwVar);
                dpgt dpgtVar3 = (dpgt) dsqpVar3;
                dgaw dgawVar4 = dpgwVar.f;
                if (dgawVar4 == null) {
                    dgawVar4 = dgaw.g;
                }
                if (dpgtVar3.c) {
                    dpgtVar3.bF();
                    dpgtVar3.c = false;
                }
                dpgw dpgwVar4 = (dpgw) dpgtVar3.b;
                dgawVar4.getClass();
                dpgwVar4.e = dgawVar4;
                dpgwVar4.a |= 8;
                dpgwVar = dpgtVar3.bK();
            }
            if ((dpgwVar.a & 64) != 0) {
                dsqp dsqpVar4 = (dsqp) dpgwVar.cu(5);
                dsqpVar4.bC(dpgwVar);
                dpgt dpgtVar4 = (dpgt) dsqpVar4;
                dgaw dgawVar5 = dpgwVar.h;
                if (dgawVar5 == null) {
                    dgawVar5 = dgaw.g;
                }
                if (dpgtVar4.c) {
                    dpgtVar4.bF();
                    dpgtVar4.c = false;
                }
                dpgw dpgwVar5 = (dpgw) dpgtVar4.b;
                dgawVar5.getClass();
                dpgwVar5.g = dgawVar5;
                dpgwVar5.a |= 32;
                dpgwVar = dpgtVar4.bK();
            }
        }
        this.a = dpgwVar;
        dpht dphtVar = dpht.AVAILABLE;
        dgaw dgawVar6 = null;
        if ((dpgwVar.a & 16) != 0) {
            dgawVar = dpgwVar.f;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        } else {
            dgawVar = null;
        }
        if ((dpgwVar.a & 64) != 0 && (dgawVar6 = dpgwVar.h) == null) {
            dgawVar6 = dgaw.g;
        }
        if ((dpgwVar.a & 8192) != 0) {
            dpbwVar = dpbw.b(dpgwVar.p);
            if (dpbwVar == null) {
                dpbwVar = dpbw.UNKNOWN;
            }
        } else {
            dpbwVar = dpbw.UNKNOWN;
        }
        donz K = vyb.K(dphtVar, vxj.e(dgawVar, dgawVar6, dpbwVar));
        this.f = K;
        donx bZ = dooa.m.bZ();
        if ((dpgwVar.a & 16) != 0) {
            dgaw dgawVar7 = dpgwVar.f;
            if (dgawVar7 == null) {
                dgawVar7 = dgaw.g;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dooa dooaVar = (dooa) bZ.b;
            dgawVar7.getClass();
            dooaVar.c = dgawVar7;
            dooaVar.a |= 2;
        }
        if ((dpgwVar.a & 64) != 0) {
            dgaw dgawVar8 = dpgwVar.h;
            if (dgawVar8 == null) {
                dgawVar8 = dgaw.g;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dooa dooaVar2 = (dooa) bZ.b;
            dgawVar8.getClass();
            dooaVar2.d = dgawVar8;
            dooaVar2.a |= 4;
        }
        if (K != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dooa dooaVar3 = (dooa) bZ.b;
            dooaVar3.b = K.d;
            dooaVar3.a |= 1;
        }
        this.e = bZ.bK();
    }

    @Override // defpackage.wpl
    @dzsi
    /* renamed from: m */
    public String r() {
        return null;
    }

    @Override // defpackage.wpl, defpackage.zef
    @dzsi
    public cjtd n() {
        cjta b = cjtd.b();
        b.d = dtyc.dt;
        b.i(this.b);
        return b.a();
    }

    @Override // defpackage.xka
    @dzsi
    /* renamed from: q */
    public eaow af() {
        return xkb.b(this.d.c, ab());
    }

    @Override // defpackage.wpl
    public Boolean s() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.wpl
    @dzsi
    public cqtd t() {
        return this.d.h;
    }

    @Override // defpackage.wpl
    public Boolean u() {
        boolean z = false;
        if (this.d.h != null && !ad().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.wpl
    public cjtd v() {
        return cjtd.b;
    }

    @Override // defpackage.wpl
    @dzsi
    public String w() {
        drhn drhnVar = this.d.g;
        if (drhnVar == null || (drhnVar.a & 16) == 0) {
            return null;
        }
        drhh drhhVar = drhnVar.f;
        if (drhhVar == null) {
            drhhVar = drhh.k;
        }
        return drhhVar.d;
    }

    @Override // defpackage.wpl
    @dzsi
    public String x() {
        return xkg.x(this.d.b, this.e, z().booleanValue());
    }

    @Override // defpackage.wpl
    public Boolean z() {
        eaol eaolVar = new eaol(this.d.c.b());
        eaqc ab = ab();
        boolean z = true;
        if (ab == null || !eaolVar.w(ab.c().l(1))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @dzsi
    public final eaqc o() {
        dgaw dgawVar;
        dpgw dpgwVar = this.a;
        int i = dpgwVar.a;
        if ((i & 8) != 0) {
            dgawVar = dpgwVar.e;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        } else if ((i & 32) != 0) {
            dgawVar = dpgwVar.g;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        } else {
            dgawVar = null;
        }
        return vxs.a(dgawVar);
    }

    @Override // defpackage.xka
    @dzsi
    /* renamed from: p */
    public eaqc ab() {
        dgaw dgawVar;
        dpgw dpgwVar = this.a;
        int i = dpgwVar.a;
        if ((i & 16) != 0) {
            dgawVar = dpgwVar.f;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        } else if ((i & 64) != 0) {
            dgawVar = dpgwVar.h;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        } else {
            dgawVar = null;
        }
        return vxs.a(dgawVar);
    }

    @Override // defpackage.wpl
    @dzsi
    public eapr y() {
        dgaw dgawVar;
        dpgw dpgwVar = this.a;
        int i = dpgwVar.a;
        if ((i & 64) != 0) {
            dgawVar = dpgwVar.h;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        } else if ((i & 16) != 0) {
            dgawVar = dpgwVar.f;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        } else {
            dgawVar = null;
        }
        return vxs.a(dgawVar);
    }
}
