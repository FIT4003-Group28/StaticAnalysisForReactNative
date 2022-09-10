package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abep  reason: default package */
/* loaded from: classes2.dex */
public final class abep extends ges implements abta {
    public abfg a;
    public jmz ad;
    public abts ae;
    absi af;
    private abtm ag;
    private cqkf<absq> ah;
    private cqkf<absr> ai;
    private cryz<dhym> aj;
    public abtn b;
    public abtt c;
    public aber d;
    public bvrb e;
    public efg f;
    public cqkj g;

    private final void q() {
        cryz<dhym> cryzVar = this.aj;
        if (cryzVar != null) {
            cryzVar.c();
        }
        this.aj = new cryz<>(new abeo(this));
        this.ae.g();
        abfg abfgVar = this.a;
        dhjx dhjxVar = this.af.b;
        if (dhjxVar == null) {
            dhjxVar = dhjx.f;
        }
        deha.q(abfgVar.b(dpsv.UNKNOWN_VERTICAL, 4, dcdc.e(), dhjxVar), this.aj, this.e.h());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.ad.a(this.ah.c());
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.ah = this.g.d(new abgx(), viewGroup, false);
        this.ai = this.g.d(new abgt(), viewGroup, false);
        return null;
    }

    public final void g(@dzsi dhym dhymVar) {
        this.ae.i(dhymVar);
    }

    @Override // defpackage.abta
    public final void i() {
        if (!this.aD) {
            return;
        }
        absi absiVar = this.af;
        dsqp dsqpVar = (dsqp) absiVar.cu(5);
        dsqpVar.bC(absiVar);
        absh abshVar = (absh) dsqpVar;
        if (abshVar.c) {
            abshVar.bF();
            abshVar.c = false;
        }
        absi absiVar2 = (absi) abshVar.b;
        absi absiVar3 = absi.d;
        absiVar2.c = null;
        absiVar2.a &= -3;
        this.af = abshVar.bK();
        this.ae.j();
        q();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        dhym dhymVar;
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        absi absiVar = (absi) bvrs.e(bundle, absi.class, (dssr) absi.d.cu(7));
        dbsk.s(absiVar);
        this.af = absiVar;
        this.ag = this.b.a(Rp(R.string.EXPLORE_POPULAR_AREAS_LEAF_PAGE_TITLE));
        this.ae = this.c.a(this, this.d);
        absi absiVar2 = this.af;
        if ((absiVar2.a & 2) != 0) {
            dhymVar = absiVar2.c;
            if (dhymVar == null) {
                dhymVar = dhym.c;
            }
        } else {
            dhymVar = null;
        }
        g(dhymVar);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxo.cE;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ai.e(this.ag);
        this.ah.e(this.ae);
        efg efgVar = this.f;
        egj egjVar = new egj(this);
        egjVar.F(this.ai.c());
        egjVar.ag(null);
        egjVar.w(this.ah.c());
        egf a = egf.a();
        a.s = true;
        egjVar.A(a);
        efgVar.a(egjVar.a());
        this.ad.b(this.ah.c());
        if ((this.af.a & 2) != 0) {
            return;
        }
        q();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        absi absiVar = this.af;
        if (absiVar != null) {
            bvrs.l(bundle, absiVar);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        cryz<dhym> cryzVar = this.aj;
        if (cryzVar != null) {
            cryzVar.c();
        }
        this.ai.e(null);
        this.ah.e(null);
        super.u();
    }
}
