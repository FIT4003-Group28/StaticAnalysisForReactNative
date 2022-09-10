package defpackage;
/* compiled from: PG */
/* renamed from: anbo  reason: default package */
/* loaded from: classes2.dex */
public final class anbo {
    private final dzsj<gga> a;
    private final dzsj<btvo> b;
    private final dzsj<dxio<aksn>> c;
    private final dzsj<dxio<akvz>> d;
    private final dzsj<dxio<akty>> e;
    private final dzsj<dxio<akzh>> f;

    public anbo(dzsj<gga> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<dxio<aksn>> dzsjVar3, dzsj<dxio<akvz>> dzsjVar4, dzsj<dxio<akty>> dzsjVar5, dzsj<dxio<akzh>> dzsjVar6) {
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

    public final anbn a(dfoe dfoeVar) {
        gga a = this.a.a();
        b(a, 1);
        btvo a2 = this.b.a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 5);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 6);
        b(dfoeVar, 7);
        return new anbn(a, a2, a3, a4, a5, a6, dfoeVar);
    }
}
