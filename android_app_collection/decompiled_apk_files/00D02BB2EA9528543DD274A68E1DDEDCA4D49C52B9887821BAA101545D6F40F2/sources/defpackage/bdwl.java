package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bdwl  reason: default package */
/* loaded from: classes3.dex */
public final class bdwl {
    private final dzsj<Activity> a;
    private final dzsj<cqkj> b;
    private final dzsj<jkf> c;
    private final dzsj<glj> d;

    public bdwl(dzsj<Activity> dzsjVar, dzsj<cqkj> dzsjVar2, dzsj<jkf> dzsjVar3, dzsj<glj> dzsjVar4) {
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

    public final /* bridge */ /* synthetic */ begc a(cqss cqssVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqkj a = this.b.a();
        b(a, 2);
        jkf a2 = this.c.a();
        b(a2, 3);
        dzsj<glj> dzsjVar = this.d;
        b(cqssVar, 5);
        return new bdwk(activity, a, a2, dzsjVar, cqssVar);
    }
}
