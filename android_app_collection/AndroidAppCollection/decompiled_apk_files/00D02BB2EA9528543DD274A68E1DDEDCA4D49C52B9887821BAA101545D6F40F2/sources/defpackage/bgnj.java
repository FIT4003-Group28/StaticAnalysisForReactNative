package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bgnj  reason: default package */
/* loaded from: classes3.dex */
public class bgnj {
    private final dzsj<Activity> a;
    private final dzsj<cbze> b;
    private final dzsj<dxio<cbzd>> c;
    private final dzsj<cjqy> d;

    public bgnj(dzsj<Activity> dzsjVar, dzsj<cbze> dzsjVar2, dzsj<dxio<cbzd>> dzsjVar3, dzsj<cjqy> dzsjVar4) {
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

    public final bgni a(dipk dipkVar, cjtd cjtdVar, cjtd cjtdVar2) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cbze a = this.b.a();
        b(a, 2);
        dxio a2 = ((dxjh) this.c).a();
        b(a2, 3);
        cjqy a3 = this.d.a();
        b(a3, 4);
        b(dipkVar, 5);
        b(cjtdVar, 6);
        b(cjtdVar2, 7);
        return new bgni(activity, a, a2, a3, dipkVar, cjtdVar, cjtdVar2);
    }
}
