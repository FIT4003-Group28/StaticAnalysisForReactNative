package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cebm  reason: default package */
/* loaded from: classes4.dex */
public class cebm {
    private final dzsj<Activity> a;
    private final dzsj<cebk> b;
    private final dzsj<bbtu> c;

    public cebm(dzsj<Activity> dzsjVar, dzsj<cebk> dzsjVar2, dzsj<bbtu> dzsjVar3) {
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

    public final cebl a(bwrs<ilo> bwrsVar, cdjd cdjdVar, cebe cebeVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cebk a = this.b.a();
        b(a, 2);
        bbtu a2 = this.c.a();
        b(a2, 3);
        b(bwrsVar, 4);
        b(cdjdVar, 5);
        b(cebeVar, 6);
        return new cebl(activity, a, a2, bwrsVar, cdjdVar, cebeVar);
    }
}
