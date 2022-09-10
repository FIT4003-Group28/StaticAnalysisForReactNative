package defpackage;
/* compiled from: PG */
/* renamed from: aext  reason: default package */
/* loaded from: classes2.dex */
public final class aext {
    public final dzsj<gga> a;
    public final dzsj<araj> b;
    public final dzsj<awre> c;
    public final dzsj<ache> d;
    public final dzsj<aesb> e;
    public final dzsj<begg> f;
    public final dzsj<bvjj> g;
    public final dzsj<akfa> h;
    public final dzsj<bwqv> i;
    public final dzsj<cjqy> j;
    public final dzsj<btvo> k;
    public final dzsj<dbsg<ddv>> l;
    public final dzsj<cqhn> m;

    public aext(dzsj<gga> dzsjVar, dzsj<araj> dzsjVar2, dzsj<awre> dzsjVar3, dzsj<ache> dzsjVar4, dzsj<aesb> dzsjVar5, dzsj<begg> dzsjVar6, dzsj<bvjj> dzsjVar7, dzsj<akfa> dzsjVar8, dzsj<bwqv> dzsjVar9, dzsj<cjqy> dzsjVar10, dzsj<btvo> dzsjVar11, dzsj<dbsg<ddv>> dzsjVar12, dzsj<cqhn> dzsjVar13) {
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
