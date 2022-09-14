package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: szm  reason: default package */
/* loaded from: classes7.dex */
public final class szm {
    public final dzsj<Activity> a;
    public final dzsj<cqat> b;
    public final dzsj<twk> c;
    public final dzsj<byyp> d;
    public final dzsj<bzgl> e;
    public final dzsj<cqhn> f;
    public final dzsj<ahvo> g;
    public final dzsj<suw> h;
    public final dzsj<dxio<cztz>> i;
    public final dzsj<gdc> j;

    public szm(dzsj<Activity> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<twk> dzsjVar3, dzsj<byyp> dzsjVar4, dzsj<bzgl> dzsjVar5, dzsj<cqhn> dzsjVar6, dzsj<ahvo> dzsjVar7, dzsj<suw> dzsjVar8, dzsj<dxio<cztz>> dzsjVar9, dzsj<gdc> dzsjVar10) {
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
