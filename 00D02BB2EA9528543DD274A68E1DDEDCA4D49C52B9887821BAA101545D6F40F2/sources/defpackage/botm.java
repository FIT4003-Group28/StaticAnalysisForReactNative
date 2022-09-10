package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: botm  reason: default package */
/* loaded from: classes3.dex */
public final class botm {
    public final dzsj<Resources> a;
    public final dzsj<gga> b;
    public final dzsj<jmx> c;
    public final dzsj<btpc> d;
    public final dzsj<bnyo> e;
    public final dzsj<boxa> f;
    public final dzsj<cklf> g;
    public final dzsj<dxio<cjqy>> h;
    public final dzsj<afwr> i;
    public final dzsj<akpm> j;

    public botm(dzsj<Resources> dzsjVar, dzsj<gga> dzsjVar2, dzsj<jmx> dzsjVar3, dzsj<btpc> dzsjVar4, dzsj<bnyo> dzsjVar5, dzsj<boxa> dzsjVar6, dzsj<cklf> dzsjVar7, dzsj<dxio<cjqy>> dzsjVar8, dzsj<afwr> dzsjVar9, dzsj<akpm> dzsjVar10) {
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
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
        a(dzsjVar10, 10);
        this.j = dzsjVar10;
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
