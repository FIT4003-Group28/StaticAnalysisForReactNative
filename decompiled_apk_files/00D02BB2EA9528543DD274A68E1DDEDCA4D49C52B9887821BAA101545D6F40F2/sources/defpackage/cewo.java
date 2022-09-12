package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cewo  reason: default package */
/* loaded from: classes4.dex */
public final class cewo {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<btvo> c;
    public final dzsj<cefd> d;
    public final dzsj<ceuo> e;
    public final dzsj<nvh> f;
    public final dzsj<isd> g;
    public final dzsj<cese> h;

    public cewo(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<cefd> dzsjVar4, dzsj<ceuo> dzsjVar5, dzsj<nvh> dzsjVar6, dzsj<isd> dzsjVar7, dzsj<cese> dzsjVar8) {
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
