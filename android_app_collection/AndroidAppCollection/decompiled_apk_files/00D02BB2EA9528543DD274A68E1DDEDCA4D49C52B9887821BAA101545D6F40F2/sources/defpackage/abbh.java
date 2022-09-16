package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: abbh  reason: default package */
/* loaded from: classes2.dex */
public final class abbh {
    private final dzsj<alay> a;
    private final dzsj<akox> b;
    private final dzsj<hwe> c;
    private final dzsj<gll> d;
    private final dzsj<dxio<akzh>> e;
    private final dzsj<btrm> f;
    private final dzsj<Resources> g;
    private final dzsj<bvrb> h;
    private final dzsj<abba> i;

    public abbh(dzsj<alay> dzsjVar, dzsj<akox> dzsjVar2, dzsj<hwe> dzsjVar3, dzsj<gll> dzsjVar4, dzsj<dxio<akzh>> dzsjVar5, dzsj<btrm> dzsjVar6, dzsj<Resources> dzsjVar7, dzsj<bvrb> dzsjVar8, dzsj<abba> dzsjVar9) {
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

    public final abbg a(abbe abbeVar, Runnable runnable) {
        b(abbeVar, 1);
        b(runnable, 2);
        alay a = this.a.a();
        b(a, 3);
        akox a2 = this.b.a();
        b(a2, 4);
        hwe a3 = this.c.a();
        b(a3, 5);
        gll a4 = this.d.a();
        b(a4, 6);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 7);
        btrm a6 = this.f.a();
        b(a6, 8);
        Resources a7 = this.g.a();
        b(a7, 9);
        bvrb a8 = this.h.a();
        b(a8, 10);
        abba a9 = this.i.a();
        b(a9, 11);
        return new abbg(abbeVar, runnable, a, a2, a3, a4, a5, a6, a7, a8, a9);
    }
}
