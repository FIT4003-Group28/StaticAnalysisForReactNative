package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: zgg  reason: default package */
/* loaded from: classes7.dex */
public final class zgg implements brva {
    private final dzsj<Activity> a;
    private final dzsj<dxio<qbt>> b;
    private final dzsj<bmom> c;
    private final dzsj<brsc> d;

    public zgg(dzsj<Activity> dzsjVar, dzsj<dxio<qbt>> dzsjVar2, dzsj<bmom> dzsjVar3, dzsj<brsc> dzsjVar4) {
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
        dxio a = ((dxjh) this.b).a();
        b(a, 2);
        bmom a2 = this.c.a();
        b(a2, 3);
        brsc a3 = this.d.a();
        b(a3, 4);
        b(jbaVar, 5);
        b(brrxVar, 6);
        return new zgf(activity, a, a2, a3, jbaVar, brrxVar);
    }
}
