package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chlt  reason: default package */
/* loaded from: classes4.dex */
public final class chlt {
    private final dzsj<Activity> a;
    private final dzsj<Resources> b;
    private final dzsj<chjb> c;
    private final dzsj<cafi> d;
    private final dzsj<chla> e;
    private final dzsj<chkd> f;
    private final dzsj<bqji> g;
    private final dzsj<cjqy> h;
    private final dzsj<buzm> i;
    private final dzsj<Executor> j;
    private final dzsj<cqre> k;
    private final dzsj<cqhn> l;
    private final dzsj<cqhu> m;
    private final dzsj<dxio<afha>> n;

    public chlt(dzsj<Activity> dzsjVar, dzsj<Resources> dzsjVar2, dzsj<chjb> dzsjVar3, dzsj<cafi> dzsjVar4, dzsj<chla> dzsjVar5, dzsj<chkd> dzsjVar6, dzsj<bqji> dzsjVar7, dzsj<cjqy> dzsjVar8, dzsj<buzm> dzsjVar9, dzsj<Executor> dzsjVar10, dzsj<cqre> dzsjVar11, dzsj<cqhn> dzsjVar12, dzsj<cqhu> dzsjVar13, dzsj<dxio<afha>> dzsjVar14) {
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

    public final chls a(djgl djglVar, chlr chlrVar, ddho ddhoVar, ddho ddhoVar2, @dzsi ilo iloVar, btvo btvoVar) {
        b(djglVar, 1);
        b(chlrVar, 2);
        b(ddhoVar, 3);
        b(ddhoVar2, 4);
        b(btvoVar, 6);
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 7);
        Resources a = this.b.a();
        b(a, 8);
        chjb a2 = this.c.a();
        b(a2, 9);
        cafi a3 = this.d.a();
        b(a3, 10);
        chla a4 = this.e.a();
        b(a4, 11);
        chkd a5 = this.f.a();
        b(a5, 12);
        dzsj<bqji> dzsjVar = this.g;
        cjqy a6 = this.h.a();
        b(a6, 14);
        dzsj<buzm> dzsjVar2 = this.i;
        Executor a7 = this.j.a();
        b(a7, 16);
        cqre a8 = this.k.a();
        b(a8, 17);
        cqhn a9 = this.l.a();
        b(a9, 18);
        cqhu a10 = this.m.a();
        b(a10, 19);
        dxio a11 = ((dxjh) this.n).a();
        b(a11, 20);
        return new chls(djglVar, chlrVar, ddhoVar, ddhoVar2, iloVar, btvoVar, activity, a, a2, a3, a4, a5, dzsjVar, a6, dzsjVar2, a7, a8, a9, a10, a11);
    }
}
