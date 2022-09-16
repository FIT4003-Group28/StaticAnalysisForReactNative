package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: auhj  reason: default package */
/* loaded from: classes.dex */
public final class auhj {
    private final dzsj<cjqy> a;
    private final dzsj<Application> b;
    private final dzsj<dxio<akfa>> c;
    private final dzsj<aunx> d;
    private final dzsj<auhz> e;
    private final dzsj<aump> f;
    private final dzsj<auua> g;
    private final dzsj<auui> h;
    private final dzsj<auhi> i;
    private final dzsj<auso> j;
    private final dzsj<btwr> k;
    private final dzsj<auhn> l;

    public auhj(dzsj<cjqy> dzsjVar, dzsj<Application> dzsjVar2, dzsj<dxio<akfa>> dzsjVar3, dzsj<aunx> dzsjVar4, dzsj<auhz> dzsjVar5, dzsj<aump> dzsjVar6, dzsj<auua> dzsjVar7, dzsj<auui> dzsjVar8, dzsj<auhi> dzsjVar9, dzsj<auso> dzsjVar10, dzsj<btwr> dzsjVar11, dzsj<auhn> dzsjVar12) {
        c(dzsjVar, 1);
        this.a = dzsjVar;
        c(dzsjVar2, 2);
        this.b = dzsjVar2;
        c(dzsjVar3, 3);
        this.c = dzsjVar3;
        c(dzsjVar4, 4);
        this.d = dzsjVar4;
        c(dzsjVar5, 5);
        this.e = dzsjVar5;
        c(dzsjVar6, 6);
        this.f = dzsjVar6;
        c(dzsjVar7, 7);
        this.g = dzsjVar7;
        c(dzsjVar8, 8);
        this.h = dzsjVar8;
        c(dzsjVar9, 9);
        this.i = dzsjVar9;
        c(dzsjVar10, 10);
        this.j = dzsjVar10;
        c(dzsjVar11, 11);
        this.k = dzsjVar11;
        c(dzsjVar12, 12);
        this.l = dzsjVar12;
    }

    private static <T> void c(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final augc a(@dzsi String str, @dzsi String str2, int i, @dzsi aujb aujbVar) {
        cjqy a = this.a.a();
        c(a, 1);
        Application a2 = this.b.a();
        c(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        c(a3, 3);
        aunx a4 = this.d.a();
        c(a4, 4);
        auhz a5 = this.e.a();
        c(a5, 5);
        aump a6 = this.f.a();
        c(a6, 6);
        auua a7 = this.g.a();
        c(a7, 7);
        auui a8 = this.h.a();
        c(a8, 8);
        auhi a9 = this.i.a();
        c(a9, 9);
        auso a10 = this.j.a();
        c(a10, 10);
        btwr a11 = this.k.a();
        c(a11, 11);
        auhn a12 = this.l.a();
        c(a12, 12);
        return new augc(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, str, str2, i, aujbVar);
    }

    public final augc b(int i, aujb aujbVar) {
        cjqy a = this.a.a();
        c(a, 1);
        Application a2 = this.b.a();
        c(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        c(a3, 3);
        aunx a4 = this.d.a();
        c(a4, 4);
        auhz a5 = this.e.a();
        c(a5, 5);
        aump a6 = this.f.a();
        c(a6, 6);
        auua a7 = this.g.a();
        c(a7, 7);
        auui a8 = this.h.a();
        c(a8, 8);
        auhi a9 = this.i.a();
        c(a9, 9);
        auso a10 = this.j.a();
        c(a10, 10);
        btwr a11 = this.k.a();
        c(a11, 11);
        auhn a12 = this.l.a();
        c(a12, 12);
        c(aujbVar, 14);
        return new augc(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, i, aujbVar);
    }
}
