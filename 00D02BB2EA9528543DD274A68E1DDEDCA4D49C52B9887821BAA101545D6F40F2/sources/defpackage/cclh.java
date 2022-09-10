package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: cclh  reason: default package */
/* loaded from: classes4.dex */
public final class cclh extends ges implements cczg {
    public cczi a;
    public ccxa ad;
    @dzsi
    private cqkf<ccxg> ae;
    private cczh af;
    public gga b;
    public cqkj c;
    public dxio<cclq> d;
    public efg e;
    public ccsq f;
    public ccln g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<ccxg> cqkfVar = this.ae;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        this.ae = null;
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof ccwy) {
            ccwy ccwyVar = (ccwy) obj;
            cczh cczhVar = this.af;
            ccwu ccwuVar = ccwyVar.b;
            if (ccwuVar == null) {
                ccwuVar = ccwu.d;
            }
            String str = ccwuVar.b;
            dgfg dgfgVar = ccwyVar.c;
            if (dgfgVar == null) {
                dgfgVar = dgfg.d;
            }
            cczhVar.j(str, dgfgVar);
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<ccxg> d = this.c.d(new ccpe(), viewGroup, false);
        this.ae = d;
        return d.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
            dbsk.s(bundle);
        }
        ccws ccwsVar = (ccws) bvrs.e(bundle, ccws.class, (dssr) ccws.f.cu(7));
        dbsk.s(ccwsVar);
        ccln cclnVar = ccwsVar.b;
        if (cclnVar == null) {
            cclnVar = ccln.p;
        }
        this.g = cclnVar;
        ccxa ccxaVar = ccwsVar.d;
        if (ccxaVar == null) {
            ccxaVar = ccxa.f;
        }
        this.ad = ccxaVar;
        cczi ccziVar = this.a;
        ccln cclnVar2 = this.g;
        cczi.a(ccziVar.a.a(), 1);
        gga a = ccziVar.b.a();
        cczi.a(a, 2);
        cczi.a(this, 3);
        cczi.a(cclnVar2, 4);
        cczh cczhVar = new cczh(a, this, cclnVar2);
        this.af = cczhVar;
        String str = ccwsVar.c;
        dgfg dgfgVar = ccwsVar.e;
        if (dgfgVar == null) {
            dgfgVar = dgfg.d;
        }
        cczhVar.g(str, dgfgVar);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxx.af;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        cqkf<ccxg> cqkfVar = this.ae;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.af);
        efg efgVar = this.e;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.e(this);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        ccwr bZ = ccws.f.bZ();
        ccln cclnVar = this.g;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccws ccwsVar = (ccws) bZ.b;
        cclnVar.getClass();
        ccwsVar.b = cclnVar;
        ccwsVar.a |= 1;
        String d = this.af.d();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccws ccwsVar2 = (ccws) bZ.b;
        d.getClass();
        ccwsVar2.a |= 2;
        ccwsVar2.c = d;
        dgfg i = this.af.i();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccws ccwsVar3 = (ccws) bZ.b;
        i.getClass();
        ccwsVar3.e = i;
        int i2 = ccwsVar3.a | 8;
        ccwsVar3.a = i2;
        ccxa ccxaVar = this.ad;
        ccxaVar.getClass();
        ccwsVar3.d = ccxaVar;
        ccwsVar3.a = i2 | 4;
        bvrs.l(bundle, bZ.bK());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        cqkf<ccxg> cqkfVar = this.ae;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        super.u();
    }
}
