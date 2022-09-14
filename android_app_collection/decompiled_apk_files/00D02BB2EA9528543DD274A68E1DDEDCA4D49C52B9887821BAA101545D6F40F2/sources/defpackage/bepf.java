package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bepf  reason: default package */
/* loaded from: classes3.dex */
public final class bepf {
    private final dzsj<ff> a;
    private final dzsj<cqat> b;
    private final dzsj<cqhn> c;
    private final dzsj<bgyj> d;
    private final dzsj<beic> e;
    private final dzsj<bepq> f;
    private final dzsj<bgzb> g;
    private final dzsj<Executor> h;

    public bepf(dzsj<ff> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<bgyj> dzsjVar4, dzsj<beic> dzsjVar5, dzsj<bepq> dzsjVar6, dzsj<bgzb> dzsjVar7, dzsj<Executor> dzsjVar8) {
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

    public final bepe a(cqkp cqkpVar, bwrs<ilo> bwrsVar) {
        ff ffVar = (ff) ((dxjd) this.a).a;
        b(ffVar, 1);
        cqat a = this.b.a();
        b(a, 2);
        cqhn a2 = this.c.a();
        b(a2, 3);
        bgyj a3 = this.d.a();
        b(a3, 4);
        beic a4 = this.e.a();
        b(a4, 5);
        bepq a5 = this.f.a();
        b(a5, 6);
        bgzb a6 = this.g.a();
        b(a6, 7);
        Executor a7 = this.h.a();
        b(a7, 8);
        b(cqkpVar, 9);
        b(bwrsVar, 10);
        return new bepe(ffVar, a, a2, a3, a4, a5, a6, a7, cqkpVar, bwrsVar);
    }
}
