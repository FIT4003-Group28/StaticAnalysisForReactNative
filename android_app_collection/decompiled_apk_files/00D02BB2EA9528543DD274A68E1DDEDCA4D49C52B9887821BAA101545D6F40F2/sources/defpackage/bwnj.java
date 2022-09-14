package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bwnj  reason: default package */
/* loaded from: classes4.dex */
public class bwnj implements Serializable {
    private bxla b = bxla.UNKNOWN;
    @dzsi
    private dtja c = null;
    private boolean d = true;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    @dzsi
    private bwnl h = null;
    public bwnk a = bwnk.a;
    private final HashSet<bwnl> i = dcnm.c();
    private final LinkedHashMap<bwnl, ArrayList<bwnf>> j = dcjz.h();
    @dzsi
    private bwne k = null;
    @dzsi
    private bvrt<dthb> l = null;
    @dzsi
    private String m = null;
    @dzsi
    private String n = null;
    @dzsi
    private dtjs o = null;
    @dzsi
    private alad p = null;
    @dzsi
    private akqs q = null;
    @dzsi
    private bvrt<dtaq> r = null;
    @dzsi
    private bvrt<dtjt> s = null;
    private boolean t = true;
    private final ArrayList<bwnf> u = dchl.a();
    @dzsi
    private String v = null;
    @dzsi
    private bvrt<dtod> w = null;
    private boolean x = false;
    private boolean y = true;

    public final synchronized void A(@dzsi akqs akqsVar) {
        this.q = akqsVar;
    }

    @dzsi
    public final synchronized akqs B() {
        return this.q;
    }

    public final synchronized void C(@dzsi dtaq dtaqVar) {
        this.r = bvrt.a(dtaqVar);
    }

    @dzsi
    public final synchronized dtaq D() {
        return (dtaq) bvrt.f(this.r, (dssr) dtaq.m.cu(7), dtaq.m);
    }

    public final synchronized void E(@dzsi dtjt dtjtVar) {
        this.s = bvrt.a(dtjtVar);
    }

    @dzsi
    public final synchronized dtjt F() {
        return (dtjt) bvrt.f(this.s, (dssr) dtjt.e.cu(7), dtjt.e);
    }

    public final synchronized void G(boolean z) {
        this.y = z;
    }

    public final synchronized boolean H() {
        return this.y;
    }

    public final synchronized dcdc<bwnf> I() {
        return dcdc.r(this.u);
    }

    public final synchronized void J(bwnl bwnlVar, bwnf bwnfVar) {
        ArrayList<bwnf> arrayList = this.j.get(bwnlVar);
        if (arrayList == null) {
            arrayList = dchl.a();
            this.j.put(bwnlVar, arrayList);
        }
        arrayList.add(bwnfVar);
        this.x = true;
    }

    public final synchronized dcdc<bwnf> K() {
        return dcdc.q(dcbg.h(this.j.values()));
    }

    public final synchronized void L() {
        this.j.clear();
        this.x = true;
    }

    public final synchronized void M(boolean z) {
        this.t = z;
    }

    public final synchronized boolean N() {
        return this.t;
    }

    public final synchronized void O(@dzsi String str) {
        this.v = str;
    }

    @dzsi
    public final synchronized String P() {
        return this.v;
    }

    public final synchronized void Q(@dzsi bwne bwneVar) {
        this.k = bwneVar;
        this.x = true;
    }

    @dzsi
    public final synchronized bwne R() {
        return this.k;
    }

    public final synchronized void S(dtod dtodVar) {
        this.w = bvrt.a(dtodVar);
        this.x = true;
    }

    public final synchronized void T() {
        this.x = true;
    }

    public final synchronized boolean U() {
        return this.x;
    }

    public final synchronized void V() {
        this.x = false;
    }

    public final synchronized void W(dtmr dtmrVar, @dzsi String str) {
        this.u.add(new bwnf(dtmrVar, str, null));
        this.x = true;
    }

    public final synchronized void X(bwnl bwnlVar) {
        if (!this.j.containsKey(bwnlVar)) {
            this.i.add(bwnlVar);
        }
    }

    @dzsi
    public final synchronized void Y() {
        dtod dtodVar = (dtod) bvrt.f(this.w, (dssr) dtod.a.cu(7), dtod.a);
    }

    public final synchronized void Z() {
        this.g = true;
    }

    public final synchronized void a(bwnj bwnjVar) {
        if (this == bwnjVar) {
            return;
        }
        this.b = bwnjVar.b;
        this.c = bwnjVar.c;
        this.d = bwnjVar.d;
        this.e = bwnjVar.e;
        this.f = bwnjVar.f;
        this.g = bwnjVar.g;
        this.o = bwnjVar.o;
        this.m = bwnjVar.m;
        this.n = bwnjVar.n;
        this.s = bwnjVar.s;
        this.p = bwnjVar.p;
        this.q = bwnjVar.q;
        this.r = bwnjVar.r;
        this.t = bwnjVar.t;
        this.h = bwnjVar.h;
        this.a = bwnjVar.a;
        this.i.clear();
        this.i.addAll(bwnjVar.i);
        this.j.clear();
        this.j.putAll(bwnjVar.j);
        this.k = bwnjVar.k;
        this.l = bwnjVar.l;
        this.u.clear();
        this.u.addAll(bwnjVar.u);
        this.v = bwnjVar.v;
        this.w = bwnjVar.w;
        this.x = true;
        this.y = bwnjVar.y;
    }

    public final synchronized void aa() {
        this.f = true;
    }

    @dzsi
    public final synchronized void ab() {
    }

    @dzsi
    public final synchronized void ac() {
    }

    @dzsi
    public final synchronized void ad() {
    }

    @dzsi
    public final synchronized void ae() {
        dssr dssrVar = (dssr) dtox.c.cu(7);
    }

    @dzsi
    public final synchronized dtja b() {
        return this.c;
    }

    public final synchronized void c(@dzsi dtja dtjaVar) {
        this.c = dtjaVar;
    }

    public final synchronized boolean d() {
        return this.d;
    }

    public final synchronized void e(boolean z) {
        this.d = z;
    }

    public final synchronized boolean f() {
        return this.e;
    }

    public final synchronized void g(boolean z) {
        this.e = z;
    }

    public final synchronized boolean h() {
        return this.f;
    }

    public final synchronized boolean i() {
        return this.g;
    }

    @dzsi
    public final synchronized dtjs j() {
        return this.o;
    }

    public final synchronized void k(@dzsi dtjs dtjsVar) {
        this.o = dtjsVar;
    }

    public final synchronized bxla l() {
        return this.b;
    }

    public final synchronized void m(bxla bxlaVar) {
        dbsk.s(bxlaVar);
        this.b = bxlaVar;
    }

    public final synchronized boolean n(bwnl bwnlVar) {
        return this.i.contains(bwnlVar);
    }

    public final synchronized void o() {
        this.i.clear();
    }

    public final synchronized void p(bwnl bwnlVar) {
        this.h = bwnlVar;
        X(bwnlVar);
    }

    @dzsi
    public final synchronized bwnl q() {
        return this.h;
    }

    public final synchronized void r(bwnl bwnlVar) {
        this.i.remove(bwnlVar);
    }

    public final synchronized Set<bwnl> s() {
        return dcnm.e(this.i);
    }

    public final synchronized void t(@dzsi dthb dthbVar) {
        this.l = bvrt.a(dthbVar);
    }

    @dzsi
    public final synchronized dthb u() {
        return (dthb) bvrt.f(this.l, (dssr) dthb.F.cu(7), dthb.F);
    }

    @dzsi
    public final synchronized String v() {
        return this.m;
    }

    public final synchronized void w(@dzsi String str) {
        this.m = str;
        this.x = true;
    }

    @dzsi
    public final synchronized String x() {
        return this.n;
    }

    public final synchronized void y(@dzsi String str) {
        this.n = str;
        this.x = true;
    }

    public final synchronized void z(@dzsi alad aladVar) {
        this.p = aladVar;
    }
}
