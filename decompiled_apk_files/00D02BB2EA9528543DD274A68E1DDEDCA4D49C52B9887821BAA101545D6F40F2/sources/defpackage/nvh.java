package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: nvh  reason: default package */
/* loaded from: classes7.dex */
public class nvh {
    private final dzsj<Activity> a;
    private final dzsj<cjzo> b;
    private final dzsj<cjqy> c;
    private final dzsj<btrm> d;
    private final dzsj<nut> e;
    private final dzsj<qbt> f;

    public nvh(dzsj<Activity> dzsjVar, dzsj<cjzo> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<btrm> dzsjVar4, dzsj<nut> dzsjVar5, dzsj<qbt> dzsjVar6) {
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

    public final nvg a(nxl nxlVar, @dzsi nxa nxaVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cjzo a = this.b.a();
        b(a, 2);
        cjqy a2 = this.c.a();
        b(a2, 3);
        btrm a3 = this.d.a();
        b(a3, 4);
        dzsj<nut> dzsjVar = this.e;
        dzsj<qbt> dzsjVar2 = this.f;
        b(nxlVar, 7);
        return new nvg(activity, a, a2, a3, dzsjVar, dzsjVar2, nxlVar, null, nxaVar);
    }
}
