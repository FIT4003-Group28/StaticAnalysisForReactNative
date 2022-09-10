package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bgpa  reason: default package */
/* loaded from: classes3.dex */
public class bgpa {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;
    private final dzsj<bmdq> c;
    private final dzsj<bgnj> d;
    private final dzsj<dxio<afha>> e;

    public bgpa(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bmdq> dzsjVar3, dzsj<bgnj> dzsjVar4, dzsj<dxio<afha>> dzsjVar5) {
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

    public final bgoz a(dipk dipkVar, dxio<bvvw> dxioVar, dxio<apyz> dxioVar2, btvo btvoVar, int i, ilo iloVar, bgnk bgnkVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqhn a = this.b.a();
        b(a, 2);
        bmdq a2 = this.c.a();
        b(a2, 3);
        bgnj a3 = this.d.a();
        b(a3, 4);
        dxio a4 = ((dxjh) this.e).a();
        b(a4, 5);
        b(dipkVar, 6);
        b(dxioVar, 8);
        b(dxioVar2, 9);
        b(btvoVar, 10);
        b(iloVar, 12);
        b(bgnkVar, 13);
        return new bgoz(activity, a, a2, a3, a4, dipkVar, true, dxioVar, dxioVar2, btvoVar, i, iloVar, bgnkVar);
    }
}
