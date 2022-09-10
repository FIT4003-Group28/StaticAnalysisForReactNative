package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: azbv  reason: default package */
/* loaded from: classes3.dex */
public final class azbv implements brva {
    private final dzsj<Activity> a;
    private final dzsj<brsc> b;
    private final dzsj<axwy> c;
    private final dzsj<axyp> d;

    public azbv(dzsj<Activity> dzsjVar, dzsj<brsc> dzsjVar2, dzsj<axwy> dzsjVar3, dzsj<axyp> dzsjVar4) {
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

    @Override // defpackage.brva
    public final /* bridge */ /* synthetic */ brvb a(jba jbaVar, brrx brrxVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        brsc a = this.b.a();
        b(a, 2);
        dzsj<axwy> dzsjVar = this.c;
        axyp a2 = this.d.a();
        b(a2, 4);
        b(jbaVar, 5);
        b(brrxVar, 6);
        return new azbu(activity, a, dzsjVar, a2, jbaVar, brrxVar);
    }
}
