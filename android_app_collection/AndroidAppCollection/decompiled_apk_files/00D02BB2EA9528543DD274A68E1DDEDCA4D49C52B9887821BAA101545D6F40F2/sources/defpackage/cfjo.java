package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cfjo  reason: default package */
/* loaded from: classes4.dex */
public final class cfjo {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<cfjb> c;
    public final dzsj<aujx> d;
    public final dzsj<cfgv> e;
    public final dzsj<ceze> f;
    public final dzsj<cfkq> g;
    public final dzsj<bvrb> h;
    public final dzsj<cezg> i;
    public final dzsj<Resources> j;

    public cfjo(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cfjb> dzsjVar3, dzsj<aujx> dzsjVar4, dzsj<cfgv> dzsjVar5, dzsj<ceze> dzsjVar6, dzsj<cfkq> dzsjVar7, dzsj<bvrb> dzsjVar8, dzsj<cezg> dzsjVar9, dzsj<Resources> dzsjVar10) {
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
