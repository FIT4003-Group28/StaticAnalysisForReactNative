package defpackage;
/* compiled from: PG */
/* renamed from: aynp  reason: default package */
/* loaded from: classes3.dex */
public final class aynp {
    private final dzsj<gga> a;
    private final dzsj<aymh> b;
    private final dzsj<ayak> c;
    private final dzsj<fd> d;
    private final dzsj<jkf> e;
    private final dzsj<axwg> f;
    private final dzsj<ayfn> g;

    public aynp(dzsj<gga> dzsjVar, dzsj<aymh> dzsjVar2, dzsj<ayak> dzsjVar3, dzsj<fd> dzsjVar4, dzsj<jkf> dzsjVar5, dzsj<axwg> dzsjVar6, dzsj<ayfn> dzsjVar7) {
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

    public final ayno a(@dzsi bwrs<baad> bwrsVar) {
        gga a = this.a.a();
        b(a, 1);
        aymh a2 = this.b.a();
        b(a2, 2);
        ayak a3 = this.c.a();
        b(a3, 3);
        fd fdVar = (fd) ((dxjd) this.d).a;
        b(fdVar, 4);
        jkf a4 = this.e.a();
        b(a4, 5);
        axwg a5 = this.f.a();
        b(a5, 6);
        return new ayno(a, a2, a3, fdVar, a4, a5, this.g, bwrsVar);
    }
}
