package defpackage;

import android.app.Activity;
import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: scp  reason: default package */
/* loaded from: classes7.dex */
public final class scp {
    public final dzsj<Application> a;
    public final dzsj<btvo> b;
    public final dzsj<qjk> c;
    public final dzsj<axvy> d;
    public final dzsj<cqhn> e;
    public final dzsj<sic> f;
    public final dzsj<ros> g;
    public final dzsj<sbz> h;
    public final dzsj<dxio<sim>> i;
    public final dzsj<Executor> j;
    public final dzsj<Executor> k;
    public final dzsj<saf> l;
    public final dzsj<axwq> m;
    public final dzsj<wbx> n;
    public final dzsj<Activity> o;

    public scp(dzsj<Application> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<qjk> dzsjVar3, dzsj<axvy> dzsjVar4, dzsj<cqhn> dzsjVar5, dzsj<sic> dzsjVar6, dzsj<ros> dzsjVar7, dzsj<sbz> dzsjVar8, dzsj<dxio<sim>> dzsjVar9, dzsj<Executor> dzsjVar10, dzsj<Executor> dzsjVar11, dzsj<saf> dzsjVar12, dzsj<axwq> dzsjVar13, dzsj<wbx> dzsjVar14, dzsj<Activity> dzsjVar15) {
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
        a(dzsjVar14, 14);
        this.n = dzsjVar14;
        a(dzsjVar15, 15);
        this.o = dzsjVar15;
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
