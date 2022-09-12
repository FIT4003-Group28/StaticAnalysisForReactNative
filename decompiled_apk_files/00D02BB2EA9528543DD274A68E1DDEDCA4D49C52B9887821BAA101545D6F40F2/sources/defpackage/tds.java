package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tds  reason: default package */
/* loaded from: classes7.dex */
public final class tds {
    public final dzsj<Activity> a;
    public final dzsj<gga> b;
    public final dzsj<cqhn> c;
    public final dzsj<vtn> d;
    public final dzsj<twh> e;
    public final dzsj<tao> f;
    public final dzsj<suq> g;
    public final dzsj<wtw> h;

    public tds(dzsj<Activity> dzsjVar, dzsj<gga> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<vtn> dzsjVar4, dzsj<twh> dzsjVar5, dzsj<tao> dzsjVar6, dzsj<suq> dzsjVar7, dzsj<wtw> dzsjVar8) {
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
