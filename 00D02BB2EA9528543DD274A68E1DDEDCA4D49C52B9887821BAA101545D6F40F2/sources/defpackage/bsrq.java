package defpackage;
/* compiled from: PG */
/* renamed from: bsrq  reason: default package */
/* loaded from: classes4.dex */
public final class bsrq {
    private final dzsj<cqhn> a;
    private final dzsj<bsri> b;

    public bsrq(dzsj<cqhn> dzsjVar, dzsj<bsri> dzsjVar2) {
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

    public final bsrp a(String str) {
        b(this.a.a(), 1);
        bsri a = this.b.a();
        b(a, 2);
        b(str, 3);
        return new bsrp(a, str);
    }
}
