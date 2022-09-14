package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: arhy  reason: default package */
/* loaded from: classes2.dex */
public final class arhy {
    public final dzsj<Application> a;
    public final dzsj<arhz> b;

    public arhy(dzsj<Application> dzsjVar, dzsj<arhz> dzsjVar2) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
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
