package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: reu  reason: default package */
/* loaded from: classes7.dex */
public final class reu {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;
    private final dzsj<vtn> c;
    private final dzsj<dxio<qbt>> d;
    private final dzsj<dxio<ascb>> e;
    private final dzsj<bvso> f;
    private final dzsj<isd> g;
    private final dzsj<dxio<axvy>> h;
    private final dzsj<cklf> i;
    private final dzsj<zse> j;
    private final dzsj<btwd> k;
    private final dzsj<btvo> l;
    private final dzsj<vpd> m;

    public reu(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<vtn> dzsjVar3, dzsj<dxio<qbt>> dzsjVar4, dzsj<dxio<ascb>> dzsjVar5, dzsj<bvso> dzsjVar6, dzsj<isd> dzsjVar7, dzsj<dxio<axvy>> dzsjVar8, dzsj<cklf> dzsjVar9, dzsj<zse> dzsjVar10, dzsj<btwd> dzsjVar11, dzsj<btvo> dzsjVar12, dzsj<vpd> dzsjVar13) {
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

    public final ret a(amte amteVar, int i, @dzsi rfm rfmVar, boolean z, boolean z2, long j, @dzsi dqek dqekVar, dbsg<wcn> dbsgVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqhn a = this.b.a();
        b(a, 2);
        vtn a2 = this.c.a();
        b(a2, 3);
        dxio a3 = ((dxjh) this.d).a();
        b(a3, 4);
        dxio a4 = ((dxjh) this.e).a();
        b(a4, 5);
        bvso a5 = this.f.a();
        b(a5, 6);
        isd a6 = this.g.a();
        b(a6, 7);
        dxio a7 = ((dxjh) this.h).a();
        b(a7, 8);
        cklf a8 = this.i.a();
        b(a8, 9);
        zse a9 = this.j.a();
        b(a9, 10);
        btwd a10 = this.k.a();
        b(a10, 11);
        btvo a11 = this.l.a();
        b(a11, 12);
        vpd a12 = this.m.a();
        b(a12, 13);
        b(amteVar, 14);
        b(dbsgVar, 21);
        return new ret(activity, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, amteVar, i, rfmVar, z, z2, j, dqekVar, dbsgVar);
    }
}
