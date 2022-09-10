package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: caxo  reason: default package */
/* loaded from: classes4.dex */
public final class caxo {
    private final dzsj<cjjj> a;
    private final dzsj<caxn> b;
    private final dzsj<Activity> c;
    private final dzsj<cqkj> d;
    private final dzsj<cklf> e;
    private final dzsj<Executor> f;

    public caxo(dzsj<cjjj> dzsjVar, dzsj<caxn> dzsjVar2, dzsj<Activity> dzsjVar3, dzsj<cqkj> dzsjVar4, dzsj<cklf> dzsjVar5, dzsj<Executor> dzsjVar6) {
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
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
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

    public final caxm a(caxa caxaVar) {
        cjjj a = this.a.a();
        b(a, 1);
        caxn a2 = this.b.a();
        b(a2, 2);
        Activity activity = (Activity) ((dxjd) this.c).a;
        b(activity, 3);
        cqkj a3 = this.d.a();
        b(a3, 4);
        cklf a4 = this.e.a();
        b(a4, 5);
        Executor a5 = this.f.a();
        b(a5, 6);
        b(caxaVar, 7);
        return new caxm(a, a2, activity, a3, a4, a5, caxaVar);
    }
}
