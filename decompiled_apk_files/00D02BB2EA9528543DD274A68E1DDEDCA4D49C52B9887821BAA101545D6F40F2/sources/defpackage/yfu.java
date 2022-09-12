package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: yfu  reason: default package */
/* loaded from: classes7.dex */
public class yfu {
    private static final cqrp b = cqrp.d(50.0d);
    @dzsi
    akte a;
    private final gll d;
    private final akto e;
    private final akox f;
    private final yfv g;
    private final alec h;
    private final xlu i;
    private final bvrb j;
    private final cqat k;
    private final akzh l;
    private final bnsn m;
    private final xaz n;
    @dzsi
    private Integer c = null;
    private List<akta> o = dcdc.e();
    @dzsi
    private vtx p = null;
    private Boolean q = false;

    public yfu(akto aktoVar, akox akoxVar, gll gllVar, yfv yfvVar, alec alecVar, xlu xluVar, bvrb bvrbVar, cqat cqatVar, akzh akzhVar, bnsn bnsnVar, xaz xazVar) {
        this.e = aktoVar;
        this.f = akoxVar;
        this.d = gllVar;
        this.g = yfvVar;
        this.h = alecVar;
        this.i = xluVar;
        this.j = bvrbVar;
        this.k = cqatVar;
        this.l = akzhVar;
        this.m = bnsnVar;
        this.n = xazVar;
    }

    private final void d(List<xmx> list, boolean z) {
        if (this.q.booleanValue()) {
            this.i.b(list, z, false);
        }
    }

    private final void e(Context context, akrk akrkVar, dpgw dpgwVar) {
        akrkVar.b();
        Rect e = this.d.e();
        if (e.height() >= b.NR(context)) {
            akox akoxVar = this.f;
            dnoh dnohVar = dpgwVar.i;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            akoxVar.p(akyt.h(akqq.e(dnohVar), e));
        }
    }

    private static void f(alxh alxhVar, List<akqq> list, Set<String> set, dpgw dpgwVar) {
        if ((dpgwVar.a & 128) != 0) {
            dnoh dnohVar = dpgwVar.i;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            akra f = akra.f(akqq.e(dnohVar));
            akrn b2 = alxhVar.b(f, f.r() * 150.0d);
            if (b2 == null) {
                return;
            }
            list.add(b2.a.S());
            if ((dpgwVar.a & 4096) == 0) {
                return;
            }
            set.add(dpgwVar.n);
        }
    }

    private final void g(@dzsi vtx vtxVar) {
        vtx vtxVar2 = this.p;
        if (vtxVar2 != null) {
            this.m.l(vtxVar2);
        }
        if (vtxVar != null) {
            this.m.k(vtxVar);
        }
        this.p = vtxVar;
    }

    public final synchronized void a(djxo djxoVar, boolean z, final Context context, int i, @dzsi CharSequence charSequence, boolean z2) {
        int b2;
        dpgw dpgwVar;
        dpgw dpgwVar2;
        eaol a;
        eaol eaolVar;
        int i2;
        dphe dpheVar;
        final dpgw dpgwVar3;
        int i3;
        dcdc e;
        donz donzVar;
        cqtd cqtdVar;
        dsrj<dvzn> dsrjVar = djxoVar.c;
        if (dsrjVar.isEmpty() || djxoVar.d.size() <= i || (djxoVar.d.get(i).a & 1) == 0) {
            b();
            return;
        }
        dphe dpheVar2 = djxoVar.d.get(i).b;
        if (dpheVar2 == null) {
            dpheVar2 = dphe.x;
        }
        dphe dpheVar3 = dpheVar2;
        if (dpheVar3.w.isEmpty() || (dpheVar3.w.get(0).a & 1) == 0) {
            b();
            return;
        }
        int i4 = dpheVar3.w.get(0).b;
        if (dsrjVar.size() <= i4) {
            b();
            return;
        }
        final akrk h = akrk.h(dsrjVar.get(i4));
        if ((dpheVar3.a & 16) != 0) {
            b2 = Color.parseColor(dpheVar3.f);
        } else {
            b2 = ibm.w().b(context);
        }
        dccx dccxVar = new dccx();
        dpgw dpgwVar4 = dpheVar3.c;
        if (dpgwVar4 == null) {
            dpgwVar4 = dpgw.r;
        }
        dccxVar.g(dpgwVar4);
        dccxVar.i(dpheVar3.j);
        dpgw dpgwVar5 = dpheVar3.d;
        if (dpgwVar5 == null) {
            dpgwVar5 = dpgw.r;
        }
        dccxVar.g(dpgwVar5);
        dcdc f = dccxVar.f();
        dpgw dpgwVar6 = (dpgw) f.get(djxoVar.d.get(i).e);
        xmv g = xmw.g();
        ((xms) g).a = h;
        ((xms) g).b = xmw.h(f);
        g.b(b2);
        xmw a2 = g.a();
        if (!ygh.G(djxoVar, i).booleanValue()) {
            e = dcdc.e();
            i2 = b2;
            dpheVar = dpheVar3;
            dpgwVar3 = dpgwVar6;
            i3 = 4;
        } else {
            djxn djxnVar = djxoVar.d.get(i);
            dphe dpheVar4 = djxnVar.b;
            if (dpheVar4 == null) {
                dpheVar4 = dphe.x;
            }
            dpgl dpglVar = dpheVar4.l.get(0).b;
            if (dpglVar == null) {
                dpglVar = dpgl.g;
            }
            dcdc r = dcdc.r(dpglVar.b);
            int i5 = djxnVar.e;
            if (i5 > dpheVar4.j.size()) {
                dpgwVar2 = dpheVar4.d;
                if (dpgwVar2 == null) {
                    dpgwVar2 = dpgw.r;
                }
                dgaw dgawVar = dpgwVar2.e;
                if (dgawVar == null) {
                    dgawVar = dgaw.g;
                }
                eaol a3 = vxs.a(dgawVar);
                dgaw dgawVar2 = dpgwVar2.g;
                if (dgawVar2 == null) {
                    dgawVar2 = dgaw.g;
                }
                if ((dgawVar2.a & 1) != 0) {
                    dgaw dgawVar3 = dpgwVar2.g;
                    if (dgawVar3 == null) {
                        dgawVar3 = dgaw.g;
                    }
                    a = vxs.a(dgawVar3);
                } else {
                    a = a3;
                }
                eaolVar = a3;
            } else {
                if (i5 != 0) {
                    dpgwVar = dpheVar4.j.get(i5 - 1);
                } else {
                    dpgwVar = dpheVar4.c;
                    if (dpgwVar == null) {
                        dpgwVar = dpgw.r;
                    }
                }
                dpgwVar2 = dpgwVar;
                dgaw dgawVar4 = dpgwVar2.f;
                if (dgawVar4 == null) {
                    dgawVar4 = dgaw.g;
                }
                a = vxs.a(dgawVar4);
                dgaw dgawVar5 = dpgwVar2.h;
                if (dgawVar5 == null) {
                    dgawVar5 = dgaw.g;
                }
                if ((dgawVar5.a & 1) != 0) {
                    dgaw dgawVar6 = dpgwVar2.h;
                    if (dgawVar6 == null) {
                        dgawVar6 = dgaw.g;
                    }
                    eaolVar = a;
                    a = vxs.a(dgawVar6);
                } else {
                    eaolVar = a;
                }
            }
            if ((djxnVar.a & 1) != 0 && eaolVar != null) {
                dpjb dpjbVar = dpheVar4.t;
                if (dpjbVar == null) {
                    dpjbVar = dpjb.e;
                }
                cqat cqatVar = this.k;
                i2 = b2;
                dpheVar = dpheVar3;
                String num = Integer.toString(Arrays.hashCode(new Object[]{charSequence, dpglVar.e, akqi.b(dpgwVar2.n), a}));
                zvb zvbVar = new zvb(r, vtj.TRANSIT_LIGHT);
                dpce dpceVar = (dpce) dcft.r(alcf.p(dpglVar.b), null);
                String str = dpglVar.e;
                dnoh dnohVar = dpgwVar2.i;
                if (dnohVar == null) {
                    dnohVar = dnoh.d;
                }
                dnoh dnohVar2 = dnohVar;
                dphd dphdVar = dpheVar4.r;
                if (dphdVar == null) {
                    dphdVar = dphd.f;
                }
                dpbw b3 = dpbw.b(dphdVar.b);
                if (b3 == null) {
                    b3 = dpbw.UNKNOWN;
                }
                int ordinal = b3.ordinal();
                if (ordinal == 1) {
                    donzVar = donz.ON_TIME;
                } else {
                    donzVar = (ordinal == 2 || ordinal == 3) ? donz.CHANGED : null;
                }
                dpzb dpzbVar = dpjbVar.c;
                if (dpzbVar == null) {
                    dpzbVar = dpzb.d;
                }
                dpyy b4 = dpyy.b(dpzbVar.c);
                if (b4 == null) {
                    b4 = dpyy.OCCUPANCY_RATE_UNKNOWN;
                }
                dpyy dpyyVar = b4;
                dqea dqeaVar = dpjbVar.b;
                if (dqeaVar == null) {
                    dqeaVar = dqea.b;
                }
                dqea dqeaVar2 = dqeaVar;
                doza v = alca.v(djxnVar.c);
                jhk T = vyb.T(dpheVar4, vtj.TRANSIT_LIGHT);
                Integer valueOf = Integer.valueOf(dpheVar4.h);
                drhn i6 = this.n.i(dpheVar4.m, dpjbVar);
                drhh b5 = this.n.b(i6);
                if (i6 == null || b5 == null) {
                    cqtdVar = null;
                } else {
                    cqtdVar = this.n.d(b5, xaz.h(i6) && this.n.f(), false, null, true);
                }
                i3 = 4;
                dpgwVar3 = dpgwVar6;
                e = dcdc.f(new xmy(context, cqatVar, num, zvbVar, dpceVar, str, dnohVar2, eaolVar, donzVar, dpyyVar, dqeaVar2, v, T, valueOf, null, a2, cqtdVar));
            }
            i2 = b2;
            dpheVar = dpheVar3;
            dpgwVar3 = dpgwVar6;
            i3 = 4;
            e = dcdc.e();
        }
        if (this.c == null || h.hashCode() != this.c.intValue()) {
            b();
            this.i.m(i3);
            this.q = true;
            final int i7 = i2;
            final dphe dpheVar5 = dpheVar;
            this.j.b(new Runnable(this, h, i7, dpheVar5, dpgwVar3, context) { // from class: yft
                private final yfu a;
                private final akrk b;
                private final int c;
                private final dphe d;
                private final dpgw e;
                private final Context f;

                {
                    this.a = this;
                    this.b = h;
                    this.c = i7;
                    this.d = dpheVar5;
                    this.e = dpgwVar3;
                    this.f = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c(this.b, this.c, this.d, this.e, this.f);
                }
            }, bvrj.BACKGROUND_THREADPOOL);
            d(e, z);
            return;
        }
        d(e, z);
        if (!z2) {
            return;
        }
        e(context, h, dpgwVar3);
    }

    public final synchronized void b() {
        g(null);
        this.c = null;
        akte akteVar = this.a;
        if (akteVar != null) {
            akteVar.j();
            yfv yfvVar = this.g;
            for (int i = 0; i < yfvVar.b.size(); i++) {
                yfvVar.c.j(yfvVar.b.valueAt(i));
            }
            yfvVar.b.clear();
            this.a = null;
        }
        if (!this.o.isEmpty()) {
            this.h.c(this.o);
            this.h.d();
            this.o = new ArrayList();
        }
        if (this.q.booleanValue()) {
            this.i.j();
            this.q = false;
        }
    }

    public final synchronized void c(akrk akrkVar, int i, dphe dpheVar, dpgw dpgwVar, Context context) {
        yfv yfvVar = this.g;
        akxa akxaVar = new akxa(yfvVar.a);
        List<akra> q = akrkVar.q();
        akuh akuhVar = yfvVar.b.get(i);
        if (akuhVar == null) {
            akuhVar = yfvVar.a.e().c(albu.a(aleq.b(i), i, bntp.POLYLINE));
            yfvVar.b.put(i, akuhVar);
        }
        akte c = akxaVar.c(q, akuhVar, 0, 0, 2, 2, 1);
        this.e.c().f(c);
        this.a = c;
        this.c = Integer.valueOf(akrkVar.hashCode());
        ArrayList arrayList = new ArrayList();
        dpgw dpgwVar2 = dpheVar.c;
        if (dpgwVar2 == null) {
            dpgwVar2 = dpgw.r;
        }
        arrayList.add(dpgwVar2);
        arrayList.addAll(dpheVar.j);
        dpgw dpgwVar3 = dpheVar.d;
        if (dpgwVar3 == null) {
            dpgwVar3 = dpgw.r;
        }
        arrayList.add(dpgwVar3);
        if (arrayList.size() >= 2) {
            alxh alxhVar = new alxh(akrkVar);
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            for (dpgw dpgwVar4 : arrayList.subList(0, arrayList.size() - 1)) {
                if ((dpgwVar4.a & 4096) == 0 || !hashSet.contains(dpgwVar4.n)) {
                    f(alxhVar, arrayList2, hashSet, dpgwVar4);
                }
            }
            f(alxhVar, arrayList2, hashSet, (dpgw) dcft.s(arrayList));
            if (arrayList2.size() >= 2) {
                dccx F = dcdc.F();
                dbsk.a(arrayList2.size() >= 2);
                dccx dccxVar = new dccx();
                dccxVar.g(new aldj((akqq) arrayList2.get(0), 1));
                for (int i2 = 1; i2 < arrayList2.size() - 1; i2++) {
                    dccxVar.g(new alet((akqq) arrayList2.get(i2), i, 2));
                }
                dccxVar.g(new aldj((akqq) dcft.s(arrayList2), 3));
                dcdc f = dccxVar.f();
                int size = f.size();
                for (int i3 = 0; i3 < size; i3++) {
                    F.g(this.h.a((aldl) f.get(i3), bntp.POLYLINE_MEASLES.c()));
                }
                this.o = F.f();
                g(new vtx(this.m, this.o, this.l, false, false));
                this.m.q();
            }
        }
        e(context, akrkVar, dpgwVar);
    }
}
