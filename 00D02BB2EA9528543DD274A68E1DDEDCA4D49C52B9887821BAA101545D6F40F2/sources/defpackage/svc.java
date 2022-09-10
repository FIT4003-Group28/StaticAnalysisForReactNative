package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: svc  reason: default package */
/* loaded from: classes7.dex */
public final class svc {
    public final dzsj<Activity> a;
    public final dzsj<Executor> b;
    public final dzsj<btpc> c;
    public final dzsj<dxio<dbsg<arkd>>> d;
    public final dzsj<dbsg<arkb>> e;
    public final dzsj<byyp> f;
    public final dzsj<suu> g;

    public svc(dzsj<Activity> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<btpc> dzsjVar3, dzsj<dxio<dbsg<arkd>>> dzsjVar4, dzsj<dbsg<arkb>> dzsjVar5, dzsj<byyp> dzsjVar6, dzsj<suu> dzsjVar7) {
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
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
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
