package defpackage;
/* compiled from: PG */
/* renamed from: bayv  reason: default package */
/* loaded from: classes3.dex */
public final class bayv {
    private final dzsj<gga> a;
    private final dzsj<axwq> b;
    private final dzsj<bwqv> c;
    private final dzsj<btrm> d;
    private final dzsj<ania> e;
    private final dzsj<axwg> f;
    private final dzsj<amfi> g;
    private final dzsj<axwy> h;
    private final dzsj<bvsl> i;
    private final dzsj<batz> j;
    private final dzsj<wdw> k;
    private final dzsj<dxio<wdy>> l;
    private final dzsj<dxio<wdx>> m;

    public bayv(dzsj<gga> dzsjVar, dzsj<axwq> dzsjVar2, dzsj<bwqv> dzsjVar3, dzsj<btrm> dzsjVar4, dzsj<ania> dzsjVar5, dzsj<axwg> dzsjVar6, dzsj<amfi> dzsjVar7, dzsj<axwy> dzsjVar8, dzsj<bvsl> dzsjVar9, dzsj<batz> dzsjVar10, dzsj<wdw> dzsjVar11, dzsj<dxio<wdy>> dzsjVar12, dzsj<dxio<wdx>> dzsjVar13) {
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

    public final bayu a(dndr dndrVar, Long l, @dzsi akqi akqiVar, @dzsi String str, @dzsi akqq akqqVar, @dzsi String str2, @dzsi decq decqVar, @dzsi Integer num, axwu axwuVar) {
        gga a = this.a.a();
        b(a, 1);
        axwq a2 = this.b.a();
        b(a2, 2);
        bwqv a3 = this.c.a();
        b(a3, 3);
        btrm a4 = this.d.a();
        b(a4, 4);
        ania a5 = this.e.a();
        b(a5, 5);
        axwg a6 = this.f.a();
        b(a6, 6);
        dzsj<amfi> dzsjVar = this.g;
        dzsj<axwy> dzsjVar2 = this.h;
        dzsj<bvsl> dzsjVar3 = this.i;
        batz a7 = this.j.a();
        b(a7, 10);
        wdw a8 = this.k.a();
        b(a8, 11);
        dxio a9 = ((dxjh) this.l).a();
        b(a9, 12);
        dxio a10 = ((dxjh) this.m).a();
        b(a10, 13);
        b(dndrVar, 14);
        b(l, 15);
        b(axwuVar, 22);
        return new bayu(a, a2, a3, a4, a5, a6, dzsjVar, dzsjVar2, dzsjVar3, a7, a8, a9, a10, dndrVar, l, akqiVar, str, akqqVar, str2, decqVar, num, axwuVar);
    }
}
