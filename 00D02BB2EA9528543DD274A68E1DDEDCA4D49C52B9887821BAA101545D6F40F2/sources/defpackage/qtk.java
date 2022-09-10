package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: qtk  reason: default package */
/* loaded from: classes7.dex */
public final class qtk implements qus {
    private final dzsj<Executor> a;
    private final dzsj<aedv> b;
    private final dzsj<cqkj> c;
    private final dzsj<qsw> d;
    private final dzsj<qtx> e;
    private final dzsj<dxio<cqhn>> f;
    private final dzsj<btrm> g;
    private final dzsj<btvo> h;
    private final dzsj<qxa> i;
    private final dzsj<acyp> j;
    private final dzsj<rbp> k;

    public qtk(dzsj<Executor> dzsjVar, dzsj<aedv> dzsjVar2, dzsj<cqkj> dzsjVar3, dzsj<qsw> dzsjVar4, dzsj<qtx> dzsjVar5, dzsj<dxio<cqhn>> dzsjVar6, dzsj<btrm> dzsjVar7, dzsj<btvo> dzsjVar8, dzsj<qxa> dzsjVar9, dzsj<acyp> dzsjVar10, dzsj<rbp> dzsjVar11) {
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
        b(dzsjVar11, 11);
        this.k = dzsjVar11;
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

    @Override // defpackage.qus
    public final /* bridge */ /* synthetic */ qut a(qur qurVar, @dzsi Runnable runnable) {
        Executor a = this.a.a();
        b(a, 1);
        aedv a2 = this.b.a();
        b(a2, 2);
        cqkj a3 = this.c.a();
        b(a3, 3);
        qsw a4 = this.d.a();
        b(a4, 4);
        qtx a5 = this.e.a();
        b(a5, 5);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 6);
        btrm a7 = this.g.a();
        b(a7, 7);
        btvo a8 = this.h.a();
        b(a8, 8);
        qxa a9 = this.i.a();
        b(a9, 9);
        acyp a10 = this.j.a();
        b(a10, 10);
        rbp a11 = this.k.a();
        b(a11, 11);
        b(qurVar, 12);
        return new qtj(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, qurVar, runnable);
    }
}
