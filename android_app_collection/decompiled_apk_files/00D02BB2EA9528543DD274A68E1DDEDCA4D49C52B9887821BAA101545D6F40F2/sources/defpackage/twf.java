package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: twf  reason: default package */
/* loaded from: classes7.dex */
public class twf {
    private final dzsj<Activity> a;
    private final dzsj<twt> b;
    private final dzsj<twv> c;
    private final dzsj<twr> d;

    public twf(dzsj<Activity> dzsjVar, dzsj<twt> dzsjVar2, dzsj<twv> dzsjVar3, dzsj<twr> dzsjVar4) {
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

    public final twe a(tlv tlvVar, amve amveVar, boolean z) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        twt a = this.b.a();
        b(a, 2);
        twv a2 = this.c.a();
        b(a2, 3);
        twr a3 = this.d.a();
        b(a3, 4);
        b(tlvVar, 5);
        b(amveVar, 6);
        return new twe(activity, a, a2, a3, tlvVar, amveVar, z);
    }
}
