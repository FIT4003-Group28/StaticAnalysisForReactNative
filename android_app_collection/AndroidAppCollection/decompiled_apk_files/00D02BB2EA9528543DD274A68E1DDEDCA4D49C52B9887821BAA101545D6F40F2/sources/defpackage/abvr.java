package defpackage;
/* compiled from: PG */
/* renamed from: abvr  reason: default package */
/* loaded from: classes2.dex */
public final class abvr {
    private final dzsj<akpm> a;
    private final dzsj<aeau> b;
    private final dzsj<abfl> c;
    private final dzsj<gga> d;
    private final dzsj<efg> e;
    private final dzsj<cklq> f;

    public abvr(dzsj<akpm> dzsjVar, dzsj<aeau> dzsjVar2, dzsj<abfl> dzsjVar3, dzsj<gga> dzsjVar4, dzsj<efg> dzsjVar5, dzsj<cklq> dzsjVar6) {
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

    public final abvq a(dqfo dqfoVar, ddho ddhoVar, @dzsi dxio<aeaa> dxioVar, @dzsi acwt acwtVar, abse abseVar) {
        akpm a = this.a.a();
        b(a, 1);
        aeau a2 = this.b.a();
        b(a2, 2);
        abfl a3 = this.c.a();
        b(a3, 3);
        gga a4 = this.d.a();
        b(a4, 4);
        efg a5 = this.e.a();
        b(a5, 5);
        cklq a6 = this.f.a();
        b(a6, 6);
        b(dqfoVar, 7);
        b(ddhoVar, 8);
        b(abseVar, 11);
        return new abvq(a, a2, a3, a4, a5, a6, dqfoVar, ddhoVar, dxioVar, acwtVar, abseVar);
    }
}
