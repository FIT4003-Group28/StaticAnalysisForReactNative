package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: iqm  reason: default package */
/* loaded from: classes6.dex */
public final class iqm {
    public final dzsj<akox> a;
    public final dzsj<hwe> b;
    public final dzsj<Executor> c;
    public final dzsj<jkj> d;
    public final dzsj<gll> e;
    public final dzsj<Activity> f;
    public final dzsj<dxio<akzh>> g;
    public final dzsj<cjyb> h;

    public iqm(dzsj<akox> dzsjVar, dzsj<hwe> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<jkj> dzsjVar4, dzsj<gll> dzsjVar5, dzsj<Activity> dzsjVar6, dzsj<dxio<akzh>> dzsjVar7, dzsj<cjyb> dzsjVar8) {
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
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
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
