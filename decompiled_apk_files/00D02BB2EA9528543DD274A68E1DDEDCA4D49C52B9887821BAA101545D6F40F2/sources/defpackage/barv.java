package defpackage;
/* compiled from: PG */
/* renamed from: barv  reason: default package */
/* loaded from: classes3.dex */
public final class barv {
    private final dzsj<gga> a;
    private final dzsj<cqhn> b;
    private final dzsj<axwq> c;
    private final dzsj<axwy> d;
    private final dzsj<afzv> e;
    private final dzsj<dxio<akfa>> f;

    public barv(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<axwq> dzsjVar3, dzsj<axwy> dzsjVar4, dzsj<afzv> dzsjVar5, dzsj<dxio<akfa>> dzsjVar6) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
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

    public final baru a() {
        gga a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        axwq a3 = this.c.a();
        b(a3, 3);
        axwy a4 = this.d.a();
        b(a4, 4);
        afzv a5 = this.e.a();
        b(a5, 5);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 6);
        return new baru(a, a2, a3, a4, a5, a6);
    }
}
