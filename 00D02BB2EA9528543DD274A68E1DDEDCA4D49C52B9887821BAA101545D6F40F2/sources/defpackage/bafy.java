package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bafy  reason: default package */
/* loaded from: classes3.dex */
public final class bafy {
    public final dzsj<bayv> a;
    public final dzsj<bayy> b;
    public final dzsj<bazx> c;
    public final dzsj<cqhn> d;
    public final dzsj<Executor> e;
    public final dzsj<Executor> f;
    public final dzsj<btrm> g;
    public final dzsj<gga> h;
    public final dzsj<ahjq> i;
    public final dzsj<dxio<axwy>> j;
    public final dzsj<axwq> k;

    public bafy(dzsj<bayv> dzsjVar, dzsj<bayy> dzsjVar2, dzsj<bazx> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<Executor> dzsjVar5, dzsj<Executor> dzsjVar6, dzsj<btrm> dzsjVar7, dzsj<gga> dzsjVar8, dzsj<ahjq> dzsjVar9, dzsj<dxio<axwy>> dzsjVar10, dzsj<axwq> dzsjVar11) {
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
