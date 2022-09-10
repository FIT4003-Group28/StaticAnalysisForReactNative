package defpackage;
/* compiled from: PG */
/* renamed from: aynm  reason: default package */
/* loaded from: classes3.dex */
public final class aynm {
    private final dzsj<gga> a;
    private final dzsj<cqhn> b;
    private final dzsj<jkf> c;
    private final dzsj<araj> d;
    private final dzsj<dxio<axwi>> e;
    private final dzsj<ayay> f;
    private final dzsj<batm> g;
    private final dzsj<dxio<ayfn>> h;
    private final dzsj<axwg> i;
    private final dzsj<cpv> j;

    public aynm(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<jkf> dzsjVar3, dzsj<araj> dzsjVar4, dzsj<dxio<axwi>> dzsjVar5, dzsj<ayay> dzsjVar6, dzsj<batm> dzsjVar7, dzsj<dxio<ayfn>> dzsjVar8, dzsj<axwg> dzsjVar9, dzsj<cpv> dzsjVar10) {
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

    public final aynl a(@dzsi bwrs<baad> bwrsVar) {
        gga a = this.a.a();
        b(a, 1);
        b(this.b.a(), 2);
        jkf a2 = this.c.a();
        b(a2, 3);
        dzsj<araj> dzsjVar = this.d;
        dxio a3 = ((dxjh) this.e).a();
        b(a3, 5);
        ayay a4 = this.f.a();
        b(a4, 6);
        batm a5 = this.g.a();
        b(a5, 7);
        dxio a6 = ((dxjh) this.h).a();
        b(a6, 8);
        axwg a7 = this.i.a();
        b(a7, 9);
        cpv a8 = this.j.a();
        b(a8, 10);
        return new aynl(a, a2, dzsjVar, a3, a4, a5, a6, a7, a8, bwrsVar);
    }
}
