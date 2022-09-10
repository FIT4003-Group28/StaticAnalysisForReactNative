package defpackage;
/* compiled from: PG */
/* renamed from: sqz  reason: default package */
/* loaded from: classes7.dex */
public final class sqz {
    private final dzsj<gga> a;
    private final dzsj<dxio<qbt>> b;

    public sqz(dzsj<gga> dzsjVar, dzsj<dxio<qbt>> dzsjVar2) {
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

    public final sqy a(boolean z, boolean z2) {
        gga a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        return new sqy(a, a2, z, z2);
    }
}
