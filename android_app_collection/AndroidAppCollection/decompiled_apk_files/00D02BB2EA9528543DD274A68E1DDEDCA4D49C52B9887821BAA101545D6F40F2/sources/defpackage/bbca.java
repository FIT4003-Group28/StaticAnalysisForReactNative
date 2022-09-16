package defpackage;
/* compiled from: PG */
/* renamed from: bbca  reason: default package */
/* loaded from: classes3.dex */
public final class bbca {
    private final dzsj<gga> a;
    private final dzsj<bwqv> b;
    private final dzsj<ania> c;
    private final dzsj<aymh> d;
    private final dzsj<ayak> e;
    private final dzsj<dxio<axwo>> f;
    private final dzsj<batz> g;
    private final dzsj<cqhn> h;
    private final dzsj<axze> i;
    private final dzsj<aydl> j;
    private final dzsj<axwg> k;

    public bbca(dzsj<gga> dzsjVar, dzsj<bwqv> dzsjVar2, dzsj<ania> dzsjVar3, dzsj<aymh> dzsjVar4, dzsj<ayak> dzsjVar5, dzsj<dxio<axwo>> dzsjVar6, dzsj<batz> dzsjVar7, dzsj<cqhn> dzsjVar8, dzsj<axze> dzsjVar9, dzsj<aydl> dzsjVar10, dzsj<axwg> dzsjVar11) {
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

    public final bbbz a(baad baadVar) {
        gga a = this.a.a();
        b(a, 1);
        bwqv a2 = this.b.a();
        b(a2, 2);
        ania a3 = this.c.a();
        b(a3, 3);
        aymh a4 = this.d.a();
        b(a4, 4);
        ayak a5 = this.e.a();
        b(a5, 5);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 6);
        batz a7 = this.g.a();
        b(a7, 7);
        b(this.h.a(), 8);
        axze a8 = this.i.a();
        b(a8, 9);
        aydl a9 = this.j.a();
        b(a9, 10);
        axwg a10 = this.k.a();
        b(a10, 11);
        b(baadVar, 12);
        return new bbbz(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, baadVar);
    }
}
