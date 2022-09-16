package defpackage;
/* compiled from: PG */
/* renamed from: bckz  reason: default package */
/* loaded from: classes3.dex */
public final class bckz {
    private final dzsj<cqhu> a;

    public bckz(dzsj<cqhu> dzsjVar) {
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

    public final bcky a(cqjg cqjgVar, bckx bckxVar) {
        b(cqjgVar, 1);
        b(bckxVar, 2);
        b(this.a.a(), 3);
        return new bcky(cqjgVar, bckxVar);
    }
}
