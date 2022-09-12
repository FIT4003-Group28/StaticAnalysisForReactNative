package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: wio  reason: default package */
/* loaded from: classes7.dex */
public final class wio extends ges {
    public static final dcqe a = dcqe.c("wio");
    private static final cqrp am = cqrp.d(8.0d);
    private static final afwn[] an = {afwn.e(afwm.TRANSIT, false), afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.BICYCLING, false)};
    private static final afwn[] ao = {afwn.e(afwm.TRANSIT, true)};
    public ztb ad;
    public btvo ae;
    public dxio<ckcw> af;
    public vnb ag;
    public dbsg<drn> ah;
    public wsc ai;
    @dzsi
    public cqkf<wpu> aj;
    @dzsi
    public qdg ak;
    @dzsi
    private cqkf<? super wpu> ap;
    private vne ar;
    private bxbd as;
    private ddho at;
    private cjtd au;
    @dzsi
    private dro av;
    public zaa b;
    public efg c;
    public cqkj d;
    public wsd e;
    public btrm f;
    public bxbe g;
    private boolean aq = false;
    final win al = new win(this);

    public static wio g(qdg qdgVar) {
        ArrayList<String> arrayList;
        wio wioVar = new wio();
        Bundle bundle = new Bundle();
        bundle.putString("StartTransitStationParams.twl", qdgVar.a());
        bundle.putString("StartTransitStationParams.sfi", qdgVar.b());
        List<String> e = qdgVar.e();
        if (e instanceof ArrayList) {
            arrayList = (ArrayList) e;
        } else {
            arrayList = new ArrayList<>(e);
        }
        bundle.putStringArrayList("StartTransitStationParams.fdt", arrayList);
        int n = qdgVar.n();
        int i = n - 1;
        if (n != 0) {
            bundle.putInt("StartTransitStationParams.dts", i);
            Long f = qdgVar.f();
            if (f != null) {
                bundle.putLong("StartTransitStationParams.slgk", f.longValue());
            }
            dopk g = qdgVar.g();
            if (g != null) {
                bundle.putBundle("StartTransitStationParams.ts", bvrs.d(g));
            }
            qdi c = qdgVar.c();
            if (c != null) {
                bundle.putParcelable("StartTransitStationParams.fl", new ProtoBufUtil$ParcelableProtoList(c.a));
            }
            bundle.putBoolean("StartTransitStationParams.mi", qdgVar.h());
            akqq d = qdgVar.d();
            if (d != null) {
                bvrs.k(bundle, "StartTransitStationParams.lff", d.g());
            }
            bundle.putBoolean("StartTransitStationParams.ifs", qdgVar.i());
            bundle.putBoolean("StartTransitStationParams.ifp", qdgVar.j());
            bundle.putBoolean(".rtos", qdgVar.k());
            bundle.putString("StartTransitStationParams.csfi", qdgVar.l());
            dnqh m = qdgVar.m();
            if (m != null) {
                bvrs.k(bundle, "StartTransitStationParams.lp", m);
            }
            wioVar.B(bundle);
            return wioVar;
        }
        throw null;
    }

    private final void w() {
        wsc wscVar = this.ai;
        if (wscVar != null) {
            wscVar.d();
            this.ai.Q();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.aj = null;
        this.ap = null;
        vnb vnbVar = this.ag;
        vnbVar.a(null);
        vnbVar.d(-1, vnbVar.a.a(), alae.a);
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.aj = this.d.d(new wos(), viewGroup, false);
        this.ap = this.d.d(new icw(), viewGroup, false);
        cqkf<wpu> cqkfVar = this.aj;
        dbsk.s(cqkfVar);
        zut zutVar = (zut) cqkfVar.c();
        zutVar.setNestedScrollViewProvider(aegv.b(wos.a));
        zutVar.setShowGrippy(true);
        zutVar.setShouldUseRoundedCornersShadow(true);
        ff J = J();
        dbsk.s(J);
        int a2 = (int) (bvsc.a(J) * 0.65f);
        zutVar.h(a2);
        zutVar.setSoftMinimumHeightPixels(a2);
        zutVar.l(new wim(this, zutVar));
        ztb ztbVar = this.ad;
        cqkf<? super wpu> cqkfVar2 = this.ap;
        dbsk.s(cqkfVar2);
        ztbVar.a((idc) cqkfVar2.c());
        this.ad.b(am);
        zaa zaaVar = this.b;
        cqkf<wpu> cqkfVar3 = this.aj;
        dbsk.s(cqkfVar3);
        zaaVar.a(cqkfVar3.c());
        return null;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (this.ai != null) {
            ((ckco) this.af.a().a(ckkm.a)).a(this.ai.O().d);
        }
        if (this.aD) {
            J().g().e();
            return true;
        }
        return false;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        qdg i;
        Bundle bundle2 = this.o;
        if (bundle2 == null) {
            i = null;
        } else {
            qdf o = qdg.o();
            qaw qawVar = (qaw) o;
            qawVar.a = bundle2.getString("StartTransitStationParams.twl");
            qawVar.b = bundle2.getString("StartTransitStationParams.sfi");
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("StartTransitStationParams.fdt");
            if (stringArrayList != null) {
                o.b(stringArrayList);
            }
            o.g(dopr.b(bundle2.getInt("StartTransitStationParams.dts", 0)));
            if (bundle2.containsKey("StartTransitStationParams.slgk")) {
                qawVar.e = Long.valueOf(bundle2.getLong("StartTransitStationParams.slgk"));
            }
            Bundle bundle3 = bundle2.getBundle("StartTransitStationParams.ts");
            if (bundle3 != null) {
                qawVar.f = (dopk) bvrs.e(bundle3, dopk.class, (dssr) dopk.x.cu(7));
            }
            ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList = (ProtoBufUtil$ParcelableProtoList) bundle2.getParcelable("StartTransitStationParams.fl");
            if (protoBufUtil$ParcelableProtoList != null) {
                qawVar.c = new qdi(protoBufUtil$ParcelableProtoList.a((dssr) dpce.f.cu(7)));
            }
            o.f(bundle2.getBoolean("StartTransitStationParams.mi", true));
            dnoh dnohVar = (dnoh) bvrs.f(bundle2, "StartTransitStationParams.lff", (dssr) dnoh.d.cu(7));
            if (dnohVar != null) {
                qawVar.d = akqq.e(dnohVar);
            }
            o.d(bundle2.getBoolean("StartTransitStationParams.ifs"));
            o.c(bundle2.getBoolean("StartTransitStationParams.ifp"));
            o.e(bundle2.getBoolean(".rtos"));
            qawVar.g = bundle2.getString("StartTransitStationParams.csfi");
            dnqh dnqhVar = (dnqh) bvrs.f(bundle2, "StartTransitStationParams.lp", (dssr) dnqh.p.cu(7));
            if (dnqhVar != null) {
                qawVar.h = dnqhVar;
            }
            i = o.i();
        }
        if (i == null) {
            return;
        }
        this.as = this.g.a(dtyb.dO);
        i(i);
        super.l(bundle);
        this.ar = new vne(new dbty(this) { // from class: wii
            private final wio a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                cqkf<wpu> cqkfVar = this.a.aj;
                dbsk.s(cqkfVar);
                return (aegc) cqkfVar.c();
            }
        });
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        cqkf<wpu> cqkfVar = this.aj;
        if (cqkfVar == null) {
            return;
        }
        View c = cqkfVar.c();
        if (!(c instanceof zut)) {
            return;
        }
        zut zutVar = (zut) c;
        ff J = J();
        dbsk.s(J);
        int a2 = (int) (bvsc.a(J) * 0.65f);
        if (a2 == zutVar.x()) {
            return;
        }
        zutVar.setSoftMinimumHeightPixels(a2);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return this.at;
    }

    public final void q() {
        cqkf<wpu> cqkfVar = this.aj;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.ai);
        cqkf<? super wpu> cqkfVar2 = this.ap;
        dbsk.s(cqkfVar2);
        cqkfVar2.e(this.ai);
        this.b.c();
        cqkf<wpu> cqkfVar3 = this.aj;
        dbsk.s(cqkfVar3);
        zut zutVar = (zut) cqkfVar3.c();
        zutVar.n();
        cqkf<? super wpu> cqkfVar4 = this.ap;
        dbsk.s(cqkfVar4);
        zvv zvvVar = new zvv(cqkfVar4);
        afwn[] afwnVarArr = this.ae.getTransitPagesParameters().g ? an : ao;
        egj egjVar = new egj(this);
        egjVar.C(zvvVar);
        egjVar.w(null);
        egjVar.as(this.as);
        egf a2 = egf.a();
        a2.l = afwnVarArr;
        a2.l(!this.ai.n().booleanValue());
        a2.n = false;
        a2.x = false;
        a2.B = true;
        egjVar.A(a2);
        egjVar.J(new egq(this) { // from class: wik
            private final wio a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                wio wioVar = this.a;
                wioVar.ai.L();
                vnb vnbVar = wioVar.ag;
                int i = vnbVar.b;
                if (i == -1) {
                    return;
                }
                vnbVar.c(i);
            }
        });
        cqkf<? super wpu> cqkfVar5 = this.ap;
        dbsk.s(cqkfVar5);
        egjVar.F(cqkfVar5.c());
        egjVar.f(false);
        egjVar.ag(null);
        cqkf<? super wpu> cqkfVar6 = this.ap;
        dbsk.s(cqkfVar6);
        egjVar.N((int) (bvsc.b(cqkfVar6.c()) * 0.65f));
        egjVar.H(zutVar);
        ztb.e(egjVar, zvvVar, zutVar, am);
        dro droVar = this.av;
        if (droVar != null) {
            egjVar.g(droVar);
        }
        this.c.a(egjVar.a());
        this.ag.a(zutVar);
        this.ai.c();
        bd().c(this.aH.g()).d(this.au);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        q();
        if (!this.aq) {
            btrm btrmVar = this.f;
            win winVar = this.al;
            dceq a2 = dcet.a();
            a2.b(azrg.class, new wip(0, azrg.class, winVar, bvrj.UI_THREAD));
            a2.b(azre.class, new wip(1, azre.class, winVar, bvrj.UI_THREAD));
            btrmVar.g(winVar, a2.a());
            vnf.c(this.f, this.ar);
            this.aq = true;
        }
        this.ai.H();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        w();
        if (this.aq) {
            this.f.a(this.al);
            vnf.b(this.f, this.ar);
            this.aq = false;
        }
        this.b.b();
        cqkf<wpu> cqkfVar = this.aj;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        cqkf<? super wpu> cqkfVar2 = this.ap;
        dbsk.s(cqkfVar2);
        cqkfVar2.e(null);
        super.u();
    }

    public final void i(qdg qdgVar) {
        this.ak = qdgVar;
        dopk g = qdgVar.g();
        String b = g != null ? g.d : qdgVar.b();
        qdi c = qdgVar.c();
        if (b == null) {
            return;
        }
        akqi b2 = akqi.b(b);
        String a2 = g != null ? g.b : qdgVar.a();
        wij wijVar = new wij(this);
        this.as.l(null);
        if (this.ah.a() && this.ah.b().a()) {
            this.av = this.ah.b().d(this);
        }
        wsc wscVar = this.ai;
        if (wscVar != null) {
            w();
        }
        akqi f = akqi.f(qdgVar.l());
        ddho ddhoVar = f != null ? dtyc.cy : dtyc.fk;
        this.at = ddhoVar;
        this.au = cjtd.a(ddhoVar);
        wsd wsdVar = this.e;
        List<String> e = qdgVar.e();
        String e2 = dbsj.e(a2);
        boolean h = qdgVar.h();
        bxbd bxbdVar = this.as;
        dro droVar = this.av;
        dnqh m = qdgVar.m();
        Activity activity = (Activity) ((dxjd) wsdVar.a).a;
        wsd.a(activity, 1);
        eeu a3 = wsdVar.b.a();
        wsd.a(a3, 2);
        ivg a4 = wsdVar.c.a();
        wsd.a(a4, 3);
        cqhn a5 = wsdVar.d.a();
        wsd.a(a5, 4);
        btrm a6 = wsdVar.e.a();
        wsd.a(a6, 5);
        ckcw a7 = wsdVar.f.a();
        wsd.a(a7, 6);
        xcs a8 = wsdVar.g.a();
        wsd.a(a8, 7);
        cqba a9 = wsdVar.h.a();
        wsd.a(a9, 8);
        jmn a10 = wsdVar.i.a();
        wsd.a(a10, 9);
        dxio a11 = ((dxjh) wsdVar.j).a();
        wsd.a(a11, 10);
        vtn a12 = wsdVar.k.a();
        wsd.a(a12, 11);
        wqj a13 = wsdVar.l.a();
        wsd.a(a13, 12);
        wqr a14 = wsdVar.m.a();
        wsd.a(a14, 13);
        wkg a15 = wsdVar.n.a();
        wsd.a(a15, 14);
        btvo a16 = wsdVar.o.a();
        wsd.a(a16, 15);
        xiy a17 = wsdVar.p.a();
        wsd.a(a17, 16);
        wrc a18 = wsdVar.q.a();
        wsd.a(a18, 17);
        xib a19 = wsdVar.r.a();
        wsd.a(a19, 18);
        befw a20 = wsdVar.s.a();
        wsd.a(a20, 19);
        cjbh a21 = wsdVar.t.a();
        wsd.a(a21, 20);
        cjbt a22 = wsdVar.u.a();
        wsd.a(a22, 21);
        wrp a23 = wsdVar.v.a();
        wsd.a(a23, 22);
        wsd.a(b2, 23);
        wsd.a(e, 25);
        wsd.a(e2, 28);
        wsc wscVar2 = new wsc(activity, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, b2, f, e, c, e2, h, bxbdVar, droVar, wijVar, m);
        this.ai = wscVar2;
        wscVar2.G(g);
        if (wscVar == null) {
            return;
        }
        this.ai.H();
    }
}
