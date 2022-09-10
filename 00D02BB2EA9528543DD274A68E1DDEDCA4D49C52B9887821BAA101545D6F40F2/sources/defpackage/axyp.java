package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: axyp  reason: default package */
/* loaded from: classes3.dex */
public class axyp {
    private final dzsj<Activity> a;
    private final dzsj<akfa> b;
    private final dzsj<dxio<axwp>> c;

    public axyp(dzsj<Activity> dzsjVar, dzsj<akfa> dzsjVar2, dzsj<dxio<axwp>> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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

    public final axyo a(ilo iloVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        akfa a = this.b.a();
        b(a, 2);
        dxio a2 = ((dxjh) this.c).a();
        b(a2, 3);
        b(iloVar, 4);
        return new axyo(activity, a, a2, iloVar);
    }
}
