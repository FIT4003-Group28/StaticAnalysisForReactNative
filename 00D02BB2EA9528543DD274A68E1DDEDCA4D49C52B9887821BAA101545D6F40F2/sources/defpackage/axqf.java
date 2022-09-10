package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axqf  reason: default package */
/* loaded from: classes3.dex */
public final class axqf {
    private final dzsj<cqhn> a;
    private final dzsj<Context> b;
    private final dzsj<Executor> c;
    private final dzsj<akfa> d;
    private final dzsj<axhs> e;
    private final dzsj<axjh> f;
    private final dzsj<akfc> g;
    private final dzsj<cpv> h;
    private final dzsj<cqhu> i;

    public axqf(dzsj<cqhn> dzsjVar, dzsj<Context> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<akfa> dzsjVar4, dzsj<axhs> dzsjVar5, dzsj<axjh> dzsjVar6, dzsj<akfc> dzsjVar7, dzsj<cpv> dzsjVar8, dzsj<cqhu> dzsjVar9) {
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

    public final axqe a(String str, String str2, crzo<axoj> crzoVar, dfqc dfqcVar, String str3) {
        cqhn a = this.a.a();
        b(a, 1);
        Context a2 = this.b.a();
        b(a2, 2);
        Executor a3 = this.c.a();
        b(a3, 3);
        akfa a4 = this.d.a();
        b(a4, 4);
        axhs a5 = this.e.a();
        b(a5, 5);
        axjh a6 = this.f.a();
        b(a6, 6);
        akfc a7 = this.g.a();
        b(a7, 7);
        cpv a8 = this.h.a();
        b(a8, 8);
        cqhu a9 = this.i.a();
        b(a9, 9);
        b(str, 10);
        b(str2, 11);
        b(crzoVar, 12);
        b(dfqcVar, 13);
        return new axqe(a, a2, a3, a4, a5, a6, a7, a8, a9, str, str2, crzoVar, dfqcVar, str3);
    }
}
