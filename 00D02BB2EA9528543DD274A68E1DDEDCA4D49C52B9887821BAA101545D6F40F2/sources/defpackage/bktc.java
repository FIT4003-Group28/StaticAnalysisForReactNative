package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bktc  reason: default package */
/* loaded from: classes3.dex */
public class bktc {
    private final dzsj<Activity> a;
    private final dzsj<bljv> b;
    private final dzsj<btvo> c;

    public bktc(dzsj<Activity> dzsjVar, dzsj<bljv> dzsjVar2, dzsj<btvo> dzsjVar3) {
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

    public final bktb a(ilo iloVar, djck djckVar, bksg bksgVar, ddho ddhoVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        bljv a = this.b.a();
        b(a, 2);
        btvo a2 = this.c.a();
        b(a2, 3);
        b(iloVar, 4);
        b(djckVar, 5);
        b(bksgVar, 6);
        b(ddhoVar, 8);
        return new bktb(activity, a, a2, iloVar, djckVar, bksgVar, true, ddhoVar);
    }
}
