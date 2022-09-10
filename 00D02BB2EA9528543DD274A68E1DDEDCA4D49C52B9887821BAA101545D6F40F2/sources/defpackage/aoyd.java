package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aoyd  reason: default package */
/* loaded from: classes2.dex */
public final class aoyd implements aoxv {
    private static final dcqe e = dcqe.c("aoyd");
    public final apkf a;
    public final Executor b;
    private final cqat f;
    private final anhk g;
    private final btvo h;
    private final Executor i;
    @dzsi
    private dcdc<akqi> k;
    @dzsi
    private eapd l;
    private final buqr m;
    public final Map<akqi, aoxt> c = new HashMap();
    public final List<aowp> d = new ArrayList();
    private boolean j = false;

    public aoyd(cqat cqatVar, apkf apkfVar, buqr buqrVar, anhk anhkVar, btvo btvoVar, Executor executor, Executor executor2) {
        this.f = cqatVar;
        this.a = apkfVar;
        this.m = buqrVar;
        this.g = anhkVar;
        this.h = btvoVar;
        this.i = executor;
        this.b = executor2;
    }

    public static void k(bwrs<aoyg> bwrsVar, aoyf aoyfVar, String str) {
        aoyg c = bwrsVar.c();
        dbsk.s(c);
        aoyf b = c.b();
        if (b != aoyfVar) {
            bvoo.h("Unexpected state after %s: %s", str, b);
        }
    }

    private final void n(bwrs<aoyg> bwrsVar) {
        aoyg c = bwrsVar.c();
        dbsk.s(c);
        djcn o = o(c.a());
        int i = this.h.getMapsActivitiesParameters().l;
        if (o.c) {
            o.bF();
            o.c = false;
        }
        djcq djcqVar = (djcq) o.b;
        djcq djcqVar2 = djcq.h;
        djcqVar.a |= 128;
        djcqVar.f = i;
        this.m.b(o.bK(), new aoxx(this, bwrsVar, c), this.i);
    }

    private final djcn o(aoyj aoyjVar) {
        dbsg i;
        djcn bZ = djcq.h.bZ();
        dnwb a = this.g.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djcq djcqVar = (djcq) bZ.b;
        a.getClass();
        djcqVar.g = a;
        djcqVar.a |= 256;
        dbsg<aoxp> b = aoyjVar.b();
        dbsg<ilo> c = aoyjVar.c();
        if (b.a() || c.a()) {
            djco bZ2 = djcp.e.bZ();
            if (b.a()) {
                String a2 = b.b().a();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                djcp djcpVar = (djcp) bZ2.b;
                a2.getClass();
                djcpVar.a |= 2;
                djcpVar.d = a2;
                bZ2.bK();
            }
            if (c.a()) {
                dtbp dtbpVar = (dtbp) dtbq.g.bZ();
                dgrh h = c.b().ai().h();
                if (dtbpVar.c) {
                    dtbpVar.bF();
                    dtbpVar.c = false;
                }
                dtbq dtbqVar = (dtbq) dtbpVar.b;
                h.getClass();
                dtbqVar.b = h;
                dtbqVar.a |= 1;
                String b2 = bkkc.b((dtbq) dtbpVar.bK());
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                djcp djcpVar2 = (djcp) bZ2.b;
                b2.getClass();
                djcpVar2.a |= 1;
                djcpVar2.b = b2;
            }
            i = dbsg.i(bZ2.bK());
        } else {
            i = dbpy.a;
        }
        if (i.a()) {
            djcp djcpVar3 = (djcp) i.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djcq djcqVar2 = (djcq) bZ.b;
            djcpVar3.getClass();
            djcqVar2.b = djcpVar3;
            djcqVar2.a |= 2;
        }
        aoyi aoyiVar = aoyi.BY_LAST_VISIT_TIME_DESCENDING;
        aoyf aoyfVar = aoyf.INITIAL_LOADING;
        int ordinal = aoyjVar.a().ordinal();
        if (ordinal == 0) {
            dqlh bZ3 = dqlk.d.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dqlk dqlkVar = (dqlk) bZ3.b;
            dqlkVar.b = 2;
            dqlkVar.a |= 1;
            dqlk dqlkVar2 = (dqlk) bZ3.b;
            dqlkVar2.c = 0;
            dqlkVar2.a |= 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djcq djcqVar3 = (djcq) bZ.b;
            dqlk bK = bZ3.bK();
            bK.getClass();
            djcqVar3.e = bK;
            djcqVar3.a |= 64;
        } else if (ordinal == 1) {
            dqlh bZ4 = dqlk.d.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dqlk dqlkVar3 = (dqlk) bZ4.b;
            dqlkVar3.b = 1;
            dqlkVar3.a |= 1;
            dqlk dqlkVar4 = (dqlk) bZ4.b;
            dqlkVar4.c = 0;
            dqlkVar4.a |= 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djcq djcqVar4 = (djcq) bZ.b;
            dqlk bK2 = bZ4.bK();
            bK2.getClass();
            djcqVar4.e = bK2;
            djcqVar4.a |= 64;
        }
        return bZ;
    }

    private final bwrs<aoyg> p(aoyj aoyjVar) {
        aoyf aoyfVar = aoyf.INITIAL_LOADING;
        dcdc<aoxt> e2 = dcdc.e();
        dcdc<aoxt> e3 = dcdc.e();
        dbpy<Object> dbpyVar = dbpy.a;
        eapd eapdVar = new eapd(this.f.b());
        aoxe aoxeVar = new aoxe();
        if (aoyjVar != null) {
            aoxeVar.a = aoyjVar;
            aoxeVar.f(aoyfVar);
            aoxeVar.e(e2);
            aoxeVar.d(e3);
            aoxeVar.c = null;
            aoxeVar.d = dbpyVar;
            aoxeVar.b = eapdVar;
            return bwrs.a(aoxeVar.g());
        }
        throw new NullPointerException("Null key");
    }

    @Override // defpackage.aoxv
    public final bwrs<aoyg> a(aoyj aoyjVar) {
        bwrs<aoyg> p = p(aoyjVar);
        n(p);
        return p;
    }

    @Override // defpackage.aoxv
    public final aoxu b() {
        aoxd aoxdVar = new aoxd(p(aoyj.h(aoyi.BY_LAST_VISIT_TIME_DESCENDING, 2, dbpy.a, dbpy.a)), p(aoyj.h(aoyi.BY_LAST_VISIT_TIME_DESCENDING, 1, dbpy.a, dbpy.a)));
        djcq djcqVar = djcq.h;
        dsqp dsqpVar = (dsqp) djcqVar.cu(5);
        dsqpVar.bC(djcqVar);
        djcn djcnVar = (djcn) dsqpVar;
        dnwb a = this.g.a();
        if (djcnVar.c) {
            djcnVar.bF();
            djcnVar.c = false;
        }
        djcq djcqVar2 = (djcq) djcnVar.b;
        a.getClass();
        djcqVar2.g = a;
        djcqVar2.a |= 256;
        this.m.b(djcnVar.bK(), new aoyb(new aoyc(this, aoxdVar.a), new aoyc(this, aoxdVar.b)), this.i);
        return aoxdVar;
    }

    @Override // defpackage.aoxv
    public final void c(bwrs<aoyg> bwrsVar) {
        synchronized (bwrsVar) {
            aoyg c = bwrsVar.c();
            dbsk.s(c);
            aoyi aoyiVar = aoyi.BY_LAST_VISIT_TIME_DESCENDING;
            aoyf aoyfVar = aoyf.INITIAL_LOADING;
            int ordinal = c.b().ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                aoye h = c.h();
                                h.f(aoyf.INITIAL_LOADING);
                                h.c(dbpy.a);
                                bwrsVar.d(h.g());
                                int e2 = c.a().e();
                                if (e2 == 0) {
                                    throw null;
                                }
                                if (e2 != 3) {
                                    djcq djcqVar = djcq.h;
                                    dsqp dsqpVar = (dsqp) djcqVar.cu(5);
                                    dsqpVar.bC(djcqVar);
                                    djcn djcnVar = (djcn) dsqpVar;
                                    dnwb a = this.g.a();
                                    if (djcnVar.c) {
                                        djcnVar.bF();
                                        djcnVar.c = false;
                                    }
                                    djcq djcqVar2 = (djcq) djcnVar.b;
                                    a.getClass();
                                    djcqVar2.g = a;
                                    djcqVar2.a |= 256;
                                    this.m.b(djcnVar.bK(), new aoyc(this, bwrsVar), this.i);
                                } else {
                                    n(bwrsVar);
                                }
                            }
                        }
                    }
                }
                aoye h2 = c.h();
                h2.f(aoyf.LOADING);
                h2.c(dbpy.a);
                bwrsVar.d(h2.g());
                aoyg c2 = bwrsVar.c();
                dbsk.s(c2);
                djcn o = o(c2.a());
                if (o.c) {
                    o.bF();
                    o.c = false;
                }
                djcq djcqVar3 = (djcq) o.b;
                djcq djcqVar4 = djcq.h;
                djcqVar3.a |= 16;
                djcqVar3.c = 100;
                dspd f = c2.f();
                if (f != null) {
                    if (o.c) {
                        o.bF();
                        o.c = false;
                    }
                    djcq djcqVar5 = (djcq) o.b;
                    f.getClass();
                    djcqVar5.a |= 32;
                    djcqVar5.d = f;
                }
                this.m.b(o.bK(), new aoya(this, bwrsVar, c2), this.i);
            }
        }
    }

    @Override // defpackage.aoxv
    public final void d(dcdc<akqi> dcdcVar) {
        if (this.j) {
            this.k = dcdcVar;
        } else if (!dcdcVar.isEmpty()) {
            this.j = true;
            djcn o = o(aoyj.f());
            djco bZ = djcp.e.bZ();
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                akqi akqiVar = dcdcVar.get(i);
                if (((djcp) bZ.b).c.size() >= 100) {
                    break;
                }
                if (!this.c.containsKey(akqiVar)) {
                    String c = bkkc.c(akqiVar);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    djcp djcpVar = (djcp) bZ.b;
                    c.getClass();
                    dsrj<String> dsrjVar = djcpVar.c;
                    if (!dsrjVar.a()) {
                        djcpVar.c = dsqw.cl(dsrjVar);
                    }
                    djcpVar.c.add(c);
                }
            }
            if (((djcp) bZ.b).c.size() == 0) {
                this.j = false;
                return;
            }
            djcp bK = bZ.bK();
            if (o.c) {
                o.bF();
                o.c = false;
            }
            djcq djcqVar = (djcq) o.b;
            djcq djcqVar2 = djcq.h;
            bK.getClass();
            djcqVar.b = bK;
            djcqVar.a |= 2;
            this.m.b(o.bK(), new aoxz(this), this.i);
        }
    }

    @Override // defpackage.aoxv
    @dzsi
    public final aoxt e(akqi akqiVar) {
        synchronized (this.c) {
            if (this.c.containsKey(akqiVar)) {
                return this.c.get(akqiVar);
            }
            return null;
        }
    }

    @Override // defpackage.aoxv
    public final void f() {
        this.l = new eapd(this.f.b());
    }

    @Override // defpackage.aoxv
    public final boolean g(bwrs<aoyg> bwrsVar) {
        eapd eapdVar = this.l;
        if (eapdVar == null) {
            return false;
        }
        aoyg c = bwrsVar.c();
        dbsk.s(c);
        return eapdVar.w(c.e());
    }

    @Override // defpackage.aoxv
    public final void h(aowp aowpVar) {
        this.d.add(aowpVar);
    }

    @Override // defpackage.aoxv
    public final void i(aowp aowpVar) {
        this.d.remove(aowpVar);
    }

    public final void j() {
        dcdc<akqi> dcdcVar = this.k;
        if (dcdcVar != null) {
            d(dcdc.r(dcdcVar));
            this.k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcdc<aoxt> l(List<djct> list, final int i) {
        return dcdc.r(dchl.k(list, new dbrn(this, i) { // from class: aoxw
            private final aoyd a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                aoyd aoydVar = this.a;
                int i2 = this.b;
                djct djctVar = (djct) obj;
                apkf apkfVar = aoydVar.a;
                drdg drdgVar = djctVar.a;
                if (drdgVar == null) {
                    drdgVar = drdg.q;
                }
                dgrh dgrhVar = bkkc.a(drdgVar.c).b;
                if (dgrhVar == null) {
                    dgrhVar = dgrh.d;
                }
                akqi k = akqi.k(dgrhVar);
                String str = drdgVar.g;
                dpum dpumVar = drdgVar.f;
                if (dpumVar == null) {
                    dpumVar = dpum.d;
                }
                String a = apkfVar.a(k, str, dpumVar);
                ily ilyVar = new ily();
                ilyVar.j(k);
                dpum dpumVar2 = drdgVar.f;
                if (dpumVar2 == null) {
                    dpumVar2 = dpum.d;
                }
                ilyVar.q(akqq.f(dpumVar2));
                if (a == null) {
                    a = drdgVar.g;
                }
                ilyVar.F(a);
                ilyVar.w = drdgVar.h;
                ilyVar.c = false;
                dbsg<akqi> i3 = dbsg.i(k);
                dpum dpumVar3 = drdgVar.f;
                if (dpumVar3 == null) {
                    dpumVar3 = dpum.d;
                }
                dbsg<dndr> c = apkfVar.c(i3, dbsg.i(akqq.f(dpumVar3)));
                if (c.a()) {
                    ilyVar.z = c.b();
                }
                for (drdd drddVar : drdgVar.m) {
                    ilyVar.f(drddVar.b);
                }
                if (drdgVar.i.size() > 0) {
                    ilyVar.A(drdgVar.i.get(0));
                }
                if ((drdgVar.a & 8192) != 0) {
                    dpxf dpxfVar = drdgVar.n;
                    if (dpxfVar == null) {
                        dpxfVar = dpxf.f;
                    }
                    ilyVar.s(dpxfVar);
                }
                ilo d = ilyVar.d();
                dqlg dqlgVar = djctVar.b;
                if (dqlgVar == null) {
                    dqlgVar = dqlg.c;
                }
                bvrt b = bvrt.b(dqlgVar);
                dqdw dqdwVar = djctVar.c;
                if (dqdwVar == null) {
                    dqdwVar = dqdw.c;
                }
                return new aoxc(d, b, bvrt.b(dqdwVar), i2);
            }
        }));
    }
}
