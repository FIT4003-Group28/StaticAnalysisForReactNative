package defpackage;
/* compiled from: PG */
/* renamed from: rik  reason: default package */
/* loaded from: classes7.dex */
public final class rik {
    private final dzsj<rii> a;

    public rik(dzsj<rii> dzsjVar) {
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

    public final rij a(dnli dnliVar) {
        b(this.a.a(), 1);
        b(dnliVar, 2);
        return new rij(dnliVar);
    }
}
