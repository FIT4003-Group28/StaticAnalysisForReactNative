package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: bfhu  reason: default package */
/* loaded from: classes3.dex */
public class bfhu {
    private final dzsj<Activity> a;
    private final dzsj<btvo> b;
    private final dzsj<cqhn> c;
    private final dzsj<cqhu> d;
    private final dzsj<bmfg> e;
    private final dzsj<bmgu> f;
    private final dzsj<beya> g;
    private final dzsj<bfcz> h;
    private final dzsj<iqs> i;
    private final dzsj<bwqv> j;
    private final dzsj<bfhx> k;
    private final dzsj<bfha> l;
    private final dzsj<bmef> m;
    private final dzsj<bego> n;
    private final dzsj<bfgq> o;

    public bfhu(dzsj<Activity> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<cqhu> dzsjVar4, dzsj<bmfg> dzsjVar5, dzsj<bmgu> dzsjVar6, dzsj<beya> dzsjVar7, dzsj<bfcz> dzsjVar8, dzsj<iqs> dzsjVar9, dzsj<bwqv> dzsjVar10, dzsj<bfhx> dzsjVar11, dzsj<bfha> dzsjVar12, dzsj<bmef> dzsjVar13, dzsj<bego> dzsjVar14, dzsj<bfgq> dzsjVar15) {
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

    public final bfht a(boolean z, boolean z2, @dzsi View.OnClickListener onClickListener) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 4);
        btvo a = this.b.a();
        b(a, 5);
        cqhn a2 = this.c.a();
        b(a2, 6);
        cqhu a3 = this.d.a();
        b(a3, 7);
        bmfg a4 = this.e.a();
        b(a4, 8);
        bmgu a5 = this.f.a();
        b(a5, 9);
        beya a6 = this.g.a();
        b(a6, 10);
        bfcz a7 = this.h.a();
        b(a7, 11);
        iqs a8 = this.i.a();
        b(a8, 12);
        bwqv a9 = this.j.a();
        b(a9, 13);
        bfhx a10 = this.k.a();
        b(a10, 14);
        bfha a11 = this.l.a();
        b(a11, 15);
        bmef a12 = this.m.a();
        b(a12, 16);
        bego a13 = this.n.a();
        b(a13, 17);
        bfgq a14 = this.o.a();
        b(a14, 18);
        return new bfht(z, z2, onClickListener, activity, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14);
    }
}
