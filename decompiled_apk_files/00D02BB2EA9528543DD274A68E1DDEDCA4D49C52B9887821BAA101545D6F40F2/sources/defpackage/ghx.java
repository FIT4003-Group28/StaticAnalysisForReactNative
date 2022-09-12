package defpackage;
/* compiled from: PG */
/* renamed from: ghx  reason: default package */
/* loaded from: classes6.dex */
public final class ghx {
    private final dzsj<cjqy> a;

    public ghx(dzsj<cjqy> dzsjVar) {
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

    public final ghw a(ghu ghuVar, boolean z) {
        cjqy a = this.a.a();
        b(a, 1);
        b(ghuVar, 2);
        return new ghw(a, ghuVar, z);
    }
}
