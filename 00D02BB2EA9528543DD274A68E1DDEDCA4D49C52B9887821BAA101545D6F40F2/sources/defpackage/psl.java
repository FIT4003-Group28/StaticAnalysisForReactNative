package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: psl  reason: default package */
/* loaded from: classes7.dex */
public final class psl {
    public final dzsj<Activity> a;
    public final dzsj<btrm> b;
    public final dzsj<btvo> c;
    public final dzsj<dxio<brba>> d;
    public final dzsj<dxio<broq>> e;
    public final dzsj<akox> f;
    public final dzsj<srv> g;
    public final dzsj<pso> h;

    public psl(dzsj<Activity> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<dxio<brba>> dzsjVar4, dzsj<dxio<broq>> dzsjVar5, dzsj<akox> dzsjVar6, dzsj<srv> dzsjVar7, dzsj<pso> dzsjVar8) {
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
