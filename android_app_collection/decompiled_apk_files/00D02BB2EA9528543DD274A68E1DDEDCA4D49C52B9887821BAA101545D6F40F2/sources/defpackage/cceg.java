package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cceg  reason: default package */
/* loaded from: classes4.dex */
public final class cceg {
    public final dzsj<dxio<cccs>> a;
    public final dzsj<dxio<bvby>> b;
    public final dzsj<dxio<cceb>> c;
    public final dzsj<dxio<bvjj>> d;
    public final dzsj<dxio<Executor>> e;

    public cceg(dzsj<dxio<cccs>> dzsjVar, dzsj<dxio<bvby>> dzsjVar2, dzsj<dxio<cceb>> dzsjVar3, dzsj<dxio<bvjj>> dzsjVar4, dzsj<dxio<Executor>> dzsjVar5) {
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
