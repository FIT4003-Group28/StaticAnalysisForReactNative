package defpackage;
/* compiled from: PG */
/* renamed from: bayy  reason: default package */
/* loaded from: classes3.dex */
public final class bayy {
    private final dzsj<gga> a;
    private final dzsj<bwqv> b;
    private final dzsj<btrm> c;
    private final dzsj<ania> d;
    private final dzsj<axwy> e;
    private final dzsj<axxi> f;
    private final dzsj<ahjq> g;
    private final dzsj<batd> h;
    private final dzsj<batz> i;
    private final dzsj<wdw> j;
    private final dzsj<dxio<wdy>> k;
    private final dzsj<dxio<wdx>> l;

    public bayy(dzsj<gga> dzsjVar, dzsj<bwqv> dzsjVar2, dzsj<btrm> dzsjVar3, dzsj<ania> dzsjVar4, dzsj<axwy> dzsjVar5, dzsj<axxi> dzsjVar6, dzsj<ahjq> dzsjVar7, dzsj<batd> dzsjVar8, dzsj<batz> dzsjVar9, dzsj<wdw> dzsjVar10, dzsj<dxio<wdy>> dzsjVar11, dzsj<dxio<wdx>> dzsjVar12) {
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

    public final bayx a(dndr dndrVar) {
        gga a = this.a.a();
        b(a, 1);
        bwqv a2 = this.b.a();
        b(a2, 2);
        btrm a3 = this.c.a();
        b(a3, 3);
        ania a4 = this.d.a();
        b(a4, 4);
        dzsj<axwy> dzsjVar = this.e;
        axxi a5 = this.f.a();
        b(a5, 6);
        ahjq a6 = this.g.a();
        b(a6, 7);
        batd a7 = this.h.a();
        b(a7, 8);
        batz a8 = this.i.a();
        b(a8, 9);
        wdw a9 = this.j.a();
        b(a9, 10);
        dxio a10 = ((dxjh) this.k).a();
        b(a10, 11);
        dxio a11 = ((dxjh) this.l).a();
        b(a11, 12);
        b(dndrVar, 13);
        return new bayx(a, a2, a3, a4, dzsjVar, a5, a6, a7, a8, a9, a10, a11, dndrVar);
    }
}
