package defpackage;
/* compiled from: PG */
/* renamed from: bopp  reason: default package */
/* loaded from: classes3.dex */
public final class bopp {
    public final dzsj<bopj> a;
    public final dzsj<cqhn> b;

    public bopp(dzsj<bopj> dzsjVar, dzsj<cqhn> dzsjVar2) {
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
