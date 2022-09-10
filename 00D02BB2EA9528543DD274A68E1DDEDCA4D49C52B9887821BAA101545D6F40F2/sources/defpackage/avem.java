package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avem  reason: default package */
/* loaded from: classes2.dex */
public final class avem {
    public final dzsj<awfh> a;
    public final dzsj<cqat> b;
    public final dzsj<dxio<avas>> c;
    public final dzsj<dxio<avbf>> d;
    public final dzsj<avpn> e;
    public final dzsj<dxio<awkw>> f;
    public final dzsj<dxio<avfo>> g;
    public final dzsj<dehq> h;
    public final dzsj<Executor> i;
    public final dzsj<dehq> j;
    public final dzsj<avhd> k;
    public final dzsj<avpo> l;
    public final dzsj<avzo> m;
    public final dzsj<avzm> n;
    public final dzsj<avzr> o;
    public final dzsj<awhl> p;
    public final dzsj<avpz> q;
    public final dzsj<dxio<avrw>> r;

    public avem(dzsj<awfh> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<dxio<avas>> dzsjVar3, dzsj<dxio<avbf>> dzsjVar4, dzsj<avpn> dzsjVar5, dzsj<dxio<awkw>> dzsjVar6, dzsj<dxio<avfo>> dzsjVar7, dzsj<dehq> dzsjVar8, dzsj<Executor> dzsjVar9, dzsj<dehq> dzsjVar10, dzsj<avhd> dzsjVar11, dzsj<avpo> dzsjVar12, dzsj<avzo> dzsjVar13, dzsj<avzm> dzsjVar14, dzsj<avzr> dzsjVar15, dzsj<awhl> dzsjVar16, dzsj<avpz> dzsjVar17, dzsj<dxio<avrw>> dzsjVar18) {
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
        a(dzsjVar16, 16);
        this.p = dzsjVar16;
        a(dzsjVar17, 17);
        this.q = dzsjVar17;
        a(dzsjVar18, 18);
        this.r = dzsjVar18;
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
