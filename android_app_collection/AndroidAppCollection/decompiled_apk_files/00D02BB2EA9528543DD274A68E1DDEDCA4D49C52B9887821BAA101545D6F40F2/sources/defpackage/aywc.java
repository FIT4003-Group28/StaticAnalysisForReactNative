package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aywc  reason: default package */
/* loaded from: classes3.dex */
public final class aywc {
    private final dzsj<gga> a;
    private final dzsj<fd> b;
    private final dzsj<dxio<axwo>> c;
    private final dzsj<axwi> d;
    private final dzsj<bvrb> e;
    private final dzsj<ayvl> f;
    private final dzsj<axyr> g;
    private final dzsj<aybl> h;
    private final dzsj<ayfl> i;
    private final dzsj<cqhn> j;
    private final dzsj<cqhu> k;
    private final dzsj<aydu> l;
    private final dzsj<ayay> m;
    private final dzsj<Executor> n;
    private final dzsj<axwg> o;
    private final dzsj<cjqy> p;
    private final dzsj<ayvj> q;
    private final dzsj<ayyq> r;
    private final dzsj<cpv> s;
    private final dzsj<gfq> t;
    private final dzsj<aymh> u;

    public aywc(dzsj<gga> dzsjVar, dzsj<fd> dzsjVar2, dzsj<dxio<axwo>> dzsjVar3, dzsj<axwi> dzsjVar4, dzsj<bvrb> dzsjVar5, dzsj<ayvl> dzsjVar6, dzsj<axyr> dzsjVar7, dzsj<aybl> dzsjVar8, dzsj<ayfl> dzsjVar9, dzsj<cqhn> dzsjVar10, dzsj<cqhu> dzsjVar11, dzsj<aydu> dzsjVar12, dzsj<ayay> dzsjVar13, dzsj<Executor> dzsjVar14, dzsj<axwg> dzsjVar15, dzsj<cjqy> dzsjVar16, dzsj<ayvj> dzsjVar17, dzsj<ayyq> dzsjVar18, dzsj<cpv> dzsjVar19, dzsj<gfq> dzsjVar20, dzsj<aymh> dzsjVar21) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
        b(dzsjVar10, 10);
        this.j = dzsjVar10;
        b(dzsjVar11, 11);
        this.k = dzsjVar11;
        b(dzsjVar12, 12);
        this.l = dzsjVar12;
        b(dzsjVar13, 13);
        this.m = dzsjVar13;
        b(dzsjVar14, 14);
        this.n = dzsjVar14;
        b(dzsjVar15, 15);
        this.o = dzsjVar15;
        b(dzsjVar16, 16);
        this.p = dzsjVar16;
        b(dzsjVar17, 17);
        this.q = dzsjVar17;
        b(dzsjVar18, 18);
        this.r = dzsjVar18;
        b(dzsjVar19, 19);
        this.s = dzsjVar19;
        b(dzsjVar20, 20);
        this.t = dzsjVar20;
        b(dzsjVar21, 21);
        this.u = dzsjVar21;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final aywb a(ges gesVar, baad baadVar, @dzsi baal baalVar, ayrp ayrpVar) {
        gga a = this.a.a();
        b(a, 1);
        fd fdVar = (fd) ((dxjd) this.b).a;
        b(fdVar, 2);
        dxio a2 = ((dxjh) this.c).a();
        b(a2, 3);
        axwi a3 = this.d.a();
        b(a3, 4);
        bvrb a4 = this.e.a();
        b(a4, 5);
        ayvl a5 = this.f.a();
        b(a5, 6);
        axyr a6 = this.g.a();
        b(a6, 7);
        aybl a7 = this.h.a();
        b(a7, 8);
        ayfl a8 = this.i.a();
        b(a8, 9);
        b(this.j.a(), 10);
        b(this.k.a(), 11);
        aydu a9 = this.l.a();
        b(a9, 12);
        ayay a10 = this.m.a();
        b(a10, 13);
        Executor a11 = this.n.a();
        b(a11, 14);
        axwg a12 = this.o.a();
        b(a12, 15);
        cjqy a13 = this.p.a();
        b(a13, 16);
        ayvj a14 = this.q.a();
        b(a14, 17);
        ayyq a15 = this.r.a();
        b(a15, 18);
        cpv a16 = this.s.a();
        b(a16, 19);
        gfq a17 = this.t.a();
        b(a17, 20);
        aymh a18 = this.u.a();
        b(a18, 21);
        b(gesVar, 22);
        b(baadVar, 23);
        b(ayrpVar, 25);
        return new aywb(a, fdVar, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, gesVar, baadVar, baalVar, ayrpVar);
    }
}
