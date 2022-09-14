package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avry  reason: default package */
/* loaded from: classes.dex */
public final class avry {
    public final dzsj<avpn> a;
    public final dzsj<avsb> b;
    public final dzsj<Map<dluy, avyy>> c;
    public final dzsj<dxio<btxc>> d;
    public final dzsj<Executor> e;
    public final dzsj<avzj> f;

    public avry(dzsj<avpn> dzsjVar, dzsj<avsb> dzsjVar2, dzsj<Map<dluy, avyy>> dzsjVar3, dzsj<dxio<btxc>> dzsjVar4, dzsj<Executor> dzsjVar5, dzsj<avzj> dzsjVar6) {
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
