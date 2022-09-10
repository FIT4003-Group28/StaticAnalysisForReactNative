package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: sis  reason: default package */
/* loaded from: classes7.dex */
public final class sis extends ges {
    private static final jjn an = jjn.EXPANDED;
    public cqkj a;
    public aedv ad;
    public ixr ae;
    public qsg af;
    public bzmm ag;
    public six ah;
    public dxio<acwo> ai;
    public siv aj;
    public cjqy ak;
    public snc al;
    @dzsi
    private cqkf<snb> ao;
    @dzsi
    private cqkf<?> ap;
    @dzsi
    private sio aq;
    private qcq ar;
    public efg b;
    public dxio<afwp> c;
    public ivt d;
    public sow e;
    public jkf f;
    public btrm g;
    private boolean as = false;
    public int am = -1;
    private final aeds at = new siq(this);

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.ao = null;
        if (this.aq != null) {
            cqkf<?> cqkfVar = this.ap;
            dbsk.s(cqkfVar);
            View c = cqkfVar.c();
            sio sioVar = this.aq;
            dbsk.s(sioVar);
            c.removeOnLayoutChangeListener(sioVar);
        }
        if (this.ap != null) {
            this.ap = null;
        }
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ae(Activity activity) {
        super.ae(activity);
        this.al = this.e.a.a();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        Bundle bundle2 = this.o;
        qcp b = qcq.b();
        boolean z = true;
        if (bundle2 != null && !bundle2.getBoolean("StartDestinationsParams.sa")) {
            z = false;
        }
        b.b(z);
        this.ar = b.a();
        cqkf<snb> d = this.a.d(new smu(), viewGroup, false);
        this.ao = d;
        this.ap = this.ad.d(viewGroup);
        this.aq = new sio(new mw(this) { // from class: sip
            private final sis a;

            {
                this.a = this;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.al.g(((Integer) obj).intValue());
            }
        });
        View c = this.ap.c();
        sio sioVar = this.aq;
        dbsk.s(sioVar);
        c.addOnLayoutChangeListener(sioVar);
        return d.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        ff J = J();
        if (J == null || !this.aD) {
            return false;
        }
        gn g = J.g();
        if (g.j() == 0) {
            J.finishAfterTransition();
            return true;
        }
        g.e();
        return true;
    }

    @dzsi
    public final aefv g() {
        cqkf<snb> cqkfVar = this.ao;
        if (cqkfVar == null) {
            return null;
        }
        return (aefv) cqkfVar.c();
    }

    public final int i() {
        ff J = J();
        dbsk.s(J);
        return (int) (bvsc.a(J) * 0.33f);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            siv sivVar = this.aj;
            sivVar.b = sivVar.a.e();
        }
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtyc.fJ;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        ff J = J();
        if (J != null) {
            ff J2 = J();
            if (J2 != null && J2.g().j() == 0 && (J2 instanceof gga) && ((gga) J2).I()) {
                return;
            }
            this.as = true;
            btrm btrmVar = this.g;
            dceq a = dcet.a();
            a.b(ardp.class, new sit(ardp.class, this));
            btrmVar.g(this, a.a());
            this.af.a();
            aljk aljkVar = new aljk();
            aljkVar.a(true);
            aljkVar.l = false;
            this.ad.b(this);
            this.ad.g(dktk.TRANSPORTATION);
            this.ad.k(this.at);
            this.ae.ak(false);
            this.ae.al(true);
            cqkf<snb> cqkfVar = this.ao;
            dbsk.s(cqkfVar);
            aefv aefvVar = (aefv) cqkfVar.c();
            aefvVar.setShowGrippy(true);
            aefvVar.setShouldUseRoundedCornersShadow(true);
            aefvVar.setHideShadowWhenFullyExpanded(true);
            aefvVar.setHideShadowWhenCollapsed(true);
            aefvVar.h(i());
            aefvVar.l(new sir(this));
            this.am = i();
            egj egjVar = new egj(this);
            egjVar.ag(null);
            egjVar.w(null);
            egjVar.K(jjn.EXPANDED);
            egjVar.D(cqrp.d(10.0d).e(J));
            egjVar.af(this.ar.a());
            egjVar.ar(false);
            egjVar.z(aljkVar);
            egjVar.U();
            egjVar.c(this.c.a().e());
            egjVar.k(true);
            egjVar.aq(cjmu.TRANSPARENT_BG_SATELLITE_ADAPTIVE_ICONS_DM_AWARE);
            ivt ivtVar = this.d;
            qcw x = qcx.x();
            x.r(amvh.i(J));
            egjVar.Q(ivtVar.b(this, x.a()));
            egf a2 = egf.a();
            a2.x = false;
            egjVar.A(a2);
            egjVar.O(jjn.FULLY_EXPANDED);
            egjVar.W(this.ae);
            egjVar.Z();
            cqkf<?> cqkfVar2 = this.ap;
            dbsk.s(cqkfVar2);
            egjVar.av(cqkfVar2.c());
            egjVar.au();
            egjVar.H(aefvVar);
            egjVar.ai(an);
            egjVar.N(i());
            this.b.a(egjVar.a());
            cqkf<snb> cqkfVar3 = this.ao;
            dbsk.s(cqkfVar3);
            cqkfVar3.e(this.al);
            this.al.h();
            this.ai.a().i(dvum.TRANSPORTATION_TAB, null);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        if (!this.as) {
            super.u();
            return;
        }
        this.as = false;
        this.al.i();
        cqkf<snb> cqkfVar = this.ao;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        this.ad.n(this.at);
        this.ad.c(this);
        this.af.b();
        this.g.a(this);
        super.u();
    }
}
