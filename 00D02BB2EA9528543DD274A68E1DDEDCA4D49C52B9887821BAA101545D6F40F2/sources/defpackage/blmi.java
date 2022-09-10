package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: blmi  reason: default package */
/* loaded from: classes3.dex */
public final class blmi {
    private final dzsj<Activity> a;
    private final dzsj<blle> b;
    private final dzsj<btvo> c;
    private final dzsj<bktc> d;
    private final dzsj<dxio<bkpi>> e;
    private final dzsj<blkj> f;
    private final dzsj<bljr> g;

    public blmi(dzsj<Activity> dzsjVar, dzsj<blle> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<bktc> dzsjVar4, dzsj<dxio<bkpi>> dzsjVar5, dzsj<blkj> dzsjVar6, dzsj<bljr> dzsjVar7) {
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

    public final blmh a(boolean z, boolean z2) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        blle a = this.b.a();
        b(a, 2);
        btvo a2 = this.c.a();
        b(a2, 3);
        bktc a3 = this.d.a();
        b(a3, 4);
        dxio a4 = ((dxjh) this.e).a();
        b(a4, 5);
        blkj a5 = this.f.a();
        b(a5, 6);
        bljr a6 = this.g.a();
        b(a6, 7);
        return new blmh(activity, a, a2, a3, a4, a5, a6, z, z2);
    }
}
