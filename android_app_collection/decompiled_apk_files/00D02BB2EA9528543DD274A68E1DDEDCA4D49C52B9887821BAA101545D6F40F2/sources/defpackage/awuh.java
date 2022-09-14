package defpackage;
/* compiled from: PG */
/* renamed from: awuh  reason: default package */
/* loaded from: classes3.dex */
public final class awuh {
    public final dzsj<gga> a;
    public final dzsj<cqkj> b;
    public final dzsj<awre> c;
    public final dzsj<dxio<bbut>> d;
    public final dzsj<bwft> e;
    public final dzsj<bniv> f;
    public final dzsj<cqat> g;
    public final dzsj<jkf> h;
    public final dzsj<cjqy> i;
    public final dzsj<awtj> j;
    public final dzsj<bniy> k;

    public awuh(dzsj<gga> dzsjVar, dzsj<cqkj> dzsjVar2, dzsj<awre> dzsjVar3, dzsj<dxio<bbut>> dzsjVar4, dzsj<bwft> dzsjVar5, dzsj<bniv> dzsjVar6, dzsj<cqat> dzsjVar7, dzsj<jkf> dzsjVar8, dzsj<cjqy> dzsjVar9, dzsj<awtj> dzsjVar10, dzsj<bniy> dzsjVar11) {
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
