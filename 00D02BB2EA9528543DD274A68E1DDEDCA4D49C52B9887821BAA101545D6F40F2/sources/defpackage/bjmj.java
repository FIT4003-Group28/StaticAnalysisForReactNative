package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bjmj  reason: default package */
/* loaded from: classes3.dex */
public final class bjmj {
    public final dzsj<gga> a;
    public final dzsj<btrm> b;
    public final dzsj<bwqv> c;
    public final dzsj<Resources> d;
    public final dzsj<bveo> e;
    public final dzsj<bvfk> f;
    public final dzsj<bvff> g;
    public final dzsj<bvfc> h;
    public final dzsj<bjgi> i;
    public final dzsj<bjhc> j;
    public final dzsj<bjlm> k;
    public final dzsj<dxio<akfc>> l;
    public final dzsj<dxio<bjgy>> m;
    public final dzsj<dxio<afha>> n;
    public final dzsj<dxio<afgy>> o;
    public final dzsj<dxio<begg>> p;
    public final dzsj<dxio<chhr>> q;
    public final dzsj<chht> r;
    public final dzsj<Executor> s;

    public bjmj(dzsj<gga> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<bwqv> dzsjVar3, dzsj<Resources> dzsjVar4, dzsj<bveo> dzsjVar5, dzsj<bvfk> dzsjVar6, dzsj<bvff> dzsjVar7, dzsj<bvfc> dzsjVar8, dzsj<bjgi> dzsjVar9, dzsj<bjhc> dzsjVar10, dzsj<bjlm> dzsjVar11, dzsj<dxio<akfc>> dzsjVar12, dzsj<dxio<bjgy>> dzsjVar13, dzsj<dxio<afha>> dzsjVar14, dzsj<dxio<afgy>> dzsjVar15, dzsj<dxio<begg>> dzsjVar16, dzsj<dxio<chhr>> dzsjVar17, dzsj<chht> dzsjVar18, dzsj<Executor> dzsjVar19) {
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
        a(dzsjVar19, 19);
        this.s = dzsjVar19;
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
