package defpackage;
/* compiled from: PG */
/* renamed from: bzds  reason: default package */
/* loaded from: classes4.dex */
public final class bzds {
    private final dzsj<bzfm> a;
    private final dzsj<bzej> b;

    public bzds(dzsj<bzfm> dzsjVar, dzsj<bzej> dzsjVar2) {
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

    public final bzdr a(dbsz<bzek> dbszVar, bzdg bzdgVar) {
        b(dbszVar, 1);
        b(bzdgVar, 2);
        bzfm a = this.a.a();
        b(a, 3);
        bzej a2 = this.b.a();
        b(a2, 4);
        return new bzdr(dbszVar, bzdgVar, a, a2);
    }
}
