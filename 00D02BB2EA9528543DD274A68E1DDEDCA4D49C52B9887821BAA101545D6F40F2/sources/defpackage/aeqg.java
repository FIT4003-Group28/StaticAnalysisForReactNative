package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aeqg  reason: default package */
/* loaded from: classes2.dex */
public final class aeqg {
    private final dzsj<Activity> a;
    private final dzsj<aeqq> b;

    public aeqg(dzsj<Activity> dzsjVar, dzsj<aeqq> dzsjVar2) {
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

    public final aeqf a(ilo iloVar, @dzsi aeqe aeqeVar, @dzsi ddho ddhoVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        aeqq a = this.b.a();
        b(a, 2);
        b(iloVar, 3);
        return new aeqf(activity, a, iloVar, aeqeVar, ddhoVar);
    }
}
