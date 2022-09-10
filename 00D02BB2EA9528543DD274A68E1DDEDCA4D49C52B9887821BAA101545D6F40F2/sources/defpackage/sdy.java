package defpackage;

import android.app.Activity;
import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sdy  reason: default package */
/* loaded from: classes7.dex */
public final class sdy {
    public final dzsj<Application> a;
    public final dzsj<btvo> b;
    public final dzsj<qjk> c;
    public final dzsj<axvy> d;
    public final dzsj<cqhn> e;
    public final dzsj<sic> f;
    public final dzsj<sfd> g;
    public final dzsj<ros> h;
    public final dzsj<sbz> i;
    public final dzsj<dxio<sim>> j;
    public final dzsj<Executor> k;
    public final dzsj<Executor> l;
    public final dzsj<cjnx> m;
    public final dzsj<axwq> n;
    public final dzsj<Activity> o;

    public sdy(dzsj<Application> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<qjk> dzsjVar3, dzsj<axvy> dzsjVar4, dzsj<cqhn> dzsjVar5, dzsj<sic> dzsjVar6, dzsj<sfd> dzsjVar7, dzsj<ros> dzsjVar8, dzsj<sbz> dzsjVar9, dzsj<dxio<sim>> dzsjVar10, dzsj<Executor> dzsjVar11, dzsj<Executor> dzsjVar12, dzsj<cjnx> dzsjVar13, dzsj<axwq> dzsjVar14, dzsj<Activity> dzsjVar15) {
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
