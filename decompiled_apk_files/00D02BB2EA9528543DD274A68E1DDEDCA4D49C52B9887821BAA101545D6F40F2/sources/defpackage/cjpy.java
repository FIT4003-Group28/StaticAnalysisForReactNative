package defpackage;
/* compiled from: PG */
/* renamed from: cjpy  reason: default package */
/* loaded from: classes4.dex */
public final class cjpy {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<agwa> c;
    public final dzsj<dxio<afzs>> d;
    public final dzsj<dxio<afzv>> e;
    public final dzsj<dxio<bsvm>> f;
    public final dzsj<dxio<apyz>> g;
    public final dzsj<dxio<apyv>> h;
    public final dzsj<bvsx> i;
    public final dzsj<cjqy> j;
    public final dzsj<acyp> k;
    public final dzsj<cpv> l;

    public cjpy(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<agwa> dzsjVar3, dzsj<dxio<afzs>> dzsjVar4, dzsj<dxio<afzv>> dzsjVar5, dzsj<dxio<bsvm>> dzsjVar6, dzsj<dxio<apyz>> dzsjVar7, dzsj<dxio<apyv>> dzsjVar8, dzsj<bvsx> dzsjVar9, dzsj<cjqy> dzsjVar10, dzsj<acyp> dzsjVar11, dzsj<cpv> dzsjVar12) {
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
