package defpackage;
/* compiled from: PG */
/* renamed from: bcqy  reason: default package */
/* loaded from: classes3.dex */
public final class bcqy {
    private final dzsj<dxio<bbut>> a;

    public bcqy(dzsj<dxio<bbut>> dzsjVar) {
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

    public final bcqx a(ilo iloVar) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        b(iloVar, 2);
        return new bcqx(a, iloVar);
    }
}
