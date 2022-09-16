package defpackage;
/* compiled from: PG */
/* renamed from: aeiv  reason: default package */
/* loaded from: classes2.dex */
public class aeiv {
    private final dzsj<bvpe> a;
    private final dzsj<huc> b;
    private final dzsj<bnjv> c;
    private final dzsj<aeio> d;
    private final dzsj<ahjq> e;

    public aeiv(dzsj<bvpe> dzsjVar, dzsj<huc> dzsjVar2, dzsj<bnjv> dzsjVar3, dzsj<aeio> dzsjVar4, dzsj<ahjq> dzsjVar5) {
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

    public final aeiu a(aeim aeimVar, aeir aeirVar, iif iifVar, dbsg<igq> dbsgVar, ihz ihzVar, int i, aeit aeitVar, boolean z) {
        bvpe a = this.a.a();
        b(a, 1);
        huc a2 = this.b.a();
        b(a2, 2);
        bnjv a3 = this.c.a();
        b(a3, 3);
        aeio a4 = this.d.a();
        b(a4, 4);
        ahjq a5 = this.e.a();
        b(a5, 5);
        b(aeimVar, 6);
        b(aeirVar, 7);
        b(iifVar, 8);
        b(dbsgVar, 9);
        b(ihzVar, 10);
        b(aeitVar, 12);
        return new aeiu(a, a2, a3, a4, a5, aeimVar, aeirVar, iifVar, dbsgVar, ihzVar, i, aeitVar, z);
    }
}
