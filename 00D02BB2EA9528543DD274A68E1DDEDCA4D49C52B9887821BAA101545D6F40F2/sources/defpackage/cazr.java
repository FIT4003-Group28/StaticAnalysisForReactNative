package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cazr  reason: default package */
/* loaded from: classes4.dex */
public class cazr implements cbqp, cbqw {
    private final cazn a;
    private final cqkj b;
    private final cazl c;
    private final ges d;
    private final cbau e;
    private final idl f;
    private final gga g;
    private gdf h = null;
    private Runnable i = null;

    public cazr(ges gesVar, cbau cbauVar, cazn caznVar, cbqd cbqdVar, cqkj cqkjVar, cazl cazlVar, cqhn cqhnVar, gga ggaVar) {
        dpsc bZ;
        this.c = cazlVar;
        this.b = cqkjVar;
        this.d = gesVar;
        this.e = cbauVar;
        this.a = caznVar;
        this.f = cbqdVar.a(cbqv.CUSTOM);
        this.g = ggaVar;
        dpsd a = cbauVar.a();
        if (a == null || a.e.size() == 0) {
            if (a != null) {
                dsqp dsqpVar = (dsqp) a.cu(5);
                dsqpVar.bC(a);
                bZ = (dpsc) dsqpVar;
            } else {
                bZ = dpsd.f.bZ();
            }
            dpvi b = cbauVar.b();
            dpvi c = cbauVar.c();
            dqho bZ2 = dqhp.d.bZ();
            dpnu i = cbpy.i(b);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqhp dqhpVar = (dqhp) bZ2.b;
            i.getClass();
            dqhpVar.b = i;
            dqhpVar.a |= 1;
            if (c != null) {
                dpnu i2 = cbpy.i(c);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dqhp dqhpVar2 = (dqhp) bZ2.b;
                i2.getClass();
                dqhpVar2.c = i2;
                dqhpVar2.a |= 2;
            }
            bZ.c(bZ2);
            cbauVar.d(bZ.bK());
        }
    }

    private static eaph j(dpnu dpnuVar, dpnu dpnuVar2) {
        eaph g = cbpy.g(dpnuVar);
        eaph g2 = cbpy.g(dpnuVar2);
        return g2.B(g) ? g2 : g;
    }

    @Override // defpackage.cbqp
    public cqkl a() {
        this.h = new gdf(this.d.H(), true);
        cqkf c = this.b.c(new cbgl(), null);
        cazl cazlVar = this.c;
        Runnable runnable = new Runnable(this) { // from class: cazp
            private final cazr a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        };
        gdf gdfVar = this.h;
        ges gesVar = this.d;
        cbau cbauVar = this.e;
        cazl.a(runnable, 1);
        cazl.a(gdfVar, 2);
        cazl.a(gesVar, 3);
        cazl.a(cbauVar, 4);
        cqkj a = cazlVar.a.a();
        cazl.a(a, 5);
        cayn a2 = cazlVar.b.a();
        cazl.a(a2, 6);
        cbbc a3 = cazlVar.c.a();
        cazl.a(a3, 7);
        cqhn a4 = cazlVar.d.a();
        cazl.a(a4, 8);
        cbdi a5 = cazlVar.e.a();
        cazl.a(a5, 9);
        cbqd a6 = cazlVar.f.a();
        cazl.a(a6, 10);
        c.e(new cazk(runnable, gdfVar, gesVar, cbauVar, a, a2, a3, a4, a5, a6));
        View c2 = c.c();
        this.h.setCancelable(false);
        this.h.setContentView(c2);
        this.h.show();
        return cqkl.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        dpnu dpnuVar;
        eaph j;
        dpsd a = this.e.a();
        if (a != null && a.e.size() > 0) {
            dpnu dpnuVar2 = a.e.get(0).b;
            if (dpnuVar2 == null) {
                dpnuVar2 = dpnu.d;
            }
            if ((a.e.get(0).a & 2) == 0) {
                dpnuVar = a.e.get(0).b;
                if (dpnuVar == null) {
                    dpnuVar = dpnu.d;
                }
            } else {
                dpnuVar = a.e.get(0).c;
                if (dpnuVar == null) {
                    dpnuVar = dpnu.d;
                }
            }
            eaph g = cbpy.g(dpnuVar2);
            eaph g2 = cbpy.g(dpnuVar);
            for (dqhp dqhpVar : a.e) {
                dpnu dpnuVar3 = dqhpVar.b;
                if (dpnuVar3 == null) {
                    dpnuVar3 = dpnu.d;
                }
                eaph g3 = cbpy.g(dpnuVar2);
                eaph g4 = cbpy.g(dpnuVar3);
                if (true != g4.C(g3)) {
                    g4 = g3;
                }
                if ((dqhpVar.a & 2) == 0) {
                    dpnu dpnuVar4 = dqhpVar.b;
                    if (dpnuVar4 == null) {
                        dpnuVar4 = dpnu.d;
                    }
                    j = j(dpnuVar, dpnuVar4);
                } else {
                    dpnu dpnuVar5 = dqhpVar.c;
                    if (dpnuVar5 == null) {
                        dpnuVar5 = dpnu.d;
                    }
                    j = j(dpnuVar, dpnuVar5);
                }
                eaph eaphVar = g4;
                g2 = j;
                g = eaphVar;
            }
            this.e.f(cbpy.h(g));
            this.e.l(cbpy.h(g2));
        }
        cqkx.p(this);
        Runnable runnable = this.i;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.cbqp
    public List<cbqo> c() {
        dpsd a = this.e.a();
        dccx F = dcdc.F();
        if (a != null) {
            for (dqhp dqhpVar : a.e) {
                cazn caznVar = this.a;
                Runnable runnable = new Runnable(this) { // from class: cazq
                    private final cazr a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                };
                cbau cbauVar = this.e;
                cazn.a(runnable, 1);
                cazn.a(cbauVar, 2);
                cazn.a(dqhpVar, 3);
                Activity activity = (Activity) ((dxjd) caznVar.a).a;
                cazn.a(activity, 4);
                cqhn a2 = caznVar.b.a();
                cazn.a(a2, 5);
                F.g(new cazm(runnable, cbauVar, dqhpVar, activity, a2));
            }
        }
        return F.f();
    }

    public cbqt d() {
        return this.e;
    }

    public void e(Runnable runnable) {
        this.i = runnable;
    }

    @Override // defpackage.cbqw
    public String f() {
        return "";
    }

    @Override // defpackage.cbqp, defpackage.cbqw
    public idl g() {
        return this.f;
    }

    @Override // defpackage.cbqp
    public String h() {
        return this.g.getString(R.string.CUSTOM_INSTANCES_LIST_TITLE);
    }

    @Override // defpackage.cbqp
    public String i() {
        return this.g.getString(R.string.ADD_CUSTOM_INSTANCE_BUTTON_TITLE);
    }
}
