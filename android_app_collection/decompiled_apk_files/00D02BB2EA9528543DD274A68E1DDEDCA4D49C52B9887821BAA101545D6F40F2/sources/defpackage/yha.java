package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.directions.transitlinespace.AutoValue_TransitLineSpaceFragment_LineSpaceFragmentInstanceState;
import com.google.android.apps.gmm.directions.transitlinespace.TransitLineSpaceFragment$LineSpaceFragmentInstanceState;
import java.io.IOException;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: yha  reason: default package */
/* loaded from: classes7.dex */
public final class yha extends ges {
    private static final jjn al = jjn.EXPANDED;
    public cqhu a;
    public yti ad;
    public acwt ae;
    public dxio<afwp> af;
    public yic ag;
    public cjxo ah;
    public yib ai;
    public vnc aj;
    @dzsi
    public yth ak;
    @dzsi
    private cqkf<yhr> am;
    @dzsi
    private cqkf<yvr> an;
    @dzsi
    private qde ao;
    @dzsi
    private jkh ap;
    @dzsi
    private yhc aq;
    private jjn ar = al;
    public dxio<ixr> b;
    public bwqv c;
    public cqkj d;
    public efg e;
    public vnp f;
    public vnd g;

    @dzsi
    private static <T extends Serializable> T g(@dzsi bwrs<T> bwrsVar) {
        try {
            return (T) bwrs.b(bwrsVar);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((yhb) btsx.b(yhb.class, this)).bK(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        jkh jkhVar;
        vnc vncVar = this.aj;
        if (vncVar != null) {
            vncVar.b(-1, vncVar.a.a(), alae.a);
            vncVar.b = null;
        }
        yhc yhcVar = this.aq;
        if (yhcVar != null && (jkhVar = this.ap) != null) {
            yhcVar.G(jkhVar);
        }
        this.ap = null;
        this.aq = null;
        this.am = null;
        this.an = null;
        this.ak = null;
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        if (this.am == null) {
            this.am = this.d.d(new yhm(), viewGroup, false);
        }
        if (this.an == null) {
            cqkf<yvr> d = this.d.d(new yrc(), viewGroup, false);
            this.an = d;
            yti ytiVar = this.ad;
            View findViewById = d.c().findViewById(yrc.a);
            dbsk.s(findViewById);
            btrm a = ytiVar.a.a();
            yti.a(a, 1);
            yti.a(findViewById, 2);
            yth ythVar = new yth(a, findViewById);
            this.ak = ythVar;
            this.ai.r(ythVar);
        }
        if (this.aq == null) {
            vnd vndVar = this.g;
            jjn jjnVar = jjn.EXPANDED;
            dbty dbtyVar = ygw.a;
            bvnx a2 = vndVar.a.a();
            vnd.a(a2, 1);
            btrm a3 = vndVar.b.a();
            vnd.a(a3, 2);
            dxio a4 = ((dxjh) vndVar.c).a();
            vnd.a(a4, 3);
            dxio a5 = ((dxjh) vndVar.d).a();
            vnd.a(a5, 4);
            vnd.a(jjnVar, 5);
            vnd.a(dbtyVar, 6);
            vnc vncVar = new vnc(a2, a3, a4, a5, jjnVar, dbtyVar);
            this.aj = vncVar;
            cqkf<yvr> cqkfVar = this.an;
            dbsk.s(cqkfVar);
            this.ap = jjk.a(vncVar, new ygz(this), new ygy(cqkfVar), new vnn(this.f.a(yhm.a)));
            yhc yhcVar = new yhc(H());
            this.aq = yhcVar;
            yhcVar.setId(yib.a);
            yhc yhcVar2 = this.aq;
            cqkf<yhr> cqkfVar2 = this.am;
            dbsk.s(cqkfVar2);
            yhcVar2.setContent(cqkfVar2.c());
            this.aq.setShouldStealEventsAboveSliderTop(false);
            this.aq.setShouldUseRoundedCornersShadow(true);
            yhc yhcVar3 = this.aq;
            jkh jkhVar = this.ap;
            dbsk.s(jkhVar);
            yhcVar3.F(jkhVar);
            return null;
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        gn gnVar = this.A;
        if (!this.aD || gnVar == null) {
            return false;
        }
        gnVar.e();
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        String string;
        qde a;
        TransitLineSpaceFragment$LineSpaceFragmentInstanceState transitLineSpaceFragment$LineSpaceFragmentInstanceState;
        super.l(bundle);
        bwqv bwqvVar = this.c;
        Bundle bundle2 = this.o;
        if (bundle2 == null || (string = bundle2.getString("StartTransitLineSpaceParams.lfi")) == null) {
            a = null;
        } else {
            qdd i = qde.i();
            i.b(akqi.b(string));
            qau qauVar = (qau) i;
            qauVar.a = bundle2.getString("StartTransitLineSpaceParams.twl");
            dnqh dnqhVar = (dnqh) bvrs.f(bundle2, "StartTransitLineSpaceParams.lp", (dssr) dnqh.p.cu(7));
            if (dnqhVar != null) {
                qauVar.b = dnqhVar;
            }
            i.c(bundle2.getBoolean(".rtos"));
            try {
                ((qau) i).c = bwqvVar.e(brln.class, bundle2, ".asreqr");
                ((qau) i).d = bwqvVar.e(brlu.class, bundle2, ".asresr");
            } catch (IOException unused) {
            }
            i.d(bundle2.getBoolean(".spm"));
            i.e(bundle2.getBoolean(".assb"));
            a = i.a();
        }
        if (a == null) {
            return;
        }
        this.ao = a;
        yic yicVar = this.ag;
        acwt acwtVar = this.ae;
        Activity activity = (Activity) ((dxjd) yicVar.a).a;
        yic.a(activity, 1);
        ivg a2 = yicVar.b.a();
        yic.a(a2, 2);
        cqhn a3 = yicVar.c.a();
        yic.a(a3, 3);
        btrm a4 = yicVar.d.a();
        yic.a(a4, 4);
        dxio a5 = ((dxjh) yicVar.e).a();
        yic.a(a5, 5);
        ytc a6 = yicVar.f.a();
        yic.a(a6, 6);
        ywn a7 = yicVar.g.a();
        yic.a(a7, 7);
        yuu a8 = yicVar.h.a();
        yic.a(a8, 8);
        yuw a9 = yicVar.i.a();
        yic.a(a9, 9);
        befw a10 = yicVar.j.a();
        yic.a(a10, 10);
        qbt a11 = yicVar.k.a();
        yic.a(a11, 11);
        yic.a(acwtVar, 12);
        yic.a(a, 13);
        this.ai = new yib(activity, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, acwtVar, a);
        if (bundle != null && (transitLineSpaceFragment$LineSpaceFragmentInstanceState = (TransitLineSpaceFragment$LineSpaceFragmentInstanceState) bundle.getParcelable("TransitLineSpaceFragment.InstanceState")) != null) {
            dgrt dgrtVar = (dgrt) bvrs.f(bundle, "TransitLineSpaceFragment.LastSearch", (dssr) dgrt.d.cu(7));
            akqs d = dgrtVar == null ? null : akqs.d(dgrtVar);
            if (d != null) {
                this.ai.k(d, transitLineSpaceFragment$LineSpaceFragmentInstanceState.a());
            }
        }
        if (!a.g()) {
            return;
        }
        ixr a12 = this.b.a();
        qde qdeVar = this.ao;
        brln brlnVar = (brln) g(qdeVar != null ? qdeVar.e() : null);
        qde qdeVar2 = this.ao;
        brlu brluVar = (brlu) g(qdeVar2 != null ? qdeVar2.f() : null);
        String str = brluVar != null ? brluVar.a : null;
        String j = brlnVar != null ? brlnVar.j() : null;
        qde qdeVar3 = this.ao;
        String b = qdeVar3 != null ? qdeVar3.b() : null;
        if (!dbsj.d(str)) {
            a12.I(str);
        } else if (!dbsj.d(j)) {
            a12.I(j);
        } else if (dbsj.d(b)) {
        } else {
            a12.I(b);
        }
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtyc.dH;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ah.a(1);
        cqkf<yhr> cqkfVar = this.am;
        if (cqkfVar == null || this.an == null) {
            return;
        }
        cqkfVar.e(this.ai);
        cqkf<yvr> cqkfVar2 = this.an;
        dbsk.s(cqkfVar2);
        cqkfVar2.e(this.ai);
        this.ai.i();
        yth ythVar = this.ak;
        dbsk.s(ythVar);
        dbsk.a(!ythVar.e);
        ythVar.e = true;
        btrm btrmVar = ythVar.a;
        dceq a = dcet.a();
        a.b(alhl.class, new ytk(0, alhl.class, ythVar, bvrj.UI_THREAD));
        a.b(alhw.class, new ytk(1, alhw.class, ythVar, bvrj.UI_THREAD));
        btrmVar.g(ythVar, a.a());
        btrm btrmVar2 = ythVar.a;
        ytg ytgVar = ythVar.c;
        dceq a2 = dcet.a();
        a2.b(ardp.class, new ytj(ardp.class, ytgVar, bvrj.UI_THREAD));
        btrmVar2.g(ytgVar, a2.a());
        if (od.ae(ythVar.b)) {
            ythVar.f();
        } else {
            ythVar.b.addOnLayoutChangeListener(new ytf(ythVar));
        }
        aljk aljkVar = new aljk();
        aljkVar.a(true);
        aljkVar.l = false;
        egj egjVar = new egj(this);
        egjVar.w(null);
        egjVar.K(jjn.EXPANDED);
        egjVar.s(this.aq);
        egjVar.aj(egn.TWO_FIFTHS_EXPANDED_MAP);
        egjVar.ai(this.ar);
        egjVar.T(jkc.k);
        egjVar.U();
        egjVar.ar(false);
        egjVar.z(aljkVar);
        egjVar.J(new egq(this) { // from class: ygx
            private final yha a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                int i;
                vnc vncVar = this.a.aj;
                if (vncVar == null || vncVar.b == null || (i = vncVar.c) == -1) {
                    return;
                }
                vncVar.a(i);
            }
        });
        egjVar.c(this.af.a().e());
        egjVar.Y(true);
        cqkf<yvr> cqkfVar3 = this.an;
        dbsk.s(cqkfVar3);
        egjVar.M(cqkfVar3.c());
        egf a3 = egf.a();
        a3.n = false;
        a3.x = false;
        egjVar.A(a3);
        qde qdeVar = this.ao;
        dbsk.s(qdeVar);
        if (qdeVar.g()) {
            egjVar.W(this.b.a());
            egjVar.O(jjn.EXPANDED);
        }
        this.e.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putParcelable("TransitLineSpaceFragment.InstanceState", new AutoValue_TransitLineSpaceFragment_LineSpaceFragmentInstanceState(this.ai.m()));
        akqs l = this.ai.l();
        if (l != null) {
            bvrs.k(bundle, "TransitLineSpaceFragment.LastSearch", l.e());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ae.a();
        cqkf<yhr> cqkfVar = this.am;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        cqkf<yvr> cqkfVar2 = this.an;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        this.ai.j();
        yth ythVar = this.ak;
        if (ythVar != null) {
            ythVar.d();
            ythVar.a.a(ythVar);
            ythVar.a.a(ythVar.c);
            ythVar.e = false;
        }
        yhc yhcVar = this.aq;
        jjn jjnVar = yhcVar != null ? yhcVar.f : al;
        if (jjnVar != jjn.HIDDEN) {
            this.ar = jjnVar;
        }
        this.ah.b();
        super.u();
    }
}
