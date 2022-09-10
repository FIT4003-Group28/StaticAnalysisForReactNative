package defpackage;
/* compiled from: PG */
/* renamed from: trj  reason: default package */
/* loaded from: classes7.dex */
public final class trj {
    private final dzsj<cqhn> a;

    public trj(dzsj<cqhn> dzsjVar) {
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

    public final <T> tri<T> a(T t, boolean z, CharSequence charSequence, @dzsi CharSequence charSequence2, @dzsi cqtd cqtdVar, @dzsi cjtd cjtdVar, @dzsi trh<T> trhVar) {
        cqhn a = this.a.a();
        b(a, 1);
        b(t, 2);
        b(charSequence, 4);
        return new tri<>(a, t, z, charSequence, charSequence2, cqtdVar, cjtdVar, trhVar);
    }
}
