package defpackage;

import android.app.Activity;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: bgow  reason: default package */
/* loaded from: classes3.dex */
public class bgow {
    private final dzsj<Activity> a;
    private final dzsj<btvo> b;
    private final dzsj<cqhn> c;
    private final dzsj<dxio<bvvw>> d;
    private final dzsj<dxio<apyz>> e;
    private final dzsj<bgoq> f;
    private final dzsj<bgpj> g;
    private final dzsj<bgqk> h;
    private final dzsj<bgpa> i;
    private final dzsj<bgos> j;
    private final dzsj<bhhf> k;
    private final dzsj<bgpg> l;
    private final dzsj<bgnc> m;
    private final dzsj<bgpe> n;
    private final dzsj<bgpc> o;

    public bgow(dzsj<Activity> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<dxio<bvvw>> dzsjVar4, dzsj<dxio<apyz>> dzsjVar5, dzsj<bgoq> dzsjVar6, dzsj<bgpj> dzsjVar7, dzsj<bgqk> dzsjVar8, dzsj<bgpa> dzsjVar9, dzsj<bgos> dzsjVar10, dzsj<bhhf> dzsjVar11, dzsj<bgpg> dzsjVar12, dzsj<bgnc> dzsjVar13, dzsj<bgpe> dzsjVar14, dzsj<bgpc> dzsjVar15) {
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

    public final bgov a(dipk dipkVar, boolean z, int i, apnq apnqVar, HashSet<bgqj> hashSet, bgez bgezVar, ilo iloVar, bgnk bgnkVar, bgnr bgnrVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        btvo a = this.b.a();
        b(a, 2);
        cqhn a2 = this.c.a();
        b(a2, 3);
        dxio a3 = ((dxjh) this.d).a();
        b(a3, 4);
        dxio a4 = ((dxjh) this.e).a();
        b(a4, 5);
        bgoq a5 = this.f.a();
        b(a5, 6);
        bgpj a6 = this.g.a();
        b(a6, 7);
        bgqk a7 = this.h.a();
        b(a7, 8);
        bgpa a8 = this.i.a();
        b(a8, 9);
        bgos a9 = this.j.a();
        b(a9, 10);
        bhhf a10 = this.k.a();
        b(a10, 11);
        bgpg a11 = this.l.a();
        b(a11, 12);
        bgnc a12 = this.m.a();
        b(a12, 13);
        bgpe a13 = this.n.a();
        b(a13, 14);
        bgpc a14 = this.o.a();
        b(a14, 15);
        b(dipkVar, 16);
        b(apnqVar, 19);
        b(hashSet, 20);
        b(bgezVar, 21);
        b(iloVar, 22);
        b(bgnkVar, 23);
        b(bgnrVar, 24);
        return new bgov(activity, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, dipkVar, z, i, apnqVar, hashSet, bgezVar, iloVar, bgnkVar, bgnrVar);
    }
}
