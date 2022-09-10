package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bqbb  reason: default package */
/* loaded from: classes4.dex */
public class bqbb {
    private final dzsj<bqco> a;
    private final dzsj<Executor> b;
    private final dzsj<Activity> c;
    private final dzsj<jkf> d;
    private final dzsj<akzh> e;
    private final dzsj<zzn> f;
    private final dzsj<akox> g;
    private final dzsj<bqdl> h;
    private final dzsj<dbsg<cfll>> i;
    private final dzsj<bqdk> j;
    private final dzsj<bqbf> k;

    public bqbb(dzsj<bqco> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<Activity> dzsjVar3, dzsj<jkf> dzsjVar4, dzsj<akzh> dzsjVar5, dzsj<zzn> dzsjVar6, dzsj<akox> dzsjVar7, dzsj<bqdl> dzsjVar8, dzsj<dbsg<cfll>> dzsjVar9, dzsj<bqdk> dzsjVar10, dzsj<bqbf> dzsjVar11) {
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
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bqba a(bqhg bqhgVar, bqaz bqazVar) {
        b(bqhgVar, 1);
        b(bqazVar, 2);
        bqco a = this.a.a();
        b(a, 3);
        Executor a2 = this.b.a();
        b(a2, 4);
        Activity activity = (Activity) ((dxjd) this.c).a;
        b(activity, 5);
        jkf a3 = this.d.a();
        b(a3, 6);
        akzh a4 = this.e.a();
        b(a4, 7);
        zzn a5 = this.f.a();
        b(a5, 8);
        akox a6 = this.g.a();
        b(a6, 9);
        bqdl a7 = this.h.a();
        b(a7, 10);
        dbsg<cfll> a8 = this.i.a();
        b(a8, 11);
        bqdk a9 = this.j.a();
        b(a9, 12);
        bqbf a10 = this.k.a();
        b(a10, 13);
        return new bqba(bqhgVar, bqazVar, a, a2, activity, a3, a4, a5, a6, a7, a8, a9, a10);
    }
}
