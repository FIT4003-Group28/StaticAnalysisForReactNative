package defpackage;
/* compiled from: PG */
/* renamed from: adci  reason: default package */
/* loaded from: classes.dex */
public final class adci {
    public final dzsj<absx> a;
    public final dzsj<acwt> b;

    public adci(dzsj<absx> dzsjVar, dzsj<acwt> dzsjVar2) {
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
