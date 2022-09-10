package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aurq  reason: default package */
/* loaded from: classes2.dex */
public final class aurq {
    private final dzsj<dxio<afef>> a;
    private final dzsj<dxio<akfa>> b;
    private final dzsj<dxio<afha>> c;
    private final dzsj<dxio<bzmm>> d;
    private final dzsj<auoo> e;
    private final dzsj<auhq> f;
    private final dzsj<cqhn> g;
    private final dzsj<aurg> h;
    private final dzsj<auon> i;
    private final dzsj<Executor> j;
    private final dzsj<akfc> k;
    private final dzsj<ckcw> l;

    public aurq(dzsj<dxio<afef>> dzsjVar, dzsj<dxio<akfa>> dzsjVar2, dzsj<dxio<afha>> dzsjVar3, dzsj<dxio<bzmm>> dzsjVar4, dzsj<auoo> dzsjVar5, dzsj<auhq> dzsjVar6, dzsj<cqhn> dzsjVar7, dzsj<aurg> dzsjVar8, dzsj<auon> dzsjVar9, dzsj<Executor> dzsjVar10, dzsj<akfc> dzsjVar11, dzsj<ckcw> dzsjVar12) {
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

    public final aurp a(Activity activity, ges gesVar) {
        b(activity, 1);
        b(gesVar, 2);
        dxio a = ((dxjh) this.a).a();
        b(a, 3);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 4);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 5);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 6);
        auoo a5 = this.e.a();
        b(a5, 7);
        auhq a6 = this.f.a();
        b(a6, 8);
        cqhn a7 = this.g.a();
        b(a7, 9);
        aurg a8 = this.h.a();
        b(a8, 10);
        auon a9 = this.i.a();
        b(a9, 11);
        Executor a10 = this.j.a();
        b(a10, 12);
        akfc a11 = this.k.a();
        b(a11, 13);
        ckcw a12 = this.l.a();
        b(a12, 14);
        return new aurp(activity, gesVar, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12);
    }
}
