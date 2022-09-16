package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bfss  reason: default package */
/* loaded from: classes3.dex */
public class bfss {
    public final dzsj<Activity> a;
    public final dzsj<btvo> b;
    public final dzsj<dxio<cqkj>> c;
    public final dzsj<bfsv> d;

    public bfss(dzsj<Activity> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<dxio<cqkj>> dzsjVar3, dzsj<bfsv> dzsjVar4) {
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
