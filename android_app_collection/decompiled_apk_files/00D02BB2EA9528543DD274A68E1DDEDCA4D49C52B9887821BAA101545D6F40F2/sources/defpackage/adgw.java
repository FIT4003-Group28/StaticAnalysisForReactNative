package defpackage;
/* compiled from: PG */
/* renamed from: adgw  reason: default package */
/* loaded from: classes.dex */
public final class adgw {
    private final dzsj<acyr> a;
    private final dzsj<adhf> b;

    public adgw(dzsj<acyr> dzsjVar, dzsj<adhf> dzsjVar2) {
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

    public final adgv a(abse abseVar) {
        acyr a = this.a.a();
        b(a, 1);
        adhf a2 = this.b.a();
        b(a2, 2);
        b(abseVar, 3);
        return new adgv(a, a2, abseVar);
    }
}
