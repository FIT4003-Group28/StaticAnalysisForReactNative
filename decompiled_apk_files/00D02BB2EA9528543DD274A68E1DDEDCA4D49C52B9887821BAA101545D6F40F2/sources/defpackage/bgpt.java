package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bgpt  reason: default package */
/* loaded from: classes3.dex */
public class bgpt implements bgoa {
    private final bgne a;
    private final bhhf b;
    private final apup c;
    final bgpl e;
    public final bnjj g;
    public final bgow h;
    @dzsi
    public bgnd m;
    @dzsi
    public bgez n;
    @dzsi
    public ilo o;
    @dzsi
    public bgnk q;
    public final List<bgns> f = new ArrayList();
    public final bgnr j = new bgpn(this);
    private final bgpp u = new bgpp(this);
    public final cqfc k = new bgpq(this);
    final apuo l = new bgpr(this);
    @dzsi
    public bgov p = null;
    public boolean s = false;
    private boolean d = false;
    public final apnq i = new apnq();
    public HashSet<bgqj> t = new HashSet<>();
    @dzsi
    public bgps r = new bgps(this);

    public bgpt(cqhn cqhnVar, bhhf bhhfVar, bnjj bnjjVar, bgow bgowVar, bgpm bgpmVar, bgne bgneVar, apup apupVar) {
        this.g = bnjjVar;
        this.c = apupVar;
        this.h = bgowVar;
        this.a = bgneVar;
        this.b = bhhfVar;
        apup a = bgpmVar.a.a();
        bgpm.a(a, 1);
        bhhf a2 = bgpmVar.b.a();
        bgpm.a(a2, 2);
        this.e = new bgpl(a, a2);
    }

    @Override // defpackage.bgoa
    public Boolean a() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.bgoa
    @dzsi
    public bgnz b() {
        return this.r;
    }

    @Override // defpackage.bgoa
    @dzsi
    public bgns c() {
        return this.p;
    }

    @Override // defpackage.bgoa
    @dzsi
    public bgny d() {
        if (e().booleanValue()) {
            return this.e;
        }
        return null;
    }

    @Override // defpackage.bgoa
    public Boolean e() {
        ilo iloVar = this.o;
        boolean z = false;
        if (iloVar != null && this.b.g(bwrs.a(iloVar)) && this.q == bgnk.PLACESHEET_POST_TAB) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bgoa
    public List<bgns> f() {
        return this.f;
    }

    @Override // defpackage.bgoa
    public cjtd g() {
        bgnk bgnkVar = this.q;
        ddho ddhoVar = (bgnkVar == null || bgnkVar != bgnk.PLACESHEET_OVERVIEW_TAB) ? dtxy.lt : dtxy.jw;
        cjta cjtaVar = new cjta();
        cjtaVar.d = ddhoVar;
        return cjtaVar.a();
    }

    public void h(ilo iloVar, int i, bgez bgezVar, bgnk bgnkVar) {
        Long l;
        Long l2;
        this.n = bgezVar;
        this.q = bgnkVar;
        ilo iloVar2 = this.o;
        if (iloVar2 == null || iloVar2 != iloVar) {
            this.f.clear();
        }
        dipo dipoVar = iloVar.h().bb;
        if (dipoVar == null) {
            dipoVar = dipo.e;
        }
        if (i == -1 || i < 0 || i >= dipoVar.c.size()) {
            if (dipoVar.c.size() > 0) {
                l = Long.valueOf(dipoVar.c.get(0).e);
                l2 = null;
            } else {
                l = null;
                l2 = null;
            }
        } else {
            dipk dipkVar = dipoVar.c.get(i);
            Long valueOf = Long.valueOf(dipkVar.e);
            Long valueOf2 = Long.valueOf(dipkVar.d);
            bgow bgowVar = this.h;
            apnq apnqVar = this.i;
            HashSet<bgqj> hashSet = this.t;
            dbsk.s(bgezVar);
            dbsk.s(iloVar);
            dbsk.s(bgnkVar);
            this.p = bgowVar.a(dipkVar, true, 0, apnqVar, hashSet, bgezVar, iloVar, bgnkVar, this.j);
            l = valueOf;
            l2 = valueOf2;
        }
        ilo iloVar3 = this.o;
        if (iloVar3 == null || iloVar3 != iloVar) {
            this.o = iloVar;
            String o = iloVar.ai().o();
            bgne bgneVar = this.a;
            bgpp bgppVar = this.u;
            buuk a = bgneVar.a.a();
            bgne.a(a, 1);
            bhhf a2 = bgneVar.b.a();
            bgne.a(a2, 2);
            bgne.a(bgppVar, 3);
            bgne.a(o, 4);
            bgne.a(iloVar, 7);
            this.m = new bgnd(a, a2, bgppVar, o, l, l2, iloVar);
            if (!e().booleanValue()) {
                return;
            }
            this.e.k(iloVar);
        }
    }

    public void i() {
        this.c.m(this.l);
    }

    public void j() {
        this.c.l(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        bgpl bgplVar = this.e;
        if (bgplVar == null || this.o == null) {
            return;
        }
        bgplVar.l(this.f.isEmpty());
        cqkx.p(this.e);
    }

    public void l() {
        Iterator<bgqj> it = this.t.iterator();
        while (it.hasNext()) {
            it.next().p();
        }
    }

    public final void m() {
        this.s = false;
        if (this.q == bgnk.PLACESHEET_OVERVIEW_TAB) {
            this.g.a();
            return;
        }
        k();
        cqkx.p(this);
    }
}
