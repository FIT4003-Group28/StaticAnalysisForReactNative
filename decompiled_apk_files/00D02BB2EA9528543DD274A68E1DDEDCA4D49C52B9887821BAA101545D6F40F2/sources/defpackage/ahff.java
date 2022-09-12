package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahff  reason: default package */
/* loaded from: classes2.dex */
public class ahff extends ahhv {
    public final dlce a;
    public final ahbd b;
    public final ahez c;
    public final axjh d;
    public final Executor e;
    public final List<agxa<?>> f;
    public final axnw g;
    public cqix<? extends agxd> h;
    public String i;
    public ahbb j;
    private final axnt u;
    private final cjta v;
    private final ddzg w;
    private final Map<String, crzp<dqaw>> x;
    private int y;

    public ahff(ahht ahhtVar, ahbd ahbdVar, ahez ahezVar, axnt axntVar, axjh axjhVar, Executor executor, dlcv dlcvVar, int i, agyh agyhVar) {
        super(ahhtVar, dlcvVar, agyhVar);
        dlce dlceVar;
        diyr diyrVar;
        this.f = new ArrayList();
        this.h = null;
        this.i = null;
        this.x = new HashMap();
        this.y = 0;
        this.b = ahbdVar;
        this.c = ahezVar;
        this.u = axntVar;
        this.d = axjhVar;
        this.e = executor;
        if (dlcvVar.b == 26) {
            dlceVar = (dlce) dlcvVar.c;
        } else {
            dlceVar = dlce.d;
        }
        this.a = dlceVar;
        agya agyaVar = agyhVar.i;
        if (((agyaVar == null ? agya.c : agyaVar).a & 1) != 0) {
            agya agyaVar2 = agyhVar.i;
            diyrVar = (agyaVar2 == null ? agya.c : agyaVar2).b;
            if (diyrVar == null) {
                diyrVar = diyr.d;
            }
        } else {
            diyrVar = dlceVar.b;
            if (diyrVar == null) {
                diyrVar = diyr.d;
            }
        }
        this.g = axjhVar.K(diyrVar);
        ddzf bZ = ddzg.t.bZ();
        ddyt bZ2 = ddyu.i.bZ();
        boolean z = agyhVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddyu ddyuVar = (ddyu) bZ2.b;
        int i2 = ddyuVar.a | 4;
        ddyuVar.a = i2;
        ddyuVar.c = z;
        int i3 = i2 | 8;
        ddyuVar.a = i3;
        ddyuVar.d = i;
        dspd dspdVar = dlcvVar.d;
        dspdVar.getClass();
        ddyuVar.a = i3 | 512;
        ddyuVar.h = dspdVar;
        ddyu bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ.b;
        bK.getClass();
        ddzgVar.k = bK;
        ddzgVar.b |= 1;
        ddzg bK2 = bZ.bK();
        this.w = bK2;
        this.v = z(dlceVar.a, i, bK2, agyhVar);
    }

    @Override // defpackage.agxe
    public List<agxa<?>> a() {
        return this.f;
    }

    @Override // defpackage.agxe
    public cjtd b(ddho ddhoVar) {
        return this.v.b(ddhoVar);
    }

    @Override // defpackage.agxe
    public cqix<? extends agxd> c() {
        return this.h;
    }

    @Override // defpackage.agxe
    public List<agwu> g() {
        return dcdc.e();
    }

    @Override // defpackage.ahhv
    public final agyh n() {
        agxs agxsVar = this.m;
        agxz bZ = agya.c.bZ();
        axnw axnwVar = this.g;
        diym bZ2 = diyr.d.bZ();
        List<diyq> a = axnwVar.a();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        diyr diyrVar = (diyr) bZ2.b;
        dsrj<diyq> dsrjVar = diyrVar.b;
        if (!dsrjVar.a()) {
            diyrVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(a, diyrVar.b);
        dspd dspdVar = axnwVar.a;
        if (dspdVar != null) {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            diyr diyrVar2 = (diyr) bZ2.b;
            dspdVar.getClass();
            diyrVar2.a |= 1;
            diyrVar2.c = dspdVar;
        }
        diyr bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agya agyaVar = (agya) bZ.b;
        bK.getClass();
        agyaVar.b = bK;
        agyaVar.a |= 1;
        if (agxsVar.c) {
            agxsVar.bF();
            agxsVar.c = false;
        }
        agyh agyhVar = (agyh) agxsVar.b;
        agya bK2 = bZ.bK();
        agyh agyhVar2 = agyh.k;
        bK2.getClass();
        agyhVar.i = bK2;
        agyhVar.a |= 2048;
        return super.n();
    }

    public final List<cqix<?>> s(List<diyq> list) {
        ArrayList arrayList = new ArrayList();
        agln aglnVar = new agln();
        for (int i = 0; i < list.size(); i++) {
            diyq diyqVar = list.get(i);
            axnt axntVar = this.u;
            dfqc dfqcVar = dfqc.STREAM_RECOMMENDATION_CARD;
            mw<axns> mwVar = new mw(this) { // from class: ahfb
                private final ahff a;

                {
                    this.a = this;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    ahbb ahbbVar;
                    ahim ahimVar;
                    ahff ahffVar = this.a;
                    axns axnsVar = (axns) obj;
                    if (ahffVar.d.i() && (ahbbVar = ahffVar.j) != null && ahbbVar.m(axnsVar, dbsg.i(agln.a))) {
                        if (ahffVar.j.a().isEmpty()) {
                            ahin ahinVar = ahffVar.n;
                            dbsk.s(ahinVar);
                            bvrj.UI_THREAD.c();
                            Iterator<ahim> it = ahinVar.l.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    ahimVar = null;
                                    break;
                                }
                                ahimVar = it.next();
                                if (ahimVar.b == ahffVar) {
                                    break;
                                }
                            }
                            if (ahimVar == null) {
                                bvoo.h("Attempted to hide a non-existent item", new Object[0]);
                            } else {
                                ges gesVar = ahinVar.m.get();
                                if (ahinVar.l.remove(ahimVar) && gesVar != null && gesVar.aD) {
                                    ahinVar.F(true);
                                }
                            }
                            ahin ahinVar2 = ahffVar.n;
                            dbsk.s(ahinVar2);
                            ahinVar2.e.c();
                            return;
                        }
                        cqkx.p(ahffVar.j);
                    }
                }
            };
            cjta b = cjtd.b();
            b.g(diyqVar.a);
            int i2 = this.y;
            this.y = i2 + 1;
            b.i(i2);
            b.r(this.w);
            axns a = axntVar.a(diyqVar, dfqcVar, mwVar, b);
            dqau dqauVar = diyqVar.b;
            if (dqauVar == null) {
                dqauVar = dqau.e;
            }
            dqkn dqknVar = dqauVar.b;
            if (dqknVar == null) {
                dqknVar = dqkn.e;
            }
            String str = dqknVar.d;
            this.x.put(str, new ahfd(this, str));
            a.b().m().e(this.x.get(str), this.e);
            arrayList.add(cqgr.fT(aglnVar, a));
            if (i == list.size() - 1) {
                this.i = str;
            }
        }
        return arrayList;
    }
}
