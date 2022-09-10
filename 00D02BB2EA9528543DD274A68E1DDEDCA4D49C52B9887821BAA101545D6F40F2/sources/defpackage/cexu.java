package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cexu  reason: default package */
/* loaded from: classes4.dex */
public class cexu {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;
    private final dzsj<bwqv> c;
    private final dzsj<ahjq> d;
    private final dzsj<akfa> e;
    private final dzsj<akfc> f;
    private final dzsj<bvsl> g;
    private final dzsj<begg> h;
    private final dzsj<axwy> i;
    private final dzsj<axyp> j;

    public cexu(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bwqv> dzsjVar3, dzsj<ahjq> dzsjVar4, dzsj<akfa> dzsjVar5, dzsj<akfc> dzsjVar6, dzsj<bvsl> dzsjVar7, dzsj<begg> dzsjVar8, dzsj<axwy> dzsjVar9, dzsj<axyp> dzsjVar10) {
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

    public final cext a(bwrs<ilo> bwrsVar, bwrs<cdjd> bwrsVar2, @dzsi jay jayVar, boolean z) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqhn a = this.b.a();
        b(a, 2);
        bwqv a2 = this.c.a();
        b(a2, 3);
        ahjq a3 = this.d.a();
        b(a3, 4);
        akfa a4 = this.e.a();
        b(a4, 5);
        akfc a5 = this.f.a();
        b(a5, 6);
        bvsl a6 = this.g.a();
        b(a6, 7);
        begg a7 = this.h.a();
        b(a7, 8);
        axwy a8 = this.i.a();
        b(a8, 9);
        axyp a9 = this.j.a();
        b(a9, 10);
        b(bwrsVar, 11);
        b(bwrsVar2, 12);
        return new cext(activity, a, a2, a3, a4, a5, a6, a7, a8, a9, bwrsVar, bwrsVar2, jayVar, z);
    }
}
