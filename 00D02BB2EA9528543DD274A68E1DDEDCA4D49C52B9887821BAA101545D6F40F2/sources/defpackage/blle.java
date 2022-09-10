package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: blle  reason: default package */
/* loaded from: classes3.dex */
public class blle {
    private final dzsj<Activity> a;
    private final dzsj<btvo> b;
    private final dzsj<dxio<bkpi>> c;
    private final dzsj<blkj> d;

    public blle(dzsj<Activity> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<dxio<bkpi>> dzsjVar3, dzsj<blkj> dzsjVar4) {
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

    public final blld a() {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        btvo a = this.b.a();
        b(a, 2);
        dxio a2 = ((dxjh) this.c).a();
        b(a2, 3);
        blkj a3 = this.d.a();
        b(a3, 4);
        return new blld(activity, a, a2, a3);
    }
}
