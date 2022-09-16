package defpackage;
/* compiled from: PG */
/* renamed from: kgx  reason: default package */
/* loaded from: classes7.dex */
public final class kgx {
    public final dzsj<crzm<jzq>> a;
    public final dzsj<bvjj> b;
    public final dzsj<btvo> c;
    public final dzsj<jzp> d;
    public final dzsj<cjqy> e;
    public final dzsj<cjqq> f;
    public final dzsj<ckcw> g;
    public final dzsj<akfa> h;
    public final dzsj<dehq> i;
    public final dzsj<bvrb> j;
    public final dzsj<dbsg<afeg>> k;

    public kgx(dzsj<crzm<jzq>> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<jzp> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<cjqq> dzsjVar6, dzsj<ckcw> dzsjVar7, dzsj<akfa> dzsjVar8, dzsj<dehq> dzsjVar9, dzsj<bvrb> dzsjVar10, dzsj<dbsg<afeg>> dzsjVar11) {
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
