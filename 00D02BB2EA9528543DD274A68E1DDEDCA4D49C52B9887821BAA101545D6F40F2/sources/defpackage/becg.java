package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: becg  reason: default package */
/* loaded from: classes3.dex */
public final class becg implements brva {
    private final dzsj<Activity> a;
    private final dzsj<dxio<brba>> b;
    private final dzsj<brsc> c;

    public becg(dzsj<Activity> dzsjVar, dzsj<dxio<brba>> dzsjVar2, dzsj<brsc> dzsjVar3) {
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

    @Override // defpackage.brva
    public final /* bridge */ /* synthetic */ brvb a(jba jbaVar, brrx brrxVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        dxio a = ((dxjh) this.b).a();
        b(a, 2);
        brsc a2 = this.c.a();
        b(a2, 3);
        b(jbaVar, 4);
        b(brrxVar, 5);
        return new becf(activity, a, a2, jbaVar, brrxVar);
    }
}
