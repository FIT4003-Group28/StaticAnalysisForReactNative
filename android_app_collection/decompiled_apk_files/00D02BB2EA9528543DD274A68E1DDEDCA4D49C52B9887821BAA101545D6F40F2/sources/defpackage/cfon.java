package defpackage;
/* compiled from: PG */
/* renamed from: cfon  reason: default package */
/* loaded from: classes4.dex */
public class cfon {
    private final dzsj<cqhn> a;

    public cfon(dzsj<cqhn> dzsjVar) {
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

    public final cfom a(dddi dddiVar, dien dienVar, mw<dspd> mwVar) {
        cqhn a = this.a.a();
        b(a, 1);
        b(dddiVar, 2);
        b(dienVar, 3);
        b(mwVar, 4);
        return new cfom(a, dddiVar, dienVar, mwVar);
    }
}
