package defpackage;
/* compiled from: PG */
/* renamed from: tkr  reason: default package */
/* loaded from: classes7.dex */
public final class tkr implements qgs {
    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    @Override // defpackage.qgs
    public final /* bridge */ /* synthetic */ akvo a(qhu qhuVar, qgv qgvVar) {
        b(qhuVar, 1);
        b(qgvVar, 2);
        return new tkq(qhuVar, qgvVar);
    }
}
