package defpackage;
/* compiled from: PG */
/* renamed from: arxw  reason: default package */
/* loaded from: classes2.dex */
public class arxw {
    private final dzsj<cqhn> a;

    public arxw(dzsj<cqhn> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final arxv a(cqss cqssVar) {
        cqhn a = this.a.a();
        b(a, 1);
        b(cqssVar, 2);
        return new arxv(a, cqssVar);
    }
}
