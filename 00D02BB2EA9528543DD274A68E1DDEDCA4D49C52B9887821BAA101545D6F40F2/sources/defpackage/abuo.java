package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: abuo  reason: default package */
/* loaded from: classes.dex */
public final class abuo {
    private final dzsj<Activity> a;
    private final dzsj<dxio<begg>> b;

    public abuo(dzsj<Activity> dzsjVar, dzsj<dxio<begg>> dzsjVar2) {
        c(dzsjVar, 1);
        this.a = dzsjVar;
        c(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final /* bridge */ /* synthetic */ abms a(dvyw dvywVar, @dzsi acwt acwtVar, ddho ddhoVar, @dzsi ddet ddetVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        c(activity, 1);
        dxio a = ((dxjh) this.b).a();
        c(a, 2);
        c(dvywVar, 3);
        c(ddhoVar, 5);
        return new abun(activity, a, dvywVar, acwtVar, ddhoVar, ddetVar);
    }

    public final /* bridge */ /* synthetic */ abms b(dvyw dvywVar, @dzsi acwt acwtVar, ddho ddhoVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        c(activity, 1);
        dxio a = ((dxjh) this.b).a();
        c(a, 2);
        c(dvywVar, 3);
        c(ddhoVar, 5);
        return new abun(activity, a, dvywVar, acwtVar, ddhoVar, null);
    }
}
