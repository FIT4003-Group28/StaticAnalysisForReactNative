package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: advv  reason: default package */
/* loaded from: classes2.dex */
public final class advv {
    private final dzsj<Activity> a;
    private final dzsj<akzh> b;
    private final dzsj<cchz> c;
    private final dzsj<bqji> d;
    private final dzsj<bbut> e;
    private final dzsj<adyo> f;

    public advv(dzsj<Activity> dzsjVar, dzsj<akzh> dzsjVar2, dzsj<cchz> dzsjVar3, dzsj<bqji> dzsjVar4, dzsj<bbut> dzsjVar5, dzsj<adyo> dzsjVar6) {
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

    public final advu a(btlu btluVar, int i, View.OnAttachStateChangeListener onAttachStateChangeListener) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        akzh a = this.b.a();
        b(a, 2);
        cchz a2 = this.c.a();
        b(a2, 3);
        bqji a3 = this.d.a();
        b(a3, 4);
        bbut a4 = this.e.a();
        b(a4, 5);
        adyo a5 = this.f.a();
        b(a5, 6);
        b(btluVar, 7);
        b(onAttachStateChangeListener, 9);
        return new advu(activity, a, a2, a3, a4, a5, btluVar, i, onAttachStateChangeListener);
    }
}
