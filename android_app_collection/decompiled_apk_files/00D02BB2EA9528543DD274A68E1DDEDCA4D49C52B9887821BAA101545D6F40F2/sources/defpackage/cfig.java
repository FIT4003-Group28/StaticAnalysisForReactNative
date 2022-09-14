package defpackage;
/* compiled from: PG */
/* renamed from: cfig  reason: default package */
/* loaded from: classes4.dex */
public class cfig {
    private final dzsj<cqhn> a;

    public cfig(dzsj<cqhn> dzsjVar) {
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

    public final cfif a(dddi dddiVar, dlmr dlmrVar, cfjm cfjmVar) {
        cqhn a = this.a.a();
        b(a, 1);
        b(dddiVar, 2);
        b(dlmrVar, 3);
        b(cfjmVar, 4);
        return new cfif(a, dddiVar, dlmrVar, cfjmVar);
    }
}
