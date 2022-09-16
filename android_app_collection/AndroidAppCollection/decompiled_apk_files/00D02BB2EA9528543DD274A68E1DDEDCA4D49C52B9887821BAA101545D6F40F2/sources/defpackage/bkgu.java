package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bkgu  reason: default package */
/* loaded from: classes3.dex */
public final class bkgu {
    public final dzsj<gga> a;
    public final dzsj<akfa> b;
    public final dzsj<cchz> c;
    public final dzsj<cqhn> d;
    public final dzsj<Executor> e;
    public final dzsj<dxio<apzh>> f;
    public final dzsj<dxio<apyz>> g;
    public final dzsj<btvo> h;
    public final dzsj<cjqy> i;
    public final dzsj<cjqq> j;

    public bkgu(dzsj<gga> dzsjVar, dzsj<akfa> dzsjVar2, dzsj<cchz> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<Executor> dzsjVar5, dzsj<dxio<apzh>> dzsjVar6, dzsj<dxio<apyz>> dzsjVar7, dzsj<btvo> dzsjVar8, dzsj<cjqy> dzsjVar9, dzsj<cjqq> dzsjVar10) {
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
