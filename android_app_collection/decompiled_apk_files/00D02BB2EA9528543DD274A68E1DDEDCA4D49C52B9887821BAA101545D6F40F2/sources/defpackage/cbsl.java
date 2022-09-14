package defpackage;
/* compiled from: PG */
/* renamed from: cbsl  reason: default package */
/* loaded from: classes4.dex */
public final class cbsl {
    public final dzsj<cbsq> a;
    public final dzsj<cbtc> b;

    public cbsl(dzsj<cbsq> dzsjVar, dzsj<cbtc> dzsjVar2) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
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
