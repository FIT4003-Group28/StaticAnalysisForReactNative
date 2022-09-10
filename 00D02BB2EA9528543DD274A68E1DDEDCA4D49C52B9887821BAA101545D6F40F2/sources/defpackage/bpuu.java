package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bpuu  reason: default package */
/* loaded from: classes4.dex */
public final class bpuu {
    private final dzsj<bnyo> a;
    private final dzsj<Activity> b;

    public bpuu(dzsj<bnyo> dzsjVar, dzsj<Activity> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final bput a(akqi akqiVar) {
        b(akqiVar, 1);
        bnyo a = this.a.a();
        b(a, 2);
        Activity activity = (Activity) ((dxjd) this.b).a;
        b(activity, 3);
        return new bput(akqiVar, a, activity);
    }
}
