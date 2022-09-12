package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: apdb  reason: default package */
/* loaded from: classes2.dex */
public class apdb {
    private final dzsj<Activity> a;
    private final dzsj<ahjq> b;
    private final dzsj<bmdv> c;
    private final dzsj<bnjv> d;

    public apdb(dzsj<Activity> dzsjVar, dzsj<ahjq> dzsjVar2, dzsj<bmdv> dzsjVar3, dzsj<bnjv> dzsjVar4) {
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

    public final apda a(aoxt aoxtVar, aoxr aoxrVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        ahjq a = this.b.a();
        b(a, 2);
        bmdv a2 = this.c.a();
        b(a2, 3);
        bnjv a3 = this.d.a();
        b(a3, 4);
        b(aoxtVar, 5);
        b(aoxrVar, 6);
        return new apda(activity, a, a2, a3, aoxtVar, aoxrVar);
    }
}
