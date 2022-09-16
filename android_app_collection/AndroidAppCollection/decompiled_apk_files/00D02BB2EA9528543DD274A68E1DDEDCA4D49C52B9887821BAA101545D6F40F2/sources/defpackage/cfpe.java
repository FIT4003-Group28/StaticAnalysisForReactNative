package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cfpe  reason: default package */
/* loaded from: classes4.dex */
public class cfpe {
    public final dzsj<Resources> a;
    public final dzsj<cqhn> b;
    public final dzsj<cfns> c;
    public final dzsj<cfof> d;
    public final dzsj<cfod> e;
    public final dzsj<cfpg> f;
    public final dzsj<bvjj> g;
    public final dzsj<dxio<cezv>> h;
    public final dzsj<btvo> i;
    public final dzsj<cpv> j;
    public final dzsj<Executor> k;
    public final dzsj<ckcw> l;
    private final dzsj<cfof> m;
    private final dzsj<cfod> n;
    private final dzsj<cfpg> o;

    public cfpe(dzsj<Resources> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cfns> dzsjVar3, dzsj<cfof> dzsjVar4, dzsj<cfod> dzsjVar5, dzsj<cfpg> dzsjVar6, dzsj<bvjj> dzsjVar7, dzsj<dxio<cezv>> dzsjVar8, dzsj<btvo> dzsjVar9, dzsj<cpv> dzsjVar10, dzsj<Executor> dzsjVar11, dzsj<ckcw> dzsjVar12, dzsj<cfof> dzsjVar13, dzsj<cfod> dzsjVar14, dzsj<cfpg> dzsjVar15) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
        b(dzsjVar10, 10);
        this.j = dzsjVar10;
        b(dzsjVar11, 11);
        this.k = dzsjVar11;
        b(dzsjVar12, 12);
        this.l = dzsjVar12;
        b(dzsjVar13, 13);
        this.m = dzsjVar13;
        b(dzsjVar14, 14);
        this.n = dzsjVar14;
        b(dzsjVar15, 15);
        this.o = dzsjVar15;
    }

    public static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final cfpd a(cfnq cfnqVar, boolean z, Handler handler, @dzsi Long l, boolean z2, @dzsi String str, @dzsi dqvj dqvjVar, Runnable runnable, @dzsi String str2, String str3, @dzsi String str4, @dzsi dpum dpumVar, @dzsi String str5) {
        Resources a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        cfns a3 = this.c.a();
        b(a3, 3);
        cfof a4 = this.m.a();
        b(a4, 4);
        cfod a5 = this.n.a();
        b(a5, 5);
        cfpg a6 = this.o.a();
        b(a6, 6);
        bvjj a7 = this.g.a();
        b(a7, 7);
        dxio a8 = ((dxjh) this.h).a();
        b(a8, 8);
        btvo a9 = this.i.a();
        b(a9, 9);
        cpv a10 = this.j.a();
        b(a10, 10);
        Executor a11 = this.k.a();
        b(a11, 11);
        ckcw a12 = this.l.a();
        b(a12, 12);
        b(cfnqVar, 13);
        b(handler, 15);
        b(runnable, 20);
        b(str3, 22);
        return new cfpd(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, cfnqVar, z, handler, l, z2, str, dqvjVar, runnable, str2, str3, str4, dpumVar, str5);
    }
}
