package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: adxf  reason: default package */
/* loaded from: classes2.dex */
public final class adxf {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;
    private final dzsj<ahjq> c;
    private final dzsj<bvsl> d;
    private final dzsj<dxio<adyg>> e;

    public adxf(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<ahjq> dzsjVar3, dzsj<bvsl> dzsjVar4, dzsj<dxio<adyg>> dzsjVar5) {
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

    public final adxe a(dvyw dvywVar, cjtd cjtdVar, boolean z) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(this.b.a(), 2);
        ahjq a = this.c.a();
        b(a, 3);
        bvsl a2 = this.d.a();
        b(a2, 4);
        dxio a3 = ((dxjh) this.e).a();
        b(a3, 5);
        b(dvywVar, 6);
        b(cjtdVar, 7);
        return new adxe(activity, a, a2, a3, dvywVar, cjtdVar, z);
    }
}
