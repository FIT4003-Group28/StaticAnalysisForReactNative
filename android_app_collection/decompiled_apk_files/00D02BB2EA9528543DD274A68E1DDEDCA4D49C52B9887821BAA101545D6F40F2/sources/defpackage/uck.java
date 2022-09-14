package defpackage;
/* compiled from: PG */
/* renamed from: uck  reason: default package */
/* loaded from: classes7.dex */
public final class uck {
    public final dzsj<tgg> a;
    public final dzsj<cqhn> b;

    public uck(dzsj<tgg> dzsjVar, dzsj<cqhn> dzsjVar2) {
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
