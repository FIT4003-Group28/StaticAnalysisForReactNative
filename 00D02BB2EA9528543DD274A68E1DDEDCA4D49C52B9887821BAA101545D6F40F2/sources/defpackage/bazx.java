package defpackage;
/* compiled from: PG */
/* renamed from: bazx  reason: default package */
/* loaded from: classes3.dex */
public final class bazx {
    private final dzsj<gga> a;
    private final dzsj<axwq> b;
    private final dzsj<bwqv> c;
    private final dzsj<ania> d;
    private final dzsj<bvsl> e;
    private final dzsj<bvrb> f;
    private final dzsj<batz> g;

    public bazx(dzsj<gga> dzsjVar, dzsj<axwq> dzsjVar2, dzsj<bwqv> dzsjVar3, dzsj<ania> dzsjVar4, dzsj<bvsl> dzsjVar5, dzsj<bvrb> dzsjVar6, dzsj<batz> dzsjVar7) {
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

    public final bazw a(azvo azvoVar, bazv bazvVar, @dzsi Integer num) {
        gga a = this.a.a();
        b(a, 1);
        axwq a2 = this.b.a();
        b(a2, 2);
        bwqv a3 = this.c.a();
        b(a3, 3);
        ania a4 = this.d.a();
        b(a4, 4);
        dzsj<bvsl> dzsjVar = this.e;
        bvrb a5 = this.f.a();
        b(a5, 6);
        batz a6 = this.g.a();
        b(a6, 7);
        b(azvoVar, 8);
        b(bazvVar, 9);
        return new bazw(a, a2, a3, a4, dzsjVar, a5, a6, azvoVar, bazvVar, num);
    }
}
