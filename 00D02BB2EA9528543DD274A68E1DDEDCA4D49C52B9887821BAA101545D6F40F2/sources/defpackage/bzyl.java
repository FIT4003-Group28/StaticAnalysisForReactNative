package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: bzyl  reason: default package */
/* loaded from: classes4.dex */
public final class bzyl {
    private final dzsj<Application> a;

    public bzyl(dzsj<Application> dzsjVar) {
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

    public final bzyk a(dgyd dgydVar) {
        Application a = this.a.a();
        b(a, 1);
        b(dgydVar, 2);
        return new bzyk(a, dgydVar);
    }
}
