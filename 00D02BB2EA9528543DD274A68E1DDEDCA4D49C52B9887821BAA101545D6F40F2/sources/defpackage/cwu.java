package defpackage;

import android.app.Activity;
import android.app.Application;
/* compiled from: PG */
/* renamed from: cwu  reason: default package */
/* loaded from: classes5.dex */
public final class cwu {
    private final dzsj<Application> a;
    private final dzsj<Activity> b;
    private final dzsj<btvo> c;
    private final dzsj<cyt> d;
    private final dzsj<cwy> e;
    private final dzsj<dxio<afha>> f;

    public cwu(dzsj<Application> dzsjVar, dzsj<Activity> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<cyt> dzsjVar4, dzsj<cwy> dzsjVar5, dzsj<dxio<afha>> dzsjVar6) {
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

    public final cwt a(cws cwsVar) {
        b(cwsVar, 1);
        Application a = this.a.a();
        b(a, 2);
        Activity activity = (Activity) ((dxjd) this.b).a;
        b(activity, 3);
        btvo a2 = this.c.a();
        b(a2, 4);
        cyt a3 = this.d.a();
        b(a3, 5);
        cwy a4 = this.e.a();
        b(a4, 6);
        dxio a5 = ((dxjh) this.f).a();
        b(a5, 7);
        return new cwt(cwsVar, a, activity, a2, a3, a4, a5);
    }
}
