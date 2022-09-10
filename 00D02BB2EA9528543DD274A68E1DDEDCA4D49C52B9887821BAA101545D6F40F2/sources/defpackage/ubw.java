package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ubw  reason: default package */
/* loaded from: classes7.dex */
public final class ubw {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;
    private final dzsj<trs> c;
    private final dzsj<tuo> d;

    public ubw(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<trs> dzsjVar3, dzsj<tuo> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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

    public final ubv a(tlv tlvVar, boolean z) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqhn a = this.b.a();
        b(a, 2);
        trs a2 = this.c.a();
        b(a2, 3);
        tuo a3 = this.d.a();
        b(a3, 4);
        b(tlvVar, 5);
        return new ubv(activity, a, a2, a3, tlvVar, z);
    }
}
