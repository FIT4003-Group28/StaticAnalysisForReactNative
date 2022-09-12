package defpackage;
/* compiled from: PG */
/* renamed from: pml  reason: default package */
/* loaded from: classes7.dex */
public final class pml {
    private final dzsj<pmi> a;

    public pml(dzsj<pmi> dzsjVar) {
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

    public final pmk a(String str, dqsz dqszVar) {
        pmi a = this.a.a();
        b(a, 1);
        b(str, 2);
        b(dqszVar, 3);
        return new pmk(a, str, dqszVar);
    }
}
