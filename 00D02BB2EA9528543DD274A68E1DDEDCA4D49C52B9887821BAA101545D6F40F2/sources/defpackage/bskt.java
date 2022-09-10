package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bskt  reason: default package */
/* loaded from: classes4.dex */
public class bskt implements bskr {
    private final dxio<bshe> b;
    private final bsiq c;
    private final bsim d;
    private final dxio<bsjd> e;
    private final dxio<bshj> f;
    private final dxio<bshp> g;
    private final dxio<bsht> h;
    private final bsiw i;
    private final bshy j;
    @dzsi
    private final bsid k;
    private final bsii l;
    private final dxio<bsju> m;
    private final brcs n;
    private final dxio<bshc> o;
    private final btvo p;
    private final Resources q;
    private final cklq r;
    private final bzmm s;
    private final brfq t;
    private bskq v;
    @dzsi
    private bsjt w;
    @dzsi
    private bsks x;
    bsjm a = new bsjm();
    private List<bsjq> u = new ArrayList();

    public bskt(dxio<bshe> dxioVar, bsiq bsiqVar, bsim bsimVar, dxio<bsjd> dxioVar2, dxio<bshj> dxioVar3, dxio<bshp> dxioVar4, dxio<bsht> dxioVar5, bsiw bsiwVar, bshy bshyVar, @dzsi bsid bsidVar, bsii bsiiVar, dxio<bsju> dxioVar6, Resources resources, btvo btvoVar, cklq cklqVar, bzmm bzmmVar, brfq brfqVar, brcs brcsVar, dxio<bshc> dxioVar7) {
        this.b = dxioVar;
        this.c = bsiqVar;
        this.d = bsimVar;
        this.e = dxioVar2;
        this.f = dxioVar3;
        this.g = dxioVar4;
        this.h = dxioVar5;
        this.i = bsiwVar;
        this.j = bshyVar;
        this.k = bsidVar;
        this.l = bsiiVar;
        this.m = dxioVar6;
        this.q = resources;
        this.p = btvoVar;
        this.r = cklqVar;
        this.s = bzmmVar;
        this.t = brfqVar;
        this.n = brcsVar;
        this.o = dxioVar7;
    }

    private final List<bsjq> f(bsjm bsjmVar) {
        ArrayList arrayList = new ArrayList();
        if (this.v != null) {
            dnnn n = bsjmVar.n();
            if (aehr.c(n)) {
                bsjt bsjtVar = this.w;
                if (bsjtVar == null) {
                    bsju a = this.m.a();
                    bskq bskqVar = this.v;
                    dbsk.s(bskqVar);
                    dbsk.s(n);
                    aehu d = aehr.d(n);
                    Activity activity = (Activity) ((dxjd) a.a).a;
                    bsju.a(activity, 1);
                    bsju.a(a.b.a(), 2);
                    aehr a2 = a.c.a();
                    bsju.a(a2, 3);
                    aeol a3 = a.d.a();
                    bsju.a(a3, 4);
                    cqkj a4 = a.e.a();
                    bsju.a(a4, 5);
                    aeqi a5 = a.f.a();
                    bsju.a(a5, 6);
                    btvo a6 = a.g.a();
                    bsju.a(a6, 7);
                    bsju.a(bsjmVar, 8);
                    bsju.a(bskqVar, 9);
                    bsju.a(d, 10);
                    bsjt bsjtVar2 = new bsjt(activity, a2, a3, a4, a5, a6, bsjmVar, bskqVar, d);
                    this.w = bsjtVar2;
                    bsks bsksVar = this.x;
                    if (bsksVar != null) {
                        bsjtVar2.k(bsksVar);
                    }
                } else {
                    bsjtVar.o(bsjmVar);
                }
                if (!arrayList.contains(this.w)) {
                    arrayList.add(0, this.w);
                }
            }
            for (djml djmlVar : bsjmVar.j()) {
                bsha h = h(djmlVar.c);
                bskq bskqVar2 = this.v;
                dbsk.s(bskqVar2);
                bsko o = bsko.o(djmlVar, bsjmVar, h, bskqVar2, this.q, this.s, this.t, this.r);
                if (o == null) {
                    djmlVar.toString();
                } else {
                    o.k(this.x);
                    boolean k = bsjmVar.k(djmlVar);
                    o.m(k);
                    if (g(djmlVar)) {
                        dbsk.s(h);
                        h.m(this.a);
                        o.m(h.t());
                    }
                    if (!k) {
                        djmk b = djmk.b(djmlVar.g);
                        if (b == null) {
                            b = djmk.ALWAYS_SHOW;
                        }
                        if (!b.equals(djmk.ALWAYS_SHOW) && !g(djmlVar)) {
                        }
                    }
                    arrayList.add(o);
                }
            }
        }
        return arrayList;
    }

    private final boolean g(djml djmlVar) {
        djmk b = djmk.b(djmlVar.g);
        if (b == null) {
            b = djmk.ALWAYS_SHOW;
        }
        return b.equals(djmk.SHOW_AS_VALUE_SELECTOR) && h(djmlVar.c) != null;
    }

    @Override // defpackage.bskr
    public List<bsjq> a() {
        return this.u;
    }

    public void b() {
        for (bsjq bsjqVar : this.u) {
            bsjqVar.n();
        }
    }

    public void c(@dzsi bsks bsksVar) {
        this.x = bsksVar;
        for (bsjq bsjqVar : this.u) {
            bsjqVar.k(bsksVar);
        }
    }

    public void d(bskq bskqVar, bsjm bsjmVar) {
        this.v = bskqVar;
        this.a = bsjmVar;
        this.u = f(bsjmVar);
        cqkx.p(this);
    }

    public void e(bsjm bsjmVar) {
        this.a = bsjmVar;
        this.u.clear();
        List<bsjq> f = f(this.a);
        ArrayList arrayList = new ArrayList();
        for (bsjq bsjqVar : f) {
            if (!bsjqVar.l().equals(djmk.SHOW_ONLY_WHEN_APPLIED) || !bsjqVar.c().booleanValue()) {
                this.u.add(bsjqVar);
            } else {
                arrayList.add(bsjqVar);
            }
        }
        this.u.addAll(0, arrayList);
        cqkx.p(this);
    }

    @dzsi
    private final bsha h(int i) {
        if (i != 1) {
            if (i == 5) {
                return this.b.a().a();
            }
            if (i == 7) {
                return this.d;
            }
            if (i == 10) {
                return this.j;
            }
            if (i == 20) {
                return this.i;
            }
            if (i == 23) {
                return this.g.a().a();
            }
            if (i == 25) {
                if (!this.n.a()) {
                    return null;
                }
                return this.f.a().a();
            } else if (i == 31) {
                if (!this.p.getCategoricalSearchParameters().g()) {
                    return null;
                }
                return this.k;
            } else if (i == 33) {
                Activity activity = (Activity) ((dxjd) this.h.a().a).a;
                bsht.a(activity);
                return new bshs(activity);
            } else if (i == 42) {
                if (!this.p.getExploreMapParameters().a().contains(12)) {
                    return null;
                }
                return this.o.a().a();
            } else if (i != 17) {
                if (i != 18 || !this.p.getCategoricalSearchParameters().b()) {
                    return null;
                }
                return this.l;
            } else {
                return this.e.a().a();
            }
        }
        return this.c;
    }
}
