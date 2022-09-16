package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ivt  reason: default package */
/* loaded from: classes.dex */
public final class ivt {
    private final dzsj<Activity> a;
    private final dzsj<dxio<qbt>> b;
    private final dzsj<acyp> c;
    private final dzsj<bsvm> d;

    public ivt(dzsj<Activity> dzsjVar, dzsj<dxio<qbt>> dzsjVar2, dzsj<acyp> dzsjVar3, dzsj<bsvm> dzsjVar4) {
        c(dzsjVar, 1);
        this.a = dzsjVar;
        c(dzsjVar2, 2);
        this.b = dzsjVar2;
        c(dzsjVar3, 3);
        this.c = dzsjVar3;
        c(dzsjVar4, 4);
        this.d = dzsjVar4;
    }

    private static <T> void c(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final ivs a(gft gftVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        c(activity, 1);
        dxio a = ((dxjh) this.b).a();
        c(a, 2);
        acyp a2 = this.c.a();
        c(a2, 3);
        c(gftVar, 4);
        bsvm a3 = this.d.a();
        c(a3, 5);
        return new ivs(activity, a, a2, gftVar, a3);
    }

    public final ivs b(gft gftVar, @dzsi qcz qczVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        c(activity, 1);
        dxio a = ((dxjh) this.b).a();
        c(a, 2);
        acyp a2 = this.c.a();
        c(a2, 3);
        c(gftVar, 4);
        bsvm a3 = this.d.a();
        c(a3, 6);
        return new ivs(activity, a, a2, gftVar, qczVar, a3);
    }
}
