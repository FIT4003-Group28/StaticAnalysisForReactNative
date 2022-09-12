package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tam  reason: default package */
/* loaded from: classes7.dex */
public final class tam {
    private final dzsj<Activity> a;
    private final dzsj<suv> b;
    private final dzsj<vpd> c;

    public tam(dzsj<Activity> dzsjVar, dzsj<suv> dzsjVar2, dzsj<vpd> dzsjVar3) {
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

    public final tal a(tlv tlvVar, amve amveVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        suv a = this.b.a();
        b(a, 2);
        vpd a2 = this.c.a();
        b(a2, 3);
        b(tlvVar, 4);
        b(amveVar, 5);
        return new tal(activity, a, a2, tlvVar, amveVar);
    }
}
