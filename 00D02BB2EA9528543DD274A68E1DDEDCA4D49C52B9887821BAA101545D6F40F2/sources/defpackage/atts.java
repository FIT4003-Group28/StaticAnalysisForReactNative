package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atts  reason: default package */
/* loaded from: classes2.dex */
public final class atts {
    private final dzsj<Context> a;
    private final dzsj<btrm> b;
    private final dzsj<btvo> c;
    private final dzsj<cref> d;
    private final dzsj<cqat> e;
    private final dzsj<cjqy> f;
    private final dzsj<cjqq> g;
    private final dzsj<vtn> h;
    private final dzsj<bvsl> i;
    private final dzsj<dehq> j;
    private final dzsj<Executor> k;
    private final dzsj<atsr> l;
    private final dzsj<asxu> m;
    private final dzsj<asxw> n;
    private final dzsj<Boolean> o;

    public atts(dzsj<Context> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<cref> dzsjVar4, dzsj<cqat> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<cjqq> dzsjVar7, dzsj<vtn> dzsjVar8, dzsj<bvsl> dzsjVar9, dzsj<dehq> dzsjVar10, dzsj<Executor> dzsjVar11, dzsj<atsr> dzsjVar12, dzsj<asxu> dzsjVar13, dzsj<asxw> dzsjVar14, dzsj<Boolean> dzsjVar15) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
        b(dzsjVar10, 10);
        this.j = dzsjVar10;
        b(dzsjVar11, 11);
        this.k = dzsjVar11;
        b(dzsjVar12, 12);
        this.l = dzsjVar12;
        b(dzsjVar13, 13);
        this.m = dzsjVar13;
        b(dzsjVar14, 14);
        this.n = dzsjVar14;
        b(dzsjVar15, 15);
        this.o = dzsjVar15;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final attr a(crqb crqbVar) {
        Context a = this.a.a();
        b(a, 1);
        btrm a2 = this.b.a();
        b(a2, 2);
        btvo a3 = this.c.a();
        b(a3, 3);
        cref a4 = this.d.a();
        b(a4, 4);
        cqat a5 = this.e.a();
        b(a5, 5);
        cjqy a6 = this.f.a();
        b(a6, 6);
        cjqq a7 = this.g.a();
        b(a7, 7);
        vtn a8 = this.h.a();
        b(a8, 8);
        bvsl a9 = this.i.a();
        b(a9, 9);
        dehq a10 = this.j.a();
        b(a10, 10);
        Executor a11 = this.k.a();
        b(a11, 11);
        atsr a12 = this.l.a();
        b(a12, 12);
        asxu a13 = this.m.a();
        b(a13, 13);
        asxw a14 = this.n.a();
        b(a14, 14);
        b(crqbVar, 15);
        Boolean a15 = this.o.a();
        b(a15, 16);
        return new attr(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, crqbVar, a15.booleanValue());
    }
}
