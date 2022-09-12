package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: nhg  reason: default package */
/* loaded from: classes7.dex */
public final class nhg {
    public final dzsj<bvsl> a;
    public final dzsj<bvjj> b;
    public final dzsj<cqat> c;
    public final dzsj<jzp> d;
    public final dzsj<ahjq> e;
    public final dzsj<cjqy> f;
    public final dzsj<cjqq> g;
    public final dzsj<jzv> h;
    public final dzsj<dxio<aukk>> i;
    public final dzsj<cqhn> j;
    public final dzsj<Executor> k;

    public nhg(dzsj<bvsl> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<cqat> dzsjVar3, dzsj<jzp> dzsjVar4, dzsj<ahjq> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<cjqq> dzsjVar7, dzsj<jzv> dzsjVar8, dzsj<dxio<aukk>> dzsjVar9, dzsj<cqhn> dzsjVar10, dzsj<Executor> dzsjVar11) {
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
