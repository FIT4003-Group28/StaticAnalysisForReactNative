package defpackage;
/* compiled from: PG */
/* renamed from: aczg  reason: default package */
/* loaded from: classes.dex */
public final class aczg {
    public final dzsj<akpm> a;
    public final dzsj<abfl> b;
    public final dzsj<gga> c;
    public final dzsj<efg> d;
    public final dzsj<acwt> e;
    public final dzsj<cklq> f;

    public aczg(dzsj<akpm> dzsjVar, dzsj<abfl> dzsjVar2, dzsj<gga> dzsjVar3, dzsj<efg> dzsjVar4, dzsj<acwt> dzsjVar5, dzsj<cklq> dzsjVar6) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
