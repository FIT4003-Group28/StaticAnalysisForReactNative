package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: brbx  reason: default package */
/* loaded from: classes4.dex */
public final class brbx {
    private final dzsj<Activity> a;
    private final dzsj<akpm> b;
    private final dzsj<dxio<akzh>> c;
    private final dzsj<broq> d;
    private final dzsj<cjqy> e;
    private final dzsj<ckcw> f;
    private final dzsj<brbh> g;
    private final dzsj<braw> h;
    private final dzsj<bvjj> i;

    public brbx(dzsj<Activity> dzsjVar, dzsj<akpm> dzsjVar2, dzsj<dxio<akzh>> dzsjVar3, dzsj<broq> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<ckcw> dzsjVar6, dzsj<brbh> dzsjVar7, dzsj<braw> dzsjVar8, dzsj<bvjj> dzsjVar9) {
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

    public final brbw a(bwrs<brln> bwrsVar, bwrs<brlu> bwrsVar2, @dzsi ixr ixrVar, brbo brboVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        akpm a = this.b.a();
        b(a, 2);
        dxio a2 = ((dxjh) this.c).a();
        b(a2, 3);
        broq a3 = this.d.a();
        b(a3, 4);
        cjqy a4 = this.e.a();
        b(a4, 5);
        ckcw a5 = this.f.a();
        b(a5, 6);
        brbh a6 = this.g.a();
        b(a6, 7);
        braw a7 = this.h.a();
        b(a7, 8);
        b(this.i.a(), 9);
        b(bwrsVar, 10);
        b(bwrsVar2, 11);
        b(brboVar, 13);
        return new brbw(activity, a, a2, a3, a4, a5, a6, a7, bwrsVar, bwrsVar2, ixrVar);
    }
}
