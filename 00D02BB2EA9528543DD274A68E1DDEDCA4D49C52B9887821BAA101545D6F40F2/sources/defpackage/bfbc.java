package defpackage;
/* compiled from: PG */
/* renamed from: bfbc  reason: default package */
/* loaded from: classes3.dex */
public class bfbc {
    private final dzsj<gga> a;
    private final dzsj<cqat> b;
    private final dzsj<beya> c;
    private final dzsj<bfaq> d;
    private final dzsj<axru> e;
    private final dzsj<axrx> f;
    private final dzsj<dxio<cjqq>> g;
    private final dzsj<bfbl> h;
    private final dzsj<cqkj> i;
    private final dzsj<bfbn> j;
    private final dzsj<dxio<afha>> k;

    public bfbc(dzsj<gga> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<beya> dzsjVar3, dzsj<bfaq> dzsjVar4, dzsj<axru> dzsjVar5, dzsj<axrx> dzsjVar6, dzsj<dxio<cjqq>> dzsjVar7, dzsj<bfbl> dzsjVar8, dzsj<cqkj> dzsjVar9, dzsj<bfbn> dzsjVar10, dzsj<dxio<afha>> dzsjVar11) {
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

    public final bfbb a(bfby bfbyVar) {
        gga a = this.a.a();
        b(a, 1);
        cqat a2 = this.b.a();
        b(a2, 2);
        beya a3 = this.c.a();
        b(a3, 3);
        bfaq a4 = this.d.a();
        b(a4, 4);
        axru a5 = this.e.a();
        b(a5, 5);
        axrx a6 = this.f.a();
        b(a6, 6);
        dxio a7 = ((dxjh) this.g).a();
        b(a7, 7);
        bfbl a8 = this.h.a();
        b(a8, 8);
        cqkj a9 = this.i.a();
        b(a9, 9);
        bfbn a10 = this.j.a();
        b(a10, 10);
        dxio a11 = ((dxjh) this.k).a();
        b(a11, 11);
        b(bfbyVar, 12);
        return new bfbb(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, bfbyVar);
    }
}
