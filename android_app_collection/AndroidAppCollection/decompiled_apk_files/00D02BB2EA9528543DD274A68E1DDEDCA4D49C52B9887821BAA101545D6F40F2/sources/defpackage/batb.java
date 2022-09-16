package defpackage;
/* compiled from: PG */
/* renamed from: batb  reason: default package */
/* loaded from: classes3.dex */
public final class batb {
    private final dzsj<gga> a;
    private final dzsj<cqhn> b;
    private final dzsj<cqkj> c;
    private final dzsj<axwg> d;
    private final dzsj<bass> e;
    private final dzsj<barh> f;
    private final dzsj<bakw> g;
    private final dzsj<batn> h;
    private final dzsj<dxio<begg>> i;
    private final dzsj<dxio<axwo>> j;
    private final dzsj<dxio<avik>> k;
    private final dzsj<dxio<avij>> l;

    public batb(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cqkj> dzsjVar3, dzsj<axwg> dzsjVar4, dzsj<bass> dzsjVar5, dzsj<barh> dzsjVar6, dzsj<bakw> dzsjVar7, dzsj<batn> dzsjVar8, dzsj<dxio<begg>> dzsjVar9, dzsj<dxio<axwo>> dzsjVar10, dzsj<dxio<avik>> dzsjVar11, dzsj<dxio<avij>> dzsjVar12) {
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

    public final bata a(bakx bakxVar, axxe axxeVar) {
        gga a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        cqkj a3 = this.c.a();
        b(a3, 3);
        axwg a4 = this.d.a();
        b(a4, 4);
        bass a5 = this.e.a();
        b(a5, 5);
        barh a6 = this.f.a();
        b(a6, 6);
        bakw a7 = this.g.a();
        b(a7, 7);
        batn a8 = this.h.a();
        b(a8, 8);
        dxio a9 = ((dxjh) this.i).a();
        b(a9, 9);
        dxio a10 = ((dxjh) this.j).a();
        b(a10, 10);
        dxio a11 = ((dxjh) this.k).a();
        b(a11, 11);
        dxio a12 = ((dxjh) this.l).a();
        b(a12, 12);
        b(bakxVar, 13);
        b(axxeVar, 14);
        return new bata(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, bakxVar, axxeVar);
    }
}
