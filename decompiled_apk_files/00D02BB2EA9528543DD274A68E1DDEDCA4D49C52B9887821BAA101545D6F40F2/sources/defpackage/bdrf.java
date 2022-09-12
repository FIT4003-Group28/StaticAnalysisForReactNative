package defpackage;
/* compiled from: PG */
/* renamed from: bdrf  reason: default package */
/* loaded from: classes3.dex */
public final class bdrf {
    public final dzsj<cqhn> a;

    public bdrf(dzsj<cqhn> dzsjVar) {
        a(dzsjVar);
        this.a = dzsjVar;
    }

    public static <T> void a(T t) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
