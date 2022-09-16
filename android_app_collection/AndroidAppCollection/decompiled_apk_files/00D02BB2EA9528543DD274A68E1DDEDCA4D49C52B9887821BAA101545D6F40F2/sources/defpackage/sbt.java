package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: sbt  reason: default package */
/* loaded from: classes7.dex */
public final class sbt {
    public final dzsj<Application> a;
    public final dzsj<cqhn> b;
    public final dzsj<sev> c;

    public sbt(dzsj<Application> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<sev> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
