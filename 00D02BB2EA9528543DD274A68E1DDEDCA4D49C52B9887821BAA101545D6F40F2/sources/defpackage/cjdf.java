package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cjdf  reason: default package */
/* loaded from: classes4.dex */
public final class cjdf {
    private final dzsj<Activity> a;
    private final dzsj<angp> b;
    private final dzsj<Executor> c;
    private final dzsj<dxio<anhg>> d;
    private final dzsj<dxio<bqji>> e;
    private final dzsj<cjdf> f;
    private final dzsj<dxio<cdjj>> g;

    public cjdf(dzsj<Activity> dzsjVar, dzsj<angp> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<dxio<anhg>> dzsjVar4, dzsj<dxio<bqji>> dzsjVar5, dzsj<cjdf> dzsjVar6, dzsj<dxio<cdjj>> dzsjVar7) {
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
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cjde a(dlif dlifVar, int i, String str, cjdx cjdxVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        angp a = this.b.a();
        b(a, 2);
        Executor a2 = this.c.a();
        b(a2, 3);
        dxio a3 = ((dxjh) this.d).a();
        b(a3, 4);
        dxio a4 = ((dxjh) this.e).a();
        b(a4, 5);
        cjdf a5 = this.f.a();
        b(a5, 6);
        dxio a6 = ((dxjh) this.g).a();
        b(a6, 7);
        b(dlifVar, 8);
        b(str, 10);
        b(cjdxVar, 11);
        return new cjde(activity, a, a2, a3, a4, a5, a6, dlifVar, i, str, cjdxVar);
    }
}
