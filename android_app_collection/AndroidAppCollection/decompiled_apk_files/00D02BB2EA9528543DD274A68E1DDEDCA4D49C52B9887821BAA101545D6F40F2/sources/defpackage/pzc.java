package defpackage;
/* compiled from: PG */
/* renamed from: pzc  reason: default package */
/* loaded from: classes7.dex */
public final class pzc {
    public final dzsj<gga> a;
    public final dzsj<gft> b;
    public final dzsj<pzh> c;
    public final dzsj<pyv> d;

    public pzc(dzsj<gga> dzsjVar, dzsj<gft> dzsjVar2, dzsj<pzh> dzsjVar3, dzsj<pyv> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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
