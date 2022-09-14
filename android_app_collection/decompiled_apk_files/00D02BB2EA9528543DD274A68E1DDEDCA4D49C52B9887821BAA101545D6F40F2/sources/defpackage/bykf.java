package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bykf  reason: default package */
/* loaded from: classes4.dex */
public final class bykf {
    private final dzsj<Activity> a;
    private final dzsj<bynr> b;
    private final dzsj<bynx> c;
    private final dzsj<akpm> d;
    private final dzsj<dxio<akzh>> e;
    private final dzsj<gll> f;
    private final dzsj<cjqy> g;

    public bykf(dzsj<Activity> dzsjVar, dzsj<bynr> dzsjVar2, dzsj<bynx> dzsjVar3, dzsj<akpm> dzsjVar4, dzsj<dxio<akzh>> dzsjVar5, dzsj<gll> dzsjVar6, dzsj<cjqy> dzsjVar7) {
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

    public final byke a(byny bynyVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        bynr a = this.b.a();
        b(a, 2);
        bynx a2 = this.c.a();
        b(a2, 3);
        akpm a3 = this.d.a();
        b(a3, 4);
        dxio a4 = ((dxjh) this.e).a();
        b(a4, 5);
        gll a5 = this.f.a();
        b(a5, 6);
        cjqy a6 = this.g.a();
        b(a6, 7);
        b(bynyVar, 8);
        return new byke(activity, a, a2, a3, a4, a5, a6, bynyVar);
    }
}
