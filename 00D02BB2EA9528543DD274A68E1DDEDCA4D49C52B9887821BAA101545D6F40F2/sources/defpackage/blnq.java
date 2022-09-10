package defpackage;
/* compiled from: PG */
/* renamed from: blnq  reason: default package */
/* loaded from: classes3.dex */
public class blnq {
    private final dzsj<gga> a;
    private final dzsj<ceda> b;
    private final dzsj<blni> c;
    private final dzsj<ixf> d;
    private final dzsj<cebm> e;
    private final dzsj<blmp> f;
    private final dzsj<bhuh> g;
    private final dzsj<dxio<bkpi>> h;
    private final dzsj<cqhn> i;
    private final dzsj<bhhf> j;
    private final dzsj<bwqv> k;

    public blnq(dzsj<gga> dzsjVar, dzsj<ceda> dzsjVar2, dzsj<blni> dzsjVar3, dzsj<ixf> dzsjVar4, dzsj<cebm> dzsjVar5, dzsj<blmp> dzsjVar6, dzsj<bhuh> dzsjVar7, dzsj<dxio<bkpi>> dzsjVar8, dzsj<cqhn> dzsjVar9, dzsj<bhhf> dzsjVar10, dzsj<bwqv> dzsjVar11) {
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

    public final blnp a(cdjk cdjkVar, boolean z) {
        gga a = this.a.a();
        b(a, 1);
        ceda a2 = this.b.a();
        b(a2, 2);
        blni a3 = this.c.a();
        b(a3, 3);
        ixf a4 = this.d.a();
        b(a4, 4);
        cebm a5 = this.e.a();
        b(a5, 5);
        blmp a6 = this.f.a();
        b(a6, 6);
        bhuh a7 = this.g.a();
        b(a7, 7);
        dxio a8 = ((dxjh) this.h).a();
        b(a8, 8);
        cqhn a9 = this.i.a();
        b(a9, 9);
        bhhf a10 = this.j.a();
        b(a10, 10);
        bwqv a11 = this.k.a();
        b(a11, 11);
        b(cdjkVar, 12);
        return new blnp(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, cdjkVar, z);
    }
}
