package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: arvi  reason: default package */
/* loaded from: classes2.dex */
public final class arvi {
    public final dzsj<Context> a;
    public final dzsj<cqhn> b;
    public final dzsj<aruv> c;
    public final dzsj<arxw> d;
    public final dzsj<aryc> e;
    public final dzsj<arrh> f;
    public final dzsj<arve> g;
    public final dzsj<dxio<afha>> h;
    public final dzsj<dehq> i;
    public final dzsj<dehq> j;

    public arvi(dzsj<Context> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<aruv> dzsjVar3, dzsj<arxw> dzsjVar4, dzsj<aryc> dzsjVar5, dzsj<arrh> dzsjVar6, dzsj<arve> dzsjVar7, dzsj<dxio<afha>> dzsjVar8, dzsj<dehq> dzsjVar9, dzsj<dehq> dzsjVar10) {
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
