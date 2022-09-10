package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ccsk  reason: default package */
/* loaded from: classes4.dex */
public final class ccsk {
    private final dzsj<Executor> a;
    private final dzsj<bbtk> b;
    private final dzsj<bbul> c;
    private final dzsj<chhr> d;
    private final dzsj<ccrh> e;
    private final dzsj<ccrf> f;
    private final dzsj<akfa> g;
    private final dzsj<ccst> h;
    private final dzsj<ccru> i;
    private final dzsj<cctx> j;

    public ccsk(dzsj<Executor> dzsjVar, dzsj<bbtk> dzsjVar2, dzsj<bbul> dzsjVar3, dzsj<chhr> dzsjVar4, dzsj<ccrh> dzsjVar5, dzsj<ccrf> dzsjVar6, dzsj<akfa> dzsjVar7, dzsj<ccst> dzsjVar8, dzsj<ccru> dzsjVar9, dzsj<cctx> dzsjVar10) {
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
        b(dzsjVar10, 10);
        this.j = dzsjVar10;
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

    public final ccsj a(ccsf ccsfVar) {
        Executor a = this.a.a();
        b(a, 1);
        bbtk a2 = this.b.a();
        b(a2, 2);
        bbul a3 = this.c.a();
        b(a3, 3);
        chhr a4 = this.d.a();
        b(a4, 4);
        ccrh a5 = this.e.a();
        b(a5, 5);
        ccrf a6 = this.f.a();
        b(a6, 6);
        akfa a7 = this.g.a();
        b(a7, 7);
        ccst a8 = this.h.a();
        b(a8, 8);
        ccru a9 = this.i.a();
        b(a9, 9);
        cctx a10 = this.j.a();
        b(a10, 10);
        b(ccsfVar, 11);
        return new ccsj(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, ccsfVar);
    }
}
