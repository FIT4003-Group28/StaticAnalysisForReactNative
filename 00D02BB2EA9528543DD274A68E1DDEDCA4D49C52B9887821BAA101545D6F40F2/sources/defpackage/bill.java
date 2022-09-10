package defpackage;
/* compiled from: PG */
/* renamed from: bill  reason: default package */
/* loaded from: classes3.dex */
public final class bill {
    private final dzsj<biyd> a;

    public bill(dzsj<biyd> dzsjVar) {
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

    public final bilk a(biyb biybVar) {
        biyd a = this.a.a();
        b(a, 1);
        b(biybVar, 2);
        return new bilk(a, biybVar);
    }
}
