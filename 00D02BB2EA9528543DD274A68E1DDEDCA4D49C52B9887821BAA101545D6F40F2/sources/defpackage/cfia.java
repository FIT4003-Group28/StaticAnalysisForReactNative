package defpackage;
/* compiled from: PG */
/* renamed from: cfia  reason: default package */
/* loaded from: classes4.dex */
public final class cfia {
    private final dzsj<cqhn> a;

    public cfia(dzsj<cqhn> dzsjVar) {
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

    public final cfhz a(dddi dddiVar, dlmh dlmhVar, cfjm cfjmVar) {
        b(this.a.a(), 1);
        b(dddiVar, 2);
        b(dlmhVar, 3);
        b(cfjmVar, 4);
        return new cfhz(dddiVar, dlmhVar, cfjmVar);
    }
}
