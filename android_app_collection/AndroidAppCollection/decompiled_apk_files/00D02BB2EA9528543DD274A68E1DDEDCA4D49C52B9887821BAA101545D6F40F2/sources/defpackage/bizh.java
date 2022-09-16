package defpackage;
/* compiled from: PG */
/* renamed from: bizh  reason: default package */
/* loaded from: classes3.dex */
public final class bizh {
    private final dzsj<bjhi> a;

    public bizh(dzsj<bjhi> dzsjVar) {
        b(dzsjVar);
        this.a = dzsjVar;
    }

    private static <T> void b(T t) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    public final bizg a() {
        bjhi a = this.a.a();
        b(a);
        return new bizg(a);
    }
}
