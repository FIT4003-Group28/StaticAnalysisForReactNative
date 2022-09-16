package defpackage;
/* compiled from: PG */
/* renamed from: ppp  reason: default package */
/* loaded from: classes7.dex */
public final class ppp {
    public final dzsj<gga> a;
    public final dzsj<pnq> b;
    public final dzsj<bvjj> c;

    public ppp(dzsj<gga> dzsjVar, dzsj<pnq> dzsjVar2, dzsj<bvjj> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
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
