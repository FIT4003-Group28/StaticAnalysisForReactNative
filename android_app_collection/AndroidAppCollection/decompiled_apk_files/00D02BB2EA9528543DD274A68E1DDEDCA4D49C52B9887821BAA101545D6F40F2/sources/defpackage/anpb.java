package defpackage;
/* compiled from: PG */
/* renamed from: anpb  reason: default package */
/* loaded from: classes2.dex */
public class anpb {
    private final dzsj<gga> a;
    private final dzsj<anpc> b;
    private final dzsj<cqat> c;
    private final dzsj<angp> d;
    private final dzsj<anhg> e;
    private final dzsj<bbut> f;
    private final dzsj<anqx> g;
    private final dzsj<anru> h;
    private final dzsj<aoiw> i;
    private final dzsj<btvo> j;
    private final dzsj<aogw> k;
    private final dzsj<aokw> l;
    private final dzsj<aojq> m;

    public anpb(dzsj<gga> dzsjVar, dzsj<anpc> dzsjVar2, dzsj<cqat> dzsjVar3, dzsj<angp> dzsjVar4, dzsj<anhg> dzsjVar5, dzsj<bbut> dzsjVar6, dzsj<anqx> dzsjVar7, dzsj<anru> dzsjVar8, dzsj<aoiw> dzsjVar9, dzsj<btvo> dzsjVar10, dzsj<aogw> dzsjVar11, dzsj<aokw> dzsjVar12, dzsj<aojq> dzsjVar13) {
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

    public final anpa a(dvay dvayVar, dpop dpopVar, aoge aogeVar, boolean z) {
        b(dvayVar, 1);
        b(dpopVar, 2);
        b(aogeVar, 3);
        gga a = this.a.a();
        b(a, 5);
        b(this.b.a(), 6);
        cqat a2 = this.c.a();
        b(a2, 7);
        angp a3 = this.d.a();
        b(a3, 8);
        anhg a4 = this.e.a();
        b(a4, 9);
        bbut a5 = this.f.a();
        b(a5, 10);
        anqx a6 = this.g.a();
        b(a6, 11);
        anru a7 = this.h.a();
        b(a7, 12);
        aoiw a8 = this.i.a();
        b(a8, 13);
        b(this.j.a(), 14);
        aogw a9 = this.k.a();
        b(a9, 15);
        aokw a10 = this.l.a();
        b(a10, 16);
        aojq a11 = this.m.a();
        b(a11, 17);
        return new anpa(dvayVar, dpopVar, aogeVar, z, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11);
    }
}
