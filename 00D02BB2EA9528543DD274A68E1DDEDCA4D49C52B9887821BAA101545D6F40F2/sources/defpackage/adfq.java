package defpackage;
/* compiled from: PG */
/* renamed from: adfq  reason: default package */
/* loaded from: classes2.dex */
public final class adfq {
    public final dzsj<cqhn> a;
    public final dzsj<abjo> b;
    public final dzsj<acyr> c;
    public final dzsj<dxio<abfa>> d;
    public final dzsj<acwt> e;
    public final dzsj<abfc> f;

    public adfq(dzsj<cqhn> dzsjVar, dzsj<abjo> dzsjVar2, dzsj<acyr> dzsjVar3, dzsj<dxio<abfa>> dzsjVar4, dzsj<acwt> dzsjVar5, dzsj<abfc> dzsjVar6) {
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
