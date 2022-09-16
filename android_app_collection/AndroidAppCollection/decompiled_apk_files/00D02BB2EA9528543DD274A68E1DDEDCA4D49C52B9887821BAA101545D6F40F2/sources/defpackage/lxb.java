package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lxb  reason: default package */
/* loaded from: classes7.dex */
public final class lxb {
    public final dzsj<Application> a;
    public final dzsj<dxio<bvsl>> b;
    public final dzsj<dxio<amfi>> c;
    public final dzsj<cqat> d;
    public final dzsj<Executor> e;

    public lxb(dzsj<Application> dzsjVar, dzsj<dxio<bvsl>> dzsjVar2, dzsj<dxio<amfi>> dzsjVar3, dzsj<cqat> dzsjVar4, dzsj<Executor> dzsjVar5) {
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
