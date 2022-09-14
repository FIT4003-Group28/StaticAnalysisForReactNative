package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: abtz  reason: default package */
/* loaded from: classes.dex */
public final class abtz {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;
    private final dzsj<abfa> c;
    private final dzsj<acyr> d;
    private final dzsj<abus> e;

    public abtz(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<abfa> dzsjVar3, dzsj<acyr> dzsjVar4, dzsj<abus> dzsjVar5) {
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

    public final /* bridge */ /* synthetic */ abkm a(boolean z, ddho ddhoVar, @dzsi acwt acwtVar, absg absgVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(this.b.a(), 2);
        abfa a = this.c.a();
        b(a, 3);
        b(this.d.a(), 4);
        abus a2 = this.e.a();
        b(a2, 5);
        b(ddhoVar, 9);
        b(absgVar, 11);
        return new abty(activity, a, a2, z, ddhoVar, acwtVar, absgVar);
    }
}
