package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: arjb  reason: default package */
/* loaded from: classes2.dex */
public final class arjb {
    public final dzsj<Activity> a;
    public final dzsj<bfld> b;
    public final dzsj<arin> c;
    public final dzsj<jkf> d;
    public final dzsj<behx> e;
    public final dzsj<bniv> f;
    public final dzsj<bfhx> g;
    public final dzsj<bniy> h;
    public final dzsj<cqhn> i;
    public final dzsj<vwv> j;
    public final dzsj<cpv> k;

    public arjb(dzsj<Activity> dzsjVar, dzsj<bfld> dzsjVar2, dzsj<arin> dzsjVar3, dzsj<jkf> dzsjVar4, dzsj<behx> dzsjVar5, dzsj<bniv> dzsjVar6, dzsj<bfhx> dzsjVar7, dzsj<bniy> dzsjVar8, dzsj<cqhn> dzsjVar9, dzsj<vwv> dzsjVar10, dzsj<cpv> dzsjVar11) {
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
        a(dzsjVar11, 11);
        this.k = dzsjVar11;
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
