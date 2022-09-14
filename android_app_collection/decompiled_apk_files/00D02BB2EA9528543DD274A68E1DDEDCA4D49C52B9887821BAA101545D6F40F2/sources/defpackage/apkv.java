package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: apkv  reason: default package */
/* loaded from: classes2.dex */
public final class apkv {
    private final dzsj<Activity> a;
    private final dzsj<jkj> b;
    private final dzsj<cqkj> c;

    public apkv(dzsj<Activity> dzsjVar, dzsj<jkj> dzsjVar2, dzsj<cqkj> dzsjVar3) {
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

    public final apku a(jbk jbkVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        dzsj<jkj> dzsjVar = this.b;
        cqkj a = this.c.a();
        b(a, 3);
        b(jbkVar, 4);
        return new apku(activity, dzsjVar, a, jbkVar);
    }
}
