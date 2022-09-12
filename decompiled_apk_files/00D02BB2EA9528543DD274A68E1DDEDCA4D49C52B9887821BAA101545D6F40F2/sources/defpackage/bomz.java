package defpackage;
/* compiled from: PG */
/* renamed from: bomz  reason: default package */
/* loaded from: classes3.dex */
public final class bomz {
    private final dzsj<dxio<akzh>> a;
    private final dzsj<dxio<akpm>> b;

    public bomz(dzsj<dxio<akzh>> dzsjVar, dzsj<dxio<akpm>> dzsjVar2) {
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

    public final bomy a(bomx bomxVar) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        b(bomxVar, 3);
        return new bomy(a, a2, bomxVar);
    }
}
