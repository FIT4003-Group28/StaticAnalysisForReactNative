package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: kss  reason: default package */
/* loaded from: classes7.dex */
public final class kss {
    private final dzsj<Application> a;
    private final dzsj<btrm> b;
    private final dzsj<cqat> c;
    private final dzsj<bvjj> d;
    private final dzsj<bvrb> e;
    private final dzsj<srv> f;
    private final dzsj<btvo> g;
    private final dzsj<dxio<bvsf>> h;
    private final dzsj<vvb> i;
    private final dzsj<vva> j;
    private final dzsj<klz> k;
    private final dzsj<jzn> l;
    private final dzsj<kma> m;

    public kss(dzsj<Application> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<cqat> dzsjVar3, dzsj<bvjj> dzsjVar4, dzsj<bvrb> dzsjVar5, dzsj<srv> dzsjVar6, dzsj<btvo> dzsjVar7, dzsj<dxio<bvsf>> dzsjVar8, dzsj<vvb> dzsjVar9, dzsj<vva> dzsjVar10, dzsj<klz> dzsjVar11, dzsj<jzn> dzsjVar12, dzsj<kma> dzsjVar13) {
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
        b(dzsjVar12, 12);
        this.l = dzsjVar12;
        b(dzsjVar13, 13);
        this.m = dzsjVar13;
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

    public final ksr a(@dzsi akox akoxVar, vxo vxoVar, int i) {
        Application a = this.a.a();
        b(a, 1);
        btrm a2 = this.b.a();
        b(a2, 2);
        cqat a3 = this.c.a();
        b(a3, 3);
        bvjj a4 = this.d.a();
        b(a4, 4);
        bvrb a5 = this.e.a();
        b(a5, 5);
        dzsj<srv> dzsjVar = this.f;
        btvo a6 = this.g.a();
        b(a6, 8);
        dxio a7 = ((dxjh) this.h).a();
        b(a7, 9);
        b(vxoVar, 10);
        vvb a8 = this.i.a();
        b(a8, 11);
        vva a9 = this.j.a();
        b(a9, 12);
        klz a10 = this.k.a();
        b(a10, 13);
        jzn a11 = this.l.a();
        b(a11, 14);
        kma a12 = this.m.a();
        b(a12, 15);
        return new ksr(a, a2, a3, a4, a5, akoxVar, dzsjVar, a6, a7, vxoVar, a8, a9, a10, a11, a12, i);
    }
}
