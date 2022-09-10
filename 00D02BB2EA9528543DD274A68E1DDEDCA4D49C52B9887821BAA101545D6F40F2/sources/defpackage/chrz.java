package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: chrz  reason: default package */
/* loaded from: classes4.dex */
public final class chrz {
    public final dzsj<btvo> a;
    public final dzsj<bvjj> b;
    public final dzsj<Activity> c;
    public final dzsj<cpv> d;
    public final dzsj<dxio<chnm>> e;

    public chrz(dzsj<btvo> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<Activity> dzsjVar3, dzsj<cpv> dzsjVar4, dzsj<dxio<chnm>> dzsjVar5) {
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
