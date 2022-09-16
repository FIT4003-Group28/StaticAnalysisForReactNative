package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bgoq  reason: default package */
/* loaded from: classes3.dex */
public class bgoq {
    private final dzsj<Activity> a;
    private final dzsj<bgng> b;
    private final dzsj<bhhf> c;
    private final dzsj<dxio<apup>> d;
    private final dzsj<dxio<apuq>> e;
    private final dzsj<dxio<bwft>> f;

    public bgoq(dzsj<Activity> dzsjVar, dzsj<bgng> dzsjVar2, dzsj<bhhf> dzsjVar3, dzsj<dxio<apup>> dzsjVar4, dzsj<dxio<apuq>> dzsjVar5, dzsj<dxio<bwft>> dzsjVar6) {
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

    public final bgop a(@dzsi dipk dipkVar, ilo iloVar, int i, bgnk bgnkVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        bgng a = this.b.a();
        b(a, 2);
        bhhf a2 = this.c.a();
        b(a2, 3);
        dxio a3 = ((dxjh) this.d).a();
        b(a3, 4);
        dxio a4 = ((dxjh) this.e).a();
        b(a4, 5);
        dxio a5 = ((dxjh) this.f).a();
        b(a5, 6);
        b(iloVar, 8);
        b(bgnkVar, 10);
        return new bgop(activity, a, a2, a3, a4, a5, dipkVar, iloVar, i, bgnkVar);
    }
}
