package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: xih  reason: default package */
/* loaded from: classes7.dex */
public final class xih {
    private final dzsj<Application> a;

    public xih(dzsj<Application> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
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

    public final xig a(eapg eapgVar, eapg eapgVar2, @dzsi ddho ddhoVar) {
        Application a = this.a.a();
        b(a, 1);
        b(eapgVar, 2);
        b(eapgVar2, 3);
        return new xig(a, eapgVar, eapgVar2, ddhoVar);
    }
}
