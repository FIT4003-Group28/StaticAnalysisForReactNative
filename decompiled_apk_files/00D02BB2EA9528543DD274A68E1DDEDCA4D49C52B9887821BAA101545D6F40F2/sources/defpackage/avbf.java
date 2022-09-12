package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avbf  reason: default package */
/* loaded from: classes2.dex */
public final class avbf {
    public final dzsj<btvo> a;
    public final dzsj<avba> b;
    public final dzsj<avop> c;
    public final dzsj<avbz> d;
    public final dzsj<avtr> e;
    public final dzsj<avll> f;
    public final dzsj<awhs> g;
    public final dzsj<Executor> h;
    public final dzsj<Executor> i;
    public final dzsj<dehq> j;
    public final dzsj<avki> k;
    public final dzsj<avjl> l;
    public final dzsj<dxio<avbg>> m;
    public final dzsj<cjqy> n;
    public final dzsj<avtv> o;

    public avbf(dzsj<btvo> dzsjVar, dzsj<avba> dzsjVar2, dzsj<avop> dzsjVar3, dzsj<avbz> dzsjVar4, dzsj<avtr> dzsjVar5, dzsj<avll> dzsjVar6, dzsj<awhs> dzsjVar7, dzsj<Executor> dzsjVar8, dzsj<Executor> dzsjVar9, dzsj<dehq> dzsjVar10, dzsj<avki> dzsjVar11, dzsj<avjl> dzsjVar12, dzsj<dxio<avbg>> dzsjVar13, dzsj<cjqy> dzsjVar14, dzsj<avtv> dzsjVar15) {
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
        a(dzsjVar14, 14);
        this.n = dzsjVar14;
        a(dzsjVar15, 15);
        this.o = dzsjVar15;
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
