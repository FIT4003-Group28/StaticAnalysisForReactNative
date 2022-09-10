package defpackage;
/* compiled from: PG */
/* renamed from: bzdn  reason: default package */
/* loaded from: classes4.dex */
public final class bzdn {
    private final dzsj<amub> a;

    public bzdn(dzsj<amub> dzsjVar) {
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

    public final bzdm a(dbsz<bzek> dbszVar, bzdg bzdgVar) {
        b((amub) ((dxjd) this.a).a, 1);
        b(dbszVar, 2);
        b(bzdgVar, 3);
        return new bzdm(dbszVar, bzdgVar);
    }
}
