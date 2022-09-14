package defpackage;
/* compiled from: PG */
/* renamed from: abtt  reason: default package */
/* loaded from: classes2.dex */
public final class abtt {
    private final dzsj<gga> a;
    private final dzsj<cqhn> b;
    private final dzsj<cjqy> c;
    private final dzsj<abtc> d;
    private final dzsj<abtd> e;
    private final dzsj<dehq> f;
    private final dzsj<abtu> g;

    public abtt(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<abtc> dzsjVar4, dzsj<abtd> dzsjVar5, dzsj<dehq> dzsjVar6, dzsj<abtu> dzsjVar7) {
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

    public final abts a(abta abtaVar, abfi abfiVar) {
        gga a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        cjqy a3 = this.c.a();
        b(a3, 3);
        b(this.d.a(), 4);
        abtd a4 = this.e.a();
        b(a4, 5);
        dehq a5 = this.f.a();
        b(a5, 6);
        abtu a6 = this.g.a();
        b(a6, 7);
        b(abtaVar, 8);
        b(abfiVar, 9);
        return new abts(a, a2, a3, a4, a5, a6, abtaVar, abfiVar);
    }
}
