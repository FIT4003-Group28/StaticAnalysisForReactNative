package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: atml  reason: default package */
/* loaded from: classes2.dex */
public class atml {
    public final dzsj<Context> a;
    public final dzsj<atln> b;
    public final dzsj<bvsl> c;
    public final dzsj<vtn> d;
    public final dzsj<atmj> e;
    public final dzsj<atnb> f;
    public final dzsj<atnc> g;
    public final dzsj<atne> h;
    public final dzsj<atee> i;
    public final dzsj<ated> j;
    public final dzsj<Boolean> k;
    public final dzsj<zrl> l;
    public final dzsj<btvo> m;
    public final dzsj<zrt> n;

    public atml(dzsj<Context> dzsjVar, dzsj<atln> dzsjVar2, dzsj<bvsl> dzsjVar3, dzsj<vtn> dzsjVar4, dzsj<atmj> dzsjVar5, dzsj<atnb> dzsjVar6, dzsj<atnc> dzsjVar7, dzsj<atne> dzsjVar8, dzsj<atee> dzsjVar9, dzsj<ated> dzsjVar10, dzsj<Boolean> dzsjVar11, dzsj<zrl> dzsjVar12, dzsj<btvo> dzsjVar13, dzsj<zrt> dzsjVar14) {
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
