package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dxk  reason: default package */
/* loaded from: classes6.dex */
public final class dxk {
    public final dzsj<dwr> a;
    public final dzsj<dol> b;
    public final dzsj<dve> c;
    public final dzsj<dvt> d;
    public final dzsj<Executor> e;
    public final dzsj<cqat> f;
    public final dzsj<duz> g;
    public final dzsj<der> h;
    public final dzsj<djs> i;
    public final dzsj<dkf> j;
    public final dzsj<cjqy> k;
    public final dzsj<dkh> l;
    public final dzsj<dkn> m;

    public dxk(dzsj<dwr> dzsjVar, dzsj<dol> dzsjVar2, dzsj<dve> dzsjVar3, dzsj<dvt> dzsjVar4, dzsj<Executor> dzsjVar5, dzsj<cqat> dzsjVar6, dzsj<duz> dzsjVar7, dzsj<der> dzsjVar8, dzsj<djs> dzsjVar9, dzsj<dkf> dzsjVar10, dzsj<cjqy> dzsjVar11, dzsj<dkh> dzsjVar12, dzsj<dkn> dzsjVar13) {
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
