package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abew  reason: default package */
/* loaded from: classes2.dex */
public final class abew extends ges implements abta {
    public abtn a;
    public efg ad;
    public cqkj ae;
    public jmz af;
    public abts ag;
    absk ah;
    private abtm ai;
    private cqkf<absq> aj;
    private cqkf<absr> ak;
    private cryz<awwb> al;
    public dxio<ahjq> b;
    public akpm c;
    public awvy d;
    public abtt e;
    public abey f;
    public bvrb g;

    private final void q() {
        cryz<awwb> cryzVar = this.al;
        if (cryzVar != null) {
            cryzVar.c();
        }
        awws u = awwt.u();
        u.t(dcdc.f("more_query_shortcuts"));
        u.e(awvv.c);
        awwt a = u.a();
        awvw f = awvx.f();
        f.e(a);
        f.b(this.c.aa());
        GmmLocation a2 = this.b.a().a();
        if (a2 != null) {
            f.d(a2);
        }
        dehn<awwb> b = this.d.b(f.a());
        this.al = new cryz<>(new abev(this));
        this.ag.g();
        deha.q(b, this.al, this.g.h());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.af.a(this.aj.c());
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.ak = this.ae.d(new abgt(), viewGroup, false);
        this.aj = this.ae.d(new abhc(), viewGroup, false);
        return null;
    }

    public final void g() {
        dhym dhymVar;
        abts abtsVar = this.ag;
        if (this.ah.b.size() > 0) {
            dhyi bZ = dhym.c.bZ();
            dsrj<dqfq> dsrjVar = this.ah.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhym dhymVar2 = (dhym) bZ.b;
            dsrj<dqfq> dsrjVar2 = dhymVar2.a;
            if (!dsrjVar2.a()) {
                dhymVar2.a = dsqw.cl(dsrjVar2);
            }
            dsod.bv(dsrjVar, dhymVar2.a);
            dhymVar = bZ.bK();
        } else {
            dhymVar = null;
        }
        abtsVar.i(dhymVar);
    }

    @Override // defpackage.abta
    public final void i() {
        if (!this.aD) {
            return;
        }
        absk abskVar = this.ah;
        dsqp dsqpVar = (dsqp) abskVar.cu(5);
        dsqpVar.bC(abskVar);
        absj absjVar = (absj) dsqpVar;
        if (absjVar.c) {
            absjVar.bF();
            absjVar.c = false;
        }
        absk abskVar2 = absk.d;
        ((absk) absjVar.b).b = absk.ck();
        this.ah = absjVar.bK();
        this.ag.j();
        q();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        absk abskVar = (absk) bvrs.e(bundle, absk.class, (dssr) absk.d.cu(7));
        dbsk.s(abskVar);
        this.ah = abskVar;
        abtm a = this.a.a(Rp(R.string.EXPLORE_CATEGORIES_MORE));
        this.ai = a;
        a.d(false);
        abtt abttVar = this.e;
        abey abeyVar = this.f;
        abse abseVar = this.ah.c;
        if (abseVar == null) {
            abseVar = abse.e;
        }
        abvu a2 = abeyVar.a.a();
        abey.a(a2, 1);
        abey.a(abseVar, 2);
        this.ag = abttVar.a(this, new abex(a2, abseVar));
        g();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxo.cL;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ak.e(this.ai);
        this.aj.e(this.ag);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.G(this.ak.c(), 5);
        egjVar.w(this.aj.c());
        egjVar.e(this);
        egf a = egf.a();
        a.s = true;
        egjVar.A(a);
        this.ad.a(egjVar.a());
        this.af.b(this.aj.c());
        if (this.ah.b.size() <= 0) {
            q();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        absk abskVar = this.ah;
        if (abskVar != null) {
            bvrs.l(bundle, abskVar);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        cryz<awwb> cryzVar = this.al;
        if (cryzVar != null) {
            cryzVar.c();
        }
        this.ak.e(null);
        this.aj.e(null);
        super.u();
    }
}
