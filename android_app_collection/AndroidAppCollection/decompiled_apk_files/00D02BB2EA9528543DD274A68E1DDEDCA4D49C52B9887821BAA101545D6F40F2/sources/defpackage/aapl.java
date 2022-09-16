package defpackage;
/* compiled from: PG */
/* renamed from: aapl  reason: default package */
/* loaded from: classes2.dex */
public final class aapl {
    public final dzsj<gga> a;
    public final dzsj<cqkj> b;
    public final dzsj<aaph> c;
    public final dzsj<busw> d;

    public aapl(dzsj<gga> dzsjVar, dzsj<cqkj> dzsjVar2, dzsj<aaph> dzsjVar3, dzsj<busw> dzsjVar4) {
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
