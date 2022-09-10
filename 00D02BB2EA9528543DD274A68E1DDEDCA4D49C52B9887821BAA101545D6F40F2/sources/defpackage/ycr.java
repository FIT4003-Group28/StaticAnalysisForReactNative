package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ycr  reason: default package */
/* loaded from: classes7.dex */
public final class ycr {
    public final dzsj<Activity> a;
    public final dzsj<btvo> b;
    public final dzsj<cqhn> c;
    public final dzsj<byyp> d;
    public final dzsj<Executor> e;
    public final dzsj<ahjq> f;
    public final dzsj<vwv> g;
    public final dzsj<ycu> h;
    public final dzsj<dxio<dbsg<arkd>>> i;
    public final dzsj<byzd> j;
    public final dzsj<btpc> k;

    public ycr(dzsj<Activity> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<byyp> dzsjVar4, dzsj<Executor> dzsjVar5, dzsj<ahjq> dzsjVar6, dzsj<vwv> dzsjVar7, dzsj<ycu> dzsjVar8, dzsj<dxio<dbsg<arkd>>> dzsjVar9, dzsj<byzd> dzsjVar10, dzsj<btpc> dzsjVar11) {
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
