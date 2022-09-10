package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abet  reason: default package */
/* loaded from: classes2.dex */
public final class abet extends ges implements abta {
    public abfa a;
    public cqkj ad;
    public jmz ae;
    public abts af;
    absn ag;
    private abtm ah;
    private cqkf<absq> ai;
    private cqkf<absr> aj;
    private cryz<dhym> ak;
    public abfg b;
    public abtn c;
    public abtt d;
    public abeu e;
    public bvrb f;
    public efg g;

    private final void q() {
        cryz<dhym> cryzVar = this.ak;
        if (cryzVar != null) {
            cryzVar.c();
        }
        this.ak = new cryz<>(new abes(this));
        this.af.g();
        abfg abfgVar = this.b;
        dpsv b = dpsv.b(this.ag.b);
        if (b == null) {
            b = dpsv.UNKNOWN_VERTICAL;
        }
        int a = dpsx.a(this.ag.g);
        if (a == 0) {
            a = 1;
        }
        dsrh<dpuz> dsrhVar = new dsrh(this.ag.e, absn.f);
        dccx F = dcdc.F();
        for (dpuz dpuzVar : dsrhVar) {
            dpux bZ = dpva.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpva dpvaVar = (dpva) bZ.b;
            dpvaVar.b = dpuzVar.e;
            dpvaVar.a |= 1;
            F.g(bZ.bK());
        }
        dcdc f = F.f();
        dhjx dhjxVar = this.ag.c;
        if (dhjxVar == null) {
            dhjxVar = dhjx.f;
        }
        dehn<dhym> b2 = abfgVar.b(b, a, f, dhjxVar);
        dbsk.s(b2);
        deha.q(b2, this.ak, this.f.h());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.ae.a(this.ai.c());
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.ai = this.ad.d(new abgz(), viewGroup, false);
        this.aj = this.ad.d(new abgt(), viewGroup, false);
        return null;
    }

    public final void g(@dzsi dhym dhymVar) {
        this.af.i(dhymVar);
    }

    @Override // defpackage.abta
    public final void i() {
        if (!this.aD) {
            return;
        }
        absn absnVar = this.ag;
        dsqp dsqpVar = (dsqp) absnVar.cu(5);
        dsqpVar.bC(absnVar);
        absm absmVar = (absm) dsqpVar;
        if (absmVar.c) {
            absmVar.bF();
            absmVar.c = false;
        }
        absn absnVar2 = (absn) absmVar.b;
        dsrg<Integer, dpuz> dsrgVar = absn.f;
        absnVar2.d = null;
        absnVar2.a &= -5;
        this.ag = absmVar.bK();
        this.af.j();
        q();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        String Rp;
        dhym dhymVar;
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        absn absnVar = (absn) bvrs.e(bundle, absn.class, (dssr) absn.h.cu(7));
        dbsk.s(absnVar);
        this.ag = absnVar;
        if (!this.a.c() || new dsrh(this.ag.e, absn.f).isEmpty()) {
            Rp = Rp(R.string.EXPLORE_SCAVENGER_HUNT_MORE_PAGE_TITLE);
        } else {
            dpuz dpuzVar = dpuz.UNKNOWN_TYPE;
            int ordinal = ((dpuz) dcft.c(new dsrh(this.ag.e, absn.f))).ordinal();
            if (ordinal == 1) {
                Rp = Rq(R.string.EXPLORE_SCAVENGER_HUNT_LEAF_PAGE_TITLE, Rp(R.string.EXPLORE_LIST_CATEGORY_FOOD_AND_DRINK));
            } else if (ordinal == 2) {
                Rp = Rq(R.string.EXPLORE_SCAVENGER_HUNT_LEAF_PAGE_TITLE, Rp(R.string.EXPLORE_LIST_CATEGORY_THINGS_TO_DO));
            } else if (ordinal == 3) {
                Rp = Rq(R.string.EXPLORE_SCAVENGER_HUNT_LEAF_PAGE_TITLE, Rp(R.string.EXPLORE_LIST_CATEGORY_CITY_GUIDES));
            } else {
                Rp = Rp(R.string.EXPLORE_SCAVENGER_HUNT_MORE_PAGE_TITLE);
            }
        }
        this.ah = this.c.a(Rp);
        this.af = this.d.a(this, this.e);
        absn absnVar2 = this.ag;
        if ((absnVar2.a & 4) != 0) {
            dhymVar = absnVar2.d;
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
        return dtxo.cJ;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.aj.e(this.ah);
        this.ai.e(this.af);
        efg efgVar = this.g;
        egj egjVar = new egj(this);
        egjVar.F(this.aj.c());
        egjVar.ag(null);
        egjVar.w(this.ai.c());
        egf a = egf.a();
        a.s = true;
        egjVar.A(a);
        efgVar.a(egjVar.a());
        this.ae.b(this.ai.c());
        if ((this.ag.a & 4) != 0) {
            return;
        }
        q();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        absn absnVar = this.ag;
        if (absnVar != null) {
            bvrs.l(bundle, absnVar);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        cryz<dhym> cryzVar = this.ak;
        if (cryzVar != null) {
            cryzVar.c();
        }
        this.aj.e(null);
        this.ai.e(null);
        super.u();
    }
}
