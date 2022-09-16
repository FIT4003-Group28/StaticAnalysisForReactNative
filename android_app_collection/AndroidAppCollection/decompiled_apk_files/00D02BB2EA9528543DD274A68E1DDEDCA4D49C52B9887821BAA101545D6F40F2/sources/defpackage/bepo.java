package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bepo  reason: default package */
/* loaded from: classes3.dex */
public final class bepo {
    private final dzsj<ff> a;
    private final dzsj<apnm> b;
    private final dzsj<cqhn> c;
    private final dzsj<bgyj> d;
    private final dzsj<beib> e;
    private final dzsj<beph> f;
    private final dzsj<bepl> g;
    private final dzsj<axru> h;
    private final dzsj<axrx> i;
    private final dzsj<cjqy> j;
    private final dzsj<Executor> k;

    public bepo(dzsj<ff> dzsjVar, dzsj<apnm> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<bgyj> dzsjVar4, dzsj<beib> dzsjVar5, dzsj<beph> dzsjVar6, dzsj<bepl> dzsjVar7, dzsj<axru> dzsjVar8, dzsj<axrx> dzsjVar9, dzsj<cjqy> dzsjVar10, dzsj<Executor> dzsjVar11) {
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

    public final bepn a(bwrs<bvrt<benb>> bwrsVar, cqkp cqkpVar, bwrs<ilo> bwrsVar2) {
        ff ffVar = (ff) ((dxjd) this.a).a;
        b(ffVar, 1);
        apnm a = this.b.a();
        b(a, 2);
        cqhn a2 = this.c.a();
        b(a2, 3);
        bgyj a3 = this.d.a();
        b(a3, 4);
        beib a4 = this.e.a();
        b(a4, 5);
        beph a5 = this.f.a();
        b(a5, 6);
        bepl a6 = this.g.a();
        b(a6, 7);
        axru a7 = this.h.a();
        b(a7, 8);
        axrx a8 = this.i.a();
        b(a8, 9);
        cjqy a9 = this.j.a();
        b(a9, 10);
        Executor a10 = this.k.a();
        b(a10, 11);
        b(bwrsVar, 12);
        b(cqkpVar, 13);
        b(bwrsVar2, 14);
        return new bepn(ffVar, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, bwrsVar, cqkpVar, bwrsVar2);
    }
}
