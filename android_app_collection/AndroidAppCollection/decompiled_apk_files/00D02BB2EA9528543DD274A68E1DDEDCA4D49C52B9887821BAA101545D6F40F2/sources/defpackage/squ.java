package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: squ  reason: default package */
/* loaded from: classes7.dex */
public final class squ {
    private final dzsj<gga> a;
    private final dzsj<dxio<qbt>> b;
    private final dzsj<wdt> c;
    private final dzsj<String> d;
    private final dzsj<Executor> e;
    private final dzsj<Executor> f;
    private final dzsj<cqhn> g;
    private final dzsj<ahjq> h;
    private final dzsj<qsg> i;
    private final dzsj<Context> j;
    private final dzsj<cpv> k;

    public squ(dzsj<gga> dzsjVar, dzsj<dxio<qbt>> dzsjVar2, dzsj<wdt> dzsjVar3, dzsj<String> dzsjVar4, dzsj<Executor> dzsjVar5, dzsj<Executor> dzsjVar6, dzsj<cqhn> dzsjVar7, dzsj<ahjq> dzsjVar8, dzsj<qsg> dzsjVar9, dzsj<Context> dzsjVar10, dzsj<cpv> dzsjVar11) {
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

    public final sqt a(int i, String str, String str2, cqtd cqtdVar, cqss cqssVar, amvh amvhVar, @dzsi Runnable runnable, String str3, boolean z) {
        gga a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        wdt a3 = this.c.a();
        b(a3, 3);
        dzsj<String> dzsjVar = this.d;
        Executor a4 = this.e.a();
        b(a4, 5);
        Executor a5 = this.f.a();
        b(a5, 6);
        cqhn a6 = this.g.a();
        b(a6, 7);
        ahjq a7 = this.h.a();
        b(a7, 8);
        qsg a8 = this.i.a();
        b(a8, 9);
        Context a9 = this.j.a();
        b(a9, 10);
        cpv a10 = this.k.a();
        b(a10, 11);
        b(str, 13);
        b(str2, 14);
        b(cqtdVar, 15);
        b(cqssVar, 16);
        b(amvhVar, 17);
        b(str3, 19);
        return new sqt(a, a2, a3, dzsjVar, a4, a5, a6, a7, a8, a9, a10, i, str, str2, cqtdVar, cqssVar, amvhVar, runnable, str3, z);
    }
}
