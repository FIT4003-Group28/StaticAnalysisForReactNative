package defpackage;
/* compiled from: PG */
/* renamed from: noh  reason: default package */
/* loaded from: classes7.dex */
public final class noh {
    private final dzsj<ktf> a;

    public noh(dzsj<ktf> dzsjVar) {
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

    public final nog a(noe noeVar, nov novVar) {
        b(noeVar, 1);
        b(novVar, 2);
        ktf a = this.a.a();
        b(a, 3);
        return new nog(noeVar, novVar, a);
    }
}
