package defpackage;
/* compiled from: PG */
/* renamed from: cgaf  reason: default package */
/* loaded from: classes4.dex */
public class cgaf {
    private final dzsj<bmdv> a;
    private final dzsj<cqhn> b;

    public cgaf(dzsj<bmdv> dzsjVar, dzsj<cqhn> dzsjVar2) {
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

    public final cgae a(cfza cfzaVar, ges gesVar) {
        bmdv a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        b(cfzaVar, 3);
        b(gesVar, 4);
        return new cgae(a, a2, cfzaVar, gesVar);
    }
}
