package defpackage;
/* compiled from: PG */
/* renamed from: rhz  reason: default package */
/* loaded from: classes7.dex */
public final class rhz {
    private final dzsj<rht> a;
    private final dzsj<rik> b;

    public rhz(dzsj<rht> dzsjVar, dzsj<rik> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final rhy a(dnkn dnknVar) {
        b(this.a.a(), 1);
        rik a = this.b.a();
        b(a, 2);
        b(dnknVar, 3);
        return new rhy(a, dnknVar);
    }
}
