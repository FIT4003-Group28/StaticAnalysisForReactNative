package defpackage;
/* compiled from: PG */
/* renamed from: batc  reason: default package */
/* loaded from: classes3.dex */
public final class batc {
    private final dzsj<gga> a;
    private final dzsj<fd> b;
    private final dzsj<afzv> c;
    private final dzsj<dxio<akfa>> d;

    public batc(dzsj<gga> dzsjVar, dzsj<fd> dzsjVar2, dzsj<afzv> dzsjVar3, dzsj<dxio<akfa>> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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

    public final basz a(axxe axxeVar) {
        gga a = this.a.a();
        b(a, 1);
        fd fdVar = (fd) ((dxjd) this.b).a;
        b(fdVar, 2);
        afzv a2 = this.c.a();
        b(a2, 3);
        dxio a3 = ((dxjh) this.d).a();
        b(a3, 4);
        b(axxeVar, 5);
        return new basz(a, fdVar, a2, a3, axxeVar);
    }
}
