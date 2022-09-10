package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bgpc  reason: default package */
/* loaded from: classes3.dex */
public class bgpc {
    private final dzsj<Activity> a;

    public bgpc(dzsj<Activity> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
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

    public final bgpb a(dipk dipkVar, diov diovVar, int i) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(dipkVar, 2);
        b(diovVar, 3);
        return new bgpb(activity, dipkVar, diovVar, i);
    }
}
