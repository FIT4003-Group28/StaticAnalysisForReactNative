package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: btub  reason: default package */
/* loaded from: classes.dex */
public final class btub {
    public final dzsj<Application> a;
    public final dzsj<cqat> b;
    public final dzsj<ckcw> c;
    public final dzsj<btrm> d;
    public final dzsj<btvo> e;

    public btub(dzsj<Application> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<ckcw> dzsjVar3, dzsj<btrm> dzsjVar4, dzsj<btvo> dzsjVar5) {
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
