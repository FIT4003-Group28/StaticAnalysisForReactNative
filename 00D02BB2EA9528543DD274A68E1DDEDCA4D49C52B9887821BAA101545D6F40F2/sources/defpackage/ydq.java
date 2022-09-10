package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ydq  reason: default package */
/* loaded from: classes7.dex */
public final class ydq extends ges {
    private static final cqrp ag = cqrp.d(8.0d);
    private static final afwn[] ah = {afwn.e(afwm.TRANSIT, true)};
    public zaa a;
    public ygh ad;
    public cqkf<yfq> ae;
    public View af;
    private cqkf<yfp> ai;
    private vne aj;
    public efg b;
    public cqkj c;
    public ygi d;
    public btrm e;
    public cpv f;
    public ztb g;

    public static ydq g(qdc qdcVar) {
        ydq ydqVar = new ydq();
        Bundle bundle = new Bundle();
        dpce a = qdcVar.a();
        if (a != null) {
            bundle.putBundle("StartTransitLineParams.cwl", bvrs.d(a));
        }
        bundle.putString("StartTransitLineParams.lfi", qdcVar.b());
        bundle.putString("StartTransitLineParams.osfi", qdcVar.c());
        bundle.putString("StartTransitLineParams.dsfi", qdcVar.d());
        eapd e = qdcVar.e();
        if (e != null) {
            bundle.putLong("StartTransitLineParams.dt", e.a);
        }
        bundle.putString("StartTransitLineParams.vt", qdcVar.f());
        ydqVar.B(bundle);
        return ydqVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qd() {
        ygh yghVar = this.ad;
        if (yghVar != null) {
            yghVar.s();
        }
        super.Qd();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<yfq> d = this.c.d(new yfk(), viewGroup, false);
        this.ae = d;
        zut zutVar = (zut) d.c();
        zutVar.setNestedScrollViewProvider(aegv.a(aegv.b(yfk.a), aegu.a, aegv.b(R.id.transit_line_departures_list)));
        int a = (int) (bvsc.a(J()) * 0.5f);
        zutVar.h(a);
        zutVar.setSoftMinimumHeightPixels(a);
        zutVar.setShouldUseRoundedCornersShadow(true);
        zutVar.setShowGrippy(true);
        cqkf<yfp> d2 = this.c.d(new yeu(), viewGroup, false);
        this.ai = d2;
        this.af = d2.c();
        zutVar.setSnapPoints(dcdc.h(aegg.c, new aegf(0.5f), aegg.b));
        zutVar.l(new ydp(this, zutVar));
        this.g.a((idc) this.ai.c());
        this.g.b(ag);
        this.a.a(this.ae.c());
        this.aj = new vne(new dbty(this) { // from class: ydm
            private final ydq a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return (zut) this.a.ae.c();
            }
        });
        return null;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (this.aD) {
            J().g().e();
            return true;
        }
        return false;
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtyc.dp;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ad.w(true);
        vnf.c(this.e, this.aj);
        this.ae.e(this.ad);
        this.ai.e(this.ad.z());
        this.a.c();
        cqkf<yfp> cqkfVar = this.ai;
        dbsk.s(cqkfVar);
        zvv zvvVar = new zvv(cqkfVar);
        zut zutVar = (zut) this.ae.c();
        egj egjVar = new egj(this);
        egjVar.G(this.af, 6);
        egjVar.C(zvvVar);
        egjVar.w(null);
        egjVar.ag(null);
        egjVar.H(zutVar);
        egjVar.Y(true);
        egf a = egf.a();
        a.l = ah;
        a.l(true);
        a.n = false;
        a.x = false;
        egjVar.A(a);
        egjVar.J(new egq(this) { // from class: ydn
            private final ydq a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                View a2;
                ydq ydqVar = this.a;
                if (ydqVar.aD && (a2 = cqhu.a(ydqVar.af, icu.c)) != null) {
                    ydqVar.f.c(a2, 8);
                }
                ydqVar.ad.u();
            }
        });
        egjVar.N((int) (bvsc.b(this.af) * 0.5f));
        ztb.e(egjVar, zvvVar, zutVar, ag);
        this.b.a(egjVar.a());
        this.ad.c();
        this.ad.t();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ad.w(false);
        this.ad.B();
        this.ad.d();
        this.a.b();
        this.ae.e(null);
        vnf.b(this.e, this.aj);
        this.ai.e(null);
        super.u();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        qdc a;
        Bundle bundle2 = this.o;
        if (bundle2 == null) {
            a = null;
        } else {
            qdb g = qdc.g();
            Bundle bundle3 = bundle2.getBundle("StartTransitLineParams.cwl");
            if (bundle3 != null) {
                ((qas) g).a = (dpce) bvrs.e(bundle3, dpce.class, (dssr) dpce.f.cu(7));
            }
            g.b(bundle2.getString("StartTransitLineParams.lfi"));
            qas qasVar = (qas) g;
            qasVar.b = bundle2.getString("StartTransitLineParams.osfi");
            qasVar.c = bundle2.getString("StartTransitLineParams.dsfi");
            if (bundle2.containsKey("StartTransitLineParams.dt")) {
                qasVar.d = new eapd(bundle2.getLong("StartTransitLineParams.dt"));
            }
            qasVar.e = bundle2.getString("StartTransitLineParams.vt");
            a = g.a();
        }
        qdc qdcVar = a;
        if (qdcVar == null) {
            return;
        }
        ygi ygiVar = this.d;
        Activity activity = (Activity) ((dxjd) ygiVar.a).a;
        ygi.a(activity, 1);
        ivg a2 = ygiVar.b.a();
        ygi.a(a2, 2);
        cqhn a3 = ygiVar.c.a();
        ygi.a(a3, 3);
        jmn a4 = ygiVar.d.a();
        ygi.a(a4, 4);
        ydu a5 = ygiVar.e.a();
        ygi.a(a5, 5);
        ygu a6 = ygiVar.f.a();
        ygi.a(a6, 6);
        yfu a7 = ygiVar.g.a();
        ygi.a(a7, 7);
        vtn a8 = ygiVar.h.a();
        ygi.a(a8, 8);
        bvrb a9 = ygiVar.i.a();
        ygi.a(a9, 9);
        ckcw a10 = ygiVar.j.a();
        ygi.a(a10, 10);
        qbt a11 = ygiVar.k.a();
        ygi.a(a11, 11);
        ygi.a(qdcVar, 12);
        ygh yghVar = new ygh(activity, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, qdcVar);
        this.ad = yghVar;
        yghVar.p();
        super.l(bundle);
    }
}
