package defpackage;
/* compiled from: PG */
/* renamed from: adwv  reason: default package */
/* loaded from: classes2.dex */
public final class adwv {
    private final dzsj<cqhn> a;

    public adwv(dzsj<cqhn> dzsjVar) {
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

    public final adwu a(axne axneVar) {
        cqhn a = this.a.a();
        b(a, 1);
        b(axneVar, 2);
        return new adwu(a, axneVar);
    }
}
