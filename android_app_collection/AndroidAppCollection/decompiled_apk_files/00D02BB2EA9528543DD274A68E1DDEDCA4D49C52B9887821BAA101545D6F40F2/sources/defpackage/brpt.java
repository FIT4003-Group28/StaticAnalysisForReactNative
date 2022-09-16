package defpackage;
/* compiled from: PG */
/* renamed from: brpt  reason: default package */
/* loaded from: classes4.dex */
public final class brpt {
    private final dzsj<btvo> a;

    public brpt(dzsj<btvo> dzsjVar) {
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

    public final brps a(brln brlnVar) {
        btvo a = this.a.a();
        b(a, 1);
        b(brlnVar, 2);
        return new brps(a, brlnVar);
    }
}
