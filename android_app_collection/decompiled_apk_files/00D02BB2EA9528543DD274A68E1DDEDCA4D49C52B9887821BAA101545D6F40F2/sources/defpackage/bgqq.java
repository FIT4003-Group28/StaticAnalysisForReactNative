package defpackage;
/* compiled from: PG */
/* renamed from: bgqq  reason: default package */
/* loaded from: classes3.dex */
public final class bgqq {
    private final dzsj<dxio<akla>> a;

    public bgqq(dzsj<dxio<akla>> dzsjVar) {
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

    public final bgqp a(dpwr dpwrVar) {
        b(dpwrVar, 1);
        dxio a = ((dxjh) this.a).a();
        b(a, 2);
        return new bgqp(dpwrVar, a);
    }
}
