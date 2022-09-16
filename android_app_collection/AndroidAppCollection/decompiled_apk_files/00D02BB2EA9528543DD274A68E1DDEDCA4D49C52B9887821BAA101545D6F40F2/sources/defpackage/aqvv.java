package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aqvv  reason: default package */
/* loaded from: classes2.dex */
public class aqvv {
    private final dzsj<Activity> a;
    private final dzsj<dxio<akfa>> b;
    private final dzsj<dxio<aqbo>> c;
    private final dzsj<dxio<apyu>> d;
    private final dzsj<dehq> e;
    private final dzsj<dehq> f;
    private final dzsj<apzy> g;
    private final dzsj<cqhn> h;
    private final dzsj<aqvx> i;
    private final dzsj<bvjj> j;
    private final dzsj<apyx> k;
    private final dzsj<dxio<apyz>> l;

    public aqvv(dzsj<Activity> dzsjVar, dzsj<dxio<akfa>> dzsjVar2, dzsj<dxio<aqbo>> dzsjVar3, dzsj<dxio<apyu>> dzsjVar4, dzsj<dehq> dzsjVar5, dzsj<dehq> dzsjVar6, dzsj<apzy> dzsjVar7, dzsj<cqhn> dzsjVar8, dzsj<aqvx> dzsjVar9, dzsj<bvjj> dzsjVar10, dzsj<apyx> dzsjVar11, dzsj<dxio<apyz>> dzsjVar12) {
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

    public final aqvu a(String str, ddce ddceVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        dxio a = ((dxjh) this.b).a();
        b(a, 2);
        dxio a2 = ((dxjh) this.c).a();
        b(a2, 3);
        dxio a3 = ((dxjh) this.d).a();
        b(a3, 4);
        dehq a4 = this.e.a();
        b(a4, 5);
        dehq a5 = this.f.a();
        b(a5, 6);
        apzy a6 = this.g.a();
        b(a6, 7);
        cqhn a7 = this.h.a();
        b(a7, 8);
        aqvx a8 = this.i.a();
        b(a8, 9);
        bvjj a9 = this.j.a();
        b(a9, 10);
        apyx a10 = this.k.a();
        b(a10, 11);
        dxio a11 = ((dxjh) this.l).a();
        b(a11, 12);
        b(str, 13);
        b(ddceVar, 14);
        return new aqvu(activity, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, str, ddceVar);
    }
}
