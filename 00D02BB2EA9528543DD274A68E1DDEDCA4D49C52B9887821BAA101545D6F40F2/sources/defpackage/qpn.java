package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: qpn  reason: default package */
/* loaded from: classes7.dex */
public final class qpn {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<dxio<qbt>> c;
    public final dzsj<dxio<ros>> d;
    public final dzsj<dxio<afwt>> e;
    public final dzsj<isd> f;
    public final dzsj<yzi> g;
    public final dzsj<dxio<qwx>> h;
    public final dzsj<acyp> i;
    public final dzsj<btvo> j;

    public qpn(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<dxio<qbt>> dzsjVar3, dzsj<dxio<ros>> dzsjVar4, dzsj<dxio<afwt>> dzsjVar5, dzsj<isd> dzsjVar6, dzsj<yzi> dzsjVar7, dzsj<dxio<qwx>> dzsjVar8, dzsj<acyp> dzsjVar9, dzsj<btvo> dzsjVar10) {
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
