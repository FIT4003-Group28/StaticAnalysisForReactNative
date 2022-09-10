package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: apyc  reason: default package */
/* loaded from: classes2.dex */
public final class apyc {
    public final dzsj<Application> a;
    public final dzsj<dxio<aprv>> b;
    public final dzsj<dxio<auhi>> c;
    public final dzsj<dxio<auhj>> d;
    public final dzsj<dxio<aqwq>> e;

    public apyc(dzsj<Application> dzsjVar, dzsj<dxio<aprv>> dzsjVar2, dzsj<dxio<auhi>> dzsjVar3, dzsj<dxio<auhj>> dzsjVar4, dzsj<dxio<aqwq>> dzsjVar5) {
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
