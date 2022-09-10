package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ccko  reason: default package */
/* loaded from: classes4.dex */
public final class ccko extends ges {
    public dxio<cclq> a;
    public ccys b;
    public cqkj c;
    public efg d;
    @dzsi
    private ccyr e;
    @dzsi
    private cqkf<ccxd> f;
    private ccwf g = ccwf.e;

    private final void g(boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            if (z) {
                J().getWindow().addFlags(134217728);
            } else {
                J().getWindow().clearFlags(134217728);
            }
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.f = null;
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof ccwy) {
            ccwy ccwyVar = (ccwy) obj;
            ccyr ccyrVar = this.e;
            dbsk.s(ccyrVar);
            ccwu ccwuVar = ccwyVar.b;
            if (ccwuVar == null) {
                ccwuVar = ccwu.d;
            }
            dgfg dgfgVar = ccwyVar.c;
            if (dgfgVar == null) {
                dgfgVar = dgfg.d;
            }
            ccyrVar.n(ccwuVar, dgfgVar);
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<ccxd> d = this.c.d(new ccnx(), viewGroup, false);
        this.f = d;
        dbsk.s(d);
        return d.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.e = null;
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        ccyr ccyrVar = this.e;
        if (ccyrVar != null) {
            ccyrVar.a(null);
            return true;
        }
        return false;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        ccwf ccwfVar = (ccwf) bvrs.e(bundle, ccwf.class, (dssr) ccwf.e.cu(7));
        dbsk.s(ccwfVar);
        this.g = ccwfVar;
        ccys ccysVar = this.b;
        ff ffVar = (ff) ((dxjd) ccysVar.a).a;
        ccys.a(ffVar, 1);
        dxio a = ((dxjh) ccysVar.b).a();
        ccys.a(a, 2);
        ccys.a(ccysVar.c.a(), 3);
        ccyl a2 = ccysVar.d.a();
        ccys.a(a2, 4);
        chhr a3 = ccysVar.e.a();
        ccys.a(a3, 5);
        ccrh a4 = ccysVar.f.a();
        ccys.a(a4, 6);
        cctx a5 = ccysVar.g.a();
        ccys.a(a5, 7);
        ccys.a(this, 8);
        this.e = new ccyr(ffVar, a, a2, a3, a4, a5, this);
        int a6 = ccwe.a(this.g.c);
        if (a6 == 0 || a6 != 2) {
            int a7 = ccwe.a(this.g.c);
            if (a7 == 0 || a7 != 3) {
                return;
            }
            ccyr ccyrVar = this.e;
            dbsk.s(ccyrVar);
            ccwm ccwmVar = this.g.d;
            if (ccwmVar == null) {
                ccwmVar = ccwm.j;
            }
            ccyrVar.j(ccwmVar);
            return;
        }
        ccyr ccyrVar2 = this.e;
        dbsk.s(ccyrVar2);
        ccwb ccwbVar = this.g.b;
        if (ccwbVar == null) {
            ccwbVar = ccwb.f;
        }
        ccwm ccwmVar2 = this.g.d;
        if (ccwmVar2 == null) {
            ccwmVar2 = ccwm.j;
        }
        ccyrVar2.i(ccwbVar, ccwmVar2);
        ccyr ccyrVar3 = this.e;
        dbsk.s(ccyrVar3);
        ccyrVar3.k(new cckn(this));
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxx.o;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        cqkf<ccxd> cqkfVar = this.f;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.e);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.e(this);
        this.d.a(egjVar.a());
        g(true);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        ccyr ccyrVar = this.e;
        dbsk.s(ccyrVar);
        ccwb ccwbVar = ccyrVar.l().b;
        ccwf ccwfVar = this.g;
        dsqp dsqpVar = (dsqp) ccwfVar.cu(5);
        dsqpVar.bC(ccwfVar);
        ccwc ccwcVar = (ccwc) dsqpVar;
        if (ccwbVar.equals(ccyb.a)) {
            if (ccwcVar.c) {
                ccwcVar.bF();
                ccwcVar.c = false;
            }
            ccwf ccwfVar2 = (ccwf) ccwcVar.b;
            ccwf ccwfVar3 = ccwf.e;
            ccwfVar2.b = null;
            ccwfVar2.a &= -2;
            ccwf ccwfVar4 = (ccwf) ccwcVar.b;
            ccwfVar4.c = 2;
            ccwfVar4.a = 2 | ccwfVar4.a;
        } else {
            if (ccwcVar.c) {
                ccwcVar.bF();
                ccwcVar.c = false;
            }
            ccwf ccwfVar5 = (ccwf) ccwcVar.b;
            ccwf ccwfVar6 = ccwf.e;
            ccwbVar.getClass();
            ccwfVar5.b = ccwbVar;
            ccwfVar5.a |= 1;
        }
        ccyr ccyrVar2 = this.e;
        dbsk.s(ccyrVar2);
        ccwm m = ccyrVar2.m();
        if (ccwcVar.c) {
            ccwcVar.bF();
            ccwcVar.c = false;
        }
        ccwf ccwfVar7 = (ccwf) ccwcVar.b;
        m.getClass();
        ccwfVar7.d = m;
        ccwfVar7.a |= 4;
        ccwf bK = ccwcVar.bK();
        this.g = bK;
        bvrs.l(bundle, bK);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        cqkf<ccxd> cqkfVar = this.f;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        g(false);
        super.u();
    }
}
