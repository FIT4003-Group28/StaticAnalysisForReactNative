package defpackage;
/* compiled from: PG */
/* renamed from: bizv  reason: default package */
/* loaded from: classes3.dex */
public final class bizv {
    public final dzsj<gga> a;
    public final dzsj<bwqv> b;
    public final dzsj<bjhc> c;
    public final dzsj<bjcj> d;
    public final dzsj<cqhn> e;
    public final dzsj<bjau> f;
    public final dzsj<bjzf> g;
    public final dzsj<bjbh> h;
    public final dzsj<bjbr> i;
    public final dzsj<bjhs> j;
    public final dzsj<bjgi> k;
    public final dzsj<bjgb> l;
    public final dzsj<bjgu> m;

    public bizv(dzsj<gga> dzsjVar, dzsj<bwqv> dzsjVar2, dzsj<bjhc> dzsjVar3, dzsj<bjcj> dzsjVar4, dzsj<cqhn> dzsjVar5, dzsj<bjau> dzsjVar6, dzsj<bjzf> dzsjVar7, dzsj<bjbh> dzsjVar8, dzsj<bjbr> dzsjVar9, dzsj<bjhs> dzsjVar10, dzsj<bjgi> dzsjVar11, dzsj<bjgb> dzsjVar12, dzsj<bjgu> dzsjVar13) {
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
