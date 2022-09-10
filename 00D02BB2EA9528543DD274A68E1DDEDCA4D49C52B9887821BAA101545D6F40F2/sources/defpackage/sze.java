package defpackage;
/* compiled from: PG */
/* renamed from: sze  reason: default package */
/* loaded from: classes7.dex */
public final class sze {
    public final dzsj<twk> a;
    public final dzsj<sxq> b;

    public sze(dzsj<twk> dzsjVar, dzsj<sxq> dzsjVar2) {
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
