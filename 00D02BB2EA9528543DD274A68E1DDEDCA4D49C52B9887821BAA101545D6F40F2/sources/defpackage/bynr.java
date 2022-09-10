package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bynr  reason: default package */
/* loaded from: classes4.dex */
public class bynr {
    private final dzsj<bvsl> a;
    private final dzsj<dxio<byej>> b;
    private final dzsj<dxio<dbsg<afha>>> c;
    private final dzsj<dxio<dbsg<aagc>>> d;
    private final dzsj<dxio<dbsg<akgd>>> e;
    private final dzsj<cjqy> f;
    private final dzsj<cjqq> g;
    private final dzsj<amfi> h;
    private final dzsj<bvgl> i;
    private final dzsj<bvgn> j;
    private final dzsj<cqhn> k;
    private final dzsj<bvrb> l;
    private final dzsj<btvo> m;

    public bynr(dzsj<bvsl> dzsjVar, dzsj<dxio<byej>> dzsjVar2, dzsj<dxio<dbsg<afha>>> dzsjVar3, dzsj<dxio<dbsg<aagc>>> dzsjVar4, dzsj<dxio<dbsg<akgd>>> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<cjqq> dzsjVar7, dzsj<amfi> dzsjVar8, dzsj<bvgl> dzsjVar9, dzsj<bvgn> dzsjVar10, dzsj<cqhn> dzsjVar11, dzsj<bvrb> dzsjVar12, dzsj<btvo> dzsjVar13) {
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

    public final bynq a(byno bynoVar, Context context, amwb amwbVar, boolean z, boolean z2, @dzsi bynm bynmVar, @dzsi bykw bykwVar) {
        bvsl a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 5);
        cjqy a6 = this.f.a();
        b(a6, 6);
        cjqq a7 = this.g.a();
        b(a7, 7);
        amfi a8 = this.h.a();
        b(a8, 8);
        bvgl a9 = this.i.a();
        b(a9, 9);
        bvgn a10 = this.j.a();
        b(a10, 10);
        b(this.k.a(), 11);
        bvrb a11 = this.l.a();
        b(a11, 12);
        btvo a12 = this.m.a();
        b(a12, 13);
        b(bynoVar, 14);
        b(context, 15);
        b(amwbVar, 16);
        return new bynq(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, bynoVar, context, amwbVar, z, z2, bynmVar, bykwVar);
    }
}
