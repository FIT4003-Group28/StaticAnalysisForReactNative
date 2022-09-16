package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bhiz  reason: default package */
/* loaded from: classes3.dex */
public class bhiz {
    private final dzsj<Activity> a;
    private final dzsj<bhhf> b;
    private final dzsj<bhiu> c;
    private final dzsj<dxio<bheb>> d;

    public bhiz(dzsj<Activity> dzsjVar, dzsj<bhhf> dzsjVar2, dzsj<bhiu> dzsjVar3, dzsj<dxio<bheb>> dzsjVar4) {
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

    public final bhiy a(boolean z) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 2);
        bhhf a = this.b.a();
        b(a, 3);
        bhiu a2 = this.c.a();
        b(a2, 4);
        dxio a3 = ((dxjh) this.d).a();
        b(a3, 5);
        return new bhiy(z, activity, a, a2, a3);
    }
}
