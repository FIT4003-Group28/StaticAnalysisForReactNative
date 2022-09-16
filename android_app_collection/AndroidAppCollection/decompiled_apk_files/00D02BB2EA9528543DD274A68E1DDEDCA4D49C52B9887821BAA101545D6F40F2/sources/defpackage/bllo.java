package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bllo  reason: default package */
/* loaded from: classes3.dex */
public class bllo {
    private final dzsj<Activity> a;
    private final dzsj<btvo> b;
    private final dzsj<cebr> c;
    private final dzsj<cqhn> d;
    private final dzsj<dxio<cafi>> e;
    private final dzsj<dxio<cdjj>> f;
    private final dzsj<dxio<aesb>> g;
    private final dzsj<dxio<akfa>> h;
    private final dzsj<dxio<cchz>> i;
    private final dzsj<bqji> j;

    public bllo(dzsj<Activity> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<cebr> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<dxio<cafi>> dzsjVar5, dzsj<dxio<cdjj>> dzsjVar6, dzsj<dxio<aesb>> dzsjVar7, dzsj<dxio<akfa>> dzsjVar8, dzsj<dxio<cchz>> dzsjVar9, dzsj<bqji> dzsjVar10) {
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

    public final blln a(boolean z, cdjk cdjkVar, ddho ddhoVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        btvo a = this.b.a();
        b(a, 2);
        cebr a2 = this.c.a();
        b(a2, 3);
        cqhn a3 = this.d.a();
        b(a3, 4);
        dxio a4 = ((dxjh) this.e).a();
        b(a4, 5);
        dxio a5 = ((dxjh) this.f).a();
        b(a5, 6);
        dxio a6 = ((dxjh) this.g).a();
        b(a6, 7);
        dxio a7 = ((dxjh) this.h).a();
        b(a7, 8);
        dxio a8 = ((dxjh) this.i).a();
        b(a8, 9);
        dzsj<bqji> dzsjVar = this.j;
        b(cdjkVar, 12);
        b(ddhoVar, 13);
        return new blln(activity, a, a2, a3, a4, a5, a6, a7, a8, dzsjVar, z, cdjkVar, ddhoVar);
    }
}
