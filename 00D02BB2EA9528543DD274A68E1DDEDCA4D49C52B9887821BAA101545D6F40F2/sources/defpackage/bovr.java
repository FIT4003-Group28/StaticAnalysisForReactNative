package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bovr  reason: default package */
/* loaded from: classes3.dex */
public final class bovr {
    private final dzsj<bvrb> a;
    private final dzsj<acwo> b;
    private final dzsj<Activity> c;
    private final dzsj<bbul> d;
    private final dzsj<akfa> e;
    private final dzsj<bbtk> f;

    public bovr(dzsj<bvrb> dzsjVar, dzsj<acwo> dzsjVar2, dzsj<Activity> dzsjVar3, dzsj<bbul> dzsjVar4, dzsj<akfa> dzsjVar5, dzsj<bbtk> dzsjVar6) {
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

    public final bovn a(bovf bovfVar) {
        bvrb a = this.a.a();
        b(a, 1);
        acwo a2 = this.b.a();
        b(a2, 2);
        Activity activity = (Activity) ((dxjd) this.c).a;
        b(activity, 3);
        bbul a3 = this.d.a();
        b(a3, 4);
        akfa a4 = this.e.a();
        b(a4, 5);
        bbtk a5 = this.f.a();
        b(a5, 6);
        b(bovfVar, 7);
        return new bovn(a, a2, activity, a3, a4, a5, bovfVar);
    }
}
