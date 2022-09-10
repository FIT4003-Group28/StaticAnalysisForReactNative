package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: umo  reason: default package */
/* loaded from: classes7.dex */
public final class umo {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<dxio<bwsh>> c;
    public final dzsj<vtn> d;
    public final dzsj<qbv> e;

    public umo(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<dxio<bwsh>> dzsjVar3, dzsj<vtn> dzsjVar4, dzsj<qbv> dzsjVar5) {
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
