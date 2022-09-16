package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: shb  reason: default package */
/* loaded from: classes7.dex */
public class shb implements sbd {
    private final cqkn<sbe> A;
    private final int B;
    public final Context a;
    public final List<sbe> b;
    public final boolean c;
    @dzsi
    public dcdc<amvh> d;
    @dzsi
    public akqs e;
    public sbe f;
    public boolean g;
    public boolean h;
    public boolean i;
    private final qjk j;
    private final shu k;
    private final sic l;
    private final sdz m;
    private final qsm n;
    private final vox o;
    private final sgc p;
    private final akox q;
    @dzsi
    private final rln r;
    @dzsi
    private final sbe s;
    @dzsi
    private final sbe t;
    private final boolean u;
    @dzsi
    private amte v;
    private List<Future<rlm>> w;
    private final int x;
    @dzsi
    private sbc y;
    private final degu<amte> z;

    public shb(Application application, cqhn cqhnVar, qjk qjkVar, shu shuVar, sic sicVar, sdz sdzVar, qsm qsmVar, vox voxVar, sgc sgcVar, akox akoxVar, rln rlnVar, btvo btvoVar, dndr dndrVar, dndr dndrVar2) {
        this.b = new ArrayList();
        this.w = new ArrayList();
        this.g = true;
        boolean z = false;
        this.h = false;
        this.i = false;
        this.z = new sgz(this);
        sha shaVar = new sha(this);
        this.A = shaVar;
        dbsk.a(dndrVar.equals(dndr.HOME) || dndrVar.equals(dndr.WORK));
        dbsk.a(dndrVar2.equals(dndr.HOME) || dndrVar2.equals(dndr.WORK));
        dbsk.a(dndrVar != dndrVar2);
        this.a = application;
        this.j = qjkVar;
        this.k = shuVar;
        this.l = sicVar;
        this.m = sdzVar;
        this.n = qsmVar;
        this.o = voxVar;
        this.p = sgcVar;
        this.q = akoxVar;
        this.r = rlnVar;
        if (dndrVar == dndr.HOME && dndrVar2 == dndr.WORK) {
            z = true;
        }
        this.c = z;
        this.u = btvoVar.getCommuteSetupParameters().m;
        this.t = btvoVar.getCommuteSetupParameters().k ? new shd(dcdc.e(), null, null, -1, shaVar, x(z), 0, application.getString(R.string.TRANSIT_ROUTE_BUILD_OWN)) : null;
        this.s = new shd(dcdc.e(), null, null, -1, shaVar, x(z), 0, application.getString(R.string.TRANSIT_ROUTE_OTHER));
        this.B = 1;
        this.x = -1;
    }

    private static ddho x(boolean z) {
        return z ? dtxl.dK : dtxl.dI;
    }

    @Override // defpackage.sbd
    public Boolean a() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.sbd
    public Boolean b() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.sbd
    public Boolean c() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.sbd
    public List<sbe> d() {
        return this.b;
    }

    @Override // defpackage.sbd
    public cjtd e() {
        return cjtd.a(this.c ? dtxl.dJ : dtxl.dH);
    }

    public void g() {
        f();
        h();
    }

    public final void h() {
        int i;
        if (this.f != null) {
            Iterator<sbe> it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = 0;
                    break;
                }
                sbe next = it.next();
                if (next == this.f) {
                    i = this.b.indexOf(next);
                    break;
                }
            }
            for (View view : cqkx.n(this)) {
                if (view instanceof GmmRecyclerView) {
                    ((GmmRecyclerView) view).n(i);
                }
            }
        }
    }

    public void i() {
        this.o.a();
        int i = this.B;
        if (i == 0) {
            throw null;
        }
        if (i != 1) {
            amte amteVar = this.v;
            dbsk.s(amteVar);
            u(amteVar);
        } else {
            this.n.e();
            rln rlnVar = this.r;
            if (rlnVar != null && this.c) {
                rlnVar.a.a();
            }
            if (this.g) {
                final dcep<Integer> j = this.j.j();
                if (j.isEmpty()) {
                    return;
                }
                dcdc<amvh> dcdcVar = this.d;
                if (dcdcVar == null || dcdcVar.isEmpty()) {
                    this.l.c(new sib(this, j) { // from class: sgy
                        private final shb a;
                        private final dcep b;

                        {
                            this.a = this;
                            this.b = j;
                        }

                        @Override // defpackage.sib
                        public final void a(qjn qjnVar) {
                            shb shbVar = this.a;
                            dcep dcepVar = this.b;
                            azva a = qjnVar.a();
                            azva b = qjnVar.b();
                            if (a == null || b == null) {
                                shbVar.r();
                                return;
                            }
                            akqq akqqVar = a.e;
                            akqq akqqVar2 = b.e;
                            if (akqqVar != null && akqqVar2 != null) {
                                akqr a2 = akqs.a();
                                a2.d(akqqVar);
                                a2.d(akqqVar2);
                                shbVar.e = a2.b();
                            }
                            if (shbVar.t(shbVar.f)) {
                                shbVar.j();
                            }
                            sie c = sie.c(shbVar.a, qjnVar);
                            shbVar.d = shbVar.c ? c.d() : c.e();
                            if (shbVar.d.isEmpty()) {
                                shbVar.r();
                            } else {
                                shbVar.s(dcepVar);
                            }
                        }
                    });
                    return;
                } else {
                    s(j);
                    return;
                }
            }
        }
        if (!t(this.f)) {
            return;
        }
        j();
    }

    public final void j() {
        akqs akqsVar = this.e;
        if (akqsVar != null) {
            akox akoxVar = this.q;
            akyc n = akyt.n(akqsVar, 150, 150, Math.round(akoxVar.o.y * 0.25f), Math.round(this.q.o.y * 0.7f));
            n.b = 500;
            akoxVar.p(n);
        }
    }

    public void k() {
        this.o.b();
        this.p.a();
        rln rlnVar = this.r;
        if (rlnVar != null && this.c) {
            rlnVar.a.b();
        }
        int i = this.B;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.n.f();
            return;
        }
        throw null;
    }

    @dzsi
    public amte l() {
        return this.v;
    }

    @dzsi
    public sbe m() {
        return this.s;
    }

    @dzsi
    public sbe n() {
        return this.t;
    }

    @dzsi
    public sbe o() {
        return this.f;
    }

    public dbsg<Future<rlm>> p() {
        sbe sbeVar = this.f;
        if (sbeVar == null) {
            return dbpy.a;
        }
        int g = sbeVar.g();
        List<Future<rlm>> list = this.w;
        return (list == null || g < 0 || g >= list.size()) ? dbpy.a : dbsg.i(this.w.get(g));
    }

    public void q(@dzsi sbc sbcVar) {
        this.y = sbcVar;
    }

    public final void r() {
        this.i = true;
        this.g = false;
        cqkx.p(this);
        w();
    }

    public final void s(Collection<Integer> collection) {
        dbsk.s(this.d);
        if (this.c) {
            this.n.h(this.d, this.k.a(collection, this.j.l()), this.z);
        } else {
            this.n.i(this.d, this.k.a(collection, this.j.n()), this.z);
        }
    }

    public final boolean t(@dzsi sbe sbeVar) {
        return sbeVar == null || sbeVar == this.s || sbeVar == this.t;
    }

    public final void u(amte amteVar) {
        final rln rlnVar;
        dehn h;
        rll rllVar;
        amuq[] c;
        rll rllVar2;
        sbe sbeVar;
        sbe sbeVar2;
        this.v = amteVar;
        List<amub> a = amteVar.a(this.a);
        this.g = false;
        this.h = false;
        this.b.clear();
        if (!this.i && (sbeVar2 = this.t) != null) {
            sbeVar2.i(0);
            this.b.add(this.t);
        }
        this.b.addAll(sea.a(a, this.m, this.A, x(this.c)));
        boolean isEmpty = this.b.isEmpty();
        this.i = isEmpty;
        if (!isEmpty && (sbeVar = this.s) != null) {
            sbeVar.i(this.b.size());
            this.b.add(this.s);
        }
        if (this.u && this.c && (rlnVar = this.r) != null) {
            ArrayList g = dchl.g(amteVar.a.n());
            for (int i = 0; i < amteVar.a.n(); i++) {
                amve m = amteVar.a.m(i);
                if (m.b().i) {
                    h = deha.a(rlm.d(rll.CONFIDENTIAL_TRIP));
                } else if (m.e() == 1) {
                    ArrayList arrayList = new ArrayList();
                    if (m.e() == 1) {
                        for (amuq amuqVar : m.d(0).c()) {
                            dqvj c2 = dqvj.c(amuqVar.a().b);
                            if (c2 == null) {
                                c2 = dqvj.DRIVE;
                            }
                            if (c2 == dqvj.TRANSIT) {
                                arrayList.add(amuqVar);
                            }
                        }
                    }
                    if (arrayList.size() != 1) {
                        arrayList.size();
                        if (arrayList.isEmpty()) {
                            rllVar = rll.NO_TRANSIT_STEP_GROUPS_IN_TRIP;
                        } else {
                            rllVar = rll.MULTIPLE_TRANSIT_STEP_GROUPS_IN_TRIP;
                        }
                        h = deha.a(rlm.d(rllVar));
                    } else {
                        amuq amuqVar2 = (amuq) arrayList.get(0);
                        int i2 = amuqVar2.g().h;
                        dgsn dgsnVar = dgsn.VEHICLE_TYPE_ANY;
                        switch (dgsn.b(i2).ordinal()) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                                qsg qsgVar = rlnVar.a;
                                dpgw dpgwVar = amuqVar2.g().d;
                                if (dpgwVar == null) {
                                    dpgwVar = dpgw.r;
                                }
                                akqi b = akqi.b(dpgwVar.n);
                                dpgw dpgwVar2 = amuqVar2.g().c;
                                if (dpgwVar2 == null) {
                                    dpgwVar2 = dpgw.r;
                                }
                                akqi b2 = akqi.b(dpgwVar2.n);
                                dwal ca = dwao.R.ca(rlnVar.c.b(dqvj.TRANSIT, 3, vul.TRANSIT_ROUTE_SELECTION));
                                dwbk dwbkVar = ((dwao) ca.b).f;
                                if (dwbkVar == null) {
                                    dwbkVar = dwbk.s;
                                }
                                dsqp dsqpVar = (dsqp) dwbkVar.cu(5);
                                dsqpVar.bC(dwbkVar);
                                dwbd dwbdVar = (dwbd) dsqpVar;
                                if (dwbdVar.c) {
                                    dwbdVar.bF();
                                    dwbdVar.c = false;
                                }
                                dwbk dwbkVar2 = (dwbk) dwbdVar.b;
                                dwbkVar2.a |= 32;
                                dwbkVar2.g = false;
                                dpgr bZ = dpgs.c.bZ();
                                dqvh dqvhVar = dqvh.TRANSIT_VEHICLE_TYPE_RAIL;
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dpgs dpgsVar = (dpgs) bZ.b;
                                dpgsVar.b = dqvhVar.h;
                                dpgsVar.a |= 1;
                                dwbdVar.c(bZ.bK());
                                if (ca.c) {
                                    ca.bF();
                                    ca.c = false;
                                }
                                dwao dwaoVar = (dwao) ca.b;
                                dwbk bK = dwbdVar.bK();
                                bK.getClass();
                                dwaoVar.f = bK;
                                dwaoVar.a |= 2;
                                dopb bZ2 = dopk.x.bZ();
                                String o = b.o();
                                if (bZ2.c) {
                                    bZ2.bF();
                                    bZ2.c = false;
                                }
                                dopk dopkVar = (dopk) bZ2.b;
                                o.getClass();
                                dopkVar.a |= 4;
                                dopkVar.d = o;
                                dopk bK2 = bZ2.bK();
                                dopb bZ3 = dopk.x.bZ();
                                String o2 = b2.o();
                                if (bZ3.c) {
                                    bZ3.bF();
                                    bZ3.c = false;
                                }
                                dopk dopkVar2 = (dopk) bZ3.b;
                                o2.getClass();
                                dopkVar2.a |= 4;
                                dopkVar2.d = o2;
                                List<amvh> asList = Arrays.asList(sht.x(bK2), sht.x(bZ3.bK()));
                                vum vumVar = new vum();
                                vumVar.c(asList);
                                vumVar.a = ca.bK();
                                h = deew.h(qsgVar.c(vumVar.a()), new dbrn(rlnVar) { // from class: rlk
                                    private final rln a;

                                    {
                                        this.a = rlnVar;
                                    }

                                    @Override // defpackage.dbrn
                                    public final Object a(Object obj) {
                                        rln rlnVar2 = this.a;
                                        amte amteVar2 = (amte) obj;
                                        amve amveVar = null;
                                        amub amubVar = null;
                                        for (int i3 = 0; i3 < amteVar2.a.n(); i3++) {
                                            amve m2 = amteVar2.a.m(i3);
                                            if (!m2.b().i) {
                                                if (amveVar == null) {
                                                    amubVar = amteVar2.b(i3, rlnVar2.b);
                                                    amveVar = m2;
                                                } else {
                                                    return rlm.d(rll.MULTIPLE_TRIPS_IN_RESPONSE);
                                                }
                                            }
                                        }
                                        if (amveVar == null) {
                                            return rlm.d(rll.NO_TRIPS_IN_RESPONSE);
                                        }
                                        return new rlj(dbsg.i(qqh.a(qqh.b(4), amveVar)), dbsg.j(amubVar), rll.SUCCESS);
                                    }
                                }, dege.a);
                                continue;
                            default:
                                int i3 = amuqVar2.g().h;
                                h = deha.a(rlm.d(rll.VEHICLE_TYPE_NOT_SUPPORTED));
                                continue;
                        }
                    }
                } else {
                    m.e();
                    if (m.e() == 0) {
                        rllVar2 = rll.NO_PATHS_IN_TRIP;
                    } else {
                        rllVar2 = rll.MULTIPLE_PATHS_IN_TRIP;
                    }
                    h = deha.a(rlm.d(rllVar2));
                }
                g.add(h);
            }
            this.w = g;
        }
        if (this.x != -1) {
            for (sbe sbeVar3 : this.b) {
                boolean z = sbeVar3.g() == this.x;
                sbeVar3.e(z);
                if (z) {
                    v(sbeVar3);
                }
            }
        }
        cqkx.p(this);
        w();
    }

    public final void v(sbe sbeVar) {
        this.f = sbeVar;
        w();
    }

    public final void w() {
        sbc sbcVar = this.y;
        if (sbcVar != null) {
            sbcVar.a();
        }
    }

    public shb(Application application, cqhn cqhnVar, qjk qjkVar, shu shuVar, sic sicVar, sdz sdzVar, qsm qsmVar, vox voxVar, sgc sgcVar, akox akoxVar, dcdc<amvh> dcdcVar, amte amteVar, int i) {
        this.b = new ArrayList();
        this.w = new ArrayList();
        this.g = true;
        this.h = false;
        this.i = false;
        this.z = new sgz(this);
        this.A = new sha(this);
        this.a = application;
        this.j = qjkVar;
        this.k = shuVar;
        this.l = sicVar;
        this.m = sdzVar;
        this.n = qsmVar;
        this.o = voxVar;
        this.p = sgcVar;
        this.q = akoxVar;
        this.c = true;
        this.v = amteVar;
        this.x = i;
        this.g = false;
        this.B = 2;
        this.d = dcdcVar;
        this.s = null;
        this.t = null;
        this.r = null;
        this.u = false;
    }

    public final void f() {
        amte amteVar;
        sbe sbeVar;
        sbe sbeVar2 = this.f;
        if (sbeVar2 != null) {
            dcdc<amvh> dcdcVar = this.d;
            if (dcdcVar != null && (amteVar = this.v) != null && sbeVar2 != this.s && ((sbeVar = this.t) == null || sbeVar2 != sbeVar)) {
                this.o.c(amteVar, dcdcVar, sbeVar2.g(), vov.SINGLE_ROUTE, vow.g, null);
                sgc sgcVar = this.p;
                amte amteVar2 = this.v;
                dbsk.s(amteVar2);
                amub amubVar = amteVar2.a(this.a).get(this.f.g());
                sgcVar.a();
                sgcVar.d.clear();
                amtr a = amug.a(amubVar);
                if (a != null) {
                    for (int i = 0; i < a.e(); i++) {
                        amuq d = a.d(i);
                        dcdc<dpce> q = dcdc.q(alcf.o(d.h().c));
                        if (!q.isEmpty()) {
                            List<aktc> list = sgcVar.d;
                            akuh akuhVar = sgcVar.f.get(q);
                            if (akuhVar == null) {
                                Context context = sgcVar.e;
                                akuhVar = sgcVar.c.aj().aE().d(new zua(context, q, albv.b(context), new Rect(0, 0, 0, 2), jmj.a(sgcVar.e, 244)).a());
                                sgcVar.f.put(q, akuhVar);
                            }
                            dpgw dpgwVar = d.g().c;
                            if (dpgwVar == null) {
                                dpgwVar = dpgw.r;
                            }
                            dnoh dnohVar = dpgwVar.i;
                            if (dnohVar == null) {
                                dnohVar = dnoh.d;
                            }
                            if (sgcVar.g == null) {
                                sgcVar.g = sgcVar.c.aj().aE().c(sgc.b);
                            }
                            aktg aktgVar = sgcVar.g;
                            dbsk.s(aktgVar);
                            dmls a2 = akxh.a(akra.e(dnohVar.b, dnohVar.c));
                            dmpk dmpkVar = (dmpk) dmpn.r.bZ();
                            dmpe dmpeVar = (dmpe) dmph.f.bZ();
                            dmpc dmpcVar = (dmpc) dmpd.h.bZ();
                            int a3 = akuhVar.a();
                            if (dmpcVar.c) {
                                dmpcVar.bF();
                                dmpcVar.c = false;
                            }
                            dmpd dmpdVar = (dmpd) dmpcVar.b;
                            dmpdVar.a |= 2;
                            dmpdVar.c = a3;
                            dmpeVar.b(dmpcVar);
                            int a4 = aktgVar.a();
                            if (dmpeVar.c) {
                                dmpeVar.bF();
                                dmpeVar.c = false;
                            }
                            dmph dmphVar = (dmph) dmpeVar.b;
                            dmphVar.a |= 1;
                            dmphVar.c = a4;
                            if (dmpkVar.c) {
                                dmpkVar.bF();
                                dmpkVar.c = false;
                            }
                            dmpn dmpnVar = (dmpn) dmpkVar.b;
                            dmph dmphVar2 = (dmph) dmpeVar.bK();
                            dmphVar2.getClass();
                            dmpnVar.b = dmphVar2;
                            dmpnVar.a |= 1;
                            dmlp bZ = dmlq.e.bZ();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dmlq dmlqVar = (dmlq) bZ.b;
                            a2.getClass();
                            dmlqVar.b = a2;
                            dmlqVar.a |= 1;
                            dmlo dmloVar = (dmlo) dcft.s(sgc.a);
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dmlq dmlqVar2 = (dmlq) bZ.b;
                            dmlqVar2.c = dmloVar.j;
                            dmlqVar2.a |= 2;
                            if (dmpkVar.c) {
                                dmpkVar.bF();
                                dmpkVar.c = false;
                            }
                            dmpn dmpnVar2 = (dmpn) dmpkVar.b;
                            dmlq bK = bZ.bK();
                            bK.getClass();
                            dmpnVar2.d = bK;
                            dmpnVar2.a |= 4;
                            list.add(sgcVar.c.aj().aC().d((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7));
                        }
                    }
                    amsd amsdVar = new amsd();
                    amsdVar.c(new amrq());
                    amsdVar.c(new amrz());
                    amsdVar.d(10, new amrm());
                    amsdVar.d(10, new amrx());
                    akrk akrkVar = amubVar.l;
                    amsdVar.d(20, new amrr(akrkVar, dcdc.f(akrkVar), 0.0f, 0.0f));
                    amsdVar.e(1, new amrp());
                    amsdVar.e(1, new amro());
                    sgb sgbVar = new sgb(amsdVar.a());
                    for (aktc aktcVar : sgcVar.d) {
                        sgcVar.c.aj().ak().b(aktcVar, sgbVar, amsb.TRANSIT_ROUTE, 0, sgc.a);
                    }
                }
            } else {
                this.o.e();
                this.p.a();
                j();
            }
            cqkx.p(this);
        }
    }
}
