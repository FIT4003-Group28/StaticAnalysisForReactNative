package defpackage;

import android.app.Application;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wrc  reason: default package */
/* loaded from: classes7.dex */
public final class wrc {
    private static final dcqe l = dcqe.c("wrc");
    public final dxio<qbt> a;
    public final akto b;
    public final aler c;
    public final xlu d;
    public final wsu e;
    public final wst f;
    public final dbsl<dmpn> g = new xct();
    public final dcna<Integer, akte> h = dckl.b().c().a();
    public final dcna<Integer, akqi> i = dckl.b().c().a();
    public final dcna<akqi, Integer> j = dckl.b().c().a();
    final Map<akqi, aktd> k = dcjz.d();
    private final akox m;
    private final gll n;
    private final int o;

    public wrc(dxio<qbt> dxioVar, akto aktoVar, akox akoxVar, gll gllVar, ales alesVar, xlu xluVar, wsu wsuVar, wst wstVar, Application application) {
        this.a = dxioVar;
        this.b = aktoVar;
        this.m = akoxVar;
        this.n = gllVar;
        this.c = alesVar;
        this.d = xluVar;
        this.e = wsuVar;
        this.f = wstVar;
        this.o = ibm.n().b(application);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(Iterable<wpv> iterable, boolean z) {
        xmw P;
        if (this.d.i()) {
            this.d.b(dchl.c(dcft.i(dcft.o(iterable, wra.a), dbss.NOT_NULL)), z, false);
        }
        HashSet hashSet = new HashSet();
        List l2 = dchl.l(dcdc.q(iterable));
        for (int i = 0; i < l2.size(); i++) {
            wpv wpvVar = (wpv) l2.get(i);
            Integer valueOf = Integer.valueOf(wpvVar.A());
            hashSet.add(valueOf);
            if (!this.h.m(valueOf) && (P = wpvVar.P()) != null) {
                int i2 = true != wpvVar.ad().booleanValue() ? i : 0;
                akrk b = P.b();
                if (b != null) {
                    c(valueOf, b, P.a(), i2);
                    b(valueOf, b, P.c());
                }
                akrk d = P.d();
                if (d != null) {
                    c(valueOf, d, P.a(), i2);
                    b(valueOf, d, P.e());
                }
            }
        }
        for (Integer num : dcep.K(dcnm.p(this.h.J(), hashSet))) {
            for (akte akteVar : this.h.c(num)) {
                this.b.c().a(akteVar);
            }
            this.h.e(num);
            for (akqi akqiVar : this.i.c(num)) {
                this.j.G(akqiVar, num);
                if (!this.j.m(akqiVar)) {
                    aktd aktdVar = this.k.get(akqiVar);
                    if (aktdVar != null) {
                        this.b.d().e(aktdVar);
                    } else {
                        bvoo.h("Could not find rendered stop reference.", new Object[0]);
                    }
                    this.k.remove(akqiVar);
                }
            }
            this.i.e(num);
        }
        return dcft.a(iterable) > this.h.J().size();
    }

    protected final void b(Integer num, akrk akrkVar, List<drij> list) {
        alxh alxhVar;
        Iterator<drij> it;
        wrc wrcVar;
        wrc wrcVar2 = this;
        Integer num2 = num;
        if (list == null || list.isEmpty()) {
            return;
        }
        alxh alxhVar2 = new alxh(akrkVar);
        Iterator<drij> it2 = list.iterator();
        while (it2.hasNext()) {
            drij next = it2.next();
            dpsn dpsnVar = next.c;
            if (dpsnVar == null) {
                dpsnVar = dpsn.d;
            }
            akqi j = akqi.j(dpsnVar);
            if (!wrcVar2.j.m(j)) {
                dpum dpumVar = next.d;
                if (dpumVar == null) {
                    dpumVar = dpum.d;
                }
                akrn a = bzlt.a(alxhVar2, dpumVar, 150.0d);
                akqq S = a == null ? null : a.a.S();
                if (S != null) {
                    wrcVar2.i.n(num2, j);
                    wrcVar2.j.n(j, num2);
                    akto aktoVar = wrcVar2.b;
                    wsu wsuVar = wrcVar2.e;
                    int i = wrcVar2.o;
                    if (wsuVar.c.get(i) == null) {
                        SparseArray<aktg> sparseArray = wsuVar.c;
                        akvz e = wsuVar.a.e();
                        int ceil = (int) Math.ceil(wsuVar.b.getResources().getDisplayMetrics().density);
                        String a2 = ckqa.a(wsu.a(i, 4.25f, 8.5f, ceil));
                        String a3 = ckqa.a(wsu.a(i, 3.0f, 6.0f, ceil));
                        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
                        dmoo dmooVar = (dmoo) dmop.h.bZ();
                        alxhVar = alxhVar2;
                        if (dmooVar.c) {
                            dmooVar.bF();
                            dmooVar.c = false;
                        }
                        dmop dmopVar = (dmop) dmooVar.b;
                        it = it2;
                        dmopVar.a |= 1;
                        dmopVar.b = 12;
                        dmpq bZ = dmpv.s.bZ();
                        dmog dmogVar = (dmog) dmoh.h.bZ();
                        if (dmogVar.c) {
                            dmogVar.bF();
                            dmogVar.c = false;
                        }
                        dmoh dmohVar = (dmoh) dmogVar.b;
                        int i2 = dmohVar.a | 4;
                        dmohVar.a = i2;
                        dmohVar.c = ceil;
                        a3.getClass();
                        dmohVar.a = i2 | 1;
                        dmohVar.b = a3;
                        bZ.a(dmogVar);
                        if (dmooVar.c) {
                            dmooVar.bF();
                            dmooVar.c = false;
                        }
                        dmop dmopVar2 = (dmop) dmooVar.b;
                        dmpv bK = bZ.bK();
                        bK.getClass();
                        dmopVar2.d = bK;
                        dmopVar2.a |= 4;
                        dmqtVar.a(dmooVar);
                        dmoo dmooVar2 = (dmoo) dmop.h.bZ();
                        if (dmooVar2.c) {
                            dmooVar2.bF();
                            dmooVar2.c = false;
                        }
                        dmop dmopVar3 = (dmop) dmooVar2.b;
                        dmopVar3.a |= 1;
                        dmopVar3.b = 16;
                        dmpq bZ2 = dmpv.s.bZ();
                        dmog dmogVar2 = (dmog) dmoh.h.bZ();
                        if (dmogVar2.c) {
                            dmogVar2.bF();
                            dmogVar2.c = false;
                        }
                        dmoh dmohVar2 = (dmoh) dmogVar2.b;
                        int i3 = dmohVar2.a | 4;
                        dmohVar2.a = i3;
                        dmohVar2.c = ceil;
                        a2.getClass();
                        dmohVar2.a = i3 | 1;
                        dmohVar2.b = a2;
                        bZ2.a(dmogVar2);
                        if (dmooVar2.c) {
                            dmooVar2.bF();
                            dmooVar2.c = false;
                        }
                        dmop dmopVar4 = (dmop) dmooVar2.b;
                        dmpv bK2 = bZ2.bK();
                        bK2.getClass();
                        dmopVar4.d = bK2;
                        dmopVar4.a |= 4;
                        dmqtVar.a(dmooVar2);
                        sparseArray.put(i, e.c((dmqx) dmqtVar.bK()));
                    } else {
                        alxhVar = alxhVar2;
                        it = it2;
                    }
                    dmpk dmpkVar = (dmpk) dmpn.r.bZ();
                    if (dmpkVar.c) {
                        dmpkVar.bF();
                        dmpkVar.c = false;
                    }
                    dmpn dmpnVar = (dmpn) dmpkVar.b;
                    dmpnVar.a |= 32;
                    dmpnVar.g = 3;
                    dmpe dmpeVar = (dmpe) dmph.f.bZ();
                    aktg aktgVar = wsuVar.c.get(i);
                    dbsk.s(aktgVar);
                    dmpeVar.b(aktgVar.e());
                    if (dmpkVar.c) {
                        dmpkVar.bF();
                        dmpkVar.c = false;
                    }
                    dmpn dmpnVar2 = (dmpn) dmpkVar.b;
                    dmph dmphVar = (dmph) dmpeVar.bK();
                    dmphVar.getClass();
                    dmpnVar2.b = dmphVar;
                    dmpnVar2.a |= 1;
                    dmlp bZ3 = dmlq.e.bZ();
                    dmls a4 = akxh.a(akra.f(S));
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dmlq dmlqVar = (dmlq) bZ3.b;
                    a4.getClass();
                    dmlqVar.b = a4;
                    dmlqVar.a |= 1;
                    dmlo dmloVar = dmlo.CENTER;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dmlq dmlqVar2 = (dmlq) bZ3.b;
                    dmlqVar2.c = dmloVar.j;
                    dmlqVar2.a |= 2;
                    if (dmpkVar.c) {
                        dmpkVar.bF();
                        dmpkVar.c = false;
                    }
                    dmpn dmpnVar3 = (dmpn) dmpkVar.b;
                    dmlq bK3 = bZ3.bK();
                    bK3.getClass();
                    dmpnVar3.d = bK3;
                    dmpnVar3.a |= 4;
                    akxf.H(dmpkVar, j);
                    akxf.z(dmpkVar, dtyi.cm);
                    dnbb bZ4 = dnbc.c.bZ();
                    dnox bZ5 = dnpo.t.bZ();
                    bZ5.b(dnow.GENERIC_INTERACTIVE);
                    dnpo bK4 = bZ5.bK();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dnbc dnbcVar = (dnbc) bZ4.b;
                    bK4.getClass();
                    dnbcVar.b = bK4;
                    dnbcVar.a |= 1;
                    akxf.N(dmpkVar, bZ4.bK());
                    akti a5 = aktoVar.a((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
                    wrcVar = this;
                    a5.Pt(new wrb(wrcVar, j));
                    wrcVar.k.put(j, a5);
                    num2 = num;
                } else {
                    num2 = num;
                }
            } else {
                alxhVar = alxhVar2;
                it = it2;
                wrcVar = wrcVar2;
                num2 = num;
                if (!wrcVar.j.F(j, num2)) {
                    wrcVar.j.n(j, num2);
                    wrcVar.i.n(num2, j);
                }
            }
            it2 = it;
            wrcVar2 = wrcVar;
            alxhVar2 = alxhVar;
        }
    }

    protected final void c(Integer num, akrk akrkVar, int i, int i2) {
        akte d = this.c.d(akrkVar, i, i2);
        this.b.c().f(d);
        this.h.n(num, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(dopk dopkVar) {
        if ((dopkVar.a & 131072) != 0 && !dopkVar.w.isEmpty()) {
            dsrj<dopf> dsrjVar = dopkVar.w;
            dopf dopfVar = dsrjVar.get(dopkVar.v);
            Set<dopf> p = xkg.p(dopfVar, dsrjVar);
            wst wstVar = this.f;
            wstVar.b = dopfVar;
            wstVar.c.clear();
            wstVar.c.addAll(p);
            wstVar.a();
        }
        if ((dopkVar.a & 8) != 0) {
            dnoh dnohVar = dopkVar.g;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            e(akqi.b(dopkVar.d), akqq.e(dnohVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(final akqi akqiVar, akqq akqqVar) {
        int a;
        this.m.p(akyt.j(akqqVar, Math.max(this.m.n().k, 16.0f), this.n.e()));
        wst wstVar = this.f;
        dopf dopfVar = wstVar.b;
        if (dopfVar == null || !akqi.b(dopfVar.e).equals(akqiVar)) {
            dopf dopfVar2 = wstVar.b;
            dbsg m = dcft.m(wstVar.c, new dbsl(akqiVar) { // from class: wsq
                private final akqi a;

                {
                    this.a = akqiVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.equals(akqi.b(((dopf) obj).e));
                }
            });
            if (m.a()) {
                dopf dopfVar3 = (dopf) m.b();
                wstVar.c.remove(dopfVar3);
                wstVar.b = dopfVar3;
            } else {
                dopc bZ = dopf.h.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dopf dopfVar4 = (dopf) bZ.b;
                dopfVar4.b = 0;
                dopfVar4.a |= 1;
                String o = akqiVar.o();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dopf dopfVar5 = (dopf) bZ.b;
                o.getClass();
                dopfVar5.a |= 8;
                dopfVar5.e = o;
                dnoh g = akqqVar.g();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dopf dopfVar6 = (dopf) bZ.b;
                g.getClass();
                dopfVar6.d = g;
                dopfVar6.a |= 4;
                wstVar.b = bZ.bK();
            }
            if (dopfVar2 != null && (a = dope.a(dopfVar2.b)) != 0 && a != 1) {
                wstVar.c.add(dopfVar2);
            }
            wstVar.a();
        }
    }
}
