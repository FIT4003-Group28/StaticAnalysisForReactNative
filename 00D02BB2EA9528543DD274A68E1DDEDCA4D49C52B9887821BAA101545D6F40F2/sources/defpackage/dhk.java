package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dhk  reason: default package */
/* loaded from: classes6.dex */
public final class dhk {
    private final dzsj<Activity> a;
    private final dzsj<bvsl> b;
    private final dzsj<Executor> c;

    public dhk(dzsj<Activity> dzsjVar, dzsj<bvsl> dzsjVar2, dzsj<Executor> dzsjVar3) {
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

    public final dhj a() {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        bvsl a = this.b.a();
        b(a, 2);
        Executor a2 = this.c.a();
        b(a2, 3);
        return new dhj(activity, a, a2);
    }
}
