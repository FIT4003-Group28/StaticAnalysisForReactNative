package defpackage;
/* compiled from: PG */
/* renamed from: bryi  reason: default package */
/* loaded from: classes.dex */
public final class bryi {
    public final dzsj<cqhn> a;
    public final dzsj<dxio<qbt>> b;

    public bryi(dzsj<cqhn> dzsjVar, dzsj<dxio<qbt>> dzsjVar2) {
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
