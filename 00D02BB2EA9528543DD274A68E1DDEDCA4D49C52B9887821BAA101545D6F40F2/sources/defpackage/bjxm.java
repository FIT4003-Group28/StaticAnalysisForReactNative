package defpackage;
/* compiled from: PG */
/* renamed from: bjxm  reason: default package */
/* loaded from: classes3.dex */
public final class bjxm {
    private final dzsj<gga> a;
    private final dzsj<cqhn> b;
    private final dzsj<bjgo> c;
    private final dzsj<afgy> d;
    private final dzsj<dxio<afha>> e;
    private final dzsj<btrm> f;
    private final dzsj<btvo> g;
    private final dzsj<bvff> h;
    private final dzsj<bjgi> i;
    private final dzsj<bjgy> j;
    private final dzsj<bkak> k;
    private final dzsj<bjyl> l;
    private final dzsj<bjyr> m;
    private final dzsj<bjzs> n;
    private final dzsj<bjzt> o;

    public bjxm(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bjgo> dzsjVar3, dzsj<afgy> dzsjVar4, dzsj<dxio<afha>> dzsjVar5, dzsj<btrm> dzsjVar6, dzsj<btvo> dzsjVar7, dzsj<bvff> dzsjVar8, dzsj<bjgi> dzsjVar9, dzsj<bjgy> dzsjVar10, dzsj<bkak> dzsjVar11, dzsj<bjyl> dzsjVar12, dzsj<bjyr> dzsjVar13, dzsj<bjzs> dzsjVar14, dzsj<bjzt> dzsjVar15) {
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

    public final bjxl a(bjxk bjxkVar, bwrs<ilo> bwrsVar, djam djamVar, String str, bjwg bjwgVar) {
        gga a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        bjgo a3 = this.c.a();
        b(a3, 3);
        afgy a4 = this.d.a();
        b(a4, 4);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 5);
        btrm a6 = this.f.a();
        b(a6, 6);
        btvo a7 = this.g.a();
        b(a7, 7);
        bvff a8 = this.h.a();
        b(a8, 8);
        bjgi a9 = this.i.a();
        b(a9, 9);
        bjgy a10 = this.j.a();
        b(a10, 10);
        bkak a11 = this.k.a();
        b(a11, 11);
        bjyl a12 = this.l.a();
        b(a12, 12);
        bjyr a13 = this.m.a();
        b(a13, 13);
        b(this.n.a(), 14);
        b(this.o.a(), 15);
        b(bjxkVar, 16);
        b(bwrsVar, 17);
        b(djamVar, 18);
        b(str, 19);
        b(bjwgVar, 20);
        return new bjxl(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, bjxkVar, bwrsVar, djamVar, str, bjwgVar);
    }
}
