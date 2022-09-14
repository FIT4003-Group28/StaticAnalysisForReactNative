package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bqco  reason: default package */
/* loaded from: classes4.dex */
public final class bqco {
    public final dzsj<zzn> a;
    public final dzsj<Executor> b;
    public final dzsj<gga> c;
    public final dzsj<btrm> d;
    public final dzsj<akzh> e;
    public final dzsj<alhv> f;
    public final dzsj<bpsj> g;
    public final dzsj<akox> h;
    public final dzsj<bpyj> i;

    public bqco(dzsj<zzn> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<gga> dzsjVar3, dzsj<btrm> dzsjVar4, dzsj<akzh> dzsjVar5, dzsj<alhv> dzsjVar6, dzsj<bpsj> dzsjVar7, dzsj<akox> dzsjVar8, dzsj<bpyj> dzsjVar9) {
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
