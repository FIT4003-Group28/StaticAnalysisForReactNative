package defpackage;
/* compiled from: PG */
/* renamed from: adgs  reason: default package */
/* loaded from: classes.dex */
public final class adgs {
    private final dzsj<aejb> a;
    private final dzsj<acwt> b;

    public adgs(dzsj<aejb> dzsjVar, dzsj<acwt> dzsjVar2) {
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

    public final adgr a(absg absgVar) {
        aejb a = this.a.a();
        b(a, 1);
        acwt a2 = this.b.a();
        b(a2, 2);
        b(absgVar, 3);
        return new adgr(a, a2, absgVar);
    }
}
