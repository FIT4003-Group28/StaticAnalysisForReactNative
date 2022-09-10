package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bdpf  reason: default package */
/* loaded from: classes3.dex */
public final class bdpf {
    public final dzsj<Activity> a;
    public final dzsj<btvo> b;
    public final dzsj<dxio<afha>> c;
    public final dzsj<Executor> d;
    public final dzsj<axru> e;
    public final dzsj<cjqy> f;
    public final dzsj<bbtk> g;
    public final dzsj<bdod> h;
    public final dzsj<jmq> i;
    public final dzsj<bdml> j;
    public final dzsj<bdmr> k;
    public final dzsj<bdpg> l;
    public final dzsj<bdpi> m;

    public bdpf(dzsj<Activity> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<dxio<afha>> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<axru> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<bbtk> dzsjVar7, dzsj<bdod> dzsjVar8, dzsj<jmq> dzsjVar9, dzsj<bdml> dzsjVar10, dzsj<bdmr> dzsjVar11, dzsj<bdpg> dzsjVar12, dzsj<bdpi> dzsjVar13) {
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
        a(dzsjVar13, 13);
        this.m = dzsjVar13;
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
