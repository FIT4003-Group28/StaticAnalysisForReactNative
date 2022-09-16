package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: rkl  reason: default package */
/* loaded from: classes7.dex */
public class rkl {
    public final dzsj<Activity> a;
    public final dzsj<rkg> b;
    public final dzsj<dxio<ros>> c;
    public final dzsj<dxio<bvjj>> d;
    public final dzsj<dxio<cqat>> e;

    public rkl(dzsj<Activity> dzsjVar, dzsj<rkg> dzsjVar2, dzsj<dxio<ros>> dzsjVar3, dzsj<dxio<bvjj>> dzsjVar4, dzsj<dxio<cqat>> dzsjVar5) {
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
