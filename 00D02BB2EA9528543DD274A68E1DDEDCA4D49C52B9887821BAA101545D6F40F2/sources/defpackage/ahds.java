package defpackage;
/* compiled from: PG */
/* renamed from: ahds  reason: default package */
/* loaded from: classes2.dex */
public final class ahds {
    private final dzsj<gga> a;
    private final dzsj<ahfo> b;
    private final dzsj<dxio<afha>> c;

    public ahds(dzsj<gga> dzsjVar, dzsj<ahfo> dzsjVar2, dzsj<dxio<afha>> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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

    public final ahdr a(dlbw dlbwVar, dspd dspdVar, boolean z, boolean z2, ddzg ddzgVar) {
        gga a = this.a.a();
        b(a, 1);
        ahfo a2 = this.b.a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        b(dlbwVar, 4);
        b(dspdVar, 5);
        b(ddzgVar, 9);
        return new ahdr(a, a2, a3, dlbwVar, dspdVar, z, z2, 0, ddzgVar);
    }
}
