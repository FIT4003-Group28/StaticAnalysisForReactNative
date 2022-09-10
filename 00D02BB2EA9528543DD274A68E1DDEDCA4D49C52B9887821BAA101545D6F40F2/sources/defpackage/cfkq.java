package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cfkq  reason: default package */
/* loaded from: classes4.dex */
public class cfkq {
    private final dzsj<cfgm> a;
    private final dzsj<cqhn> b;
    private final dzsj<cqhu> c;
    private final dzsj<dxio<akfa>> d;
    private final dzsj<gga> e;
    private final dzsj<dxio<blpp>> f;
    private final dzsj<cezg> g;
    private final dzsj<Executor> h;
    private final dzsj<cpv> i;

    public cfkq(dzsj<cfgm> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cqhu> dzsjVar3, dzsj<dxio<akfa>> dzsjVar4, dzsj<gga> dzsjVar5, dzsj<dxio<blpp>> dzsjVar6, dzsj<cezg> dzsjVar7, dzsj<Executor> dzsjVar8, dzsj<cpv> dzsjVar9) {
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
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
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

    public final cfkp a(dlny dlnyVar, cfhr cfhrVar, Class<? extends fd> cls) {
        cfgm a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        cqhu a3 = this.c.a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        gga a5 = this.e.a();
        b(a5, 5);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 6);
        cezg a7 = this.g.a();
        b(a7, 7);
        Executor a8 = this.h.a();
        b(a8, 8);
        cpv a9 = this.i.a();
        b(a9, 9);
        b(dlnyVar, 10);
        b(cfhrVar, 11);
        b(cls, 12);
        return new cfkp(a, a2, a3, a4, a5, a6, a7, a8, a9, dlnyVar, cfhrVar, cls);
    }
}
