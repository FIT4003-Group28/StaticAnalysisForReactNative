package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sdt  reason: default package */
/* loaded from: classes7.dex */
public final class sdt {
    public final dzsj<Application> a;
    public final dzsj<cqhn> b;
    public final dzsj<sfd> c;
    public final dzsj<sec> d;
    public final dzsj<see> e;
    public final dzsj<seg> f;
    public final dzsj<sgm> g;
    public final dzsj<sic> h;
    public final dzsj<ros> i;
    public final dzsj<ahjq> j;
    public final dzsj<sgt> k;
    public final dzsj<rzv> l;
    public final dzsj<Executor> m;
    public final dzsj<sdc> n;
    public final dzsj<she> o;
    public final dzsj<rzs> p;
    public final dzsj<scr> q;
    public final dzsj<btvo> r;

    public sdt(dzsj<Application> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<sfd> dzsjVar3, dzsj<sec> dzsjVar4, dzsj<see> dzsjVar5, dzsj<seg> dzsjVar6, dzsj<sgm> dzsjVar7, dzsj<sic> dzsjVar8, dzsj<ros> dzsjVar9, dzsj<ahjq> dzsjVar10, dzsj<sgt> dzsjVar11, dzsj<rzv> dzsjVar12, dzsj<Executor> dzsjVar13, dzsj<sdc> dzsjVar14, dzsj<she> dzsjVar15, dzsj<rzs> dzsjVar16, dzsj<scr> dzsjVar17, dzsj<btvo> dzsjVar18) {
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
        a(dzsjVar16, 16);
        this.p = dzsjVar16;
        a(dzsjVar17, 17);
        this.q = dzsjVar17;
        a(dzsjVar18, 18);
        this.r = dzsjVar18;
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
