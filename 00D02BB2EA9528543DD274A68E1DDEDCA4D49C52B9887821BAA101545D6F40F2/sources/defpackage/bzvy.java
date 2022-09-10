package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: bzvy  reason: default package */
/* loaded from: classes4.dex */
public final class bzvy {
    public final dzsj<Application> a;
    public final dzsj<dxio<bzvk>> b;
    public final dzsj<dxio<auhi>> c;
    public final dzsj<bqli> d;

    public bzvy(dzsj<Application> dzsjVar, dzsj<dxio<bzvk>> dzsjVar2, dzsj<dxio<auhi>> dzsjVar3, dzsj<bqli> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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
