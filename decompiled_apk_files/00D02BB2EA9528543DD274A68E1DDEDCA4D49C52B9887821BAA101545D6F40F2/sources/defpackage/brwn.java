package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: brwn  reason: default package */
/* loaded from: classes4.dex */
public final class brwn implements brva {
    private final dzsj<Activity> a;
    private final dzsj<brsc> b;

    public brwn(dzsj<Activity> dzsjVar, dzsj<brsc> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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
        b(jbaVar, 3);
        b(brrxVar, 4);
        return new brwm(activity, a, jbaVar, brrxVar);
    }
}
