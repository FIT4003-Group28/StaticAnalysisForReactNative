package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bdql  reason: default package */
/* loaded from: classes3.dex */
public final class bdql {
    public final dzsj<ckcw> a;
    public final dzsj<bbtk> b;
    public final dzsj<bvjj> c;
    public final dzsj<aesb> d;
    public final dzsj<aujx> e;
    public final dzsj<bbul> f;
    public final dzsj<cjqy> g;
    public final dzsj<appz> h;
    public final dzsj<dxio<bduq>> i;
    public final dzsj<Executor> j;
    public final dzsj<Executor> k;

    public bdql(dzsj<ckcw> dzsjVar, dzsj<bbtk> dzsjVar2, dzsj<bvjj> dzsjVar3, dzsj<aesb> dzsjVar4, dzsj<aujx> dzsjVar5, dzsj<bbul> dzsjVar6, dzsj<cjqy> dzsjVar7, dzsj<appz> dzsjVar8, dzsj<dxio<bduq>> dzsjVar9, dzsj<Executor> dzsjVar10, dzsj<Executor> dzsjVar11) {
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
