package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tmz  reason: default package */
/* loaded from: classes7.dex */
public final class tmz {
    private final dzsj<tna> a;
    private final dzsj<bwpo> b;
    private final dzsj<dxio<bwjz>> c;
    private final dzsj<Activity> d;
    private final dzsj<vxa> e;

    public tmz(dzsj<tna> dzsjVar, dzsj<bwpo> dzsjVar2, dzsj<dxio<bwjz>> dzsjVar3, dzsj<Activity> dzsjVar4, dzsj<vxa> dzsjVar5) {
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

    public final tmy a(tmw tmwVar) {
        tna a = this.a.a();
        b(a, 1);
        bwpo a2 = this.b.a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        Activity activity = (Activity) ((dxjd) this.d).a;
        b(activity, 4);
        vxa a4 = this.e.a();
        b(a4, 5);
        b(tmwVar, 6);
        return new tmy(a, a2, a3, activity, a4, tmwVar);
    }
}
