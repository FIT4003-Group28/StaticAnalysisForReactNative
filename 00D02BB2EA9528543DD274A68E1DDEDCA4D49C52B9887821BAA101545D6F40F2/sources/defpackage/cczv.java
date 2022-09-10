package defpackage;
/* compiled from: PG */
/* renamed from: cczv  reason: default package */
/* loaded from: classes4.dex */
public final class cczv {
    public final dzsj<cqhn> a;
    public final dzsj<cqhu> b;
    public final dzsj<ff> c;
    public final dzsj<cjqy> d;
    public final dzsj<bvrb> e;
    public final dzsj<bvdz> f;
    public final dzsj<ccrh> g;
    public final dzsj<btvo> h;
    public final dzsj<dxio<bbut>> i;
    public final dzsj<ccvx> j;
    public final dzsj<cczk> k;
    public final dzsj<cpv> l;
    public final dzsj<bvjj> m;

    public cczv(dzsj<cqhn> dzsjVar, dzsj<cqhu> dzsjVar2, dzsj<ff> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<bvrb> dzsjVar5, dzsj<bvdz> dzsjVar6, dzsj<ccrh> dzsjVar7, dzsj<btvo> dzsjVar8, dzsj<dxio<bbut>> dzsjVar9, dzsj<ccvx> dzsjVar10, dzsj<cczk> dzsjVar11, dzsj<cpv> dzsjVar12, dzsj<bvjj> dzsjVar13) {
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
