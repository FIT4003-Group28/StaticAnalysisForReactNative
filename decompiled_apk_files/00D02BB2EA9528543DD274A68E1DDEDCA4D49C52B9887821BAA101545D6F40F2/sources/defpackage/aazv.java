package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aazv  reason: default package */
/* loaded from: classes2.dex */
public final class aazv {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<aahf> c;
    public final dzsj<aaht> d;
    public final dzsj<aahu> e;
    public final dzsj<aahc> f;
    public final dzsj<aaxl> g;
    public final dzsj<akla> h;

    public aazv(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<aahf> dzsjVar3, dzsj<aaht> dzsjVar4, dzsj<aahu> dzsjVar5, dzsj<aahc> dzsjVar6, dzsj<aaxl> dzsjVar7, dzsj<akla> dzsjVar8) {
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
