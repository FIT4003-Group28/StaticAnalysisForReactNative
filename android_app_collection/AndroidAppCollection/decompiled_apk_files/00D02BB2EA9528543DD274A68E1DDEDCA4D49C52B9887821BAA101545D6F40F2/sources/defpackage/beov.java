package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: beov  reason: default package */
/* loaded from: classes3.dex */
public final class beov {
    public final dzsj<Application> a;
    public final dzsj<apny> b;
    public final dzsj<dxio<beii>> c;
    public final dzsj<benm> d;
    public final dzsj<bgyg> e;
    public final dzsj<cqhn> f;

    public beov(dzsj<Application> dzsjVar, dzsj<apny> dzsjVar2, dzsj<dxio<beii>> dzsjVar3, dzsj<benm> dzsjVar4, dzsj<bgyg> dzsjVar5, dzsj<cqhn> dzsjVar6) {
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

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
