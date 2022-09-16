package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bkag  reason: default package */
/* loaded from: classes3.dex */
public final class bkag {
    public final dzsj<gga> a;
    public final dzsj<jmx> b;
    public final dzsj<cqhn> c;
    public final dzsj<cqhu> d;
    public final dzsj<bver> e;
    public final dzsj<Executor> f;
    public final dzsj<bjyc> g;
    public final dzsj<bjyj> h;

    public bkag(dzsj<gga> dzsjVar, dzsj<jmx> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<cqhu> dzsjVar4, dzsj<bver> dzsjVar5, dzsj<Executor> dzsjVar6, dzsj<bjyc> dzsjVar7, dzsj<bjyj> dzsjVar8) {
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
