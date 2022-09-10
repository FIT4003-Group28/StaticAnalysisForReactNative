package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cetx  reason: default package */
/* loaded from: classes4.dex */
public class cetx {
    private final dzsj<Activity> a;
    private final dzsj<chnm> b;
    private final dzsj<cese> c;

    public cetx(dzsj<Activity> dzsjVar, dzsj<chnm> dzsjVar2, dzsj<cese> dzsjVar3) {
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

    public final cetw a() {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        chnm a = this.b.a();
        b(a, 2);
        cese a2 = this.c.a();
        b(a2, 3);
        return new cetw(activity, a, a2);
    }
}
