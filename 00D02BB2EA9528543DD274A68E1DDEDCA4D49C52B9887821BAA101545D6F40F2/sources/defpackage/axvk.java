package defpackage;
/* compiled from: PG */
/* renamed from: axvk  reason: default package */
/* loaded from: classes3.dex */
public final class axvk {
    public final dzsj<ff> a;
    public final dzsj<cklf> b;
    public final dzsj<bzpr> c;

    public axvk(dzsj<ff> dzsjVar, dzsj<cklf> dzsjVar2, dzsj<bzpr> dzsjVar3) {
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
