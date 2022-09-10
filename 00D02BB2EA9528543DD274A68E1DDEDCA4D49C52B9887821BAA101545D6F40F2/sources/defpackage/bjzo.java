package defpackage;
/* compiled from: PG */
/* renamed from: bjzo  reason: default package */
/* loaded from: classes3.dex */
public final class bjzo {
    private final dzsj<gga> a;
    private final dzsj<cqhn> b;
    private final dzsj<bjgo> c;
    private final dzsj<bwqv> d;
    private final dzsj<btrm> e;
    private final dzsj<bvfk> f;
    private final dzsj<afgy> g;
    private final dzsj<dxio<afha>> h;
    private final dzsj<btvo> i;
    private final dzsj<bjgi> j;
    private final dzsj<bjgy> k;
    private final dzsj<bjgb> l;
    private final dzsj<bkak> m;
    private final dzsj<bjyl> n;

    public bjzo(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bjgo> dzsjVar3, dzsj<bwqv> dzsjVar4, dzsj<btrm> dzsjVar5, dzsj<bvfk> dzsjVar6, dzsj<afgy> dzsjVar7, dzsj<dxio<afha>> dzsjVar8, dzsj<btvo> dzsjVar9, dzsj<bjgi> dzsjVar10, dzsj<bjgy> dzsjVar11, dzsj<bjgb> dzsjVar12, dzsj<bkak> dzsjVar13, dzsj<bjyl> dzsjVar14) {
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

    public final bjzn a(bwrs<ilo> bwrsVar, djao djaoVar) {
        gga a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        bjgo a3 = this.c.a();
        b(a3, 3);
        bwqv a4 = this.d.a();
        b(a4, 4);
        btrm a5 = this.e.a();
        b(a5, 5);
        bvfk a6 = this.f.a();
        b(a6, 6);
        afgy a7 = this.g.a();
        b(a7, 7);
        dxio a8 = ((dxjh) this.h).a();
        b(a8, 8);
        btvo a9 = this.i.a();
        b(a9, 9);
        bjgi a10 = this.j.a();
        b(a10, 10);
        bjgy a11 = this.k.a();
        b(a11, 11);
        b(this.l.a(), 12);
        bkak a12 = this.m.a();
        b(a12, 13);
        bjyl a13 = this.n.a();
        b(a13, 14);
        b(bwrsVar, 15);
        b(djaoVar, 16);
        return new bjzn(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, bwrsVar, djaoVar);
    }
}
