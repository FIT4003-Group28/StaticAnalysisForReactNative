package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bcrm  reason: default package */
/* loaded from: classes3.dex */
public final class bcrm {
    private final dzsj<dxio<akfa>> a;
    private final dzsj<akfc> b;
    private final dzsj<bdfc> c;
    private final dzsj<dxio<bvan>> d;
    private final dzsj<Executor> e;
    private final dzsj<bbuu> f;

    public bcrm(dzsj<dxio<akfa>> dzsjVar, dzsj<akfc> dzsjVar2, dzsj<bdfc> dzsjVar3, dzsj<dxio<bvan>> dzsjVar4, dzsj<Executor> dzsjVar5, dzsj<bbuu> dzsjVar6) {
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

    public final bcrl a(boolean z, gfw gfwVar) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        akfc a2 = this.b.a();
        b(a2, 2);
        bdfc a3 = this.c.a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        Executor a5 = this.e.a();
        b(a5, 5);
        bbuu a6 = this.f.a();
        b(a6, 6);
        b(gfwVar, 8);
        return new bcrl(a, a2, a3, a4, a5, a6, z, gfwVar);
    }
}
