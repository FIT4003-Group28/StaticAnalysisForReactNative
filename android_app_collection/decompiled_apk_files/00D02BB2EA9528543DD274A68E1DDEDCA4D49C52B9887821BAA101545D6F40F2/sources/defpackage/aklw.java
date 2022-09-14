package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aklw  reason: default package */
/* loaded from: classes2.dex */
public class aklw {
    public final dzsj<Activity> a;
    public final dzsj<akkz> b;
    public final dzsj<aklj> c;
    public final dzsj<eiq> d;
    public final dzsj<dxio<afha>> e;
    private final dzsj<aklj> f;

    public aklw(dzsj<Activity> dzsjVar, dzsj<akkz> dzsjVar2, dzsj<aklj> dzsjVar3, dzsj<eiq> dzsjVar4, dzsj<dxio<afha>> dzsjVar5, dzsj<aklj> dzsjVar6) {
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

    public static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final aklv a(djsd djsdVar, dpwr dpwrVar, @dzsi ddho ddhoVar, int i, dbsg<aaao> dbsgVar) {
        b(djsdVar, 1);
        b(dpwrVar, 2);
        b(dbsgVar, 5);
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 6);
        akkz a = this.b.a();
        b(a, 7);
        aklj a2 = this.f.a();
        b(a2, 8);
        eiq a3 = this.d.a();
        b(a3, 9);
        dxio a4 = ((dxjh) this.e).a();
        b(a4, 10);
        return new aklv(djsdVar, dpwrVar, ddhoVar, i, dbsgVar, activity, a, a2, a3, a4);
    }
}
