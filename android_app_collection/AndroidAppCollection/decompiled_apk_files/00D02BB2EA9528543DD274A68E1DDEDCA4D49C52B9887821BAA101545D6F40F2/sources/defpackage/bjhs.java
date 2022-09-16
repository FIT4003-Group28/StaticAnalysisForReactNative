package defpackage;
/* compiled from: PG */
/* renamed from: bjhs  reason: default package */
/* loaded from: classes3.dex */
public final class bjhs {
    private final dzsj<bveo> a;

    public bjhs(dzsj<bveo> dzsjVar) {
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

    public final bjhr a(bjht bjhtVar) {
        bveo a = this.a.a();
        b(a, 1);
        b(bjhtVar, 2);
        return new bjhr(a, bjhtVar);
    }
}
