package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cdey  reason: default package */
/* loaded from: classes4.dex */
public final class cdey {
    private final dzsj<gga> a;
    private final dzsj<Executor> b;
    private final dzsj<cqhn> c;
    private final dzsj<dxio<cafi>> d;
    private final dzsj<cdfx> e;
    private final dzsj<cdfh> f;
    private final dzsj<cklf> g;
    private final dzsj<btvo> h;
    private final dzsj<bvjj> i;
    private final dzsj<akfa> j;
    private final dzsj<cjqy> k;
    private final dzsj<ckcw> l;
    private final dzsj<aujx> m;
    private final dzsj<buqs> n;
    private final dzsj<chht> o;

    public cdey(dzsj<gga> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<dxio<cafi>> dzsjVar4, dzsj<cdfx> dzsjVar5, dzsj<cdfh> dzsjVar6, dzsj<cklf> dzsjVar7, dzsj<btvo> dzsjVar8, dzsj<bvjj> dzsjVar9, dzsj<akfa> dzsjVar10, dzsj<cjqy> dzsjVar11, dzsj<ckcw> dzsjVar12, dzsj<aujx> dzsjVar13, dzsj<buqs> dzsjVar14, dzsj<chht> dzsjVar15) {
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
        b(dzsjVar14, 14);
        this.n = dzsjVar14;
        b(dzsjVar15, 15);
        this.o = dzsjVar15;
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

    public final cdex a(cdbf cdbfVar, cdbb cdbbVar, cdew cdewVar, Context context, boolean z, cdai cdaiVar) {
        b(cdbfVar, 1);
        b(cdbbVar, 2);
        b(cdewVar, 3);
        b(context, 4);
        b(cdaiVar, 6);
        gga a = this.a.a();
        b(a, 7);
        Executor a2 = this.b.a();
        b(a2, 8);
        cqhn a3 = this.c.a();
        b(a3, 9);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 10);
        cdfx a5 = this.e.a();
        b(a5, 11);
        cdfh a6 = this.f.a();
        b(a6, 12);
        cklf a7 = this.g.a();
        b(a7, 13);
        btvo a8 = this.h.a();
        b(a8, 14);
        bvjj a9 = this.i.a();
        b(a9, 15);
        akfa a10 = this.j.a();
        b(a10, 16);
        cjqy a11 = this.k.a();
        b(a11, 17);
        ckcw a12 = this.l.a();
        b(a12, 18);
        aujx a13 = this.m.a();
        b(a13, 19);
        buqs a14 = this.n.a();
        b(a14, 20);
        chht a15 = this.o.a();
        b(a15, 21);
        return new cdex(cdbfVar, cdbbVar, cdewVar, context, z, cdaiVar, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15);
    }
}
