package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: twk  reason: default package */
/* loaded from: classes7.dex */
public class twk {
    private final dzsj<Activity> a;
    private final dzsj<suu> b;

    public twk(dzsj<Activity> dzsjVar, dzsj<suu> dzsjVar2) {
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

    public final twj a(tlv tlvVar, amve amveVar, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, boolean z) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        suu a = this.b.a();
        b(a, 2);
        b(tlvVar, 3);
        b(amveVar, 4);
        return new twj(activity, a, tlvVar, amveVar, ddhoVar, ddhoVar2, z);
    }
}
