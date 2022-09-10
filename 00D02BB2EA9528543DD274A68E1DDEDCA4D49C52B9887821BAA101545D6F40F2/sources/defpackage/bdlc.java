package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bdlc  reason: default package */
/* loaded from: classes3.dex */
public final class bdlc {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<Executor> c;
    public final dzsj<Executor> d;
    public final dzsj<axru> e;
    public final dzsj<bdlr> f;
    public final dzsj<bdlx> g;
    public final dzsj<bbtk> h;
    public final dzsj<bbut> i;
    public final dzsj<cjqy> j;
    public final dzsj<bdqb> k;
    public final dzsj<dxio<apni>> l;

    public bdlc(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<axru> dzsjVar5, dzsj<bdlr> dzsjVar6, dzsj<bdlx> dzsjVar7, dzsj<bbtk> dzsjVar8, dzsj<bbut> dzsjVar9, dzsj<cjqy> dzsjVar10, dzsj<bdqb> dzsjVar11, dzsj<dxio<apni>> dzsjVar12) {
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
        a(dzsjVar12, 12);
        this.l = dzsjVar12;
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
