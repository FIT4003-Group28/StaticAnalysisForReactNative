package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bmef  reason: default package */
/* loaded from: classes3.dex */
public class bmef {
    private final dzsj<Activity> a;

    public bmef(dzsj<Activity> dzsjVar) {
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

    public final bmee a(ilo iloVar, begh beghVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(iloVar, 2);
        b(beghVar, 3);
        return new bmee(activity, iloVar, beghVar);
    }
}
