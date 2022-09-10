package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: yao  reason: default package */
/* loaded from: classes7.dex */
public final class yao {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<ascb> c;
    public final dzsj<btvo> d;
    public final dzsj<ahjq> e;
    public final dzsj<vwv> f;
    public final dzsj<vxa> g;
    public final dzsj<vzi> h;

    public yao(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<ascb> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<ahjq> dzsjVar5, dzsj<vwv> dzsjVar6, dzsj<vxa> dzsjVar7, dzsj<vzi> dzsjVar8) {
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
