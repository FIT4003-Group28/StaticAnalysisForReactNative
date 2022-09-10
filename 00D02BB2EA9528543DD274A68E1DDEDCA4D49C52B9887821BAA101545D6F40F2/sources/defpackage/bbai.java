package defpackage;
/* compiled from: PG */
/* renamed from: bbai  reason: default package */
/* loaded from: classes3.dex */
public final class bbai {
    private final dzsj<gfq> a;
    private final dzsj<gga> b;
    private final dzsj<bwqv> c;
    private final dzsj<axwg> d;
    private final dzsj<ania> e;
    private final dzsj<arfm> f;
    private final dzsj<batz> g;

    public bbai(dzsj<gfq> dzsjVar, dzsj<gga> dzsjVar2, dzsj<bwqv> dzsjVar3, dzsj<axwg> dzsjVar4, dzsj<ania> dzsjVar5, dzsj<arfm> dzsjVar6, dzsj<batz> dzsjVar7) {
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

    public final bbah a(dvdd dvddVar) {
        gfq a = this.a.a();
        b(a, 1);
        gga a2 = this.b.a();
        b(a2, 2);
        bwqv a3 = this.c.a();
        b(a3, 3);
        axwg a4 = this.d.a();
        b(a4, 4);
        ania a5 = this.e.a();
        b(a5, 5);
        dzsj<arfm> dzsjVar = this.f;
        batz a6 = this.g.a();
        b(a6, 7);
        b(dvddVar, 8);
        return new bbah(a, a2, a3, a4, a5, dzsjVar, a6, dvddVar);
    }
}
