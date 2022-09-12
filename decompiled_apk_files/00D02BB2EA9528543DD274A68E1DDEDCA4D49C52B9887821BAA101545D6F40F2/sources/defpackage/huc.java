package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: huc  reason: default package */
/* loaded from: classes.dex */
public class huc {
    private final dzsj<cjqy> a;
    private final dzsj<dehq> b;
    private final dzsj<Activity> c;
    private final dzsj<bvpz> d;

    public huc(dzsj<cjqy> dzsjVar, dzsj<dehq> dzsjVar2, dzsj<Activity> dzsjVar3, dzsj<bvpz> dzsjVar4) {
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

    public final hub a(htz htzVar) {
        cjqy a = this.a.a();
        b(a, 1);
        dehq a2 = this.b.a();
        b(a2, 2);
        Activity activity = (Activity) ((dxjd) this.c).a;
        b(activity, 3);
        bvpz a3 = this.d.a();
        b(a3, 4);
        b(htzVar, 5);
        return new hub(a, a2, activity, a3, htzVar);
    }
}
