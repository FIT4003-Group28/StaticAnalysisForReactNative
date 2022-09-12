package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bonr  reason: default package */
/* loaded from: classes3.dex */
public class bonr implements boqa, boom {
    public final Context a;
    public boon b;
    public final Set<byea> c;
    private final ges d;
    private final dkyr e;
    private final List<bopy> f;
    private final List<boqh> g;
    private final List h;
    @dzsi
    private List<bopx> i;
    @dzsi
    private List<bopx> j;
    private final cqkj k;
    private final dgsl l;
    private final boolean m;
    private final Set<byea> n;

    public bonr(Context context, ges gesVar, cqkj cqkjVar, btvo btvoVar, @dzsi byee byeeVar, boolean z) {
        dgsl b;
        this.m = z;
        this.d = gesVar;
        this.k = cqkjVar;
        this.a = context;
        this.e = btvoVar.getUgcParameters();
        ArrayList a = dchl.a();
        this.f = a;
        ArrayList a2 = dchl.a();
        this.g = a2;
        this.c = EnumSet.noneOf(byea.class);
        this.n = EnumSet.noneOf(byea.class);
        this.h = dchl.a();
        boou.d(context);
        a(byeeVar);
        if (u().booleanValue()) {
            b = bonk.e(a2);
        } else {
            b = bonk.b(a);
        }
        this.l = b;
    }

    @dzsi
    private final bopy v(boou boouVar) {
        for (bopy bopyVar : this.f) {
            if (bopyVar.i().equals(boouVar)) {
                return bopyVar;
            }
        }
        return null;
    }

    public void a(@dzsi byee byeeVar) {
        ArrayList<boou> arrayList;
        boolean z;
        this.i = null;
        this.j = null;
        if (u().booleanValue()) {
            this.b = new boon(this.a, this.k, null);
            this.g.clear();
            List<boqh> list = this.g;
            Context context = this.a;
            bonq bonqVar = new bonq(this);
            ArrayList f = dchl.f(byea.values().length);
            if (byeeVar == null || !byeeVar.d()) {
                for (byea byeaVar : byea.values()) {
                    f.add(new boof(context, bonqVar, byeaVar, null, true));
                }
            } else {
                for (bydp bydpVar : byeeVar.i()) {
                    f.add(new boof(context, bonqVar, bydpVar.a, bydpVar, false));
                }
            }
            list.addAll(f);
            return;
        }
        if (byeeVar != null) {
            Context context2 = this.a;
            arrayList = dchl.a();
            if (byeeVar.d()) {
                HashMap d = dcjz.d();
                for (bydp bydpVar2 : byeeVar.i()) {
                    for (byef byefVar : bydpVar2.b) {
                        if (bydpVar2.a.equals(byefVar.b)) {
                            Calendar calendar = byefVar.e;
                            Calendar calendar2 = byefVar.f;
                            String byefVar2 = byefVar.toString();
                            if (d.containsKey(byefVar2)) {
                                ((boou) d.get(byefVar2)).z(bydpVar2.a, true);
                            } else {
                                boou boouVar = new boou(context2);
                                boouVar.u();
                                boouVar.z(bydpVar2.a, true);
                                Iterator<byef> it = bydpVar2.b.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (it.next().f()) {
                                            z = true;
                                            break;
                                        }
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                                boouVar.B(z);
                                boouVar.J(calendar.get(11), calendar.get(12));
                                boouVar.P(calendar2.get(11), calendar2.get(12));
                                d.put(byefVar2, boouVar);
                                arrayList.add(boouVar);
                            }
                        }
                    }
                }
            }
        } else {
            arrayList = new ArrayList();
        }
        boon boonVar = new boon(this.a, this.k, arrayList);
        this.b = boonVar;
        boonVar.e = this;
        this.f.clear();
        for (boou boouVar2 : arrayList) {
            this.f.add(new bono(this.a, boouVar2, this, false));
        }
    }

    public void b(Set<byea> set) {
        this.n.clear();
        this.n.addAll(set);
        this.c.clear();
        this.c.addAll(set);
        Iterator<boqh> it = this.g.iterator();
        while (it.hasNext()) {
            boof boofVar = (boof) it.next();
            if (set.contains(boofVar.a())) {
                boofVar.e = true;
            }
        }
    }

    public Set<byea> c() {
        return this.c;
    }

    public Boolean d() {
        return Boolean.valueOf(!this.c.isEmpty());
    }

    public Boolean e() {
        return Boolean.valueOf(!this.n.equals(this.c));
    }

    public Boolean f() {
        dgsl b;
        if (u().booleanValue()) {
            b = bonk.e(this.g);
        } else {
            b = bonk.b(g());
        }
        return Boolean.valueOf(!b.bR().equals(this.l.bR()));
    }

    @Override // defpackage.boqa
    public List<bopy> g() {
        return this.f;
    }

    @Override // defpackage.boqa
    public dcdc<boqh> h() {
        return dcdc.r(this.g);
    }

    public dcdc i() {
        return dcdc.r(this.h);
    }

    @Override // defpackage.boqa
    public List<bopx> j(boolean z) {
        List<bopx> c;
        List<bopx> c2;
        if (z) {
            if (this.i == null) {
                if (u().booleanValue()) {
                    c2 = bonk.f(this.g, this.c, this.a, true);
                } else {
                    c2 = bonk.c(this.f, this.a, true);
                }
                this.i = c2;
            }
            return this.i;
        }
        if (this.j == null) {
            if (u().booleanValue()) {
                c = bonk.f(this.g, this.c, this.a, false);
            } else {
                c = bonk.c(this.f, this.a, false);
            }
            this.j = c;
        }
        return this.j;
    }

    public Boolean k() {
        return Boolean.valueOf(!this.l.a.isEmpty());
    }

    @Override // defpackage.boqa
    public Boolean l() {
        boolean z = false;
        if (!u().booleanValue()) {
            if (!this.b.c.isEmpty() || !this.f.isEmpty()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        for (boqh boqhVar : this.g) {
            Iterator<? extends boqi> it = boqhVar.b().iterator();
            while (it.hasNext()) {
                if (((booq) it.next()).a() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.boqa
    public Boolean m() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.boqa
    public cqkl n() {
        boou a;
        if (!this.f.isEmpty()) {
            List<bopy> list = this.f;
            boqj i = list.get(list.size() - 1).i();
            a = boou.b(this.a, i.G().intValue(), i.H().intValue(), i.M().intValue(), i.N().intValue());
        } else {
            a = boou.a(this.a);
        }
        o(a);
        return cqkl.a;
    }

    public void o(boou boouVar) {
        boon boonVar = this.b;
        if (boonVar.d != null) {
            return;
        }
        boou clone = boouVar.clone();
        boonVar.d = new bnyr(boonVar.a, boonVar.b, boouVar);
        boonVar.d.setOnCancelListener(new booj(boonVar));
        boonVar.d.show();
        boouVar.f(new book(boonVar, boouVar, clone));
        boouVar.g(new bool(boonVar, boouVar));
    }

    public void p() {
        this.b.a();
    }

    @Override // defpackage.boom
    public void q(boou boouVar) {
        if (v(boouVar) == null) {
            this.f.add(new bono(this.a, boouVar, this, true));
            this.i = null;
            this.j = null;
        }
        cqkx.p(this);
    }

    @Override // defpackage.boom
    public void r(boou boouVar) {
        cqkx.p(this);
        View view = this.d.P;
        if (view == null || boouVar == null) {
            return;
        }
        ArrayList<View> arrayList = new ArrayList<>();
        view.findViewsWithText(arrayList, boouVar.I(), 1);
        view.findViewsWithText(arrayList, boouVar.O(), 1);
        view.findViewsWithText(arrayList, boouVar.w(), 1);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).requestLayout();
        }
    }

    @Override // defpackage.boom
    public void s(boou boouVar) {
        bopy v = v(boouVar);
        if (v != null && v.c().booleanValue()) {
            this.f.remove(v);
            this.i = null;
            this.j = null;
        }
        cqkx.p(this);
    }

    public void t(boou boouVar) {
        this.b.b(boouVar);
    }

    @Override // defpackage.boqa
    public Boolean u() {
        return Boolean.valueOf(this.e.L());
    }
}
