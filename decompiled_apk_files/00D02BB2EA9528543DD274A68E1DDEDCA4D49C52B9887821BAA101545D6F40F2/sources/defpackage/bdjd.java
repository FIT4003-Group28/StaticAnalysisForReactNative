package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: bdjd  reason: default package */
/* loaded from: classes3.dex */
public final class bdjd {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<buti> c;
    public final dzsj<bdis> d;
    public final dzsj<bbut> e;
    public final dzsj<bdin> f;
    public final dzsj<gdc> g;
    public final dzsj<Handler> h;

    public bdjd(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<buti> dzsjVar3, dzsj<bdis> dzsjVar4, dzsj<bbut> dzsjVar5, dzsj<bdin> dzsjVar6, dzsj<gdc> dzsjVar7, dzsj<Handler> dzsjVar8) {
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
