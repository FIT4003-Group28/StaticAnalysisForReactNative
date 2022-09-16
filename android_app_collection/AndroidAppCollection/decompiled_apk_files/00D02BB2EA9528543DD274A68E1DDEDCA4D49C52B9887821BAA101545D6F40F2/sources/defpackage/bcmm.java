package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bcmm  reason: default package */
/* loaded from: classes3.dex */
public final class bcmm {
    private final dzsj<Activity> a;
    private final dzsj<bcld> b;

    public bcmm(dzsj<Activity> dzsjVar, dzsj<bcld> dzsjVar2) {
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

    public final bcml a(bcli bcliVar, bcku bckuVar, bckr bckrVar, dweu dweuVar, @dzsi ilo iloVar) {
        b(bcliVar, 1);
        b(bckuVar, 2);
        b(bckrVar, 3);
        b(dweuVar, 4);
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 6);
        bcld a = this.b.a();
        b(a, 7);
        return new bcml(bcliVar, bckuVar, bckrVar, dweuVar, iloVar, activity, a);
    }
}
