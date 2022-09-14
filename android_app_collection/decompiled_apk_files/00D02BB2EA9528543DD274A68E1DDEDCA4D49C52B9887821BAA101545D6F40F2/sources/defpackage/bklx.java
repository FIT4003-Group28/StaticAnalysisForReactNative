package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: bklx  reason: default package */
/* loaded from: classes3.dex */
public class bklx {
    public final dzsj<bhsk> a;
    public final dzsj<bkml> b;
    public final dzsj<bknm> c;
    public final dzsj<bklj> d;
    public final dzsj<bkod> e;
    public final dzsj<bkmz> f;
    public final dzsj<bkns> g;
    public final dzsj<bknu> h;
    public final dzsj<Resources> i;
    public final dzsj<btvo> j;
    public final dzsj<bkoj> k;
    public final dzsj<bvjj> l;

    public bklx(dzsj<bhsk> dzsjVar, dzsj<bkml> dzsjVar2, dzsj<bknm> dzsjVar3, dzsj<bklj> dzsjVar4, dzsj<bkod> dzsjVar5, dzsj<bkmz> dzsjVar6, dzsj<bkns> dzsjVar7, dzsj<bknu> dzsjVar8, dzsj<Resources> dzsjVar9, dzsj<btvo> dzsjVar10, dzsj<bkoj> dzsjVar11, dzsj<bvjj> dzsjVar12) {
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
