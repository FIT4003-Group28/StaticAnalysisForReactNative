package defpackage;
/* compiled from: PG */
/* renamed from: bkan  reason: default package */
/* loaded from: classes3.dex */
public class bkan {
    private final dzsj<cqhn> a;

    public bkan(dzsj<cqhn> dzsjVar) {
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

    public final bkam a(dqcq dqcqVar, bkal bkalVar) {
        cqhn a = this.a.a();
        b(a, 1);
        b(dqcqVar, 2);
        b(bkalVar, 4);
        return new bkam(a, dqcqVar, 0, bkalVar);
    }
}
