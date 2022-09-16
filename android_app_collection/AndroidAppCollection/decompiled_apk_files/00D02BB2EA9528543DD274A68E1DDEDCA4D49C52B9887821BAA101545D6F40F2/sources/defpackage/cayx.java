package defpackage;

import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: cayx  reason: default package */
/* loaded from: classes4.dex */
public class cayx implements cbql, cbqh {
    private int a;
    private final ges b;
    private final cayw c;
    private final cayn d;
    private final List<cbqi> e;
    @dzsi
    private cbqi f;
    private final cays g;
    @dzsi
    private final dprz h;
    private final Runnable i;
    @dzsi
    private dprz j;

    public cayx(ges gesVar, List<dprz> list, List<drlr> list2, @dzsi dprz dprzVar, @dzsi dprz dprzVar2, Runnable runnable, cayn caynVar) {
        cayw caywVar = new cayw(true);
        this.b = gesVar;
        this.c = caywVar;
        this.g = new cays(list2);
        dccx F = dcdc.F();
        int i = 0;
        for (dprz dprzVar3 : list) {
            drlr a = this.g.a(dprzVar3);
            if (a != null) {
                boolean equals = dprzVar3.equals(dprzVar2);
                cbqi a2 = caywVar.a(a, equals, this);
                if (equals) {
                    this.a = i;
                }
                F.g(a2);
                i++;
            }
        }
        this.e = F.f();
        this.h = dprzVar;
        this.j = dprzVar2;
        l(dprzVar2);
        cbqi k = k(this.j);
        this.f = k;
        if (k != null) {
            this.a = 0;
        }
        this.i = runnable;
        this.d = caynVar;
    }

    @dzsi
    private final cbqi k(@dzsi dprz dprzVar) {
        if (dprzVar == null) {
            return null;
        }
        for (cbqi cbqiVar : this.e) {
            if (cbqiVar.j().equals(dprzVar)) {
                return null;
            }
        }
        drlr a = this.g.a(dprzVar);
        if (a == null) {
            return null;
        }
        return this.c.a(a, true, this);
    }

    private final void l(@dzsi dprz dprzVar) {
        drlr a = this.g.a(dprzVar);
        String str = null;
        if (a != null && !a.c.isEmpty()) {
            str = a.c;
        }
        cayq.k(str);
    }

    @Override // defpackage.cbqh
    public void a(cbqi cbqiVar) {
        i(cbqiVar.j());
        this.d.a(cbir.a);
    }

    @Override // defpackage.cbqh
    public void b() {
        i(null);
    }

    @Override // defpackage.cbql
    public List<cbqi> c() {
        if (this.f == null) {
            return this.e;
        }
        dccx F = dcdc.F();
        cbqi cbqiVar = this.f;
        dbsk.s(cbqiVar);
        F.g(cbqiVar);
        F.i(this.e);
        return F.f();
    }

    @Override // defpackage.cbql
    @dzsi
    public dprz d() {
        return this.j;
    }

    @Override // defpackage.cbql
    public Integer e() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.cbql
    public cqkl f() {
        dprz dprzVar = this.j;
        cayt caytVar = new cayt();
        if (dprzVar != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("see_more_initial_category_parcel_key", dprzVar.au);
            caytVar.B(bundle);
        }
        this.b.aZ(caytVar);
        return cqkl.a;
    }

    @Override // defpackage.cbrs
    public Boolean g() {
        return h();
    }

    @Override // defpackage.cbrs
    public Boolean h() {
        return true;
    }

    @Override // defpackage.cbql
    public void i(@dzsi dprz dprzVar) {
        this.a = 0;
        if (this.j == dprzVar) {
            return;
        }
        this.j = dprzVar;
        l(dprzVar);
        int i = 0;
        for (cbqi cbqiVar : this.e) {
            boolean equals = cbqiVar.j().equals(dprzVar);
            cbqiVar.i(equals);
            if (equals) {
                this.a = i;
            }
            i++;
        }
        cbqi cbqiVar2 = this.f;
        if (cbqiVar2 != null) {
            boolean equals2 = cbqiVar2.j().equals(dprzVar);
            this.f.i(equals2);
            if (equals2) {
                this.a = 0;
            }
        }
        cbqi k = k(this.j);
        if (k != null) {
            this.f = k;
            this.a = 0;
        }
        cqkx.p(this);
        this.i.run();
    }

    @Override // defpackage.cbrp
    public Boolean j() {
        dprz dprzVar = this.h;
        boolean z = true;
        if (dprzVar == null) {
            if (this.j == null) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.valueOf(!dprzVar.equals(this.j));
    }
}
