package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aren  reason: default package */
/* loaded from: classes2.dex */
public final class aren {
    public final dzsj<Activity> a;
    public final dzsj<gll> b;
    public final dzsj<akox> c;
    public final dzsj<hwe> d;
    public final dzsj<dxio<akzh>> e;
    public final dzsj<bvrb> f;
    public final dzsj<jkf> g;
    public final dzsj<fd> h;

    public aren(dzsj<Activity> dzsjVar, dzsj<gll> dzsjVar2, dzsj<akox> dzsjVar3, dzsj<hwe> dzsjVar4, dzsj<dxio<akzh>> dzsjVar5, dzsj<bvrb> dzsjVar6, dzsj<jkf> dzsjVar7, dzsj<fd> dzsjVar8) {
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
