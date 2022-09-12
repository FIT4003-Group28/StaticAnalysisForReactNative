package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: bdgd  reason: default package */
/* loaded from: classes3.dex */
public final class bdgd {
    public final dzsj<Application> a;
    public final dzsj<bbtk> b;
    public final dzsj<dxio<apni>> c;
    public final dzsj<btvo> d;

    public bdgd(dzsj<Application> dzsjVar, dzsj<bbtk> dzsjVar2, dzsj<dxio<apni>> dzsjVar3, dzsj<btvo> dzsjVar4) {
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
