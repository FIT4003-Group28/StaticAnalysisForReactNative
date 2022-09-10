package defpackage;
/* compiled from: PG */
/* renamed from: cbea  reason: default package */
/* loaded from: classes.dex */
public class cbea {
    private final dzsj<gga> a;
    private final dzsj<dxio<caym>> b;

    public cbea(dzsj<gga> dzsjVar, dzsj<dxio<caym>> dzsjVar2) {
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

    public final cbdz a(@dzsi ddho ddhoVar, @dzsi ddho ddhoVar2) {
        gga a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        return new cbdz(a, a2, ddhoVar, ddhoVar2);
    }
}
