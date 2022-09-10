package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bfct  reason: default package */
/* loaded from: classes3.dex */
public final class bfct {
    private final dzsj<gga> a;
    private final dzsj<btvo> b;
    private final dzsj<cafi> c;
    private final dzsj<Executor> d;
    private final dzsj<beyb> e;
    private final dzsj<bfaq> f;
    private final dzsj<bvjj> g;
    private final dzsj<dxio<bzmm>> h;
    private final dzsj<dxio<cjqq>> i;
    private final dzsj<cqkj> j;

    public bfct(dzsj<gga> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<cafi> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<beyb> dzsjVar5, dzsj<bfaq> dzsjVar6, dzsj<bvjj> dzsjVar7, dzsj<dxio<bzmm>> dzsjVar8, dzsj<dxio<cjqq>> dzsjVar9, dzsj<cqkj> dzsjVar10) {
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

    public final bfcs a(bfbb bfbbVar, bexz bexzVar) {
        gga a = this.a.a();
        b(a, 1);
        b(this.b.a(), 2);
        cafi a2 = this.c.a();
        b(a2, 3);
        Executor a3 = this.d.a();
        b(a3, 4);
        beyb a4 = this.e.a();
        b(a4, 5);
        bfaq a5 = this.f.a();
        b(a5, 6);
        bvjj a6 = this.g.a();
        b(a6, 7);
        dxio a7 = ((dxjh) this.h).a();
        b(a7, 8);
        dxio a8 = ((dxjh) this.i).a();
        b(a8, 9);
        cqkj a9 = this.j.a();
        b(a9, 10);
        b(bfbbVar, 11);
        b(bexzVar, 12);
        return new bfcs(a, a2, a3, a4, a5, a6, a7, a8, a9, bfbbVar, bexzVar);
    }
}
