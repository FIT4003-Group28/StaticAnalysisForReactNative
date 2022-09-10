package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: acex  reason: default package */
/* loaded from: classes2.dex */
public final class acex {
    public final dzsj<cqhn> a;
    public final dzsj<abwo> b;
    public final dzsj<abwq> c;
    public final dzsj<acbw> d;
    public final dzsj<Application> e;
    public final dzsj<abtz> f;

    public acex(dzsj<cqhn> dzsjVar, dzsj<abwo> dzsjVar2, dzsj<abwq> dzsjVar3, dzsj<acbw> dzsjVar4, dzsj<Application> dzsjVar5, dzsj<abtz> dzsjVar6) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
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
