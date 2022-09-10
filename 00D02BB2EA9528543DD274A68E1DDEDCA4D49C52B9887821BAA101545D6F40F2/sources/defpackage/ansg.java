package defpackage;
/* compiled from: PG */
/* renamed from: ansg  reason: default package */
/* loaded from: classes2.dex */
public final class ansg {
    private final dzsj<gga> a;
    private final dzsj<dxio<akfa>> b;
    private final dzsj<dxio<afha>> c;

    public ansg(dzsj<gga> dzsjVar, dzsj<dxio<akfa>> dzsjVar2, dzsj<dxio<afha>> dzsjVar3) {
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

    public final ansf a(ansh anshVar) {
        gga a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        b(anshVar, 4);
        return new ansf(a, a2, a3, anshVar);
    }
}
