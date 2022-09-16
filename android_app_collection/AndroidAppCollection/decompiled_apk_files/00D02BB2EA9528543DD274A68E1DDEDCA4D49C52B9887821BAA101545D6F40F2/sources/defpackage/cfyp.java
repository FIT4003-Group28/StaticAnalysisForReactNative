package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cfyp  reason: default package */
/* loaded from: classes4.dex */
public class cfyp {
    public final dzsj<cgaf> a;
    public final dzsj<cftd> b;
    public final dzsj<cqhn> c;
    public final dzsj<dxio<angp>> d;
    public final dzsj<dxio<afha>> e;
    public final dzsj<bunc> f;
    public final dzsj<anhk> g;
    public final dzsj<cklq> h;
    public final dzsj<gga> i;
    public final dzsj<Executor> j;
    public final dzsj<cgak> k;

    public cfyp(dzsj<cgaf> dzsjVar, dzsj<cftd> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<dxio<angp>> dzsjVar4, dzsj<dxio<afha>> dzsjVar5, dzsj<bunc> dzsjVar6, dzsj<anhk> dzsjVar7, dzsj<cklq> dzsjVar8, dzsj<gga> dzsjVar9, dzsj<Executor> dzsjVar10, dzsj<cgak> dzsjVar11) {
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
