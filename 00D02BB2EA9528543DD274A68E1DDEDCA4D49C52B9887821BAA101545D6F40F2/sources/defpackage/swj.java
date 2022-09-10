package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: swj  reason: default package */
/* loaded from: classes7.dex */
public final class swj {
    private final dzsj<Activity> a;
    private final dzsj<sve> b;
    private final dzsj<zpy> c;

    public swj(dzsj<Activity> dzsjVar, dzsj<sve> dzsjVar2, dzsj<zpy> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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

    public final swi a(tlv tlvVar, amve amveVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        sve a = this.b.a();
        b(a, 2);
        zpy a2 = this.c.a();
        b(a2, 3);
        b(tlvVar, 4);
        b(amveVar, 5);
        return new swi(activity, a, a2, tlvVar, amveVar);
    }
}
