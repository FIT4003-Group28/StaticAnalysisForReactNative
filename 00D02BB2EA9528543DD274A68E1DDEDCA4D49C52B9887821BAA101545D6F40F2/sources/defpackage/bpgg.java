package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bpgg  reason: default package */
/* loaded from: classes3.dex */
public final class bpgg {
    public final dzsj<gga> a;
    public final dzsj<jmx> b;
    public final dzsj<bptg> c;
    public final dzsj<bpsw> d;
    public final dzsj<bpto> e;
    public final dzsj<bnyd> f;
    public final dzsj<booa> g;
    public final dzsj<cqhn> h;
    public final dzsj<bpsd> i;
    public final dzsj<Executor> j;
    public final dzsj<bpdu> k;
    public final dzsj<bwqv> l;
    public final dzsj<eeu> m;

    public bpgg(dzsj<gga> dzsjVar, dzsj<jmx> dzsjVar2, dzsj<bptg> dzsjVar3, dzsj<bpsw> dzsjVar4, dzsj<bpto> dzsjVar5, dzsj<bnyd> dzsjVar6, dzsj<booa> dzsjVar7, dzsj<cqhn> dzsjVar8, dzsj<bpsd> dzsjVar9, dzsj<Executor> dzsjVar10, dzsj<bpdu> dzsjVar11, dzsj<bwqv> dzsjVar12, dzsj<eeu> dzsjVar13) {
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
