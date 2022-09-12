package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awdb  reason: default package */
/* loaded from: classes3.dex */
public final class awdb {
    public final dzsj<Application> a;
    public final dzsj<btrm> b;
    public final dzsj<Executor> c;
    public final dzsj<dxio<axwp>> d;
    public final dzsj<dxio<avrw>> e;
    public final dzsj<dxio<axwq>> f;

    public awdb(dzsj<Application> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<dxio<axwp>> dzsjVar4, dzsj<dxio<avrw>> dzsjVar5, dzsj<dxio<axwq>> dzsjVar6) {
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
