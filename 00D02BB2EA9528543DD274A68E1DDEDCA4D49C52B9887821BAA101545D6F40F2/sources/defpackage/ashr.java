package defpackage;
/* compiled from: PG */
/* renamed from: ashr  reason: default package */
/* loaded from: classes2.dex */
public final class ashr {
    public final dzsj<gga> a;
    public final dzsj<cpwx> b;
    public final dzsj<aufc> c;
    public final dzsj<dehq> d;

    public ashr(dzsj<gga> dzsjVar, dzsj<cpwx> dzsjVar2, dzsj<aufc> dzsjVar3, dzsj<dehq> dzsjVar4) {
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
