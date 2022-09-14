package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: anqq  reason: default package */
/* loaded from: classes2.dex */
public final class anqq {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;
    private final dzsj<bsvm> c;
    private final dzsj<Executor> d;
    private final dzsj<anqr> e;

    public anqq(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bsvm> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<anqr> dzsjVar5) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
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

    public final anqp a() {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqhn a = this.b.a();
        b(a, 2);
        bsvm a2 = this.c.a();
        b(a2, 3);
        Executor a3 = this.d.a();
        b(a3, 4);
        anqr a4 = this.e.a();
        b(a4, 5);
        return new anqp(activity, a, a2, a3, a4);
    }
}
